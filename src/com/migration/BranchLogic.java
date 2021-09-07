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
import com.destination1.entity.BranchTb;
import com.model.BranchModel;
import com.model.PaypointModel;
import com.model.V2ProductModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class BranchLogic extends AbstractFacade<BranchTb> {
    EntityManager em;
    private Query query;

    public BranchLogic() {
        super(BranchTb.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<BranchModel> getBranches() {
        List<BranchModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("BranchTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<BranchTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                BranchModel dmodel = new BranchModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public V2ProductModel getV2ProductByCode(String id) {
        if(id == null){
        id = "";
        }
        V2ProductModel dmodel = new V2ProductModel();
        try {
            query = this.em.createNativeQuery("select PDT_SYSID, PDT_CODE, PDT_NAME  FROM product_tb WHERE PDT_CODE = '"+id+"'");
            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new V2ProductModel(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }


    public BranchModel getBranchById(int id) {
        BranchModel dmodel = new BranchModel();

        try {
            query = getEM().createNamedQuery("BranchTb.findByBranchSysid");
            query.setParameter("branchSysid", id);

            BranchTb dropdown = (BranchTb) query.setMaxResults(1).getSingleResult();
            dmodel = new BranchModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public PaypointModel checkIfExisting(String paypointid) {
        PaypointModel dmodel = new PaypointModel();

        try {

            query = this.em.createNativeQuery("select * FROM product_paypoint_tb WHERE PPT_SYSID = "+ paypointid);

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new PaypointModel(obj, "");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveDropDown(BranchModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BranchTb branch = new BranchTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getBranchTbPK().getBranchSysid() == 0) {
               create(branch);
                result = "Branch created successfully...";
            } else {
                edit(branch);
                result = "Branch updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
