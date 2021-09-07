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
import com.destination2.entity.CustomerIdMapping;
import com.model.CustomerIdMappingModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class CustomerIdMappingLogic extends AbstractFacade<CustomerIdMapping> {

    EntityManager em;
    private Query query;

    public CustomerIdMappingLogic() {
        super(CustomerIdMapping.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<CustomerIdMappingModel> getCustomerIdMappings() {
        List<CustomerIdMappingModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("CustomerIdMapping.findAll");
            //query.setParameter("fieldname", fieldname);

            List<CustomerIdMapping> branches = query.getResultList();

            branches.forEach((dd) -> {
                CustomerIdMappingModel dmodel = new CustomerIdMappingModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public CustomerIdMappingModel getCustomerIdMappingById(String id) {
        CustomerIdMappingModel dmodel = new CustomerIdMappingModel();

        try {
            query = getEM().createNamedQuery("CustomerIdMapping.findByV1teamId");
            query.setParameter("v1teamId", id);

            CustomerIdMapping bmapping = (CustomerIdMapping) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerIdMappingModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveCustomerIdMapping(CustomerIdMappingModel dmodel) {
        String result = "There was a problem saving...";

        try {
            CustomerIdMapping branch = new CustomerIdMapping(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getId() == 0) {
                create(branch);
                result = "CustomerIdMapping created successfully...";
            } else {
                edit(branch);
                result = "CustomerIdMapping updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}

