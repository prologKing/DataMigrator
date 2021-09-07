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
import com.source3.entity.EazylifeBenefTb;
import com.model.EazylifeBenefTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifeBenefTbLogic extends AbstractFacade<EazylifeBenefTb> {
    EntityManager em;
    private Query query;

    public EazylifeBenefTbLogic() {
        super(EazylifeBenefTb.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazylifeBenefTbModel> getEazylifeBenefTb() {
        List<EazylifeBenefTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifeBenefTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifeBenefTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazylifeBenefTbModel dmodel = new EazylifeBenefTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazylifeBenefTbModel getEazylifeBenefTbById(String id) {
        EazylifeBenefTbModel dmodel = new EazylifeBenefTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeBenefTb.findByProductBeneIndex");
            query.setParameter("productBeneIndex", id);

            EazylifeBenefTb dropdown = (EazylifeBenefTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeBenefTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
