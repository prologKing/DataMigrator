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
import com.destination2.entity.CustomerTb;
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.destination2.entity.PolhDetl;
import com.model.AgentIdListModel;
import com.model.AosAgentsTbModel;
import com.model.AosPolicyDetailsModel;
import com.model.BankBranchModel;
import com.model.BranchModel;
import com.model.CustomerModel;
import com.model.CustomerTbModel;
import com.model.EasyappAgentsTbModel;
import com.model.EazyappPolicyDetailsModel;
import com.model.EazylifeAgentsTbModel;
import com.model.EazylifePolicyDetailsModel;
import com.model.PayDetlModel;
import com.model.PaypointModel;
import com.model.PolhDetlModel;
import com.model.ProductAgentsModel;
import com.model.ProductTransSusuTbModel;
import com.model.UsersModel;
import com.model.V1BankBranchModel;
import com.model.V1ProductModel;
import com.model.V2ProductModel;
import java.math.BigDecimal;
import java.math.BigInteger;
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
public class PolhDetlLogic extends AbstractFacade<PolhDetl> {

    EntityManager em;
    private Query query;

    public PolhDetlLogic() {
        super(PolhDetl.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }
 int i = 0;
    public List<PolhDetlModel> getPolhDetles() {
        List<PolhDetlModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolhDetl.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhDetl> branches = query.getResultList();

            branches.forEach((dd) -> {
                if(dlist.size() == 33548){
                PolhDetlModel dmodel = new PolhDetlModel(dd);
                dlist.add(dmodel);
                }else{
                PolhDetlModel dmodel = new PolhDetlModel(dd);
                dlist.add(dmodel);
                }
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
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

    public PolhDetlModel getPolhDetlById(String id) {
        PolhDetlModel dmodel = new PolhDetlModel();

        try {
            query = getEM().createNamedQuery("PolhDetl.findByPolhNum");
            query.setParameter("polhNum", id);

            PolhDetl dropdown = (PolhDetl) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDetlModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public PolhDetlModel getPolhDetlBySysId(int id) {
        PolhDetlModel dmodel = new PolhDetlModel();

        try {
            query = getEM().createNamedQuery("PolhDetl.findByPolhSysid");
            query.setParameter("polhSysid", id);

            PolhDetl dropdown = (PolhDetl) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDetlModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public int getAosPlanID(int premium, String productcode) {
        Map<Integer, String> map = new HashMap<>();
        if ("AHCP".equals(productcode)) {
            map.put(6, "32");
            map.put(8, "33");
            map.put(9, "34");
            map.put(10, "35");
            map.put(13, "36");
        } else {
            map.put(4, "28");
            map.put(6, "29");
            map.put(8, "30");
            map.put(10, "31");
        }
        return Integer.parseInt(map.containsKey(premium) ? map.get(premium) : "0");
    }

    public String getEazyPlanID(String premium) {
        Map<String, String> map = new HashMap<>();
        map.put("51", "21");
        map.put("52", "22");
        map.put("53", "23");
        map.put("54", "24");
        map.put("55", "25");
        map.put("56", "26");
        map.put("57", "27");
        map.put("21", "AFP1");
        map.put("22", "AFP2");
        map.put("23", "AFP3");
        map.put("24", "AFP4");
        map.put("25", "AFP5");
        map.put("26", "AFP6");
        map.put("27", "AFP7");

        return map.containsKey(premium) ? map.get(premium) : "0";
    }

    public String getPlanCode(int planid) {
        Map<Integer, String> map = new HashMap<>();
        map.put(21, "AFP1");
        map.put(22, "AFP2");
        map.put(23, "AFP3");
        map.put(24, "AFP4");
        map.put(25, "AFP5");
        map.put(26, "AFP6");
        map.put(27, "AFP7");
        map.put(28, "AAP1");
        map.put(29, "AAP2");
        map.put(30, "AAP3");
        map.put(31, "AAP4");
        map.put(32, "APP1");
        map.put(33, "APP2");
        map.put(34, "APP3");
        map.put(35, "APP4");
        map.put(36, "APP5");
        return map.containsKey(planid) ? map.get(planid) : "0";
    }

    public String getSumAssured(int planid) {
        Map<Integer, String> map = new HashMap<>();
        map.put(28, "1000");
        map.put(29, "2000");
        map.put(30, "3000");
        map.put(31, "4000");
        map.put(32, "900");
        map.put(33, "1500");
        map.put(34, "1800");
        map.put(35, "2100");
        map.put(36, "3000");

        return map.containsKey(planid) ? map.get(planid) : "0";
    }

    public String getESCPlan(int planid) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, null);
        map.put(5, "ICO_05");
        map.put(10, "ICO_10");
        map.put(15, "ICO_15");
        map.put(20, "ICO_20");
        map.put(25, "ICO_25");
        map.put(30, "ICO_30");

        return map.containsKey(planid) ? map.get(planid) : "";
    }

    public String getPremiumFrequency(String escplan) {
        escplan = escplan.trim();
        Map<String, String> map = new HashMap<>();
        map.put("Daily", "D");
        map.put("Weekly", "W");
        map.put("Monthly", "M");
        map.put("Quarterly", "Q");
        map.put("Semi-Annual", "H");
        map.put("Annual", "Y");
        map.put("D", "5");
        map.put("W", "6");
        map.put("M", "1");
        map.put("Q", "2");
        map.put("H", "3");
        map.put("Y", "4");

        return map.containsKey(escplan) ? map.get(escplan) : "0";
    }

    public int getV2BankID(String bankid) {
        Map<String, String> map = new HashMap<>();
        map.put("44", "15");
        map.put("45", "6");
        map.put("46", "4");
        map.put("47", "7");
        map.put("48", "10");
        map.put("49", "17");
        map.put("50", "8");
        map.put("51", "18");
        map.put("52", "5");
        map.put("53", "20");
        map.put("54", "19");
        map.put("55", "1");
        map.put("56", "16");
        map.put("57", "14");
        map.put("58", "2");
        map.put("59", "10");
        map.put("60", "3");
        map.put("61", "12");
        map.put("62", "0");
        map.put("63", "9");
        map.put("64", "13");
        map.put("65", "6");
        return Integer.parseInt(map.containsKey(bankid) ? map.get(bankid) : "0");
    }
    
     public String getPaymentMethod(String method) {
        Map<String, String> map = new HashMap<>();
        map.put("Walk-in(branch)", "1");
        map.put("Email", "2");
        map.put("Post", "3");
        return map.containsKey(method) ? map.get(method) : "0";
    }

    public String getESCPlanInfo(String escplan) {
        Map<String, String> map = new HashMap<>();
        map.put("0", "0.00000");
        map.put("5", "0.05000");
        map.put("10", "0.10000");
        map.put("15", "0.15000");
        map.put("20", "0.20000");
        map.put("25", "0.25000");
        map.put("30", "0.30000");
        map.put(null, "0.00000");
        map.put("ICO_05", "0.03750");
        map.put("ICO_10", "0.07500");
        map.put("ICO_15", "0.11250");
        map.put("ICO_20", "0.15000");
        map.put("ICO_25", "0.18750");
        map.put("ICO_30", "0.22500");

        return map.containsKey(escplan) ? map.get(escplan) : "0";
    }
    
    

    public String savePolicy(AosPolicyDetailsModel dmodel) {
        String result = "There was a problem saving...";

        try {
            UsersLogic ulogic = new UsersLogic("aos");
            UsersLogic ulogic2 = new UsersLogic();
            AosAgentsTbModel aosagentmodel = null;
            ProductAgentsTbLogic palogic = new ProductAgentsTbLogic();
            PolhDetlLogic deil = new PolhDetlLogic();
            PolhDetlModel pmodel = new PolhDetlModel(dmodel);
            AosCustomerTbLogic cuslogic = new AosCustomerTbLogic();
            BranchLogic blogic = new BranchLogic();
            CustomerModel cusmodel = cuslogic.getCustomerById(dmodel.getProductMainCustomerindexId() != null && !"".equals(dmodel.getProductMainCustomerindexId()) ? Integer.parseInt(dmodel.getProductMainCustomerindexId()) : 0);
            CustomerTbModel custmodel = this.checkIfExisting(cusmodel.getCustomerFirstname() + " " + (cusmodel.getCustomerMiddleName()== null ? "":cusmodel.getCustomerMiddleName()) + " " + cusmodel.getCustomerSurname(), cusmodel.getCustomerMobile());
            V1ProductModel v1pmodel = cuslogic.getProductByCode(dmodel.getProductNameIndex());
            V2ProductModel v2pmodel = blogic.getV2ProductByCode(v1pmodel.getProduct_code());
            UsersModel usmodel = ulogic.getUsersRecord(dmodel.getProductMainUserindex());
            UsersModel umodel = ulogic2.getUsersById(usmodel.getUserName());
            try {
                aosagentmodel = new AosAgentsTbLogic().getAosAgentsTbById(dmodel.getProductMainAgentsId() == null ? 0 : Integer.parseInt(dmodel.getProductMainAgentsId()));
            } catch (NumberFormatException e) {
                aosagentmodel = new AosAgentsTbLogic().getAosAgentsTbByCode(dmodel.getProductMainAgentsId());
            }
            ProductAgentsModel pamodel = palogic.checkIfExisting(aosagentmodel.getAgentsName(), aosagentmodel.getAgentsMobileNo());
            ProductAgentsModel mgrmodel = palogic.getProductAgentsTbBySysId(pamodel.getPagtReportId());
            BranchModel branchmodel = blogic.getBranchById(pamodel.getProductAgentsTbPK().getPagtBranchSysid() == 0 ? 50 : pamodel.getProductAgentsTbPK().getPagtBranchSysid());
            pmodel.getPolhDetlPK().setPolhCusSysid(custmodel.getCustomerTbPK().getCusSysid());
            pmodel.getPolhDetlPK().setPolhUserSysid(umodel.getUsersTbPK().getUserSysid() == 0 ? (pamodel.getProductAgentsTbPK().getPagtSysid() == 0 ? 2:pamodel.getProductAgentsTbPK().getPagtSysid()) : umodel.getUsersTbPK().getUserSysid());
            pmodel.getPolhDetlPK().setPolhPdtSysid(v2pmodel.getPDT_SYSID());
            pmodel.setPolhPlnSysid(this.getAosPlanID((int) Double.parseDouble(dmodel.getProductMainPremium() == null || "".equals(dmodel.getProductMainPremium()) ? "0.00" : dmodel.getProductMainPremium()), v2pmodel.getPDT_CODE()));
            pmodel.setPolhPlnCode(this.getPlanCode(pmodel.getPolhPlnSysid()));
            pmodel.setPolhPrtCode(v2pmodel.getPDT_CODE());
            pmodel.setPolhCusCode(custmodel.getCusCode());
            pmodel.setPolhOff(branchmodel.getBranchCode());
            pmodel.setPolhSiBc(new BigDecimal(this.getSumAssured(pmodel.getPolhPlnSysid())));
            pmodel.setPolhUw(umodel.getUserName() == null ? pamodel.getPagtCode() : umodel.getUserName());
            pmodel.setPolhCreUserBy(umodel.getUserName() == null ? pamodel.getPagtCode() : umodel.getUserName());
            pmodel.setPolhAgnt1(pamodel.getPagtCode());
            pmodel.setPolhOvriAgnt2(mgrmodel.getPagtCode());
            if(pmodel.getPolhCreUserBy() == null){
            pmodel.setPolhCreUserBy("USSD02");
            pmodel.setPolhAgnt1("USSD02");
            pmodel.setPolhUw("USSD02");
            pmodel.setPolhOvriAgnt2("USSD01");
            }
            pmodel.setPolhEscPlan(dmodel.getPremiumMailAnnualPremiumIncrease() == null || "0".equals(dmodel.getPremiumMailAnnualPremiumIncrease()) ? null : "ICO_" + dmodel.getPremiumMailAnnualPremiumIncrease());
            pmodel.setPolhEscPlan("ICO_5".equals(pmodel.getPolhEscPlan()) ? "ICO_05" : pmodel.getPolhEscPlan());
            pmodel.setPolhEscSa(new BigDecimal(this.getESCPlanInfo(pmodel.getPolhEscPlan())));
            pmodel.setPolhEscPrem(new BigDecimal(this.getESCPlanInfo(dmodel.getPremiumMailAnnualPremiumIncrease() == null || "".equals(dmodel.getPremiumMailAnnualPremiumIncrease()) ? "0" : dmodel.getPremiumMailAnnualPremiumIncrease())));
            PayDetlModel payDetl = new PayDetlModel();
            payDetl.setPymtSysId(0);
            payDetl.setPymtExtNum(0);
            payDetl.setPymtPolhSysid(0);
            payDetl.setPymtBnkId(0);
            payDetl.setPymtBrnchId(0);
            payDetl.setPymtFreq(this.getPremiumFrequency(dmodel.getProductMainPaymentFreq()));
            payDetl.setPymtMode("Mobile Money");
             payDetl.setPymtBbkScode(null);
            payDetl.setPymtAccName(null);
            payDetl.setPymtAcc(null);
            payDetl.setPymtPayPoint(null);
            payDetl.setPymtStaffNo(null);
            payDetl.setPymtMomoNo(dmodel.getProductMainMobileMoneyNo() == null ? null : dmodel.getProductMainMobileMoneyNo().length() > 15 ? dmodel.getProductMainMobileMoneyNo().substring(0, 15): dmodel.getProductMainMobileMoneyNo());
            payDetl.setPymtCreUserBy(pmodel.getPolhCreUserBy());
            payDetl.setPymtCreDt(pmodel.getPolhCreDt());
            payDetl.setPymtFreqId(Integer.parseInt(this.getPremiumFrequency(payDetl.getPymtFreq())));
            payDetl.setPymtMandateMomo(dmodel.getProductMainMandateid());
            payDetl.setPymtMandateBkCode(null);
            payDetl.setPymtDrawerBkCode(null);
            payDetl.setPymtDedtStdt(pmodel.getPolhDudtDt());
            payDetl.setPymtPic(null);
            payDetl.setPymtMandateCheck("N");
            payDetl.setPymtMandateSts("Entered");
            

            PolhDetl branch = new PolhDetl(pmodel);

            getEM().getTransaction().begin();

            if (branch.getPolhDetlPK().getPolhSysid() == 0) {
                create(branch);
                result = "PolhDetl created successfully...";
            } else {
                edit(branch);
                result = "PolhDetl updated successfully...";
            }
               getEM().getTransaction().commit();
                PolhDetlModel pd = deil.getPolhDetlById(branch.getPolhNum());
                payDetl.setPymtPolhSysid(pd.getPolhDetlPK().getPolhSysid());
                new PayDetlLogic().savePayDetails(payDetl);
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
//    public String updateAgent2(String agent2Code, String agent1Code) {
//        String result = "There was a problem updating User Login Attempt, please contact support...";
//
//        try {
//            getEM().getTransaction().begin();
//            query = getEM().createNativeQuery("UPDATE polh_detl SET POLH_OVRI_AGNT2= '"+agent2Code.trim()+"'"
//                    + " WHERE POLH_AGNT1='" + agent1Code + "'");
//            query.executeUpdate();
//
//            result = "Reporting ID updated successfully...";
//            getEM().getTransaction().commit();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return result;
//    }
    
    public String updateAgent(PolhDetlModel dmodel) {

        try {

                List<ProductTransSusuTbModel> payment = new ProductTransSusuTbLogic().getProductTransSusuTbByPolNum(dmodel.getPolhAgnt1(), dmodel.getPolhNum());
                if(payment.size() > 0){
                ProductTransSusuTbModel payModel = payment.get(0);    
                ProductAgentsModel pamodel = new ProductAgentsTbLogic().checkIfExisting(payModel.getSusuTransName(), "");
                if(pamodel.getProductAgentsTbPK().getPagtSysid() != 0 && !"".equals(dmodel.getPolhAgnt1()) && dmodel.getPolhAgnt1() != null){
                dmodel.setPolhOvriAgnt2(pamodel.getPagtCode().trim());
                //this.updateAgent2(pamodel.getPagtCode(), payModel.getSusuTransAgentsId());
                PolhDetl pgent = new PolhDetl(dmodel);
                getEM().getTransaction().begin();
                edit(pgent);
                getEM().getTransaction().commit();
                }
            
        }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }
        return "";
    }

    public String savePolicy(EazyappPolicyDetailsModel dmodel) {
        String result = "There was a problem saving...";

        try {
            UsersLogic ulogic = new UsersLogic("eazyapp");
            UsersLogic ulogic2 = new UsersLogic();
            EasyappAgentsTbModel easyagentmodel = null;
             CustomerModel cusmodel = null;
            ProductAgentsTbLogic palogic = new ProductAgentsTbLogic();
            PolhDetlModel pmodel = new PolhDetlModel(dmodel);
            EazyappCustomerTbLogic cuslogic = new EazyappCustomerTbLogic();
            BranchLogic blogic = new BranchLogic();
            try{
            cusmodel = cuslogic.getCustomerById(dmodel.getProductMainCustomerindexId() != null && !"".equals(dmodel.getProductMainCustomerindexId()) ? Integer.parseInt(dmodel.getProductMainCustomerindexId()) : 0);
             } catch (NumberFormatException e) {
            cusmodel = cuslogic.getCustomerById(0);     
             }
            CustomerTbModel custmodel = this.checkIfExisting(cusmodel.getCustomerFirstname() + " " + (cusmodel.getCustomerMiddleName()== null ? "":cusmodel.getCustomerMiddleName()) + " " + cusmodel.getCustomerSurname(), cusmodel.getCustomerMobile());
            
            V1ProductModel v1pmodel = cuslogic.getProductByCode(dmodel.getProductNameIndex());
            V2ProductModel v2pmodel = blogic.getV2ProductByCode(v1pmodel.getProduct_code());
            UsersModel usmodel = ulogic.getUsersRecord(dmodel.getProductMainUserindex());
            UsersModel umodel = ulogic2.getUsersById(usmodel.getUserName());
            try {
                easyagentmodel = new EasyappAgentsTbLogic().getEasyappAgentsTbById(dmodel.getProductMainAgentsId() == null ? 0 : Integer.parseInt(dmodel.getProductMainAgentsId()));
            } catch (NumberFormatException e) {
                easyagentmodel = new EasyappAgentsTbLogic().getEasyappAgentsTbByCode(dmodel.getProductMainAgentsId());
            }
            ProductAgentsModel pamodel = palogic.checkIfExisting(easyagentmodel.getAgentsName(), easyagentmodel.getAgentsMobileNo());
            ProductAgentsModel mgrmodel = palogic.getProductAgentsTbBySysId(pamodel.getPagtReportId());
            BranchModel branchmodel = blogic.getBranchById(pamodel.getProductAgentsTbPK().getPagtBranchSysid() == 0 ? 50 : pamodel.getProductAgentsTbPK().getPagtBranchSysid());
            pmodel.getPolhDetlPK().setPolhCusSysid(custmodel.getCustomerTbPK().getCusSysid());
            pmodel.getPolhDetlPK().setPolhUserSysid(umodel.getUsersTbPK().getUserSysid() == 0 ? (pamodel.getProductAgentsTbPK().getPagtSysid() == 0 ? 2:pamodel.getProductAgentsTbPK().getPagtSysid()) : umodel.getUsersTbPK().getUserSysid());
            pmodel.getPolhDetlPK().setPolhPdtSysid(v2pmodel.getPDT_SYSID());
            pmodel.setPolhPlnSysid(Integer.parseInt(this.getEazyPlanID(dmodel.getProductPlanMainRateindex() == null || "".equals(dmodel.getProductPlanMainRateindex()) ? "0.00" : dmodel.getProductPlanMainRateindex())));
            pmodel.setPolhPlnCode(this.getEazyPlanID(String.valueOf(pmodel.getPolhPlnSysid())));
            pmodel.setPolhPrtCode(v2pmodel.getPDT_CODE());
            pmodel.setPolhCusCode(custmodel.getCusCode());
            pmodel.setPolhOff(branchmodel.getBranchCode());
            pmodel.setPolhSiBc(new BigDecimal(this.getSumAssured(pmodel.getPolhPlnSysid())));
            pmodel.setPolhUw(umodel.getUserName() == null ? pamodel.getPagtCode() : umodel.getUserName());
            pmodel.setPolhCreUserBy(umodel.getUserName() == null ? pamodel.getPagtCode() : umodel.getUserName());
            pmodel.setPolhAgnt1(pamodel.getPagtCode());
            pmodel.setPolhPerferedMode(this.getPaymentMethod(dmodel.getProductMainPreferredMode()));
            pmodel.setPolhOvriAgnt2(mgrmodel.getPagtCode());
            if(pmodel.getPolhCreUserBy() == null){
            pmodel.setPolhCreUserBy("USSD02");
            pmodel.setPolhAgnt1("USSD02");
            pmodel.setPolhUw("USSD02");
            pmodel.setPolhOvriAgnt2("USSD01");
            }
            pmodel.setPolhEscPlan(dmodel.getPremiumMainAnnualPremiumIncrease() == null || "0".equals(dmodel.getPremiumMainAnnualPremiumIncrease()) ? null : "ICO_" + dmodel.getPremiumMainAnnualPremiumIncrease());
            pmodel.setPolhEscPlan("ICO_5".equals(pmodel.getPolhEscPlan()) ? "ICO_05" : pmodel.getPolhEscPlan());
            pmodel.setPolhEscSa(new BigDecimal(this.getESCPlanInfo(pmodel.getPolhEscPlan())));
            pmodel.setPolhEscPrem(new BigDecimal(this.getESCPlanInfo(dmodel.getPremiumMainAnnualPremiumIncrease() == null || "".equals(dmodel.getPremiumMainAnnualPremiumIncrease()) ? "0" : dmodel.getPremiumMainAnnualPremiumIncrease())));
            PayDetlModel payDetl = new PayDetlModel();
            payDetl.setPymtSysId(0);
            payDetl.setPymtExtNum(0);
            payDetl.setPymtPolhSysid(0);
            payDetl.setPymtBnkId(this.getV2BankID(dmodel.getProductMainBankName() == null || "".equals(dmodel.getProductMainBankName()) ? "0" : dmodel.getProductMainBankName()));
            V1BankBranchModel vbmodel = cuslogic.getBankBranchByCode(dmodel.getProductMainBankBranch());
            BankBranchModel bbmodel = new CustomerTbLogic("allzmenu").getFilteredProduct(vbmodel.getBank_branch_name(), String.valueOf(payDetl.getPymtBnkId()));
            if (bbmodel.getPBKB_NAME() == null) {
                bbmodel = new CustomerTbLogic("allzmenu").getBankBranchBySysID(String.valueOf(payDetl.getPymtBnkId()));
            }

            
            payDetl.setPymtFreq(this.getPremiumFrequency(dmodel.getProductMainPaymentFreq()));
            payDetl.setPymtMode(dmodel.getProductMainPaymentMethod());
            if("Direct Debit".equals(payDetl.getPymtMode())){
            payDetl.setPymtBbkScode(bbmodel.getPBKB_SORT_CODE());
            payDetl.setPymtBrnchId(bbmodel.getPBKB_PBK_SYSID());
            payDetl.setPymtAccName(dmodel.getProductMainAccountName());
            payDetl.setPymtAcc(dmodel.getProductMainBankAccount());
            payDetl.setPymtBnk(bbmodel.getPBK_NAME());
            payDetl.setPymtBrnch(bbmodel.getPBKB_NAME());
            }else if("CAGD".equals(payDetl.getPymtMode()) || "Employer Deduction".equals(payDetl.getPymtMode())){
            PaypointModel  paymodel = new CustomerTbLogic("allzmenu").getPayPointInfo(payDetl.getPymtMode());
            payDetl.setPymtPayPoint(paymodel.getPPT_NAME());
            payDetl.setPymtPayptId(paymodel.getPPT_SYSID());
            payDetl.setPymtStaffNo(dmodel.getProductMainEmployerStaffPayrollNo());
            }
            
           
            
            payDetl.setPymtMomoNo(dmodel.getProductMainMobileMoneyNo() == null ? null : dmodel.getProductMainMobileMoneyNo().length() > 15 ? dmodel.getProductMainMobileMoneyNo().substring(0, 15): dmodel.getProductMainMobileMoneyNo());
            payDetl.setPymtCreUserBy(pmodel.getPolhCreUserBy());
            payDetl.setPymtCreDt(pmodel.getPolhCreDt());
            payDetl.setPymtFreqId(Integer.parseInt(this.getPremiumFrequency(payDetl.getPymtFreq())));
            payDetl.setPymtMandateMomo(dmodel.getProductMainMandateid());
            payDetl.setPymtMandateBkCode(null);
            payDetl.setPymtDrawerBkCode(null);
            payDetl.setPymtDedtStdt(pmodel.getPolhDudtDt());
            payDetl.setPymtPic(null);
            payDetl.setPymtMandateCheck("N");
            payDetl.setPymtMandateSts("Entered");

            PolhDetl branch = new PolhDetl(pmodel);

            getEM().getTransaction().begin();

            if (branch.getPolhDetlPK().getPolhSysid() == 0) {
                create(branch);
                
                result = "PolhDetl created successfully...";
            } else {
                edit(branch);
                result = "PolhDetl updated successfully...";
            }
               getEM().getTransaction().commit();
               PolhDetlLogic deil = new PolhDetlLogic();
                PolhDetlModel pd = deil.getPolhDetlById(branch.getPolhNum());
                 payDetl.setPymtPolhSysid(pd.getPolhDetlPK().getPolhSysid());
                new PayDetlLogic().savePayDetails(payDetl);
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    
    public String savePolicy(EazylifePolicyDetailsModel dmodel) {
        String result = "There was a problem saving...";

        try {
            UsersLogic ulogic = new UsersLogic("eazylife");
            UsersLogic ulogic2 = new UsersLogic();
            EazylifeAgentsTbModel easyagentmodel = null;
             CustomerModel cusmodel = null;
            ProductAgentsTbLogic palogic = new ProductAgentsTbLogic();
            PolhDetlModel pmodel = new PolhDetlModel(dmodel);
            EazylifeCustomerTbLogic cuslogic = new EazylifeCustomerTbLogic();
            BranchLogic blogic = new BranchLogic();
            try{
            cusmodel = cuslogic.getCustomerById(dmodel.getProductMainCustomerindexId() != null && !"".equals(dmodel.getProductMainCustomerindexId()) ? Integer.parseInt(dmodel.getProductMainCustomerindexId()) : 0);
             } catch (NumberFormatException e) {
            cusmodel = cuslogic.getCustomerById(0);     
             }
            CustomerTbModel custmodel = this.checkIfExisting(cusmodel.getCustomerFirstname() + " " + (cusmodel.getCustomerMiddleName()== null ? "":cusmodel.getCustomerMiddleName()) + " " + cusmodel.getCustomerSurname(), cusmodel.getCustomerMobile());
            
            V1ProductModel v1pmodel = cuslogic.getProductByCode(dmodel.getProductNameIndex());
            V2ProductModel v2pmodel = blogic.getV2ProductByCode(v1pmodel.getProduct_code());
            UsersModel usmodel = ulogic.getUsersRecord(dmodel.getProductMainUserindex());
            UsersModel umodel = ulogic2.getUsersById(usmodel.getUserName());
            try {
                easyagentmodel = new EazylifeAgentsTbLogic().getEazylifeAgentsTbById(dmodel.getProductMainAgentsId() == null ? 0 : Integer.parseInt(dmodel.getProductMainAgentsId()));
            } catch (NumberFormatException e) {
                easyagentmodel = new EazylifeAgentsTbLogic().getEazylifeAgentsTbByCode(dmodel.getProductMainAgentsId());
            }
            ProductAgentsModel pamodel = palogic.checkIfExisting(easyagentmodel.getAgentsName(), easyagentmodel.getAgentsMobileNo());
            ProductAgentsModel mgrmodel = palogic.getProductAgentsTbBySysId(pamodel.getPagtReportId());
            BranchModel branchmodel = blogic.getBranchById(pamodel.getProductAgentsTbPK().getPagtBranchSysid() == 0 ? 50 : pamodel.getProductAgentsTbPK().getPagtBranchSysid());
            pmodel.getPolhDetlPK().setPolhCusSysid(custmodel.getCustomerTbPK().getCusSysid());
            pmodel.getPolhDetlPK().setPolhUserSysid(umodel.getUsersTbPK().getUserSysid() == 0 ? (pamodel.getProductAgentsTbPK().getPagtSysid() == 0 ? 2:pamodel.getProductAgentsTbPK().getPagtSysid()) : umodel.getUsersTbPK().getUserSysid());
            pmodel.getPolhDetlPK().setPolhPdtSysid(v2pmodel.getPDT_SYSID());
            pmodel.setPolhPlnSysid(Integer.parseInt(this.getEazyPlanID(dmodel.getProductPlanMainRateindex() == null || "".equals(dmodel.getProductPlanMainRateindex()) ? "0.00" : dmodel.getProductPlanMainRateindex())));
            pmodel.setPolhPlnCode(this.getEazyPlanID(String.valueOf(pmodel.getPolhPlnSysid())));
            pmodel.setPolhPrtCode(v2pmodel.getPDT_CODE());
            pmodel.setPolhCusCode(custmodel.getCusCode());
            pmodel.setPolhOff(branchmodel.getBranchCode());
            pmodel.setPolhSiBc(new BigDecimal(this.getSumAssured(pmodel.getPolhPlnSysid())));
            pmodel.setPolhUw(umodel.getUserName() == null ? pamodel.getPagtCode() : umodel.getUserName());
            pmodel.setPolhCreUserBy(umodel.getUserName() == null ? pamodel.getPagtCode() : umodel.getUserName());
            pmodel.setPolhAgnt1(pamodel.getPagtCode());
            pmodel.setPolhPerferedMode(this.getPaymentMethod(dmodel.getProductMainPreferredMode()));
            pmodel.setPolhOvriAgnt2(mgrmodel.getPagtCode());
            if(pmodel.getPolhCreUserBy() == null){
            pmodel.setPolhCreUserBy("USSD02");
            pmodel.setPolhAgnt1("USSD02");
            pmodel.setPolhUw("USSD02");
            pmodel.setPolhOvriAgnt2("USSD01");
            }
            pmodel.setPolhEscPlan(dmodel.getPremiumMainAnnualPremiumIncrease() == null || "0".equals(dmodel.getPremiumMainAnnualPremiumIncrease()) ? null : "ICO_" + dmodel.getPremiumMainAnnualPremiumIncrease());
            pmodel.setPolhEscPlan("ICO_5".equals(pmodel.getPolhEscPlan()) ? "ICO_05" : pmodel.getPolhEscPlan());
            pmodel.setPolhEscSa(new BigDecimal(this.getESCPlanInfo(pmodel.getPolhEscPlan())));
            pmodel.setPolhEscPrem(new BigDecimal(this.getESCPlanInfo(dmodel.getPremiumMainAnnualPremiumIncrease() == null || "".equals(dmodel.getPremiumMainAnnualPremiumIncrease()) ? "0" : dmodel.getPremiumMainAnnualPremiumIncrease())));
            PayDetlModel payDetl = new PayDetlModel();
            payDetl.setPymtSysId(0);
            payDetl.setPymtExtNum(0);
            payDetl.setPymtPolhSysid(0);
            payDetl.setPymtBnkId(this.getV2BankID(dmodel.getProductMainBankName() == null || "".equals(dmodel.getProductMainBankName()) ? "0" : dmodel.getProductMainBankName()));
            V1BankBranchModel vbmodel = cuslogic.getBankBranchByCode(dmodel.getProductMainBankBranch());
            BankBranchModel bbmodel = new CustomerTbLogic("allzmenu").getFilteredProduct(vbmodel.getBank_branch_name(), String.valueOf(payDetl.getPymtBnkId()));
            if (bbmodel.getPBKB_NAME() == null) {
                bbmodel = new CustomerTbLogic("allzmenu").getBankBranchBySysID(String.valueOf(payDetl.getPymtBnkId()));
            }

            
            payDetl.setPymtFreq(this.getPremiumFrequency(dmodel.getProductMainPaymentFreq()));
            payDetl.setPymtMode(dmodel.getProductMainPaymentMethod());
            if("Direct Debit".equals(payDetl.getPymtMode())){
            payDetl.setPymtBbkScode(bbmodel.getPBKB_SORT_CODE());
            payDetl.setPymtBrnchId(bbmodel.getPBKB_PBK_SYSID());
            payDetl.setPymtAccName(dmodel.getProductMainAccountName());
            payDetl.setPymtAcc(dmodel.getProductMainBankAccount());
            payDetl.setPymtBnk(bbmodel.getPBK_NAME());
            payDetl.setPymtBrnch(bbmodel.getPBKB_NAME());
            }else if("CAGD".equals(payDetl.getPymtMode()) || "Employer Deduction".equals(payDetl.getPymtMode())){
            PaypointModel  paymodel = new CustomerTbLogic("allzmenu").getPayPointInfo(payDetl.getPymtMode());
            payDetl.setPymtPayPoint(paymodel.getPPT_NAME());
            payDetl.setPymtPayptId(paymodel.getPPT_SYSID());
            payDetl.setPymtStaffNo(dmodel.getProductMainEmployerStaffPayrollNo());
            }
            payDetl.setPymtMomoNo(dmodel.getProductMainMobileMoneyNo() == null ? null : dmodel.getProductMainMobileMoneyNo().length() > 15 ? dmodel.getProductMainMobileMoneyNo().substring(0, 15): dmodel.getProductMainMobileMoneyNo());
            payDetl.setPymtCreUserBy(pmodel.getPolhCreUserBy());
            payDetl.setPymtCreDt(pmodel.getPolhCreDt());
            payDetl.setPymtFreqId(Integer.parseInt(this.getPremiumFrequency(payDetl.getPymtFreq())));
            payDetl.setPymtMandateMomo(dmodel.getProductMainMandateid());
            payDetl.setPymtMandateBkCode(null);
            payDetl.setPymtDrawerBkCode(null);
            payDetl.setPymtDedtStdt(pmodel.getPolhDudtDt());
            payDetl.setPymtPic(null);
            payDetl.setPymtMandateCheck("N");
            payDetl.setPymtMandateSts("Entered");

            PolhDetl branch = new PolhDetl(pmodel);

            getEM().getTransaction().begin();

            if (branch.getPolhDetlPK().getPolhSysid() == 0) {
                create(branch);
                
                result = "PolhDetl created successfully...";
            } else {
                edit(branch);
                result = "PolhDetl updated successfully...";
            }
               getEM().getTransaction().commit();
               PolhDetlLogic deil = new PolhDetlLogic();
                PolhDetlModel pd = deil.getPolhDetlById(branch.getPolhNum());
                 payDetl.setPymtPolhSysid(pd.getPolhDetlPK().getPolhSysid());
                new PayDetlLogic().savePayDetails(payDetl);
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String savePolicy(AgentIdListModel dmodel) {
        String result = "There was a problem saving...";

        try {
            
            PolhDetlModel pmodel = new PolhDetlLogic().getPolhDetlById(dmodel.getPolicyNumber());
            ProductAgentsModel agentmodel = new ProductAgentsTbLogic().getProductAgentsTbById(dmodel.getNewAgentId());
            ProductAgentsModel mgrmodel = new ProductAgentsTbLogic().getProductAgentsTbBySysId(agentmodel.getPagtReportId());
            UsersModel umodel = new UsersLogic().getUsersById(dmodel.getNewAgentId());
            pmodel.getPolhDetlPK().setPolhUserSysid(umodel.getUsersTbPK().getUserSysid());
            pmodel.setPolhUw(dmodel.getNewAgentId());
            pmodel.setPolhCreUserBy(dmodel.getNewAgentId());
            pmodel.setPolhAgnt1(dmodel.getNewAgentId());
            pmodel.setPolhOvriAgnt2(mgrmodel.getPagtCode());
            
            PolhDetl branch = new PolhDetl(pmodel);
           
            if (branch.getPolhDetlPK().getPolhSysid() != 0 && pmodel.getPolhDetlPK().getPolhUserSysid() != 0 ) {
               
                result = "UPDATE polh_detl SET POLH_USER_SYSID = "+pmodel.getPolhDetlPK().getPolhUserSysid()+", POLH_UW = '"+pmodel.getPolhUw() +"', POLH_CRE_USER_BY = '"+pmodel.getPolhCreUserBy()+"', POLH_AGNT1 = '"+pmodel.getPolhAgnt1()+"', POLH_OVRI_AGNT2 = '"+pmodel.getPolhOvriAgnt2()+"' WHERE POLH_NUM = '"+dmodel.getPolicyNumber()+"';";
                System.out.println(result);
            }
               
               
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
   
    
    public String newSavePolicy(AgentIdListModel dmodel) {
        String result = "There was a problem saving...";

        try {
            
            PolhDetlModel pmodel = new PolhDetlLogic().getPolhDetlById(dmodel.getPolicyNumber());
            //ProductAgentsModel agentmodel = new ProductAgentsTbLogic().getProductAgentsTbById(dmodel.getNewAgentId());
            //ProductAgentsModel mgrmodel = new ProductAgentsTbLogic().getProductAgentsTbBySysId(agentmodel.getPagtReportId());
            //UsersModel umodel = new UsersLogic().getUsersById(dmodel.getNewAgentId());
//            pmodel.getPolhDetlPK().setPolhUserSysid(umodel.getUsersTbPK().getUserSysid());
//            pmodel.setPolhUw(dmodel.getNewAgentId());
//            pmodel.setPolhCreUserBy(dmodel.getNewAgentId());
//            pmodel.setPolhAgnt1(dmodel.getNewAgentId());
//            pmodel.setPolhOvriAgnt2(mgrmodel.getPagtCode());
            
//            PolhDetl branch = new PolhDetl(pmodel);
//           
//            if (branch.getPolhDetlPK().getPolhSysid() != 0 && pmodel.getPolhDetlPK().getPolhUserSysid() != 0 ) {
//               
                result = "UPDATE polh_detl_fund_annex SET PDFA_FUND_VAL = "+dmodel.getNewAgentId()+" WHERE PDFA_POLH_SYSID = "+pmodel.getPolhDetlPK().getPolhSysid()+";";
                System.out.println(result);
//            }
               
               
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String Save_Policy(AgentIdListModel dmodel) {
        String result = "There was a problem saving...";

        try {
            
            //PolhDetlModel pmodel = new PolhDetlLogic().getPolhDetlById(dmodel.getPolicyNumber());
            //ProductAgentsModel agentmodel = new ProductAgentsTbLogic().getProductAgentsTbById(dmodel.getNewAgentId());
            //ProductAgentsModel mgrmodel = new ProductAgentsTbLogic().getProductAgentsTbBySysId(agentmodel.getPagtReportId());
            //UsersModel umodel = new UsersLogic().getUsersById(dmodel.getNewAgentId());
//            pmodel.getPolhDetlPK().setPolhUserSysid(umodel.getUsersTbPK().getUserSysid());
//            pmodel.setPolhUw(dmodel.getNewAgentId());
//            pmodel.setPolhCreUserBy(dmodel.getNewAgentId());
//            pmodel.setPolhAgnt1(dmodel.getNewAgentId());
//            pmodel.setPolhOvriAgnt2(mgrmodel.getPagtCode());
            
//            PolhDetl branch = new PolhDetl(pmodel);
//           
//            if (branch.getPolhDetlPK().getPolhSysid() != 0 && pmodel.getPolhDetlPK().getPolhUserSysid() != 0 ) {
//               
                result = "UPDATE polh_detl SET POLH_STS = '"+dmodel.getOldAgentId()+"' WHERE POLH_NUM = '"+dmodel.getPolicyNumber()+"';";
                System.out.println(result);
//            }
               
               
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
