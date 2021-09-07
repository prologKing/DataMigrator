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
import com.source1.entity.AosBenefTb;
import com.model.AosBenefTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosBenefTbLogic extends AbstractFacade<AosBenefTb> {
    EntityManager em;
    private Query query;

    public AosBenefTbLogic() {
        super(AosBenefTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AosBenefTbModel> getAosBenefTb() {
        List<AosBenefTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosBenefTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosBenefTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                AosBenefTbModel dmodel = new AosBenefTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public AosBenefTbModel getAosBenefTbById(String id) {
        AosBenefTbModel dmodel = new AosBenefTbModel();

        try {
            query = getEM().createNamedQuery("AosBenefTb.findByProductBeneIndex");
            query.setParameter("productBeneIndex", id);

            AosBenefTb dropdown = (AosBenefTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosBenefTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
