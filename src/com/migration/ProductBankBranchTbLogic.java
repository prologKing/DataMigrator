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
import com.destination1.entity.ProductBankBranchTb;
import com.model.BankInfo;
import com.model.ProductBankBranchTbModel;
import com.model.ProductBankBranchTbPKModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductBankBranchTbLogic extends AbstractFacade<ProductBankBranchTb> {

    EntityManager em;
    private Query query;

    public ProductBankBranchTbLogic(String db) {
        super(ProductBankBranchTb.class);
        em = new GenericLibrary().getEM(db).createEntityManager();
    }

    public ProductBankBranchTbLogic() {
        super(ProductBankBranchTb.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductBankBranchTbModel> getProductBankBranchTb() {
        List<ProductBankBranchTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductBankBranchTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductBankBranchTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                ProductBankBranchTbModel dmodel = new ProductBankBranchTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public ProductBankBranchTbModel getProductBankBranchTbById(int id) {
        ProductBankBranchTbModel dmodel = new ProductBankBranchTbModel();

        try {
            query = getEM().createNamedQuery("ProductBankBranchTb.findByPbkbSysid");
            query.setParameter("pbkbSysid", id);

            ProductBankBranchTb bmapping = (ProductBankBranchTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductBankBranchTbModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public List<BankInfo> UpdateRecord() {
       List<BankInfo> dlist = new ArrayList<>();

        try {

            query = this.em.createNativeQuery("select column1, column2, column3, column4, column5, column6 from bankinfo where column1 = 0");

            List<Object[]> objlist = (List<Object[]>) query.getResultList();
             objlist.forEach((dd) -> {
                BankInfo dmodel = new BankInfo(dd);
                dlist.add(dmodel);
            });

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public String saveProductBankBranchTb(ProductBankBranchTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            List<BankInfo> blist = this.UpdateRecord();
            for(BankInfo binfo : blist){
            dmodel.setPbbranckPK(new ProductBankBranchTbPKModel(Integer.parseInt(binfo.getColumn1()), Integer.parseInt(binfo.getColumn2()),43));
            dmodel.setPbkbCrtDt(String.valueOf(LocalDate.now()));
            dmodel.setPbkbDt(String.valueOf(LocalDate.now()));
            dmodel.setPbkbName(binfo.getColumn4());
            dmodel.setPbkbSortCode(binfo.getColumn5());
            dmodel.setPbkbSts(binfo.getColumn6());
            ProductBankBranchTb users = new ProductBankBranchTb(dmodel);

            getEM().getTransaction().begin();

            if (users.getProductBankBranchTbPK().getPbkbSysid() == 0) {
                create(users);
                result = "ProductBankBranchTb created successfully...";
            } 

            getEM().getTransaction().commit();
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
