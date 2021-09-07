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
import com.model.V1ProductModel;
import com.source1.entity.AosCustomerTb;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class AosCustomerTbLogic extends AbstractFacade<AosCustomerTb> {

    EntityManager em;
    private Query query;

    public AosCustomerTbLogic() {
        super(AosCustomerTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<CustomerModel> getCustomers() {
        List<CustomerModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("AosCustomerTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<AosCustomerTb> branches = query.getResultList();

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
            query = getEM().createNamedQuery("AosCustomerTb.findByCustomerindex");
            query.setParameter("customerindex", id);

            AosCustomerTb bmapping = (AosCustomerTb) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
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

    public String saveCustomer(CustomerModel dmodel) {
        String result = "There was a problem saving...";

        try {
            AosCustomerTb branch = new AosCustomerTb(dmodel);

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
