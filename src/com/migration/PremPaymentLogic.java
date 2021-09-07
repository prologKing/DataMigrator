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
import com.destination2.entity.PremPayment;
import com.model.PremPaymentModel;
import com.model.PremResvModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PremPaymentLogic extends AbstractFacade<PremPayment> {

    EntityManager em;
    private Query query;

    public PremPaymentLogic() {
        super(PremPayment.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PremPaymentModel> getPremPayments() {
        List<PremPaymentModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PremPayment.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PremPayment> branches = query.getResultList();

            branches.forEach((dd) -> {
                PremPaymentModel dmodel = new PremPaymentModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public PremPaymentModel getPremPaymentById(String id) {
        PremPaymentModel dmodel = new PremPaymentModel();

        try {
            query = getEM().createNamedQuery("PremPayment.findByV1teamId");
            query.setParameter("v1teamId", id);

            PremPayment bmapping = (PremPayment) query.setMaxResults(1).getSingleResult();
            dmodel = new PremPaymentModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String savePremPayment(PremPaymentModel dmodel) {
        String result = "There was a problem saving...";

        try {
             List<PremResvModel> ab = new PremResvLogic().getPremResvs(dmodel.getSusuTransPolicyNo(), new BigDecimal(dmodel.getSusuTransCredit().toString()), dmodel.getSusuTransDate());
            if(ab.isEmpty()){
            dmodel.setIsExist(0);
            }else{
            dmodel.setIsExist(1);
            }
             
             PremPayment branch = new PremPayment(dmodel);
           

            getEM().getTransaction().begin();

            if (dmodel.getSusuTransIndex() == 0) {
                create(branch);
                result = "PremPayment created successfully...";
            } else {
                edit(branch);
                result = "PremPayment updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}

