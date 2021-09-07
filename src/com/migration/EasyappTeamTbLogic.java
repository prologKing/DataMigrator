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
import com.source2.entity.EasyappTeamTb;
import com.model.EasyappTeamTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EasyappTeamTbLogic extends AbstractFacade<EasyappTeamTb> {
    EntityManager em;
    private Query query;

    public EasyappTeamTbLogic() {
        super(EasyappTeamTb.class);
        em = new GenericLibrary().getEM("eazyapp").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<EasyappTeamTbModel> getEasyappTeamTb() {
        List<EasyappTeamTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EasyappTeamTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EasyappTeamTb> agents = query.getResultList();

            agents.forEach((dd) -> {
                EasyappTeamTbModel dmodel = new EasyappTeamTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public EasyappTeamTbModel getEasyappTeamTbById(String id) {
        EasyappTeamTbModel dmodel = new EasyappTeamTbModel();

        try {
            query = getEM().createNamedQuery("EasyappTeamTb.findByTeamIndex");
            query.setParameter("teamIndex", Integer.parseInt(id));

            EasyappTeamTb dropdown = (EasyappTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EasyappTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public EasyappTeamTbModel getAosAgentsTbByFullname(String id) {
        EasyappTeamTbModel dmodel = new EasyappTeamTbModel();

        try {
            query = getEM().createNamedQuery("EasyappTeamTb.findByTeamName");
            query.setParameter("teamName", id);

            EasyappTeamTb dropdown = (EasyappTeamTb) query.setMaxResults(1).getSingleResult();
            dmodel = new EasyappTeamTbModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

}
