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
import com.source1.entity.AosTrustTb;
import com.model.TrustTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosTrustTbLogic extends AbstractFacade<AosTrustTb> {
    EntityManager em;
    private Query query;

    public AosTrustTbLogic() {
        super(AosTrustTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<TrustTbModel> getAosTrustTb() {
        List<TrustTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosTrustTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosTrustTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                TrustTbModel dmodel = new TrustTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public TrustTbModel getAosTrustTbByRefNo(String id) {
        TrustTbModel dmodel = new TrustTbModel();

        try {
            query = getEM().createNamedQuery("AosTrustTb.findByProductrMainTrustRefNo");
            query.setParameter("productrMainTrustRefNo", id);

            AosTrustTb dropdown = (AosTrustTb) query.setMaxResults(1).getSingleResult();
            dmodel = new TrustTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
