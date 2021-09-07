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
import com.model.UsersModel;
import com.destination2.entity.CustomerTb;
import com.model.BankBranchModel;
import com.model.BranchModel;
import com.model.CustomerIdMappingModel;
import com.model.CustomerTbModel;
import com.model.PaypointModel;
import com.model.V1ProductModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author Bolaji
 */
public class CustomerTbLogic extends AbstractFacade<CustomerTb> {

    EntityManager em;
    private Query query;

    public CustomerTbLogic() {
        super(CustomerTb.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }
    
     public CustomerTbLogic(String db) {
        super(CustomerTb.class);
        em = new GenericLibrary().getEM(db).createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<CustomerTbModel> getCustomers() {
        List<CustomerTbModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("CustomerTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<CustomerTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                CustomerTbModel dmodel = new CustomerTbModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public CustomerTbModel getCustomerById(int id) {
        CustomerTbModel dmodel = new CustomerTbModel();

        try {
            query = getEM().createNamedQuery("CustomerTb.findByCusSysid");
            query.setParameter("cusSysid", id);

            CustomerTb bmapping = (CustomerTb) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerTbModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public CustomerTbModel getCustomerByCode(String id) {
        CustomerTbModel dmodel = new CustomerTbModel();

        try {
            query = getEM().createNamedQuery("CustomerTb.findByCusCode");
            query.setParameter("cusCode", id);

            CustomerTb bmapping = (CustomerTb) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerTbModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public CustomerTbModel checkIfExisting(String fullname, String mobile) {
        CustomerTbModel dmodel = new CustomerTbModel();

        try {
            String[] names = fullname.split(" ");
            String[] all = names;
            String condition = "";
            for (String name : all) {
                condition += "(CUS_SURNAME Like '%" + name + "%' OR CUS_MIDNAME Like '%" + name + "%' OR CUS_FIRSTNAME Like '%" + name + "%') AND ";
            }

            String qu = mobile == null ? " CUS_MOBILE IS NULL " : " CUS_MOBILE = '" + mobile + "'";

            query = this.em.createNativeQuery("select * FROM customer_tb WHERE " + condition + qu);

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerTbModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    
    public BankBranchModel getFilteredProduct(String fullname, String sysid) {
        BankBranchModel dmodel = new BankBranchModel();

        try {
            String[] names = fullname.split(" ");
            String[] all = names;
            String condition = "";
            for (String name : all) {
                condition += " ";
                condition += "PBKB_NAME Like '%" + name + "%' OR";
            }
            condition = condition.replaceAll(" [^ ]+$", "");

            query = this.em.createNativeQuery("SELECT PBK_SYSID, PBK_NAME, PBKB_PBK_SYSID, PBKB_NAME, PBKB_SORT_CODE FROM product_bank_tb s, product_bank_branch_tb t  "
                    + "WHERE s.PBK_SYSID = t.PBKB_PBK_SYSID  AND PBK_SYSID = " + sysid + " AND (" + condition + ") LIMIT 1");

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new BankBranchModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
     public PaypointModel getPayPointInfo(String sysid) {
        PaypointModel dmodel = new PaypointModel();

        try {

            query = this.em.createNativeQuery("SELECT PPT_SYSID, PPT_NAME FROM product_paypoint_tb WHERE PPT_ACRONYM = '" + sysid + "' LIMIT 1");

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new PaypointModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
     public BankBranchModel getBankBranchBySysID(String sysid) {
        BankBranchModel dmodel = new BankBranchModel();

        try {

            query = this.em.createNativeQuery("SELECT s.PBK_SYSID, s.PBK_NAME, t.PBKB_PBK_SYSID, t.PBKB_NAME, t.PBKB_SORT_CODE FROM product_bank_tb s, product_bank_branch_tb t  "
                    + "WHERE s.PBK_SYSID = t.PBKB_PBK_SYSID  AND PBK_SYSID = " + sysid + " AND t.PBKB_NAME = 'HEAD OFFICE' LIMIT 1");

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new BankBranchModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public static String randomPassword(int len) {
        final String characters = "0123456789ABCDEFGHIJKLMNPQRSTUVWXYZ";
        String newpass = RandomStringUtils.random(len, characters);
        return newpass;
    }

    public String saveCustomer(CustomerModel dmodel, String db) {
        String result = "There was a problem saving...";
        UsersLogic ulogic = new UsersLogic(db);
        UsersLogic ulogic2 = new UsersLogic();
        String cusid = "";

        try {
            String fname = dmodel.getCustomerFirstname() == null ? "" : dmodel.getCustomerFirstname();
            String mname = dmodel.getCustomerMiddleName() == null ? "" : dmodel.getCustomerMiddleName();
            String lname = dmodel.getCustomerSurname() == null ? "" : dmodel.getCustomerSurname();

            String fullname = fname + " "+ mname + " "+ lname;
            CustomerTbModel ctbmodel = this.checkIfExisting(fullname, dmodel.getCustomerMobile());
            if (ctbmodel.getCusCode() == null) {
                cusid = "NCI" + CustomerTbLogic.randomPassword(10);
            }
            if (ctbmodel.getCusCode() == null && ctbmodel.getCustomerTbPK().getCusSysid() != 0) {
                ctbmodel.setCusCode(cusid);
            }
            if (ctbmodel.getCustomerTbPK().getCusSysid() == 0) {
                CustomerTbModel br = new CustomerTbModel(dmodel);
                CustomerTb branch = new CustomerTb(br);
                if (br.getCusCode() != null && br.getCusCode().length() == 0) {
                    branch.setCusCode(cusid);
                    ctbmodel.setCusCode(cusid);
                }
                UsersModel usmodel = ulogic.getUsersRecord(dmodel.getCustomerUserindex());
                UsersModel umodel = ulogic2.checkIfExisting(usmodel.getUserSurname(), usmodel.getUserMobile());

                branch.getCustomerTbPK().setCusUserSysid(umodel.getUsersTbPK().getUserSysid());
                branch.getCustomerTbPK().setCusBranchSysid(umodel.getUsersTbPK().getUserBranchSysid());
                branch.setCusCrtUser(umodel.getUserName());
                if (umodel.getUsersTbPK().getUserSysid() == 0) {
                    UsersModel umodel2 = ulogic2.checkIfExisting(usmodel.getUserSurname(), usmodel.getUserMobile());
                    branch.getCustomerTbPK().setCusUserSysid(umodel2.getUsersTbPK().getUserSysid() == 0 ? 43 : umodel2.getUsersTbPK().getUserSysid());
                    branch.getCustomerTbPK().setCusBranchSysid(umodel2.getUsersTbPK().getUserBranchSysid() == 0 ? 50 : umodel2.getUsersTbPK().getUserBranchSysid());
                    branch.setCusCrtUser(umodel2.getUserName() == null ? "ddanso" : umodel.getUserName());
                }
                BranchModel bmodel = new BranchLogic().getBranchById(branch.getCustomerTbPK().getCusBranchSysid());

                branch.setCusBranchCode(bmodel.getBranchCode());
                getEM().getTransaction().begin();

                if (br.getCustomerTbPK().getCusSysid() == 0) {
                    create(branch);
                    result = "Customer created successfully...";
                } else {
                    edit(branch);
                    result = "Customer updated successfully...";
                }

                getEM().getTransaction().commit();
            } else {
                new CustomerIdMappingLogic().saveCustomerIdMapping(new CustomerIdMappingModel(0, ctbmodel.getCusCode(), dmodel.getCustomerRefNo()));
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String saveCustomer(CustomerTbModel dmodel) {
        String result = "There was a problem saving...";
        

        try {
                CustomerTb branch = new CustomerTb(dmodel);
                
                getEM().getTransaction().begin();

                if (branch.getCustomerTbPK().getCusSysid() == 0) {
                    create(branch);
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
