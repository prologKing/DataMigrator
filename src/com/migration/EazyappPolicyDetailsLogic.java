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
import com.source2.entity.EazyappPolicyDetails;
import com.model.EazyappPolicyDetailsModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazyappPolicyDetailsLogic extends AbstractFacade<EazyappPolicyDetails> {
    EntityManager em;
    private Query query;

    public EazyappPolicyDetailsLogic() {
        super(EazyappPolicyDetails.class);
        em = new GenericLibrary().getEM("eazyapp").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazyappPolicyDetailsModel> getEazyappPolicyDetails() {
        List<EazyappPolicyDetailsModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazyappPolicyDetails.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazyappPolicyDetails> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazyappPolicyDetailsModel dmodel = new EazyappPolicyDetailsModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazyappPolicyDetailsModel getEazyappPolicyDetailsByRefNo(String id) {
        EazyappPolicyDetailsModel dmodel = new EazyappPolicyDetailsModel();

        try {
            query = getEM().createNamedQuery("EazyappPolicyDetails.findByProductrRefNo");
            query.setParameter("productrRefNo", id);

            EazyappPolicyDetails dropdown = (EazyappPolicyDetails) query.setMaxResults(1).getSingleResult();
            dmodel = new EazyappPolicyDetailsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public EazyappPolicyDetailsModel getEazyappPolicyDetailsByPolhNum(String id) {
        EazyappPolicyDetailsModel dmodel = new EazyappPolicyDetailsModel();

        try {
            query = getEM().createNamedQuery("EazyappPolicyDetails.findByProductMainPolicyNo");
            query.setParameter("productMainPolicyNo", id);

            EazyappPolicyDetails dropdown = (EazyappPolicyDetails) query.setMaxResults(1).getSingleResult();
            dmodel = new EazyappPolicyDetailsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
