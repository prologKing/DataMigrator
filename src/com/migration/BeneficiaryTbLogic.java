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
import com.destination2.entity.BeneficiaryTb;
import com.model.AosBenefTbModel;
import com.model.AosPolicyDetailsModel;
import com.model.BeneficiaryTbModel;
import com.model.CustomerTbModel;
import com.model.EazyappBenefTbModel;
import com.model.EazyappPolicyDetailsModel;
import com.model.EazylifeBenefTbModel;
import com.model.EazylifePolicyDetailsModel;
import com.model.PolhDetlModel;
import com.model.TrustTbModel;
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
public class BeneficiaryTbLogic extends AbstractFacade<BeneficiaryTb> {
    EntityManager em;
    private Query query;
    DateTimeFormatter inputFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter inputFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public BeneficiaryTbLogic() {
        super(BeneficiaryTb.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<BeneficiaryTbModel> getBeneficiaryTb() {
        List<BeneficiaryTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("BeneficiaryTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<BeneficiaryTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                BeneficiaryTbModel dmodel = new BeneficiaryTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public BeneficiaryTbModel getBeneficiaryTbById(int id) {
        BeneficiaryTbModel dmodel = new BeneficiaryTbModel();

        try {
            query = getEM().createNamedQuery("BeneficiaryTb.findByBenSysid");
            query.setParameter("benSysid", id);

            BeneficiaryTb dropdown = (BeneficiaryTb) query.setMaxResults(1).getSingleResult();
            dmodel = new BeneficiaryTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public static String randomNumericString(int len) {
        final String characters = "0123456789";
        String newpass = RandomStringUtils.random(len, characters);
        return newpass;
    }


    public String saveAosBeneficiary(AosBenefTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BeneficiaryTbModel bmodel = new BeneficiaryTbModel(dmodel);
            CustomerTbLogic cblogic = new CustomerTbLogic();
            AosPolicyDetailsModel eazyPolh = new AosPolicyDetailsLogic().getAosPolicyDetailsById(dmodel.getProductrBeneRefNo());
            PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
            if(pohldetail.getPolhNum() != null && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0){
            bmodel.getBeneficiaryTbPK().setBenPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
            bmodel.setBenCrtUser(pohldetail.getPolhCreUserBy());
            LocalDate dob = dmodel.getProductBeneDob() == null ? null : LocalDate.parse(dmodel.getProductBeneDob(), inputFormat1);
            LocalDate sys = dmodel.getProductBeneInputdate() == null ? null : LocalDate.parse(dmodel.getProductBeneInputdate().substring(0, 19), inputFormat2);
            if (dob == null || sys == null) {
                bmodel.setBenAge(0);
            } else {
                Period intervalPeriod = Period.between(dob, sys);
                bmodel.setBenAge(intervalPeriod.getYears());
            }
            bmodel.setBenCode("BF" + this.randomNumericString(9));
            CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
            CustomerTbModel benef = new CustomerTbModel();
            benef.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
            benef.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
             String[] names = dmodel.getProductBeneName().split(" ");
            benef.setCusFirstname(names.length >= 2 ? dmodel.getProductBeneName().substring(0, dmodel.getProductBeneName().indexOf(' ')).toUpperCase(): dmodel.getProductBeneName().toUpperCase());
            benef.setCusSurname(names.length >= 2 ? dmodel.getProductBeneName().substring(dmodel.getProductBeneName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductBeneName().toUpperCase());
            benef.setCusGender(dmodel.getProductBeneGender());
            benef.setCusDob(dmodel.getProductBeneDob());
            benef.setCusAddrs(dmodel.getProductBeneAddress());
            benef.setCusType("BF");
            benef.setCusSts("N");
            benef.setCusSysDt(cusmodel.getCusSysDt());
            benef.setCusCrtUser(cusmodel.getCusCrtUser());
            benef.setCusRegDt(cusmodel.getCusRegDt());
            benef.setCusCode(bmodel.getBenCode());
            cblogic.saveCustomer(benef);
            CustomerTbModel cus = cblogic.getCustomerByCode(benef.getCusCode());
            int cusid = cus.getCustomerTbPK().getCusSysid();
            bmodel.getBeneficiaryTbPK().setBenCusSysid(cusid);
            BeneficiaryTb branch = new BeneficiaryTb(bmodel);

            getEM().getTransaction().begin();

            if (bmodel.getBeneficiaryTbPK().getBenSysid()== 0) {
               create(branch);
                result = "BeneficiaryTb created successfully...";
            } else {
                edit(branch);
                result = "BeneficiaryTb updated successfully...";
            }

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String saveAosTrusteeBeneficiary(TrustTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BeneficiaryTbModel bmodel = new BeneficiaryTbModel(dmodel);
            CustomerTbLogic cblogic = new CustomerTbLogic();
            AosPolicyDetailsModel eazyPolh = new AosPolicyDetailsLogic().getAosPolicyDetailsById(dmodel.getProductrMainTrustRefNo());
            PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
            if(pohldetail.getPolhNum() != null  && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0){
            bmodel.getBeneficiaryTbPK().setBenPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
            bmodel.setBenCrtUser(pohldetail.getPolhCreUserBy());
            LocalDate dob = dmodel.getProductMainTrustDob()== null ? null : LocalDate.parse(dmodel.getProductMainTrustDob(), inputFormat1);
            LocalDate sys = dmodel.getProductMainTrustInputdate() == null ? null : LocalDate.parse(dmodel.getProductMainTrustInputdate().substring(0, 19), inputFormat2);
            if (dob == null || sys == null) {
                bmodel.setBenAge(0);
            } else {
                Period intervalPeriod = Period.between(dob, sys);
                bmodel.setBenAge(intervalPeriod.getYears());
            }
            bmodel.setBenCode("BF" + this.randomNumericString(9));
            CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
            CustomerTbModel benef = new CustomerTbModel();
            benef.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
            benef.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
             String[] names = dmodel.getProductMainTrustName().split(" ");
            benef.setCusFirstname(names.length >= 2 ? dmodel.getProductMainTrustName().substring(0, dmodel.getProductMainTrustName().indexOf(' ')).toUpperCase(): dmodel.getProductMainTrustName().toUpperCase());
            benef.setCusSurname(names.length >= 2 ? dmodel.getProductMainTrustName().substring(dmodel.getProductMainTrustName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductMainTrustName().toUpperCase());
            benef.setCusGender(dmodel.getProductMainTrustGender());
            benef.setCusDob(dmodel.getProductMainTrustDob());
            benef.setCusAddrs(dmodel.getProductMainTrustAddress());
            benef.setCusType("BF");
            benef.setCusSts("N");
            benef.setCusSysDt(cusmodel.getCusSysDt());
            benef.setCusCrtUser(cusmodel.getCusCrtUser());
            benef.setCusRegDt(cusmodel.getCusRegDt());
            benef.setCusCode(bmodel.getBenCode());
            cblogic.saveCustomer(benef);
            CustomerTbModel cus = cblogic.getCustomerByCode(benef.getCusCode());
            bmodel.getBeneficiaryTbPK().setBenCusSysid(cus.getCustomerTbPK().getCusSysid());
            BeneficiaryTb branch = new BeneficiaryTb(bmodel);

            getEM().getTransaction().begin();

            if (bmodel.getBeneficiaryTbPK().getBenSysid()== 0) {
               create(branch);
                result = "BeneficiaryTb created successfully...";
            } else {
                edit(branch);
                result = "BeneficiaryTb updated successfully...";
            }

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String saveEazyappBeneficiary(EazyappBenefTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BeneficiaryTbModel bmodel = new BeneficiaryTbModel(dmodel);
            CustomerTbLogic cblogic = new CustomerTbLogic();
            EazyappPolicyDetailsModel eazyPolh = new EazyappPolicyDetailsLogic().getEazyappPolicyDetailsByRefNo(dmodel.getProductrBeneRefNo());
            PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
            if(pohldetail.getPolhNum() != null  && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0){
            bmodel.getBeneficiaryTbPK().setBenPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
            bmodel.setBenCrtUser(pohldetail.getPolhCreUserBy());
            LocalDate dob = dmodel.getProductBeneDob() == null ? null : LocalDate.parse(dmodel.getProductBeneDob(), inputFormat1);
            LocalDate sys = dmodel.getProductBeneInputdate() == null ? null : LocalDate.parse(dmodel.getProductBeneInputdate().substring(0, 19), inputFormat2);
            if (dob == null || sys == null) {
                bmodel.setBenAge(0);
            } else {
                Period intervalPeriod = Period.between(dob, sys);
                bmodel.setBenAge(intervalPeriod.getYears());
            }
            bmodel.setBenCode("BF" + this.randomNumericString(9));
            CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
            CustomerTbModel benef = new CustomerTbModel();
            benef.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
            benef.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
             String[] names = dmodel.getProductBeneName().split(" ");
            benef.setCusFirstname(names.length >= 2 ? dmodel.getProductBeneName().substring(0, dmodel.getProductBeneName().indexOf(' ')).toUpperCase(): dmodel.getProductBeneName().toUpperCase());
            benef.setCusSurname(names.length >= 2 ? dmodel.getProductBeneName().substring(dmodel.getProductBeneName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductBeneName().toUpperCase());
            benef.setCusGender(dmodel.getProductBeneGender());
            benef.setCusDob(dmodel.getProductBeneDob());
            benef.setCusAddrs(dmodel.getProductBeneAddress());
            benef.setCusType("BF");
            benef.setCusSts("N");
            benef.setCusSysDt(cusmodel.getCusSysDt());
            benef.setCusCrtUser(cusmodel.getCusCrtUser());
            benef.setCusRegDt(cusmodel.getCusRegDt());
            benef.setCusCode(bmodel.getBenCode());
            cblogic.saveCustomer(benef);
            CustomerTbModel cus = cblogic.getCustomerByCode(benef.getCusCode());
            bmodel.getBeneficiaryTbPK().setBenCusSysid(cus.getCustomerTbPK().getCusSysid());
            BeneficiaryTb branch = new BeneficiaryTb(bmodel);

            getEM().getTransaction().begin();

            if (bmodel.getBeneficiaryTbPK().getBenSysid()== 0) {
               create(branch);
                result = "BeneficiaryTb created successfully...";
            } else {
                edit(branch);
                result = "BeneficiaryTb updated successfully...";
            }

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String saveEazyappTrusteeBeneficiary(TrustTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BeneficiaryTbModel bmodel = new BeneficiaryTbModel(dmodel);
            CustomerTbLogic cblogic = new CustomerTbLogic();
            EazyappPolicyDetailsModel eazyPolh = new EazyappPolicyDetailsLogic().getEazyappPolicyDetailsByRefNo(dmodel.getProductrMainTrustRefNo());
            PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
            if(pohldetail.getPolhNum() != null  && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0){
            bmodel.getBeneficiaryTbPK().setBenPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
            bmodel.setBenCrtUser(pohldetail.getPolhCreUserBy());
            LocalDate dob = dmodel.getProductMainTrustDob()== null ? null : LocalDate.parse(dmodel.getProductMainTrustDob(), inputFormat1);
            LocalDate sys = dmodel.getProductMainTrustInputdate() == null ? null : LocalDate.parse(dmodel.getProductMainTrustInputdate().substring(0, 19), inputFormat2);
            if (dob == null || sys == null) {
                bmodel.setBenAge(0);
            } else {
                Period intervalPeriod = Period.between(dob, sys);
                bmodel.setBenAge(intervalPeriod.getYears());
            }
            bmodel.setBenCode("BF" + this.randomNumericString(9));
            CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
            CustomerTbModel benef = new CustomerTbModel();
            benef.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
            benef.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
             String[] names = dmodel.getProductMainTrustName().split(" ");
            benef.setCusFirstname(names.length >= 2 ? dmodel.getProductMainTrustName().substring(0, dmodel.getProductMainTrustName().indexOf(' ')).toUpperCase(): dmodel.getProductMainTrustName().toUpperCase());
            benef.setCusSurname(names.length >= 2 ? dmodel.getProductMainTrustName().substring(dmodel.getProductMainTrustName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductMainTrustName().toUpperCase());
            benef.setCusGender(dmodel.getProductMainTrustGender());
            benef.setCusDob(dmodel.getProductMainTrustDob());
            benef.setCusAddrs(dmodel.getProductMainTrustAddress());
            benef.setCusType("BF");
            benef.setCusSts("N");
            benef.setCusSysDt(cusmodel.getCusSysDt());
            benef.setCusCrtUser(cusmodel.getCusCrtUser());
            benef.setCusRegDt(cusmodel.getCusRegDt());
            benef.setCusCode(bmodel.getBenCode());
            cblogic.saveCustomer(benef);
            CustomerTbModel cus = cblogic.getCustomerByCode(benef.getCusCode());
            bmodel.getBeneficiaryTbPK().setBenCusSysid(cus.getCustomerTbPK().getCusSysid());
            BeneficiaryTb branch = new BeneficiaryTb(bmodel);

            getEM().getTransaction().begin();

            if (bmodel.getBeneficiaryTbPK().getBenSysid()== 0) {
               create(branch);
                result = "BeneficiaryTb created successfully...";
            } else {
                edit(branch);
                result = "BeneficiaryTb updated successfully...";
            }

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String saveEazylifeBeneficiary(EazylifeBenefTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BeneficiaryTbModel bmodel = new BeneficiaryTbModel(dmodel);
            CustomerTbLogic cblogic = new CustomerTbLogic();
            EazylifePolicyDetailsModel eazyPolh = new EazylifePolicyDetailsLogic().getEazylifePolicyDetailsByRefNo(dmodel.getProductrBeneRefNo());
            PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
            if(pohldetail.getPolhNum() != null  && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0){
            bmodel.getBeneficiaryTbPK().setBenPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
            bmodel.setBenCrtUser(pohldetail.getPolhCreUserBy());
            LocalDate dob = dmodel.getProductBeneDob() == null ? null : LocalDate.parse(dmodel.getProductBeneDob(), inputFormat1);
            LocalDate sys = dmodel.getProductBeneInputdate() == null ? null : LocalDate.parse(dmodel.getProductBeneInputdate().substring(0, 19), inputFormat2);
            if (dob == null || sys == null) {
                bmodel.setBenAge(0);
            } else {
                Period intervalPeriod = Period.between(dob, sys);
                bmodel.setBenAge(intervalPeriod.getYears());
            }
            bmodel.setBenCode("BF" + this.randomNumericString(9));
            CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
            CustomerTbModel benef = new CustomerTbModel();
            benef.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
            benef.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
             String[] names = dmodel.getProductBeneName().split(" ");
            benef.setCusFirstname(names.length >= 2 ? dmodel.getProductBeneName().substring(0, dmodel.getProductBeneName().indexOf(' ')).toUpperCase(): dmodel.getProductBeneName().toUpperCase());
            benef.setCusSurname(names.length >= 2 ? dmodel.getProductBeneName().substring(dmodel.getProductBeneName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductBeneName().toUpperCase());
            benef.setCusGender(dmodel.getProductBeneGender());
            benef.setCusDob(dmodel.getProductBeneDob());
            benef.setCusAddrs(dmodel.getProductBeneAddress());
            benef.setCusType("BF");
            benef.setCusSts("N");
            benef.setCusSysDt(cusmodel.getCusSysDt());
            benef.setCusCrtUser(cusmodel.getCusCrtUser());
            benef.setCusRegDt(cusmodel.getCusRegDt());
            benef.setCusCode(bmodel.getBenCode());
            cblogic.saveCustomer(benef);
            CustomerTbModel cus = cblogic.getCustomerByCode(benef.getCusCode());
            bmodel.getBeneficiaryTbPK().setBenCusSysid(cus.getCustomerTbPK().getCusSysid());
            BeneficiaryTb branch = new BeneficiaryTb(bmodel);

            getEM().getTransaction().begin();

            if (bmodel.getBeneficiaryTbPK().getBenSysid()== 0) {
               create(branch);
                result = "BeneficiaryTb created successfully...";
            } else {
                edit(branch);
                result = "BeneficiaryTb updated successfully...";
            }

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String saveEazylifeTrusteeBeneficiary(TrustTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BeneficiaryTbModel bmodel = new BeneficiaryTbModel(dmodel);
            CustomerTbLogic cblogic = new CustomerTbLogic();
            EazylifePolicyDetailsModel eazyPolh = new EazylifePolicyDetailsLogic().getEazylifePolicyDetailsByRefNo(dmodel.getProductrMainTrustRefNo());
            PolhDetlModel pohldetail = new PolhDetlLogic().getPolhDetlById(eazyPolh.getProductMainPolicyNo());
            if(pohldetail.getPolhNum() != null  && pohldetail.getPolhDetlPK().getPolhCusSysid() != 0){
            bmodel.getBeneficiaryTbPK().setBenPolhSysid(pohldetail.getPolhDetlPK().getPolhSysid());
            bmodel.setBenCrtUser(pohldetail.getPolhCreUserBy());
            LocalDate dob = dmodel.getProductMainTrustDob()== null ? null : LocalDate.parse(dmodel.getProductMainTrustDob(), inputFormat1);
            LocalDate sys = dmodel.getProductMainTrustInputdate() == null ? null : LocalDate.parse(dmodel.getProductMainTrustInputdate().substring(0, 19), inputFormat2);
            if (dob == null || sys == null) {
                bmodel.setBenAge(0);
            } else {
                Period intervalPeriod = Period.between(dob, sys);
                bmodel.setBenAge(intervalPeriod.getYears());
            }
            bmodel.setBenCode("BF" + this.randomNumericString(9));
            CustomerTbModel cusmodel = cblogic.getCustomerById(pohldetail.getPolhDetlPK().getPolhCusSysid());
            CustomerTbModel benef = new CustomerTbModel();
            benef.getCustomerTbPK().setCusBranchSysid(cusmodel.getCustomerTbPK().getCusBranchSysid());
            benef.getCustomerTbPK().setCusUserSysid(cusmodel.getCustomerTbPK().getCusUserSysid());
             String[] names = dmodel.getProductMainTrustName().split(" ");
            benef.setCusFirstname(names.length >= 2 ? dmodel.getProductMainTrustName().substring(0, dmodel.getProductMainTrustName().indexOf(' ')).toUpperCase(): dmodel.getProductMainTrustName().toUpperCase());
            benef.setCusSurname(names.length >= 2 ? dmodel.getProductMainTrustName().substring(dmodel.getProductMainTrustName().indexOf(' ') + 1).toUpperCase() : dmodel.getProductMainTrustName().toUpperCase());
            benef.setCusGender(dmodel.getProductMainTrustGender());
            benef.setCusDob(dmodel.getProductMainTrustDob());
            benef.setCusAddrs(dmodel.getProductMainTrustAddress());
            benef.setCusType("BF");
            benef.setCusSts("N");
            benef.setCusSysDt(cusmodel.getCusSysDt());
            benef.setCusCrtUser(cusmodel.getCusCrtUser());
            benef.setCusRegDt(cusmodel.getCusRegDt());
            benef.setCusCode(bmodel.getBenCode());
            cblogic.saveCustomer(benef);
            CustomerTbModel cus = cblogic.getCustomerByCode(benef.getCusCode());
            bmodel.getBeneficiaryTbPK().setBenCusSysid(cus.getCustomerTbPK().getCusSysid());
            BeneficiaryTb branch = new BeneficiaryTb(bmodel);

            getEM().getTransaction().begin();

            if (bmodel.getBeneficiaryTbPK().getBenSysid()== 0) {
               create(branch);
                result = "BeneficiaryTb created successfully...";
            } else {
                edit(branch);
                result = "BeneficiaryTb updated successfully...";
            }

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
