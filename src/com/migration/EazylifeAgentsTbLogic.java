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
import com.source3.entity.EazylifeAgentsTb;
import com.model.EazylifeAgentsTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifeAgentsTbLogic extends AbstractFacade<EazylifeAgentsTb> {
    EntityManager em;
    private Query query;

    public EazylifeAgentsTbLogic() {
        super(EazylifeAgentsTb.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EazylifeAgentsTbModel> getEazylifeAgents() {
        List<EazylifeAgentsTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifeAgentsTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifeAgentsTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EazylifeAgentsTbModel dmodel = new EazylifeAgentsTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EazylifeAgentsTbModel getEazylifeAgentsTbById(int id) {
        EazylifeAgentsTbModel dmodel = new EazylifeAgentsTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeAgentsTb.findByAgentsIndex");
            query.setParameter("agentsIndex", id);

            EazylifeAgentsTb dropdown = (EazylifeAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    

    
     public EazylifeAgentsTbModel getEazylifeAgentsTbByCode(String id) {
        EazylifeAgentsTbModel dmodel = new EazylifeAgentsTbModel();

        try {
            query = getEM().createNamedQuery("EazylifeAgentsTb.findByAgentsId");
            query.setParameter("agentsId", id);

            EazylifeAgentsTb dropdown = (EazylifeAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EazylifeAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
