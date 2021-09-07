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
import com.model.CustomerModel;
import com.model.V1BankBranchModel;
import com.model.V1ProductModel;
import com.source3.entity.EazylifeCustomerTb;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class EazylifeCustomerTbLogic extends AbstractFacade<EazylifeCustomerTb> {
    EntityManager em;
    private Query query;

    public EazylifeCustomerTbLogic() {
        super(EazylifeCustomerTb.class);
        em = new GenericLibrary().getEM("eazylife").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }
    
     public V1ProductModel getProductByCode(String id) {

        V1ProductModel dmodel = new V1ProductModel();
        if(id == null){
        id = "";
        }
        try {
            query = this.em.createNativeQuery("select product_index, product_code, product_name FROM product_tb WHERE product_index = '" + id + "'");
           Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new V1ProductModel(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
     
     public V1BankBranchModel getBankBranchByCode(String id) {

        V1BankBranchModel dmodel = new V1BankBranchModel();
        if("".equals(id)){
        id = null;
        }

        try {
            query = this.em.createNativeQuery("select bank_branch_index, bank_branch_name FROM product_bank_branch_tb WHERE bank_branch_index = " + id + " LIMIT 1");
           Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new V1BankBranchModel(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public List<CustomerModel> getCustomers() {
        List<CustomerModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("EazylifeCustomerTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<EazylifeCustomerTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                CustomerModel dmodel = new CustomerModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public CustomerModel getCustomerById(int id) {
        CustomerModel dmodel = new CustomerModel();

        try {
            query = getEM().createNamedQuery("EazylifeCustomerTb.findByCustomerindex");
            query.setParameter("customerindex", id);

            EazylifeCustomerTb bmapping = (EazylifeCustomerTb) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveCustomer(CustomerModel dmodel) {
        String result = "There was a problem saving...";

        try {
            EazylifeCustomerTb branch = new EazylifeCustomerTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getCustomerindex() == 0) {

                result = "Customer created successfully...";
            } else {
                edit(branch);
                result = "Customer updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
