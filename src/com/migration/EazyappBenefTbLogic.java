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
import com.source2.entity.EazyappBenefTb;
import com.model.EazyappBenefTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazyappBenefTbLogic extends AbstractFacade<EazyappBenefTb> {
    EntityManager em;
    private Query query;

    public EazyappBenefTbLogic() {
        super(EazyappBenefTb.class);
        em = new GenericLibrary().getEM("eazyapp").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazyappBenefTbModel> getEazyappBenefTb() {
        List<EazyappBenefTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazyappBenefTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazyappBenefTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazyappBenefTbModel dmodel = new EazyappBenefTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazyappBenefTbModel getEazyappBenefTbById(String id) {
        EazyappBenefTbModel dmodel = new EazyappBenefTbModel();

        try {
            query = getEM().createNamedQuery("EazyappBenefTb.findByProductBeneIndex");
            query.setParameter("productBeneIndex", id);

            EazyappBenefTb dropdown = (EazyappBenefTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazyappBenefTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
