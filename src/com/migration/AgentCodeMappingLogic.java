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
import com.destination1.entity.AgentCodeMapping;
import com.model.AgentCodeMappingModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AgentCodeMappingLogic extends AbstractFacade<AgentCodeMapping> {

    EntityManager em;
    private Query query;

    public AgentCodeMappingLogic() {
        super(AgentCodeMapping.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AgentCodeMappingModel> getAgentCodeMappings() {
        List<AgentCodeMappingModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AgentCodeMapping.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AgentCodeMapping> branches = query.getResultList();

            branches.forEach((dd) -> {
                AgentCodeMappingModel dmodel = new AgentCodeMappingModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public List<AgentCodeMappingModel> getAgentCodeMappingById(String id) {
        List<AgentCodeMappingModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AgentCodeMapping.findByStoredCode");
            query.setParameter("storedCode", id);

             List<AgentCodeMapping> branches = query.getResultList();

            branches.forEach((dd) -> {
                AgentCodeMappingModel dmodel = new AgentCodeMappingModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public String saveAgentMapping(AgentCodeMappingModel dmodel) {
        String result = "There was a problem saving...";

        try {
            AgentCodeMapping branch = new AgentCodeMapping(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getId() == 0) {
                create(branch);
                result = "AgentCodeMapping created successfully...";
            } else {
                edit(branch);
                result = "AgentCodeMapping updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
