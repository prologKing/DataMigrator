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
import com.source1.entity.AosAgentsTb;
import com.model.AosAgentsTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosAgentsTbLogic extends AbstractFacade<AosAgentsTb> {
    EntityManager em;
    private Query query;

    public AosAgentsTbLogic() {
        super(AosAgentsTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AosAgentsTbModel> getAosAgentsTb() {
        List<AosAgentsTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosAgentsTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosAgentsTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                AosAgentsTbModel dmodel = new AosAgentsTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public AosAgentsTbModel getAosAgentsTbById(int id) {
        AosAgentsTbModel dmodel = new AosAgentsTbModel();

        try {
            query = getEM().createNamedQuery("AosAgentsTb.findByAgentsIndex");
            query.setParameter("agentsIndex", id);

            AosAgentsTb dropdown = (AosAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
     public AosAgentsTbModel getAosAgentsTbByCode(String id) {
        AosAgentsTbModel dmodel = new AosAgentsTbModel();

        try {
            query = getEM().createNamedQuery("AosAgentsTb.findByAgentsId");
            query.setParameter("agentsId", id);

            AosAgentsTb dropdown = (AosAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
     
     public AosAgentsTbModel getAosAgentsTbByFullname(String id) {
        AosAgentsTbModel dmodel = new AosAgentsTbModel();

        try {
            query = getEM().createNamedQuery("AosAgentsTb.findByAgentsName");
            query.setParameter("agentsName", id);

            AosAgentsTb dropdown = (AosAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new AosAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
