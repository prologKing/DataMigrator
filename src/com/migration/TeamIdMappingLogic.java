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
import com.destination1.entity.TeamIdMapping;
import com.model.TeamIdMappingModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class TeamIdMappingLogic extends AbstractFacade<TeamIdMapping> {

    EntityManager em;
    private Query query;

    public TeamIdMappingLogic() {
        super(TeamIdMapping.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<TeamIdMappingModel> getTeamIdMappings() {
        List<TeamIdMappingModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("TeamIdMapping.findAll");
            //query.setParameter("fieldname", fieldname);

            List<TeamIdMapping> branches = query.getResultList();

            branches.forEach((dd) -> {
                TeamIdMappingModel dmodel = new TeamIdMappingModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public TeamIdMappingModel getTeamIdMappingById(String id) {
        TeamIdMappingModel dmodel = new TeamIdMappingModel();

        try {
            query = getEM().createNamedQuery("TeamIdMapping.findByV1teamId");
            query.setParameter("v1teamId", id);

            TeamIdMapping bmapping = (TeamIdMapping) query.setMaxResults(1).getSingleResult();
            dmodel = new TeamIdMappingModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveTeamIdMapping(TeamIdMappingModel dmodel) {
        String result = "There was a problem saving...";

        try {
            TeamIdMapping branch = new TeamIdMapping(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getId() == 0) {
                create(branch);
                result = "TeamIdMapping created successfully...";
            } else {
                edit(branch);
                result = "TeamIdMapping updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
