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
import com.source1.entity.ProductTransSusuTb;
import com.model.ProductTransSusuTbModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductTransSusuTbLogic extends AbstractFacade<ProductTransSusuTb> {
    EntityManager em;
    private Query query;

    public ProductTransSusuTbLogic() {
        super(ProductTransSusuTb.class);
        em = new GenericLibrary().getEM("aos").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductTransSusuTbModel> getProductTransSusuTbs() {
        List<ProductTransSusuTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductTransSusuTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductTransSusuTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                ProductTransSusuTbModel dmodel = new ProductTransSusuTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public ProductTransSusuTbModel getProductTransSusuTbById(int id) {
        ProductTransSusuTbModel dmodel = new ProductTransSusuTbModel();

        try {
            query = getEM().createNamedQuery("ProductTransSusuTb.findBySusuTransIndex");
            query.setParameter("susuTransIndex", id);

            ProductTransSusuTb bmapping = (ProductTransSusuTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductTransSusuTbModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public List<ProductTransSusuTbModel> getProductTransSusuTbByPolNum(String id) {
         List<ProductTransSusuTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductTransSusuTb.findBySusuTransPolicyNo");
            query.setParameter("susuTransPolicyNo", id);

           List<ProductTransSusuTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                ProductTransSusuTbModel dmodel = new ProductTransSusuTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<ProductTransSusuTbModel> getProductTransSusuTbByPolNum(String id, String num) {
         List<ProductTransSusuTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductTransSusuTb.findByAgentsIdAndPolnum");
            query.setParameter("susuTransAgentsId", id);
            query.setParameter("susuTransPolicyNo", num);

           List<ProductTransSusuTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                ProductTransSusuTbModel dmodel = new ProductTransSusuTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public String saveProductTransSusuTb(ProductTransSusuTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            ProductTransSusuTb branch = new ProductTransSusuTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getSusuTransIndex() == 0) {

                result = "ProductTransSusuTb created successfully...";
            } else {
                edit(branch);
                result = "ProductTransSusuTb updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
