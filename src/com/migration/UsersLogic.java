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
import com.destination1.entity.UsersTb;
import com.model.ProductAgentsModel;
import com.model.UsersModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class UsersLogic extends AbstractFacade<UsersTb> {

    EntityManager em;
    private Query query;

    public UsersLogic(String db) {
        super(UsersTb.class);
        em = new GenericLibrary().getEM(db).createEntityManager();
    }

    public UsersLogic() {
        super(UsersTb.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<UsersModel> getUsers() {
        List<UsersModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("UsersTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<UsersTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                UsersModel dmodel = new UsersModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public UsersModel getUsersById(String id) {
        UsersModel dmodel = new UsersModel();

        try {
            query = getEM().createNamedQuery("UsersTb.findByUserName");
            query.setParameter("userName", id);

            UsersTb bmapping = (UsersTb) query.setMaxResults(1).getSingleResult();
            dmodel = new UsersModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public UsersModel checkIfExisting(String fullname, String mobile) {
        UsersModel dmodel = new UsersModel();

        try {
            String[] names = fullname.split(" ");
            String[] all = names;
            String condition = "";
            for (String name : all) {
                condition += "(USER_SURNAME Like '%" + name + "%' OR USER_OTHNAME Like '%" + name + "%') AND ";
            }

            String qu = mobile == null ? " USER_MOBILE IS NULL " : " USER_MOBILE = '" + mobile + "'";

            query = this.em.createNativeQuery("select USER_SYSID, USER_BRANCH_SYSID, USER_NAME, CONCAT(USER_SURNAME, ' ', USER_OTHNAME), USER_MOBILE FROM users_tb WHERE " + condition + qu);

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new UsersModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public UsersModel getUsersRecord(String id) {
        if ("".equals(id)) {
            id = null;
        }
        UsersModel dmodel = new UsersModel();
        try {
            query = this.em.createNativeQuery("select userindex, user_branchindex, user_name, CONCAT(user_surname, ' ', user_othernames), user_mobile  FROM users_tb WHERE userindex = '" + id+"'");
            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new UsersModel(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveUsers(ProductAgentsModel dmodel) {
        String result = "There was a problem saving...";

        try {
            UsersModel umodel = new UsersModel(dmodel);
            UsersTb users = new UsersTb(umodel);

            getEM().getTransaction().begin();

            if (umodel.getUsersTbPK().getUserSysid() == 0) {
                create(users);
                result = "Users created successfully...";
            } else {
                edit(users);
                result = "Users updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
