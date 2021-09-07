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
import com.destination2.entity.AgentIdList;
import com.model.AgentIdListModel;
import com.model.BranchModel;
import com.model.PaypointModel;
import com.model.PolhDetlModel;
import com.model.ProductAgentsModel;
import com.model.V2ProductModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AgentIdListLogic extends AbstractFacade<AgentIdList> {
    EntityManager em;
    private Query query;

    public AgentIdListLogic() {
        super(AgentIdList.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AgentIdListModel> getAgentIdLists() {
        List<AgentIdListModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AgentIdList.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AgentIdList> branches = query.getResultList();

            branches.forEach((dd) -> {
                AgentIdListModel dmodel = new AgentIdListModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public AgentIdListModel getById(String id) {
        AgentIdListModel dmodel = new AgentIdListModel();

        try {
            query = getEM().createNamedQuery("AgentIdList.findByPolicyNumber");
            query.setParameter("policyNumber", id);

            AgentIdList bmapping = (AgentIdList) query.setMaxResults(1).getSingleResult();
            dmodel = new AgentIdListModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
     public String saveAdditionalInfo(AgentIdListModel dmodel) {
        String result = "There was a problem saving...";

        try {
            
            PolhDetlModel pmodel = new PolhDetlLogic().getPolhDetlById(dmodel.getPolicyNumber());
            ProductAgentsModel agentmodel = new ProductAgentsTbLogic().getProductAgentsTbById(pmodel.getPolhAgnt1());
            if(agentmodel.getProductAgentsTbPK().getPagtSysid() != 0){
            getEM().getTransaction().begin();
            dmodel.setNewAgentId(agentmodel.getPagtOthname() + ' '+agentmodel.getPagtSurname());
            AgentIdList branch = new AgentIdList(dmodel);
           
            edit(branch);
            getEM().getTransaction().commit();
            
            }
               
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
     
     public String getChannelsOfDistribution(AgentIdListModel dmodel) {
        String result = "There was a problem saving...";

        try {
            
            PolhDetlModel pmodel = new PolhDetlLogic().getPolhDetlById(dmodel.getPolicyNumber());
            ProductAgentsModel agentmodel = new ProductAgentsTbLogic().getProductAgentsTbById(pmodel.getPolhAgnt1());
            if(agentmodel.getProductAgentsTbPK().getPagtSysid() != 0){
            getEM().getTransaction().begin();
            BranchModel bmodel  = new BranchLogic().getBranchById(agentmodel.getProductAgentsTbPK().getPagtBranchSysid());
            dmodel.setNewAgentId(bmodel.getBranchName());
            AgentIdList branch = new AgentIdList(dmodel);
            edit(branch);
            getEM().getTransaction().commit();
            
            }
               
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
     
     public String getTotalDue(AgentIdListModel dmodel) {
        String result = "There was a problem saving...";

        try {
            getEM().getTransaction().begin();
            AgentIdList branch = new AgentIdList(dmodel);
            edit(branch);
            getEM().getTransaction().commit();
           
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
     
    
}
