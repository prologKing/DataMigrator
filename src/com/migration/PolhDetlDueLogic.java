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
import com.destination2.entity.PolhDetlDue;
import com.model.AgentIdListModel;
import com.model.PolhDetlDueModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PolhDetlDueLogic extends AbstractFacade<PolhDetlDue> {
    EntityManager em;
    private Query query;

    public PolhDetlDueLogic() {
        super(PolhDetlDue.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PolhDetlDueModel> getPolhDetlDue() {
        List<PolhDetlDueModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolhDetlDue.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhDetlDue> branches = query.getResultList();

            branches.forEach((dd) -> {
                PolhDetlDueModel dmodel = new PolhDetlDueModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
double totalDue = 0.00;
    public double getPolhDetlDueById(String id) {
        totalDue =  0.00;

        try {
            query = getEM().createNamedQuery("PolhDetlDue.findByDuePolNum");
            query.setParameter("duePolNum", id);

             List<PolhDetlDue> branches = query.getResultList();
             

            branches.forEach((dd) -> {
                totalDue += dd.getDueAmtBc().doubleValue();
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return totalDue;
    }
    
   public List<TotalDueModel> getTotal(String csv) {
        List<TotalDueModel> dlist = new ArrayList<>();

        try {
 
            String sql = "SELECT DUE_POL_NUM AS policyNum, SUM(DUE_AMT_BC) AS total FROM allztrnx.polh_detl_due WHERE DUE_POL_NUM IN("+csv+")"
                    +"GROUP BY DUE_POL_NUM";

            query = this.em.createNativeQuery(sql);

              List<Object[]> branches = query.getResultList();

            branches.forEach((dd) -> {
                TotalDueModel dmodel = new TotalDueModel(dd);
                dlist.add(dmodel);
            });

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    } 


    public String savePolhDetlDue(PolhDetlDueModel dmodel) {
        String result = "There was a problem saving...";

        try {
            PolhDetlDue branch = new PolhDetlDue(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getDueSysId() == 0) {
               create(branch);
                result = "PolhDetlDue created successfully...";
            } else {
                edit(branch);
                result = "PolhDetlDue updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
