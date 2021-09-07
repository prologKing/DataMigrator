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
import com.source2.entity.EazyappDependTb;
import com.model.EazyappDependTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazyappDependTbLogic extends AbstractFacade<EazyappDependTb> {
    EntityManager em;
    private Query query;

    public EazyappDependTbLogic() {
        super(EazyappDependTb.class);
        em = new GenericLibrary().getEM("eazyapp").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazyappDependTbModel> getEazyappDependTb() {
        List<EazyappDependTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazyappDependTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazyappDependTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazyappDependTbModel dmodel = new EazyappDependTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazyappDependTbModel getEazyappDependTbById(String id) {
        EazyappDependTbModel dmodel = new EazyappDependTbModel();

        try {
            query = getEM().createNamedQuery("EazyappDependTb.findByProductMainDepndIndex");
            query.setParameter("productMainDepndIndex", id);

            EazyappDependTb dropdown = (EazyappDependTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazyappDependTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
