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
import com.source2.entity.EasyappAgentsTb;
import com.model.EasyappAgentsTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EasyappAgentsTbLogic extends AbstractFacade<EasyappAgentsTb> {
    EntityManager em;
    private Query query;

    public EasyappAgentsTbLogic() {
        super(EasyappAgentsTb.class);
        em = new GenericLibrary().getEM("eazyapp").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EasyappAgentsTbModel> getEasyappAgents() {
        List<EasyappAgentsTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EasyappAgentsTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EasyappAgentsTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EasyappAgentsTbModel dmodel = new EasyappAgentsTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EasyappAgentsTbModel getEasyappAgentsTbById(int id) {
        EasyappAgentsTbModel dmodel = new EasyappAgentsTbModel();

        try {
            query = getEM().createNamedQuery("EasyappAgentsTb.findByAgentsIndex");
            query.setParameter("agentsIndex", id);

            EasyappAgentsTb dropdown = (EasyappAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EasyappAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    

    
     public EasyappAgentsTbModel getEasyappAgentsTbByCode(String id) {
        EasyappAgentsTbModel dmodel = new EasyappAgentsTbModel();

        try {
            query = getEM().createNamedQuery("EasyappAgentsTb.findByAgentsId");
            query.setParameter("agentsId", id);

            EasyappAgentsTb dropdown = (EasyappAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EasyappAgentsTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
