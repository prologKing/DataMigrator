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
import com.destination2.entity.PolhClmInit;
import com.model.AosClaimsModel;
import com.model.BranchModel;
import com.model.CustomerTbModel;
import com.model.PolhClmInitModel;
import com.model.PolhDetlModel;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PolhClmInitLogic extends AbstractFacade<PolhClmInit> {

    EntityManager em;
    private Query query;

    public PolhClmInitLogic() {
        super(PolhClmInit.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PolhClmInitModel> getPolhClmInites() {
        List<PolhClmInitModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolhClmInit.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhClmInit> branches = query.getResultList();

            branches.forEach((dd) -> {
                PolhClmInitModel dmodel = new PolhClmInitModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public PolhClmInitModel getPolhClmInitById(int id) {
        PolhClmInitModel dmodel = new PolhClmInitModel();

        try {
            query = getEM().createNamedQuery("PolhClmInit.findByPciSysid");
            query.setParameter("pciSysid", id);

            PolhClmInit dropdown = (PolhClmInit) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhClmInitModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public PolhClmInitModel getPolhByLastRecord() {
        PolhClmInitModel dmodel = new PolhClmInitModel();

        try {
            query = getEM().createNamedQuery("PolhClmInit.findByLastRecord");

            PolhClmInit dropdown = (PolhClmInit) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhClmInitModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String getNewClaimCode() {
        String staticString = "";

        try {
            query = this.em.createNativeQuery("SELECT Max(PCI_CLM_NUM) FROM allztrnx.polh_clm_init WHERE PCI_CLM_TYPE = 'Surrender'");
            String id = (String) query.setMaxResults(1).getSingleResult();
            int newid = Integer.parseInt(id.substring(3));
            newid++;
            staticString = "SUR" + String.valueOf(newid);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return staticString;
    }

    public String saveClaimInit(AosClaimsModel cmodel) {
        String result = "There was a problem saving...";
        //char c = cmodel.getTelephone().charAt(0);
        
//        if(cmodel.getPymtMode().contains("Mobile") && c != '0'){
//        cmodel.setTelephone("0"+ cmodel.getTelephone());
//        }

        try {
            if (cmodel.getPaidAmount() > 0) {
                PolhClmInitModel dmodel = new PolhClmInitModel(cmodel);
                PolhDetlModel poldet = new PolhDetlLogic().getPolhDetlById(dmodel.getPciPolNum());
                if (poldet.getPolhDetlPK().getPolhSysid() != 0) {
                    CustomerTbModel cumodel = new CustomerTbLogic().getCustomerById(poldet.getPolhDetlPK().getPolhCusSysid());
                    if(cumodel.getCustomerTbPK().getCusSysid() != 0){
                    dmodel.setPciContactNo(cumodel.getCusMobile());
                    }else{
                    dmodel.setPciContactNo(cmodel.getTelephone());
                    }
                    BranchModel br = new BranchLogic().getBranchById(dmodel.getPciOffId());
                    dmodel.setPciPolhSysid(poldet.getPolhDetlPK().getPolhSysid());
                    dmodel.setPciOff(br.getBranchName());
                    dmodel.setPciClmNum(this.getNewClaimCode());
                    PolhClmInit branch = new PolhClmInit(dmodel);

                    getEM().getTransaction().begin();

                    if (dmodel.getPciSysid() == 0) {
                        create(branch);
                        result = "PolhClmInit created successfully...";
                        getEM().getTransaction().commit();
                        PolhClmInitModel pmodel = this.getPolhByLastRecord();
                        pmodel.setPcbAmt(new BigDecimal(String.valueOf(cmodel.getPaidAmount())));
                        new PolhClmBenLogic().saveClmBen(pmodel);
                    } else {
                        edit(branch);
                        result = "PolhClmInit updated successfully...";
                    }
                }else{
                    System.out.println(dmodel.getPciPolNum());
                }
            }else{
            String d = "0";
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
