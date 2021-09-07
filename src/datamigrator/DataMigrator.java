/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamigrator;

import com.migration.AgentIdListLogic;
import com.migration.AosAgentsTbLogic;
import com.migration.AosBenefTbLogic;
import com.migration.AosClaimsLogic;
import com.migration.AosCustomerTbLogic;
import com.migration.AosDependTbLogic;
import com.migration.AosPolicyDetailsLogic;
import com.migration.AosTeamTbLogic;
import com.migration.AosTrustTbLogic;
import com.migration.BeneficiaryTbLogic;
import com.migration.BranchLogic;
import com.migration.CustomerTbLogic;
import com.migration.EasyappAgentsTbLogic;
import com.migration.EasyappTeamTbLogic;
import com.migration.EazyappBenefTbLogic;
import com.migration.EazyappCustomerTbLogic;
import com.migration.EazyappDependTbLogic;
import com.migration.EazyappPolicyDetailsLogic;
import com.migration.EazyappTrustTbLogic;
import com.migration.EazylifeAgentsTbLogic;
import com.migration.EazylifeBenefTbLogic;
import com.migration.EazylifeCustomerTbLogic;
import com.migration.EazylifeDependTbLogic;
import com.migration.EazylifePolicyDetailsLogic;
import com.migration.EazylifeTeamTbLogic;
import com.migration.EazylifeTrustTbLogic;
import com.migration.PayDetlLogic;
import com.migration.PolStartDateTbLogic;
import com.migration.PolhClmInitLogic;
import com.migration.PolhDependDtlLogic;
import com.migration.PolhDetlDueLogic;
import com.migration.PolhDetlLogic;
import com.migration.PremResvLogic;
import com.migration.ProductAgentsTbLogic;
import com.migration.ProductBankBranchTbLogic;
import com.migration.ProductTransSusuTbLogic;
import com.migration.TotalDueModel;
import com.migration.UsersLogic;
import com.model.AgentIdListModel;
import com.model.AosAgentsTbModel;
import com.model.AosBenefTbModel;
import com.model.AosClaimsModel;
import com.model.AosDependTbModel;
import com.model.AosPolicyDetailsModel;
import com.model.AosTeamTbModel;
import com.model.BranchModel;
import com.model.CustomerModel;
import com.model.EasyappAgentsTbModel;
import com.model.EasyappTeamTbModel;
import com.model.EazyappBenefTbModel;
import com.model.EazyappDependTbModel;
import com.model.EazyappPolicyDetailsModel;
import com.model.EazylifeAgentsTbModel;
import com.model.EazylifeBenefTbModel;
import com.model.EazylifeDependTbModel;
import com.model.EazylifePolicyDetailsModel;
import com.model.EazylifeTeamTbModel;
import com.model.PayDetlModel;
import com.model.PolStartDateTbModel;
import com.model.PolhDependDtlModel;
import com.model.PolhDetlModel;
import com.model.PremResvModel;
import com.model.ProductAgentsModel;
import com.model.ProductBankBranchTbModel;
import com.model.ProductTransSusuTbModel;
import com.model.TrustTbModel;
import java.util.List;

/**
 *
 * @author Developer
 */
public class DataMigrator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  BranchLogic blogic = new BranchLogic();
//        AosTeamTbLogic aostlogic = new AosTeamTbLogic();
//        AosAgentsTbLogic aoslogic = new AosAgentsTbLogic();
//        EasyappTeamTbLogic easytlogic = new EasyappTeamTbLogic();
//        EasyappAgentsTbLogic easylogic = new EasyappAgentsTbLogic();
//        EazylifeTeamTbLogic eazytlogic = new EazylifeTeamTbLogic();
//        EazylifeAgentsTbLogic eazylogic = new EazylifeAgentsTbLogic();
//        ProductAgentsTbLogic palogic = new ProductAgentsTbLogic();
//        EazyappPolicyDetailsLogic epdlogic = new EazyappPolicyDetailsLogic();
//        EazylifePolicyDetailsLogic elpdlogic = new EazylifePolicyDetailsLogic();
//        AosPolicyDetailsLogic apdlogic = new AosPolicyDetailsLogic();
//        PolhDetlLogic pdlogic = new PolhDetlLogic();
//        UsersLogic ulogic = new UsersLogic();
//        AosCustomerTbLogic aosctlogic = new AosCustomerTbLogic();
//        EazyappCustomerTbLogic eazyappctlogic = new EazyappCustomerTbLogic();
//        EazylifeCustomerTbLogic eazylifectlogic = new EazylifeCustomerTbLogic();
//        AosDependTbLogic aosdeplogic = new AosDependTbLogic();
//        EazyappDependTbLogic eazy1deplogic = new EazyappDependTbLogic();
//        EazylifeDependTbLogic eazy2deplogic = new EazylifeDependTbLogic();
//        AosBenefTbLogic aosbenlogic = new AosBenefTbLogic();
//        EazyappBenefTbLogic eazy1benlogic = new EazyappBenefTbLogic();
//        EazylifeBenefTbLogic eazy2benlogic = new EazylifeBenefTbLogic();
//        AosTrustTbLogic aosTrlogic = new AosTrustTbLogic();
//        EazyappTrustTbLogic eazy1Trlogic = new EazyappTrustTbLogic();
//        EazylifeTrustTbLogic eazy2Trlogic = new EazylifeTrustTbLogic();
//        CustomerTbLogic ctlogic = new CustomerTbLogic();
//        PolhDependDtlLogic pohldetails = new PolhDependDtlLogic();
//        BeneficiaryTbLogic bentb = new BeneficiaryTbLogic();
//        List<AosTeamTbModel> aostlist = aostlogic.getAosTeamTb();
//        List<AosAgentsTbModel> aosalist = aoslogic.getAosAgentsTb();
//        List<EasyappTeamTbModel> easytlist = easytlogic.getEasyappTeamTb();
//        List<EasyappAgentsTbModel> easylist = easylogic.getEasyappAgents();
//        List<EazylifeTeamTbModel> eazytlist = eazytlogic.getEazylifeAgents();
//        List<EazylifeAgentsTbModel> eazylist = eazylogic.getEazylifeAgents();
//        List<AosPolicyDetailsModel> polist = apdlogic.getAosPolicyDetails();
//        List<EazyappPolicyDetailsModel> epdlist = epdlogic.getEazyappPolicyDetails();
//        List<EazylifePolicyDetailsModel> elpdlist = elpdlogic.getEazylifePolicyDetails();
//        List<AosDependTbModel> dep1list = aosdeplogic.getAosDependTb();
//        List<EazyappDependTbModel> dep2list = eazy1deplogic.getEazyappDependTb();
//        List<EazylifeDependTbModel> dep3list = eazy2deplogic.getEazylifeDependTb();
//        List<AosBenefTbModel> ben1list = aosbenlogic.getAosBenefTb();
//        List<EazyappBenefTbModel> ben2list = eazy1benlogic.getEazyappBenefTb();
//        List<EazylifeBenefTbModel> ben3list = eazy2benlogic.getEazylifeBenefTb();
//        List<TrustTbModel> tr1list = aosTrlogic.getAosTrustTb();
//        List<TrustTbModel> tr2list = eazy1Trlogic.getEazyappTrustTb();
//        List<TrustTbModel> tr3list = eazy2Trlogic.getEazylifeTrustTb();
//        PolhDetlLogic alogic = new PolhDetlLogic();
//        PayDetlLogic pallogic = new PayDetlLogic();
//        PolhDependDtlLogic padlogic = new PolhDependDtlLogic();
//        PayDetlLogic bvlogic = new PayDetlLogic();
//        ProductTransSusuTbLogic ptsususLogic = new ProductTransSusuTbLogic();
//        PremResvLogic presvlogic = new PremResvLogic();
 //       PolhDetlDueLogic pddlogic = new PolhDetlDueLogic();
        List<AgentIdListModel> agentlist = new AgentIdListLogic().getAgentIdLists();
//        List<ProductTransSusuTbModel> lptlist = ptsususLogic.getProductTransSusuTbs();
//        List<PremResvModel> lprevlist = presvlogic.getPremResvs();
//        List<PolStartDateTbModel> poltblist = new PolStartDateTbLogic().getPolStartDateTbs();
//        ProductBankBranchTbLogic pbbranchlogic = new ProductBankBranchTbLogic();
//        ProductBankBranchTbModel pbbmodel = pbbranchlogic.getProductBankBranchTbById(1);
//       List<AosClaimsModel> aoscllist = new AosClaimsLogic().getAosClaims();
        String result = "";
        String csv = "";
        int cnt = 0;
        for (AgentIdListModel smodel : agentlist) {
//
//            csv += "'" + smodel.getPolicyNumber() + "',";

 //           System.out.println("Row Sys ID:" + smodel.getId() + " Row Number: " + cnt);
            result = new PolhDetlLogic().savePolicy(smodel);
        }
//        System.out.println(csv);
//        List<TotalDueModel> tlist = pddlogic.getTotal(csv.substring(0, csv.length() - 1));
//        for (TotalDueModel smodel : tlist) {
//            cnt++;
//            System.out.println(cnt);
//            AgentIdListModel agtmodel = new AgentIdListLogic().getById(smodel.getPolicyNum());
//            agtmodel.setNewAgentId(String.valueOf(smodel.getTotal()));
//            result = new AgentIdListLogic().getTotalDue(agtmodel);
//        }

//         result = pbbranchlogic.saveProductBankBranchTb(pbbmodel);   
//
//        List<PolhDetlModel> palist = alogic.getPolhDetles();
//        for (PolhDetlModel smodel : palist) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getPolhDetlPK().getPolhSysid() + " Row Number: " + cnt);
//            result = pdlogic.updateAgent(smodel);
//        }
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***First Module: AOS Team Leaders ****");
//        cnt = 0;
//        for (AosTeamTbModel smodel : aostlist) {
//            cnt++;
//            
//            System.out.println("Row Sys ID:" + smodel.getTeamIndex() + " Row Number: " + cnt);
//            result = palogic.saveAosTeamLeaders(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: AOS Agents ****");
//        cnt = 0;
//        for (AosAgentsTbModel smodel : aosalist) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getAgentsIndex() + " Row Number: " + cnt);
//            result = palogic.saveAosAgents(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: EasyApp Team Leaders ****");
//        cnt = 0;
//        for (EasyappTeamTbModel smodel : easytlist) {
//            cnt++;
//            if(cnt > 62){
//            System.out.println("Row Sys ID:" + smodel.getTeamIndex() + " Row Number: " + cnt);
//            result = palogic.saveEasyAppTeamLeaders(smodel);
//            }
//            
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: EasyApp Agents ****");
//        cnt = 0;
//        for (EasyappAgentsTbModel smodel : easylist) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getAgentsIndex() + " Row Number: " + cnt);
//            result = palogic.saveEasyAppAgents(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: EasyLife Team Leaders ****");
//        cnt = 0;
//        for (EazylifeTeamTbModel smodel : eazytlist) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getTeamIndex() + " Row Number: " + cnt);
//            result = palogic.saveEasyLifeTeamLeaders(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: EasyLife Agents ****");
//        for (EazylifeAgentsTbModel smodel : eazylist) {
//             result = palogic.saveEasyLifeAgents(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: V2 Users ****");
//        cnt = 0;
//        List<ProductAgentsModel> palist = palogic.getProductAgentsTb();
//        for (ProductAgentsModel smodel : palist) {
//            cnt++;
//            if(smodel.getProductAgentsTbPK().getPagtSysid() >= 100 && smodel.getProductAgentsTbPK().getPagtSysid()<= 284){
//            System.out.println("Row Sys ID:" + smodel.getProductAgentsTbPK().getPagtSysid() + " Row Number: " + cnt);
//            result = ulogic.saveUsers(smodel);
//            }
//        }
//        System.out.println(result);
//        List<CustomerModel> cuslist = aosctlogic.getCustomers();
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: AOS Customers ****");
//        cnt = 0;
//        for (CustomerModel smodel : cuslist) {
//             cnt++;
//            System.out.println("Row Sys ID:" + smodel.getCustomerindex() + " Row Number: " + cnt);
//            result = ctlogic.saveCustomer(smodel, "aos");
//        }
//        System.out.println(result);
//        cuslist = eazyappctlogic.getCustomers();
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazyapp Customers ****");
//        cnt = 0;
//        for (CustomerModel smodel : cuslist) {
//             cnt++;
//            System.out.println("Row Sys ID:" + smodel.getCustomerindex() + " Row Number: " + cnt);
//            result = ctlogic.saveCustomer(smodel, "eazyapp");
//        }
//        System.out.println(result);
//        cuslist = eazylifectlogic.getCustomers();
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazylife Customers ****");
//        cnt = 0;
//        for (CustomerModel smodel : cuslist) {
//             cnt++;
//            System.out.println("Row Sys ID:" + smodel.getCustomerindex() + " Row Number: " + cnt);
//            result = ctlogic.saveCustomer(smodel, "eazylife");
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: AOS Policy Details ****");
//        cnt = 0;
//        for (AosPolicyDetailsModel smodel : polist) {
//            cnt++;
//            if(cnt > 12472){
//            System.out.println("Row Sys ID:" + smodel.getProductIndex() + " Row Number: " + cnt);
//            result = pdlogic.savePolicy(smodel);
//            }
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazyapp Policy Details ****");
//        cnt = 0;
//        for (EazyappPolicyDetailsModel smodel : epdlist) {
//            cnt++;
//            if (cnt > 10838) {
//                System.out.println("Row Sys ID:" + smodel.getProductIndex() + " Row Number: " + cnt);
//                result = pdlogic.savePolicy(smodel);
//            }
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazylife Policy Details ****");
//        cnt = 0;
//        for (EazylifePolicyDetailsModel smodel : elpdlist) {
//            cnt++;
//          
//            System.out.println("Row Sys ID:" + smodel.getProductIndex() + " Row Number: " + cnt);
//            result = bvlogic.updateAgent(smodel);
//            
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: AOS Dependant Details ****");
//        cnt = 0;
//        for (AosDependTbModel smodel : dep1list) {
//            cnt++;
//            if(cnt > 12880){
//            System.out.println("Row Sys ID:" + smodel.getProductMainDepndIndex() + " Row Number: " + cnt);
//            result = pohldetails.saveAosDependant(smodel);
//            }
//        
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazyapp Dependant Details ****");
//        cnt = 0;
//        for (EazyappDependTbModel smodel : dep2list) {
//            cnt++;
//            if (cnt > 3402) {
//                System.out.println("Row Sys ID:" + smodel.getProductMainDepndIndex() + " Row Number: " + cnt);
//                result = pohldetails.saveEazyappDependant(smodel);
//            }
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazylife Dependant Details ****");
//        cnt = 0;
//        for (EazylifeDependTbModel smodel : dep3list) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getProductMainDepndIndex() + " Row Number: " + cnt);
//            result = pohldetails.saveEazylifeDependant(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: AOS Beneficiary Details ****");
//        cnt = 0;
//        for (AosBenefTbModel smodel : ben1list) {
//            cnt++;
//            if(cnt > 12019){
//            System.out.println("Row Sys ID:" + smodel.getProductBeneIndex() + " Row Number: " + cnt);
//            result = bentb.saveAosBeneficiary(smodel);
//        }
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazyapp Beneficiary Details ****");
//        cnt = 0;
//        for (EazyappBenefTbModel smodel : ben2list) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getProductBeneIndex() + " Row Number: " + cnt);
//            result = bentb.saveEazyappBeneficiary(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazylife Beneficiary Details ****");
//        cnt = 0;
//        for (EazylifeBenefTbModel smodel : ben3list) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getProductBeneIndex() + " Row Number: " + cnt);
//            result = bentb.saveEazylifeBeneficiary(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: AOS Trustee Details ****");
//        cnt = 0;
//        for (TrustTbModel smodel : tr1list) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getProductMainTrustIndex() + " Row Number: " + cnt);
//            result = bentb.saveAosTrusteeBeneficiary(smodel);
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazyapp Trustee Details ****");
//        cnt = 0;
//        for (TrustTbModel smodel : tr2list) {
//            cnt++;
//            if(cnt> 15105){
//            System.out.println("Row Sys ID:" + smodel.getProductMainTrustIndex() + " Row Number: " + cnt);
//            result = bentb.saveEazyappTrusteeBeneficiary(smodel);
//            }
//        }
//        System.out.println(result);
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("********************************************************************************************************************************************");
//        System.out.println("***Next Module: Eazylife Trustee Details ****");
//        cnt = 0;
//        for (TrustTbModel smodel : tr3list) {
//            cnt++;
//            System.out.println("Row Sys ID:" + smodel.getProductMainTrustIndex() + " Row Number: " + cnt);
//            result = bentb.saveEazylifeTrusteeBeneficiary(smodel);
//        }
//        System.out.println(result);
    }

}
