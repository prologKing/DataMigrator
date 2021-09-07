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
import com.source1.entity.AosPolicyDetails;
import com.model.AosPolicyDetailsModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosPolicyDetailsLogic extends AbstractFacade<AosPolicyDetails> {
    EntityManager em;
    private Query query;

    public AosPolicyDetailsLogic() {
        super(AosPolicyDetails.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AosPolicyDetailsModel> getAosPolicyDetails() {
        List<AosPolicyDetailsModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosPolicyDetails.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosPolicyDetails> agents = query.getResultList();

            agents.forEach((dd) -> {
                AosPolicyDetailsModel dmodel = new AosPolicyDetailsModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public AosPolicyDetailsModel getAosPolicyDetailsById(String id) {
        AosPolicyDetailsModel dmodel = new AosPolicyDetailsModel();

        try {
            query = getEM().createNamedQuery("AosPolicyDetails.findByProductrRefNo");
            query.setParameter("productrRefNo", id);

            AosPolicyDetails dropdown = (AosPolicyDetails) query.setMaxResults(1).getSingleResult();
            dmodel = new AosPolicyDetailsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public AosPolicyDetailsModel getEazyappPolicyDetailsByPolhNum(String id) {
        AosPolicyDetailsModel dmodel = new AosPolicyDetailsModel();

        try {
            query = getEM().createNamedQuery("AosPolicyDetails.findByProductMainPolicyNo");
            query.setParameter("productMainPolicyNo", id);

            AosPolicyDetails dropdown = (AosPolicyDetails) query.setMaxResults(1).getSingleResult();
            dmodel = new AosPolicyDetailsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
