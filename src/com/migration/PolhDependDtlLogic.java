/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.migration;

/**
 *
 * @author Bolaji
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.destination2.entity.PolhDependtDtl;
import com.model.AosDependTbModel;
import com.model.AosPolicyDetailsModel;
import com.model.CustomerTbModel;
import com.model.EazyappDependTbModel;
import com.model.EazyappPolicyDetailsModel;
import com.model.EazylifeDependTbModel;
import com.model.EazylifePolicyDetailsModel;
import com.model.PolhDependDtlModel;
import com.model.PolhDetlModel;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author Bolaji
 */
public class PolhDependDtlLogic extends AbstractFacade<PolhDependtDtl> {

    EntityManager em;
    private Query query;
    DateTimeFormatter inputFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter inputFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public PolhDependDtlLogic() {
        super(PolhDependtDtl.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PolhDependDtlModel> getPolhDependtDtl() {
        List<PolhDependDtlModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolhDependtDtl.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhDependtDtl> branches = query.getResultList();

            branches.forEach((dd) -> {
                PolhDependDtlModel dmodel = new PolhDependDtlModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public PolhDependDtlModel getPolhDependtDtlById(int id) {
        PolhDependDtlModel dmodel = new PolhDependDtlModel();

        try {
            query = getEM().createNamedQuery("PolhDependtDtl.findByBenSysid");
            query.setParameter("benSysid", id);

            PolhDependtDtl dropdown = (PolhDependtDtl) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDependDtlModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public PolhDependDtlModel checkIfExisting(int pohlsysid) {
        PolhDependDtlModel dmodel = new PolhDependDtlModel();

        try {

            query = this.em.createNativeQuery("select * FROM polh_dependt_dtl WHERE PDD_POLH_SYSID = " + pohlsysid + " AND PDD_CL_NAME = 'Main'");

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDependDtlModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String getNewDependantID() {
        String staticString = "DP0000001";

        try {
            query = this.em.createNativeQuery("SELECT PDD_CODE From polh_dependt_dtl a WHERE PDD_CODE like '%DP%' ORDER BY PDD_CODE DESC LIMIT 1");
            String id = (String) query.setMaxResults(1).getSingleResult();
            int newid = Integer.parseInt(id.substring(2));
            newid++;
            int length = String.valueOf(newid).length();
            staticString = staticString.substring(0, 9 - length) + String.valueOf(newid);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return staticString;
    }

    public static String randomNumericString(int len) {
        final String characters = "0123456789";
        String newpass = RandomStringUtils.random(len, characters);
        return newpass;
    }

    public String saveAosDependant(AosDependTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            if (!"Trustee".equals(dmodel.getProductMainDepndRelationship())) {
                PolhDependDtlModel br = new PolhDependDtlModel(dmodel);
                CustomerTbLogic cblogic = new CustomerTbLogic();
                AosPolicyDetailsModel aosPolh = new AosPolicyDetailsLogic().getAosPolicyDetailsById(dmodel.getProductrRefNo());
                PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(aosPolh.getProductMainPolicyNo());
                if (pohldetail.getPolhNum() != null && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0) {
                    br.setPddPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
                    br.setPddPdtSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid());
                    br.setPddPptSysid(pohldetail.getPolhPlnSysid());
                    br.setPddSa(pohldetail.getPolhSiBc());
                    br.setPddClSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid() == 81 || pohldetail.getPolhDetlPK().getPolhPdtSysid() == 82 ? 7 : "Spouse".equals(dmodel.getProductMainDepndRelationship()) ? 2 : "Child".equals(dmodel.getProductMainDepndRelationship()) ? 3 : 6);
                    br.setPddClName(pohldetail.getPolhDetlPK().getPolhPdtSysid() == 81 || pohldetail.getPolhDetlPK().getPolhPdtSysid() == 82 ? "Other Live" : "Spouse".equals(dmodel.getProductMainDepndRelationship()) ? "Spouse" : "Child".equals(dmodel.getProductMainDepndRelationship()) ? "Child" : "Ext. Family");
                    LocalDate dob = dmodel.getProductMainDepndDob() == null ? null : LocalDate.parse(dmodel.getProductMainDepndDob(), inputFormat1);
                    LocalDate sys = dmodel.getProductMainDepndInputdate() == null ? null : LocalDate.parse(dmodel.getProductMainDepndInputdate().substring(0, 19), inputFormat2);
                    CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
                    CustomerTbModel dependt = new CustomerTbModel();
                    dependt.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
                    dependt.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
                    String[] names = dmodel.getProductMainDepndName().split(" ");
                    dependt.setCusFirstname(names.length >= 2 ? dmodel.getProductMainDepndName().substring(0, dmodel.getProductMainDepndName().indexOf(' ')).toUpperCase() : dmodel.getProductMainDepndName().toUpperCase());
                    dependt.setCusSurname(names.length >= 2 ? dmodel.getProductMainDepndName().substring(dmodel.getProductMainDepndName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductMainDepndName().toUpperCase());
                    dependt.setCusGender(dmodel.getProductMainDepndGender());
                    dependt.setCusDob(dmodel.getProductMainDepndDob());
                    dependt.setCusAddrs(dmodel.getProductMainDepndAddress());
                    dependt.setCusType("DP");
                    dependt.setCusSts("N");
                    dependt.setCusSysDt(cusmodel.getCusSysDt());
                    dependt.setCusCrtUser(cusmodel.getCusCrtUser());
                    dependt.setCusRegDt(cusmodel.getCusRegDt());
                    dependt.setCusCode("DP" + this.randomNumericString(9));
                    cblogic.saveCustomer(dependt);
                    CustomerTbModel cus = cblogic.getCustomerByCode(dependt.getCusCode());
                    br.setPddCusSysid(cus.getCustomerTbPK().getCusSysid());
                    br.setPddCode(cus.getCusCode());
                    br.setPddCreUser(pohldetail.getPolhCreUserBy());
                    PolhDependDtlModel mainLiveModel = this.checkIfExisting(pohldetail.getPolhDetlPK().getPolhSysid());
                    if (mainLiveModel.getPddSysId() == 0) {
                        mainLiveModel.setPddClName("Main");
                        LocalDate mdob = cusmodel.getCusDob() == null ? null : LocalDate.parse(cusmodel.getCusDob(), inputFormat1);
                        LocalDate msys = cusmodel.getCusSysDt() == null ? null : LocalDate.parse(cusmodel.getCusSysDt().substring(0, 19), inputFormat2);
                        if (mdob == null || msys == null) {
                            mainLiveModel.setPddAge(0);
                        } else {
                            Period intervalPeriod = Period.between(mdob, msys);
                            mainLiveModel.setPddAge(intervalPeriod.getYears());
                        }
                       // mainLiveModel.setPddCusSysid(cusmodel.getCustomerTbPK().getCusSysid());
                        mainLiveModel.setPddCode(cusmodel.getCusCode());
                        mainLiveModel.setPddClSysid(1);
                        mainLiveModel.setPddCreDt(br.getPddCreDt());
                        mainLiveModel.setPddCreUser(pohldetail.getPolhCreUserBy());
                        mainLiveModel.setPddCusSysid(br.getPddCusSysid());
                        mainLiveModel.setPddDob(cusmodel.getCusDob());
                        mainLiveModel.setPddGndr(cusmodel.getCusGender());
                        mainLiveModel.setPddMobile(cusmodel.getCusMobile());
                        mainLiveModel.setPddPdtSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid());
                        mainLiveModel.setPddPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
                        mainLiveModel.setPddPptSysid(pohldetail.getPolhPlnSysid());
                        mainLiveModel.setPddName(cusmodel.getCusGender() + " " + cusmodel.getCusMidname() + " " + cusmodel.getCusSurname());
                        mainLiveModel.setPddPrem(BigDecimal.ZERO);
                        mainLiveModel.setPddSa(pohldetail.getPolhSiBc());
                        mainLiveModel.setPddSts("N");
                        new PolhDependDtlLogic().saveMainLife(mainLiveModel);
                    }
                    if (dob == null || sys == null) {
                        br.setPddAge(0);
                    } else {
                        Period intervalPeriod = Period.between(dob, sys);
                        br.setPddAge(intervalPeriod.getYears());
                    }

                    PolhDependtDtl branch = new PolhDependtDtl(br);

                    getEM().getTransaction().begin();

                    if (br.getPddSysId() == 0) {
                        create(branch);
                        result = "PolhDependtDtl created successfully...";
                    } else {
                        edit(branch);
                        result = "PolhDependtDtl updated successfully...";
                    }

                    getEM().getTransaction().commit();
                }
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String saveEazyappDependant(EazyappDependTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            if (!"Trustee".equals(dmodel.getProductMainDepndRelationship())) {
                PolhDependDtlModel br = new PolhDependDtlModel(dmodel);
                CustomerTbLogic cblogic = new CustomerTbLogic();
                EazyappPolicyDetailsModel eazyPolh = new EazyappPolicyDetailsLogic().getEazyappPolicyDetailsByRefNo(dmodel.getProductrRefNo());
                PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
                if (pohldetail.getPolhNum() != null && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0) {
                    br.setPddPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
                    br.setPddPdtSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid());
                    br.setPddPptSysid(pohldetail.getPolhPlnSysid());
                    br.setPddSa(pohldetail.getPolhSiBc());
                    br.setPddClSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid() == 81 || pohldetail.getPolhDetlPK().getPolhPdtSysid() == 82 ? 7 : "Spouse".equals(dmodel.getProductMainDepndRelationship()) ? 2 : "Child".equals(dmodel.getProductMainDepndRelationship()) ? 3 : 6);
                    br.setPddClName(pohldetail.getPolhDetlPK().getPolhPdtSysid() == 81 || pohldetail.getPolhDetlPK().getPolhPdtSysid() == 82 ? "Other Live" : "Spouse".equals(dmodel.getProductMainDepndRelationship()) ? "Spouse" : "Child".equals(dmodel.getProductMainDepndRelationship()) ? "Child" : "Ext. Family");
                    LocalDate dob = dmodel.getProductMainDepndDob() == null ? null : LocalDate.parse(dmodel.getProductMainDepndDob(), inputFormat1);
                    LocalDate sys = dmodel.getProductMainDepndInputdate() == null ? null : LocalDate.parse(dmodel.getProductMainDepndInputdate().substring(0, 19), inputFormat2);
                    CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
                    CustomerTbModel dependt = new CustomerTbModel();
                    dependt.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
                    dependt.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
                    String[] names = dmodel.getProductMainDepndName().split(" ");
                    dependt.setCusFirstname(names.length >= 2 ? dmodel.getProductMainDepndName().substring(0, dmodel.getProductMainDepndName().indexOf(' ')).toUpperCase() : dmodel.getProductMainDepndName().toUpperCase());
                    dependt.setCusSurname(names.length >= 2 ? dmodel.getProductMainDepndName().substring(dmodel.getProductMainDepndName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductMainDepndName().toUpperCase());
                    dependt.setCusGender(dmodel.getProductMainDepndGender());
                    dependt.setCusDob(dmodel.getProductMainDepndDob());
                    dependt.setCusAddrs(dmodel.getProductMainDepndAddres());
                    dependt.setCusType("DP");
                    dependt.setCusSts("N");
                    dependt.setCusSysDt(cusmodel.getCusSysDt());
                    dependt.setCusCrtUser(cusmodel.getCusCrtUser());
                    dependt.setCusRegDt(cusmodel.getCusRegDt());
                    dependt.setCusCode("DP" + this.randomNumericString(9));
                    cblogic.saveCustomer(dependt);
                    CustomerTbModel cus = cblogic.getCustomerByCode(dependt.getCusCode());
                    br.setPddCusSysid(cus.getCustomerTbPK().getCusSysid());
                    br.setPddCode(cus.getCusCode());
                    br.setPddCreUser(pohldetail.getPolhCreUserBy());
                    PolhDependDtlModel mainLiveModel = this.checkIfExisting(pohldetail.getPolhDetlPK().getPolhSysid());
                    if (mainLiveModel.getPddSysId() == 0) {
                        mainLiveModel.setPddClName("Main");
                        LocalDate mdob = cusmodel.getCusDob() == null ? null : LocalDate.parse(cusmodel.getCusDob(), inputFormat1);
                        LocalDate msys = cusmodel.getCusSysDt() == null ? null : LocalDate.parse(cusmodel.getCusSysDt().substring(0, 19), inputFormat2);
                        if (mdob == null || msys == null) {
                            mainLiveModel.setPddAge(0);
                        } else {
                            Period intervalPeriod = Period.between(mdob, msys);
                            mainLiveModel.setPddAge(intervalPeriod.getYears());
                        }
                        //mainLiveModel.setPddCusSysid(cusmodel.getCustomerTbPK().getCusSysid());
                        mainLiveModel.setPddCode(cusmodel.getCusCode());
                        mainLiveModel.setPddClSysid(1);
                        mainLiveModel.setPddCreDt(br.getPddCreDt());
                        mainLiveModel.setPddCreUser(pohldetail.getPolhCreUserBy());
                        mainLiveModel.setPddCusSysid(br.getPddCusSysid());
                        mainLiveModel.setPddDob(cusmodel.getCusDob());
                        mainLiveModel.setPddGndr(cusmodel.getCusGender());
                        mainLiveModel.setPddMobile(cusmodel.getCusMobile());
                        mainLiveModel.setPddPdtSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid());
                        mainLiveModel.setPddPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
                        mainLiveModel.setPddPptSysid(pohldetail.getPolhPlnSysid());
                        mainLiveModel.setPddName(cusmodel.getCusGender() + " " + cusmodel.getCusMidname() + " " + cusmodel.getCusSurname());
                        mainLiveModel.setPddPrem(BigDecimal.ZERO);
                        mainLiveModel.setPddSa(pohldetail.getPolhSiBc());
                        mainLiveModel.setPddSts("N");
                        new PolhDependDtlLogic().saveMainLife(mainLiveModel);
                    }
                    if (dob == null || sys == null) {
                        br.setPddAge(0);
                    } else {
                        Period intervalPeriod = Period.between(dob, sys);
                        br.setPddAge(intervalPeriod.getYears());
                    }

                    PolhDependtDtl branch = new PolhDependtDtl(br);

                    getEM().getTransaction().begin();

                    if (br.getPddSysId() == 0) {
                        create(branch);
                        result = "PolhDependtDtl created successfully...";
                    } else {
                        edit(branch);
                        result = "PolhDependtDtl updated successfully...";
                    }

                    getEM().getTransaction().commit();
                }
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String saveMainLife(PolhDependDtlModel dmodel) {
        String result = "There was a problem saving...";

        try {
            PolhDependtDtl branch = new PolhDependtDtl(dmodel);

            getEM().getTransaction().begin();

            if (branch.getPddSysId() == 0) {
                create(branch);
                result = "PolhDependtDtl created successfully...";
            } else {
                edit(branch);
                result = "PolhDependtDtl updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String updateAgent(PolhDependDtlModel dmodel) {

        try {
                
                CustomerTbModel aosteam = new CustomerTbLogic().getCustomerByCode(dmodel.getPddCode());
                dmodel.setPddCusSysid(aosteam.getCustomerTbPK().getCusSysid());               
                PolhDependtDtl pgent = new PolhDependtDtl(dmodel);
                getEM().getTransaction().begin();
                edit(pgent);
                getEM().getTransaction().commit();
            
            
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }
        return "";
    }

    public String saveEazylifeDependant(EazylifeDependTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            if (!"Trustee".equals(dmodel.getProductMainDepndRelationship())) {
                PolhDependDtlModel br = new PolhDependDtlModel(dmodel);
                CustomerTbLogic cblogic = new CustomerTbLogic();
                EazylifePolicyDetailsModel eazyPolh = new EazylifePolicyDetailsLogic().getEazylifePolicyDetailsByRefNo(dmodel.getProductrRefNo());
                PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
                if (pohldetail.getPolhNum() != null && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0) {
                    br.setPddPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
                    br.setPddPdtSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid());
                    br.setPddPptSysid(pohldetail.getPolhPlnSysid());
                    br.setPddSa(pohldetail.getPolhSiBc());
                    br.setPddClSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid() == 81 || pohldetail.getPolhDetlPK().getPolhPdtSysid() == 82 ? 7 : "Spouse".equals(dmodel.getProductMainDepndRelationship()) ? 2 : "Child".equals(dmodel.getProductMainDepndRelationship()) ? 3 : 6);
                    br.setPddClName(pohldetail.getPolhDetlPK().getPolhPdtSysid() == 81 || pohldetail.getPolhDetlPK().getPolhPdtSysid() == 82 ? "Other Live" : "Spouse".equals(dmodel.getProductMainDepndRelationship()) ? "Spouse" : "Child".equals(dmodel.getProductMainDepndRelationship()) ? "Child" : "Ext. Family");
                    LocalDate dob = dmodel.getProductMainDepndDob() == null ? null : LocalDate.parse(dmodel.getProductMainDepndDob(), inputFormat1);
                    LocalDate sys = dmodel.getProductMainDepndInputdate() == null ? null : LocalDate.parse(dmodel.getProductMainDepndInputdate().substring(0, 19), inputFormat2);
                    CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
                    CustomerTbModel dependt = new CustomerTbModel();
                    dependt.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
                    dependt.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
                    String[] names = dmodel.getProductMainDepndName().split(" ");
                    dependt.setCusFirstname(names.length >= 2 ? dmodel.getProductMainDepndName().substring(0, dmodel.getProductMainDepndName().indexOf(' ')).toUpperCase() : dmodel.getProductMainDepndName().toUpperCase());
                    dependt.setCusSurname(names.length >= 2 ? dmodel.getProductMainDepndName().substring(dmodel.getProductMainDepndName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductMainDepndName().toUpperCase());
                    dependt.setCusGender(dmodel.getProductMainDepndGender());
                    dependt.setCusDob(dmodel.getProductMainDepndDob());
                    dependt.setCusAddrs(dmodel.getProductMainDepndAddress());
                    dependt.setCusType("DP");
                    dependt.setCusSts("N");
                    dependt.setCusSysDt(cusmodel.getCusSysDt());
                    dependt.setCusCrtUser(cusmodel.getCusCrtUser());
                    dependt.setCusRegDt(cusmodel.getCusRegDt());
                    dependt.setCusCode("DP" + this.randomNumericString(9));
                    cblogic.saveCustomer(dependt);
                    CustomerTbModel cus = cblogic.getCustomerByCode(dependt.getCusCode());
                    br.setPddCusSysid(cus.getCustomerTbPK().getCusSysid());
                    br.setPddCode(cus.getCusCode());
                    br.setPddCreUser(pohldetail.getPolhCreUserBy());
                    PolhDependDtlModel mainLiveModel = this.checkIfExisting(pohldetail.getPolhDetlPK().getPolhSysid());
                    if (mainLiveModel.getPddSysId() == 0) {
                        mainLiveModel.setPddClName("Main");
                        LocalDate mdob = cusmodel.getCusDob() == null ? null : LocalDate.parse(cusmodel.getCusDob(), inputFormat1);
                        LocalDate msys = cusmodel.getCusSysDt() == null ? null : LocalDate.parse(cusmodel.getCusSysDt().substring(0, 19), inputFormat2);
                        if (mdob == null || msys == null) {
                            mainLiveModel.setPddAge(0);
                        } else {
                            Period intervalPeriod = Period.between(mdob, msys);
                            mainLiveModel.setPddAge(intervalPeriod.getYears());
                        }
                        //mainLiveModel.setPddCusSysid(cusmodel.getCustomerTbPK().getCusSysid());
                        mainLiveModel.setPddCode(cusmodel.getCusCode());
                        mainLiveModel.setPddClSysid(1);
                        mainLiveModel.setPddCreDt(br.getPddCreDt());
                        mainLiveModel.setPddCreUser(pohldetail.getPolhCreUserBy());
                        mainLiveModel.setPddCusSysid(br.getPddCusSysid());
                        mainLiveModel.setPddDob(cusmodel.getCusDob());
                        mainLiveModel.setPddGndr(cusmodel.getCusGender());
                        mainLiveModel.setPddMobile(cusmodel.getCusMobile());
                        mainLiveModel.setPddPdtSysid(pohldetail.getPolhDetlPK().getPolhPdtSysid());
                        mainLiveModel.setPddPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
                        mainLiveModel.setPddPptSysid(pohldetail.getPolhPlnSysid());
                        mainLiveModel.setPddName(cusmodel.getCusGender() + " " + cusmodel.getCusMidname() + " " + cusmodel.getCusSurname());
                        mainLiveModel.setPddPrem(BigDecimal.ZERO);
                        mainLiveModel.setPddSa(pohldetail.getPolhSiBc());
                        mainLiveModel.setPddSts("N");
                        new PolhDependDtlLogic().saveMainLife(mainLiveModel);
                    }
                    if (dob == null || sys == null) {
                        br.setPddAge(0);
                    } else {
                        Period intervalPeriod = Period.between(dob, sys);
                        br.setPddAge(intervalPeriod.getYears());
                    }

                    PolhDependtDtl branch = new PolhDependtDtl(br);

                    getEM().getTransaction().begin();

                    if (br.getPddSysId() == 0) {
                        create(branch);
                        result = "PolhDependtDtl created successfully...";
                    } else {
                        edit(branch);
                        result = "PolhDependtDtl updated successfully...";
                    }

                    getEM().getTransaction().commit();
                }
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
