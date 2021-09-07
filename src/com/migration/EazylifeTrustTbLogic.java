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
import com.source3.entity.EazylifeTrustTb;
import com.model.TrustTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifeTrustTbLogic extends AbstractFacade<EazylifeTrustTb> {
    EntityManager em;
    private Query query;

    public EazylifeTrustTbLogic() {
        super(EazylifeTrustTb.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<TrustTbModel> getEazylifeTrustTb() {
        List<TrustTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifeTrustTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifeTrustTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                TrustTbModel dmodel = new TrustTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public TrustTbModel getEazylifeTrustTbByRefNo(String id) {
        TrustTbModel dmodel = new TrustTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeTrustTb.findByProductrMainTrustRefNo");
            query.setParameter("productrMainTrustRefNo", id);

            EazylifeTrustTb dropdown = (EazylifeTrustTb) query.setMaxResults(1).getSingleResult();
            dmodel = new TrustTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
