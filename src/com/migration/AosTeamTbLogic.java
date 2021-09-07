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
import com.source1.entity.AosTeamTb;
import com.model.AosTeamTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosTeamTbLogic extends AbstractFacade<AosTeamTb> {
    EntityManager em;
    private Query query;
    public AosTeamTbLogic() {
        super(AosTeamTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AosTeamTbModel> getAosTeamTb() {
        List<AosTeamTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosTeamTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosTeamTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                AosTeamTbModel dmodel = new AosTeamTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public AosTeamTbModel getAosTeamTbById(String id) {
        AosTeamTbModel dmodel = new AosTeamTbModel();

        try {
            query = getEM().createNamedQuery("AosTeamTb.findByTeamid");
            query.setParameter("teamId", id);

            AosTeamTb dropdown = (AosTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public AosTeamTbModel getAosAgentsTbByFullname(String id) {
        AosTeamTbModel dmodel = new AosTeamTbModel();

        try {
            query = getEM().createNamedQuery("AosTeamTb.findByTeamName");
            query.setParameter("teamName", id);

            AosTeamTb dropdown = (AosTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
