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
import com.source3.entity.EazylifeTeamTb;
import com.model.EazylifeTeamTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifeTeamTbLogic extends AbstractFacade<EazylifeTeamTb> {
    EntityManager em;
    private Query query;

    public EazylifeTeamTbLogic() {
        super(EazylifeTeamTb.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazylifeTeamTbModel> getEazylifeAgents() {
        List<EazylifeTeamTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifeTeamTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifeTeamTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazylifeTeamTbModel dmodel = new EazylifeTeamTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public EazylifeTeamTbModel getEazylifeTeamTbById(String id) {
        EazylifeTeamTbModel dmodel = new EazylifeTeamTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeTeamTb.findByTeamIndex");
            query.setParameter("teamIndex", Integer.parseInt(id));

            EazylifeTeamTb dropdown = (EazylifeTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    

    
     public EazylifeTeamTbModel getEazylifeTeamTbByCode(String id) {
        EazylifeTeamTbModel dmodel = new EazylifeTeamTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeTeamTb.findByTeamId");
            query.setParameter("teamId", id);

            EazylifeTeamTb dropdown = (EazylifeTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
     
     public EazylifeTeamTbModel getAosAgentsTbByFullname(String id) {
        EazylifeTeamTbModel dmodel = new EazylifeTeamTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeTeamTb.findByTeamName");
            query.setParameter("teamName", id);

            EazylifeTeamTb dropdown = (EazylifeTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
