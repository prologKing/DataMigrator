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
import com.source3.entity.EazylifePolicyDetails;
import com.model.EazylifePolicyDetailsModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifePolicyDetailsLogic extends AbstractFacade<EazylifePolicyDetails> {
    EntityManager em;
    private Query query;

    public EazylifePolicyDetailsLogic() {
        super(EazylifePolicyDetails.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazylifePolicyDetailsModel> getEazylifePolicyDetails() {
        List<EazylifePolicyDetailsModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifePolicyDetails.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifePolicyDetails> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazylifePolicyDetailsModel dmodel = new EazylifePolicyDetailsModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazylifePolicyDetailsModel getEazylifePolicyDetailsByRefNo(String id) {
        EazylifePolicyDetailsModel dmodel = new EazylifePolicyDetailsModel();

        try {
            query = getEM().createNamedQuery("EazylifePolicyDetails.findByProductrRefNo");
            query.setParameter("productrRefNo", id);

            EazylifePolicyDetails dropdown = (EazylifePolicyDetails) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifePolicyDetailsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
