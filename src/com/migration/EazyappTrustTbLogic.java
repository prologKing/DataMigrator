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
import com.source2.entity.EazyappTrustTb;
import com.model.TrustTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazyappTrustTbLogic extends AbstractFacade<EazyappTrustTb> {
    EntityManager em;
    private Query query;

    public EazyappTrustTbLogic() {
        super(EazyappTrustTb.class);
        em = new GenericLibrary().getEM("eazyapp").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<TrustTbModel> getEazyappTrustTb() {
        List<TrustTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazyappTrustTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazyappTrustTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                TrustTbModel dmodel = new TrustTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public TrustTbModel getEazyappTrustTbByRefNo(String id) {
        TrustTbModel dmodel = new TrustTbModel();

        try {
            query = getEM().createNamedQuery("EazyappTrustTb.findByProductrMainTrustRefNo");
            query.setParameter("productrMainTrustRefNo", id);

            EazyappTrustTb dropdown = (EazyappTrustTb) query.setMaxResults(1).getSingleResult();
            dmodel = new TrustTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
