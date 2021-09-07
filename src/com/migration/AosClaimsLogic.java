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
import com.source1.entity.AosClaims;
import com.model.AosClaimsModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosClaimsLogic extends AbstractFacade<AosClaims> {
    EntityManager em;
    private Query query;

    public AosClaimsLogic() {
        super(AosClaims.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<AosClaimsModel> getAosClaims() {
        List<AosClaimsModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosClaims.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosClaims> branches = query.getResultList();

            branches.forEach((dd) -> {
                AosClaimsModel dmodel = new AosClaimsModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    

    public AosClaimsModel getAosClaimsById(int id) {
        AosClaimsModel dmodel = new AosClaimsModel();

        try {
            query = getEM().createNamedQuery("AosClaims.findByPcpSysid");
            query.setParameter("pcpSysid", id);

            AosClaims dropdown = (AosClaims) query.setMaxResults(1).getSingleResult();
            dmodel = new AosClaimsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    


    public String saveClaims(AosClaimsModel dmodel) {
        String result = "There was a problem saving...";

        try {
            AosClaims branch = new AosClaims(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getId() == 0) {
               create(branch);
                result = "AosClaims created successfully...";
            } else {
                edit(branch);
                result = "AosClaims updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
