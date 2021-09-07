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
import com.source3.entity.EazylifeDependTb;
import com.model.EazylifeDependTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifeDependTbLogic extends AbstractFacade<EazylifeDependTb> {
    EntityManager em;
    private Query query;

    public EazylifeDependTbLogic() {
        super(EazylifeDependTb.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazylifeDependTbModel> getEazylifeDependTb() {
        List<EazylifeDependTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifeDependTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifeDependTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazylifeDependTbModel dmodel = new EazylifeDependTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazylifeDependTbModel getEazylifeDependTbById(String id) {
        EazylifeDependTbModel dmodel = new EazylifeDependTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeDependTb.findByProductMainDepndIndex");
            query.setParameter("productMainDepndIndex", id);

            EazylifeDependTb dropdown = (EazylifeDependTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeDependTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
