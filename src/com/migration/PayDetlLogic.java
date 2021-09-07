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
import com.destination1.entity.ProductAgentsTb;
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.destination2.entity.PayDetl;
import com.model.AosAgentsTbModel;
import com.model.AosPolicyDetailsModel;
import com.model.AosTeamTbModel;
import com.model.EasyappAgentsTbModel;
import com.model.EasyappTeamTbModel;
import com.model.EazyappPolicyDetailsModel;
import com.model.EazylifeAgentsTbModel;
import com.model.EazylifePolicyDetailsModel;
import com.model.EazylifeTeamTbModel;
import com.model.PayDetlModel;
import com.model.PaypointModel;
import com.model.PolhDetlModel;
import com.model.ProductAgentsModel;
import com.model.V2ProductModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PayDetlLogic extends AbstractFacade<PayDetl> {

    EntityManager em;
    private Query query;

    public PayDetlLogic() {
        super(PayDetl.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PayDetlModel> getPayDetles() {
        List<PayDetlModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PayDetl.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PayDetl> branches = query.getResultList();

            branches.forEach((dd) -> {
                PayDetlModel dmodel = new PayDetlModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public PayDetlModel getPayDetlById(int id) {
        PayDetlModel dmodel = new PayDetlModel();

        try {
            query = getEM().createNamedQuery("PayDetl.findByPymtPolhSysid");
            query.setParameter("pymtPolhSysid", id);

            PayDetl dropdown = (PayDetl) query.setMaxResults(1).getSingleResult();
            dmodel = new PayDetlModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public PayDetlModel getPayDetlByPolhSysId(int id) {
        PayDetlModel dmodel = new PayDetlModel();

        try {
            query = getEM().createNamedQuery("PayDetl.findByPymtPolhSysid");
            query.setParameter("pymtPolhSysid", id);

            PayDetl dropdown = (PayDetl) query.setMaxResults(1).getSingleResult();
            dmodel = new PayDetlModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String savePayDetails(PayDetlModel dmodel) {
        String result = "There was a problem saving...";

        try {
            PayDetl branch = new PayDetl(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getPymtSysId() == 0) {
                create(branch);
                result = "PayDetl created successfully...";
            } else {
                edit(branch);
                result = "PayDetl updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String getPayPoint(String paypointid) {
        Map<String, String> map = new HashMap<>();

        map.put("92", "81");
        map.put("93", "55");
        map.put("94", "67");
        map.put("95", "22");
        map.put("96", "56");
        map.put("97", "28");
        map.put("98", "91");
        map.put("100", "16");
        map.put("101", "108");
        map.put("102", "109");
        map.put("103", "92");
        map.put("104", "84");
        map.put("106", "70");
        map.put("107", "93");
        map.put("110", "48");
        map.put("111", "43");
        map.put("112", "39");
        map.put("113", "21");
        map.put("114", "78");
        map.put("115", "82");
        map.put("116", "91");
        map.put("117", "95");
        map.put("118", "2");
        map.put("119", "30");
        map.put("120", "51");
        map.put("121", "96");
        map.put("123", "47");
        map.put("126", "44");
        map.put("127", "97");
        map.put("128", "45");
        map.put("130", "9");
        map.put("131", "33");
        map.put("132", "50");
        map.put("133", "5");
        map.put("134", "110");
        map.put("135", "98");
        map.put("136", "80");
        map.put("139", "53");
        map.put("141", "111");
        map.put("144", "75");
        map.put("148", "69");
        map.put("143", "99");
        map.put("147", "27");
        map.put("149", "100");
        map.put("150", "101");
        map.put("151", "15");
        map.put("152", "11");
        map.put("153", "77");
        map.put("154", "46");
        map.put("155", "90");
        map.put("156", "23");
        map.put("157", "112");
        map.put("158", "74");
        map.put("159", "85");
        map.put("160", "32");
        map.put("161", "20");
        map.put("162", "60");
        map.put("163", "3");
        map.put("164", "10");
        map.put("165", "61");
        map.put("166", "63");
        map.put("167", "49");
        map.put("168", "8");
        map.put("169", "42");
        map.put("170", "54");
        map.put("171", "59");
        map.put("172", "38");
        map.put("173", "12");
        map.put("174", "25");
        map.put("175", "72");
        map.put("176", "14");
        map.put("177", "37");
        map.put("178", "7");
        map.put("179", "68");
        map.put("180", "41");
        map.put("181", "31");
        map.put("182", "29");
        map.put("183", "18");
        map.put("184", "6");
        map.put("185", "34");
        map.put("186", "24");
        map.put("187", "11");
        map.put("188", "65");
        map.put("189", "1");
        map.put("190", "23");
        map.put("191", "19");
        map.put("192", "13");
        map.put("193", "35");
        map.put("194", "104");
        map.put("195", "36");
        map.put("196", "105");
        map.put("197", "106");
        map.put("198", "107");

        return map.containsKey(paypointid) ? map.get(paypointid) : "0";
    }

    public String updateAgent(EazylifePolicyDetailsModel dmodel) {

        try {
            PolhDetlModel paypointmodel = new PolhDetlLogic().getPolhDetlById(dmodel.getProductMainPolicyNo());
            PayDetlModel paydetail = new PayDetlLogic().getPayDetlByPolhSysId(paypointmodel.getPolhDetlPK().getPolhSysid());
            if(paydetail.getPymtSysId() != 0){
            String paypontidv2 = this.getPayPoint(dmodel.getProductMainEmployerDeduction());
            PaypointModel paypoint = new BranchLogic().checkIfExisting(paypontidv2);
            paydetail.setPymtPayptId(Integer.parseInt(paypontidv2));
            paydetail.setPymtPayPoint(paypoint.getPPT_NAME());
            PayDetl pagent = new PayDetl(paydetail);
            getEM().getTransaction().begin();
            edit(pagent);
            getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }
        return "";
    }

}
