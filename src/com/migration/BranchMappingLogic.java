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
import com.destination1.entity.BranchMapping;
import com.model.BranchMappingModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class BranchMappingLogic extends AbstractFacade<BranchMapping> {
    EntityManager em;
    private Query query;

    public BranchMappingLogic() {
        super(BranchMapping.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<BranchMappingModel> getBranchMappings() {
        List<BranchMappingModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("BranchMapping.findAll");
            //query.setParameter("fieldname", fieldname);

            List<BranchMapping> branches = query.getResultList();

            branches.forEach((dd) -> {
                BranchMappingModel dmodel = new BranchMappingModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public BranchMappingModel getBranchMappingById(int id) {
        BranchMappingModel dmodel = new BranchMappingModel();

        try {
            query = getEM().createNamedQuery("BranchMapping.findByV1Id");
            query.setParameter("v1Id", id);

            BranchMapping bmapping = (BranchMapping) query.setMaxResults(1).getSingleResult();
            dmodel = new BranchMappingModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveBranchMapping(BranchMappingModel dmodel) {
        String result = "There was a problem saving...";

        try {
            BranchMapping branch = new BranchMapping(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getId() == 0) {

                result = "BranchMapping created successfully...";
            } else {
                edit(branch);
                result = "BranchMapping updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
