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
import com.source1.entity.AosDependTb;
import com.model.AosDependTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosDependTbLogic extends AbstractFacade<AosDependTb> {
    EntityManager em;
    private Query query;

    public AosDependTbLogic() {
        super(AosDependTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AosDependTbModel> getAosDependTb() {
        List<AosDependTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosDependTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosDependTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                AosDependTbModel dmodel = new AosDependTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public AosDependTbModel getAosDependTbById(String id) {
        AosDependTbModel dmodel = new AosDependTbModel();

        try {
            query = getEM().createNamedQuery("AosDependTb.findByProductMainDepndIndex");
            query.setParameter("productMainDepndIndex", id);

            AosDependTb dropdown = (AosDependTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosDependTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
