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
import com.destination2.entity.PolStartDateTb;
import com.model.PolStartDateTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PolStartDateTbLogic extends AbstractFacade<PolStartDateTb> {

    EntityManager em;
    private Query query;

    public PolStartDateTbLogic() {
        super(PolStartDateTb.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PolStartDateTbModel> getPolStartDateTbs() {
        List<PolStartDateTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolStartDateTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolStartDateTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                PolStartDateTbModel dmodel = new PolStartDateTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public PolStartDateTbModel getPolStartDateTbById(String id) {
        PolStartDateTbModel dmodel = new PolStartDateTbModel();

        try {
            query = getEM().createNamedQuery("PolStartDateTb.findByPolicyNum");
            query.setParameter("policyNum", id);

            PolStartDateTb bmapping = (PolStartDateTb) query.setMaxResults(1).getSingleResult();
            dmodel = new PolStartDateTbModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String savePolStartDateTb(PolStartDateTbModel dmodel) {
        String result = "There was a problem saving...";
        String date = dmodel.getStartDate();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        String mth = "";
        String day = "01";
        if (month == 12) {
            month = 1;
            year = year + 1;
        }else{
        month = month + 1;
        }
        if (String.valueOf(month).length() < 2) {
            mth = "0" + String.valueOf(month);
        } else {
            mth = "0" + String.valueOf(month);
        }

        String startDate = String.valueOf(year) + "-" + mth + "-" + day;
        dmodel.setStartDate(startDate);

        try {
            PolStartDateTb branch = new PolStartDateTb(dmodel);

            getEM().getTransaction().begin();
            edit(branch);
            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
