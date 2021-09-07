/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source2.entity;

import com.model.EazyappPolicyDetailsModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "eazyapp_policy_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazyappPolicyDetails.findAll", query = "SELECT e FROM EazyappPolicyDetails e"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductIndex", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productIndex = :productIndex"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainRefNo", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainRefNo = :productMainRefNo"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainCustomerindexId", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainCustomerindexId = :productMainCustomerindexId"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductNameIndex", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productNameIndex = :productNameIndex"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductrRefNo", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productrRefNo = :productrRefNo"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPolicyNo", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPolicyNo = :productMainPolicyNo"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductPlanMainRateindex", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productPlanMainRateindex = :productPlanMainRateindex"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPaymentFreq", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPaymentFreq = :productMainPaymentFreq"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPolicyAcceptedDate", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPolicyAcceptedDate = :productMainPolicyAcceptedDate"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPolicyStatus", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPolicyStatus = :productMainPolicyStatus"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainBankName", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainBankName = :productMainBankName"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainBankAccount", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainBankAccount = :productMainBankAccount"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainBankBranch", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainBankBranch = :productMainBankBranch"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainMobileMoneyNo", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainMobileMoneyNo = :productMainMobileMoneyNo"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainInputdate", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainInputdate = :productMainInputdate"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPaymentMethod", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPaymentMethod = :productMainPaymentMethod"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainUserindex", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainUserindex = :productMainUserindex"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainAgentsId", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainAgentsId = :productMainAgentsId"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainDeductionStartDate", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainDeductionStartDate = :productMainDeductionStartDate"),
    @NamedQuery(name = "EazyappPolicyDetails.findByPremiumMainAnnualPremiumIncrease", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.premiumMainAnnualPremiumIncrease = :premiumMainAnnualPremiumIncrease"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainEmployerDeduction", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainEmployerDeduction = :productMainEmployerDeduction"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainEmployerStaffPayrollNo", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainEmployerStaffPayrollNo = :productMainEmployerStaffPayrollNo"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainRefno", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainRefno = :productMainRefno"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainAalisNo", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainAalisNo = :productMainAalisNo"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainSumassured", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainSumassured = :productMainSumassured"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPremium", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPremium = :productMainPremium"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPolicyTerm", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPolicyTerm = :productMainPolicyTerm"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPreferredMode", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPreferredMode = :productMainPreferredMode"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainCaption", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainCaption = :productMainCaption"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainAccountName", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainAccountName = :productMainAccountName"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainCanceled", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainCanceled = :productMainCanceled"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainTelco", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainTelco = :productMainTelco"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainMandateid", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainMandateid = :productMainMandateid"),
    @NamedQuery(name = "EazyappPolicyDetails.findBySetPremium", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.setPremium = :setPremium"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainSmsSent", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainSmsSent = :productMainSmsSent"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainStatusComplete", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainStatusComplete = :productMainStatusComplete"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPolicynoSentItc", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPolicynoSentItc = :productMainPolicynoSentItc"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPremiumSentItc", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPremiumSentItc = :productMainPremiumSentItc"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainStDt", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainStDt = :productMainStDt"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainDeductionType", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainDeductionType = :productMainDeductionType"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainPolicyOva", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainPolicyOva = :productMainPolicyOva"),
    @NamedQuery(name = "EazyappPolicyDetails.findByProductMainType", query = "SELECT e FROM EazyappPolicyDetails e WHERE e.productMainType = :productMainType")})
public class EazyappPolicyDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_index")
    private Integer productIndex;
    @Size(max = 11)
    @Column(name = "product_main_ref_no")
    private String productMainRefNo;
    @Size(max = 15)
    @Column(name = "product_main_customerindex_id")
    private String productMainCustomerindexId;
    @Size(max = 15)
    @Column(name = "product_name_index")
    private String productNameIndex;
    @Size(max = 15)
    @Column(name = "productr_ref_no")
    private String productrRefNo;
    @Size(max = 15)
    @Column(name = "product_main_policy_no")
    private String productMainPolicyNo;
    @Size(max = 11)
    @Column(name = "product_plan_main_rateindex")
    private String productPlanMainRateindex;
    @Size(max = 15)
    @Column(name = "product_main_payment_freq")
    private String productMainPaymentFreq;
    @Column(name = "product_main_policy_accepted_date")
    
    private String productMainPolicyAcceptedDate;
    @Size(max = 45)
    @Column(name = "product_main_policy_status")
    private String productMainPolicyStatus;
    @Size(max = 15)
    @Column(name = "product_main_bank_name")
    private String productMainBankName;
    @Size(max = 45)
    @Column(name = "product_main_bank_account")
    private String productMainBankAccount;
    @Size(max = 15)
    @Column(name = "product_main_bank_branch")
    private String productMainBankBranch;
    @Size(max = 20)
    @Column(name = "product_main_mobile_money_no")
    private String productMainMobileMoneyNo;
    @Column(name = "product_main_inputdate")
    private String productMainInputdate;
    @Size(max = 50)
    @Column(name = "product_main_payment_method")
    private String productMainPaymentMethod;
    @Size(max = 15)
    @Column(name = "product_main_userindex")
    private String productMainUserindex;
    @Size(max = 15)
    @Column(name = "product_main_agents_id")
    private String productMainAgentsId;
    @Column(name = "product_main_deduction_start_date")
    private String productMainDeductionStartDate;
    @Size(max = 15)
    @Column(name = "premium_main_annual_premium_increase")
    private String premiumMainAnnualPremiumIncrease;
    @Size(max = 11)
    @Column(name = "product_main_employer_deduction")
    private String productMainEmployerDeduction;
    @Size(max = 15)
    @Column(name = "product_main_employer_staff_payroll_no")
    private String productMainEmployerStaffPayrollNo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_signature")
    private String productMainSignature;
    @Size(max = 11)
    @Column(name = "product_main_refno")
    private String productMainRefno;
    @Size(max = 11)
    @Column(name = "product_main_aalis_no")
    private String productMainAalisNo;
    @Size(max = 45)
    @Column(name = "product_main_sumassured")
    private String productMainSumassured;
    @Size(max = 50)
    @Column(name = "product_main_premium")
    private String productMainPremium;
    @Size(max = 11)
    @Column(name = "product_main_policy_term")
    private String productMainPolicyTerm;
    @Size(max = 45)
    @Column(name = "product_main_preferred_mode")
    private String productMainPreferredMode;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_narration")
    private String productMainNarration;
    @Size(max = 45)
    @Column(name = "product_main_caption")
    private String productMainCaption;
    @Size(max = 45)
    @Column(name = "product_main_account_name")
    private String productMainAccountName;
    @Size(max = 45)
    @Column(name = "product_main_canceled")
    private String productMainCanceled;
    @Size(max = 15)
    @Column(name = "product_main_telco")
    private String productMainTelco;
    @Size(max = 45)
    @Column(name = "product_main_mandateid")
    private String productMainMandateid;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_response")
    private String productMainResponse;
    @Size(max = 45)
    @Column(name = "set_premium")
    private String setPremium;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_service_id")
    private String productMainServiceId;
    @Size(max = 45)
    @Column(name = "product_main_sms_sent")
    private String productMainSmsSent;
    @Size(max = 1)
    @Column(name = "product_main_status_complete")
    private String productMainStatusComplete;
    @Size(max = 45)
    @Column(name = "product_main_policyno_sent_itc")
    private String productMainPolicynoSentItc;
    @Size(max = 45)
    @Column(name = "product_main_premium_sent_itc")
    private String productMainPremiumSentItc;
    @Column(name = "product_main_st_dt")   
    private String productMainStDt;
    @Size(max = 45)
    @Column(name = "product_main_deduction_type")
    private String productMainDeductionType;
    @Size(max = 45)
    @Column(name = "product_main_policy_ova")
    private String productMainPolicyOva;
    @Size(max = 1)
    @Column(name = "product_main_type")
    private String productMainType;

    public EazyappPolicyDetails() {
    }

    public EazyappPolicyDetails(Integer productIndex, String productMainRefNo, String productMainCustomerindexId, String productNameIndex, String productrRefNo, String productMainPolicyNo, String productPlanMainRateindex, String productMainPaymentFreq, String productMainPolicyAcceptedDate, String productMainPolicyStatus, String productMainBankName, String productMainBankAccount, String productMainBankBranch, String productMainMobileMoneyNo, String productMainInputdate, String productMainPaymentMethod, String productMainUserindex, String productMainAgentsId, String productMainDeductionStartDate, String premiumMainAnnualPremiumIncrease, String productMainEmployerDeduction, String productMainEmployerStaffPayrollNo, String productMainAalisNo, String productMainSumassured, String productMainPremium, String productMainPolicyTerm, String productMainPreferredMode, String productMainNarration, String productMainCaption, String productMainAccountName, String productMainCanceled, String productMainTelco, String productMainMandateid, String productMainResponse, String setPremium, String productMainServiceId, String productMainSmsSent, String productMainStatusComplete, String productMainPolicynoSentItc, String productMainPremiumSentItc, String productMainStDt, String productMainDeductionType, String productMainPolicyOva, String productMainType) {
        this.productIndex = productIndex;
        this.productMainRefNo = productMainRefNo;
        this.productMainCustomerindexId = productMainCustomerindexId;
        this.productNameIndex = productNameIndex;
        this.productrRefNo = productrRefNo;
        this.productMainPolicyNo = productMainPolicyNo;
        this.productPlanMainRateindex = productPlanMainRateindex;
        this.productMainPaymentFreq = productMainPaymentFreq;
        this.productMainPolicyAcceptedDate = productMainPolicyAcceptedDate;
        this.productMainPolicyStatus = productMainPolicyStatus;
        this.productMainBankName = productMainBankName;
        this.productMainBankAccount = productMainBankAccount;
        this.productMainBankBranch = productMainBankBranch;
        this.productMainMobileMoneyNo = productMainMobileMoneyNo;
        this.productMainInputdate = productMainInputdate;
        this.productMainPaymentMethod = productMainPaymentMethod;
        this.productMainUserindex = productMainUserindex;
        this.productMainAgentsId = productMainAgentsId;
        this.productMainDeductionStartDate = productMainDeductionStartDate;
        this.premiumMainAnnualPremiumIncrease = premiumMainAnnualPremiumIncrease;
        this.productMainEmployerDeduction = productMainEmployerDeduction;
        this.productMainEmployerStaffPayrollNo = productMainEmployerStaffPayrollNo;
        this.productMainAalisNo = productMainAalisNo;
        this.productMainSumassured = productMainSumassured;
        this.productMainPremium = productMainPremium;
        this.productMainPolicyTerm = productMainPolicyTerm;
        this.productMainPreferredMode = productMainPreferredMode;
        this.productMainNarration = productMainNarration;
        this.productMainCaption = productMainCaption;
        this.productMainAccountName = productMainAccountName;
        this.productMainCanceled = productMainCanceled;
        this.productMainTelco = productMainTelco;
        this.productMainMandateid = productMainMandateid;
        this.productMainResponse = productMainResponse;
        this.setPremium = setPremium;
        this.productMainServiceId = productMainServiceId;
        this.productMainSmsSent = productMainSmsSent;
        this.productMainStatusComplete = productMainStatusComplete;
        this.productMainPolicynoSentItc = productMainPolicynoSentItc;
        this.productMainPremiumSentItc = productMainPremiumSentItc;
        this.productMainStDt = productMainStDt;
        this.productMainDeductionType = productMainDeductionType;
        this.productMainPolicyOva = productMainPolicyOva;
        this.productMainType = productMainType;
    }
    
    public EazyappPolicyDetails(EazyappPolicyDetailsModel epdmodel) {
        this.productIndex = epdmodel.getProductIndex();
        this.productMainRefNo = epdmodel.getProductMainRefNo();
        this.productMainCustomerindexId = epdmodel.getProductMainCustomerindexId();
        this.productNameIndex = epdmodel.getProductNameIndex();
        this.productrRefNo = epdmodel.getProductrRefNo();
        this.productMainPolicyNo = epdmodel.getProductMainPolicyNo();
        this.productPlanMainRateindex = epdmodel.getProductPlanMainRateindex();
        this.productMainPaymentFreq = epdmodel.getProductMainPaymentFreq();
        this.productMainPolicyAcceptedDate = epdmodel.getProductMainPolicyAcceptedDate();
        this.productMainPolicyStatus = epdmodel.getProductMainPolicyStatus();
        this.productMainBankName = epdmodel.getProductMainBankName();
        this.productMainBankAccount = epdmodel.getProductMainBankAccount();
        this.productMainBankBranch = epdmodel.getProductMainBankBranch();
        this.productMainMobileMoneyNo = epdmodel.getProductMainMobileMoneyNo();
        this.productMainInputdate = epdmodel.getProductMainInputdate();
        this.productMainPaymentMethod = epdmodel.getProductMainPaymentMethod();
        this.productMainUserindex = epdmodel.getProductMainUserindex();
        this.productMainAgentsId = epdmodel.getProductMainAgentsId();
        this.productMainDeductionStartDate = epdmodel.getProductMainDeductionStartDate();
        this.premiumMainAnnualPremiumIncrease = epdmodel.getPremiumMainAnnualPremiumIncrease();
        this.productMainEmployerDeduction = epdmodel.getProductMainEmployerDeduction();
        this.productMainEmployerStaffPayrollNo = epdmodel.getProductMainEmployerStaffPayrollNo();
        this.productMainAalisNo = epdmodel.getProductMainAalisNo();
        this.productMainSumassured = epdmodel.getProductMainSumassured();
        this.productMainPremium = epdmodel.getProductMainPremium();
        this.productMainPolicyTerm = epdmodel.getProductMainPolicyTerm();
        this.productMainPreferredMode = epdmodel.getProductMainPreferredMode();
        this.productMainNarration = epdmodel.getProductMainNarration();
        this.productMainCaption = epdmodel.getProductMainCaption();
        this.productMainAccountName = epdmodel.getProductMainAccountName();
        this.productMainCanceled = epdmodel.getProductMainCanceled();
        this.productMainTelco = epdmodel.getProductMainTelco();
        this.productMainMandateid = epdmodel.getProductMainMandateid();
        this.productMainResponse = epdmodel.getProductMainResponse();
        this.setPremium = epdmodel.getSetPremium();
        this.productMainServiceId = epdmodel.getProductMainServiceId();
        this.productMainSmsSent = epdmodel.getProductMainSmsSent();
        this.productMainStatusComplete = epdmodel.getProductMainStatusComplete();
        this.productMainPolicynoSentItc = epdmodel.getProductMainPolicynoSentItc();
        this.productMainPremiumSentItc = epdmodel.getProductMainPremium();
        this.productMainStDt = epdmodel.getProductMainStDt();
        this.productMainDeductionType = epdmodel.getProductMainDeductionType();
        this.productMainPolicyOva = epdmodel.getProductMainPolicyOva();
        this.productMainType = epdmodel.getProductMainType();
    }
    
    

    public EazyappPolicyDetails(Integer productIndex) {
        this.productIndex = productIndex;
    }

    public Integer getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(Integer productIndex) {
        this.productIndex = productIndex;
    }

    public String getProductMainRefNo() {
        return productMainRefNo;
    }

    public void setProductMainRefNo(String productMainRefNo) {
        this.productMainRefNo = productMainRefNo;
    }

    public String getProductMainCustomerindexId() {
        return productMainCustomerindexId;
    }

    public void setProductMainCustomerindexId(String productMainCustomerindexId) {
        this.productMainCustomerindexId = productMainCustomerindexId;
    }

    public String getProductNameIndex() {
        return productNameIndex;
    }

    public void setProductNameIndex(String productNameIndex) {
        this.productNameIndex = productNameIndex;
    }

    public String getProductrRefNo() {
        return productrRefNo;
    }

    public void setProductrRefNo(String productrRefNo) {
        this.productrRefNo = productrRefNo;
    }

    public String getProductMainPolicyNo() {
        return productMainPolicyNo;
    }

    public void setProductMainPolicyNo(String productMainPolicyNo) {
        this.productMainPolicyNo = productMainPolicyNo;
    }

    public String getProductPlanMainRateindex() {
        return productPlanMainRateindex;
    }

    public void setProductPlanMainRateindex(String productPlanMainRateindex) {
        this.productPlanMainRateindex = productPlanMainRateindex;
    }

    public String getProductMainPaymentFreq() {
        return productMainPaymentFreq;
    }

    public void setProductMainPaymentFreq(String productMainPaymentFreq) {
        this.productMainPaymentFreq = productMainPaymentFreq;
    }

    public String getProductMainPolicyAcceptedDate() {
        return productMainPolicyAcceptedDate;
    }

    public void setProductMainPolicyAcceptedDate(String productMainPolicyAcceptedDate) {
        this.productMainPolicyAcceptedDate = productMainPolicyAcceptedDate;
    }

    public String getProductMainPolicyStatus() {
        return productMainPolicyStatus;
    }

    public void setProductMainPolicyStatus(String productMainPolicyStatus) {
        this.productMainPolicyStatus = productMainPolicyStatus;
    }

    public String getProductMainBankName() {
        return productMainBankName;
    }

    public void setProductMainBankName(String productMainBankName) {
        this.productMainBankName = productMainBankName;
    }

    public String getProductMainBankAccount() {
        return productMainBankAccount;
    }

    public void setProductMainBankAccount(String productMainBankAccount) {
        this.productMainBankAccount = productMainBankAccount;
    }

    public String getProductMainBankBranch() {
        return productMainBankBranch;
    }

    public void setProductMainBankBranch(String productMainBankBranch) {
        this.productMainBankBranch = productMainBankBranch;
    }

    public String getProductMainMobileMoneyNo() {
        return productMainMobileMoneyNo;
    }

    public void setProductMainMobileMoneyNo(String productMainMobileMoneyNo) {
        this.productMainMobileMoneyNo = productMainMobileMoneyNo;
    }

    public String getProductMainInputdate() {
        return productMainInputdate;
    }

    public void setProductMainInputdate(String productMainInputdate) {
        this.productMainInputdate = productMainInputdate;
    }

    public String getProductMainPaymentMethod() {
        return productMainPaymentMethod;
    }

    public void setProductMainPaymentMethod(String productMainPaymentMethod) {
        this.productMainPaymentMethod = productMainPaymentMethod;
    }

    public String getProductMainUserindex() {
        return productMainUserindex;
    }

    public void setProductMainUserindex(String productMainUserindex) {
        this.productMainUserindex = productMainUserindex;
    }

    public String getProductMainAgentsId() {
        return productMainAgentsId;
    }

    public void setProductMainAgentsId(String productMainAgentsId) {
        this.productMainAgentsId = productMainAgentsId;
    }

    public String getProductMainDeductionStartDate() {
        return productMainDeductionStartDate;
    }

    public void setProductMainDeductionStartDate(String productMainDeductionStartDate) {
        this.productMainDeductionStartDate = productMainDeductionStartDate;
    }

    public String getPremiumMainAnnualPremiumIncrease() {
        return premiumMainAnnualPremiumIncrease;
    }

    public void setPremiumMainAnnualPremiumIncrease(String premiumMainAnnualPremiumIncrease) {
        this.premiumMainAnnualPremiumIncrease = premiumMainAnnualPremiumIncrease;
    }

    public String getProductMainEmployerDeduction() {
        return productMainEmployerDeduction;
    }

    public void setProductMainEmployerDeduction(String productMainEmployerDeduction) {
        this.productMainEmployerDeduction = productMainEmployerDeduction;
    }

    public String getProductMainEmployerStaffPayrollNo() {
        return productMainEmployerStaffPayrollNo;
    }

    public void setProductMainEmployerStaffPayrollNo(String productMainEmployerStaffPayrollNo) {
        this.productMainEmployerStaffPayrollNo = productMainEmployerStaffPayrollNo;
    }

    public String getProductMainSignature() {
        return productMainSignature;
    }

    public void setProductMainSignature(String productMainSignature) {
        this.productMainSignature = productMainSignature;
    }

    public String getProductMainRefno() {
        return productMainRefno;
    }

    public void setProductMainRefno(String productMainRefno) {
        this.productMainRefno = productMainRefno;
    }

    public String getProductMainAalisNo() {
        return productMainAalisNo;
    }

    public void setProductMainAalisNo(String productMainAalisNo) {
        this.productMainAalisNo = productMainAalisNo;
    }

    public String getProductMainSumassured() {
        return productMainSumassured;
    }

    public void setProductMainSumassured(String productMainSumassured) {
        this.productMainSumassured = productMainSumassured;
    }

    public String getProductMainPremium() {
        return productMainPremium;
    }

    public void setProductMainPremium(String productMainPremium) {
        this.productMainPremium = productMainPremium;
    }

    public String getProductMainPolicyTerm() {
        return productMainPolicyTerm;
    }

    public void setProductMainPolicyTerm(String productMainPolicyTerm) {
        this.productMainPolicyTerm = productMainPolicyTerm;
    }

    public String getProductMainPreferredMode() {
        return productMainPreferredMode;
    }

    public void setProductMainPreferredMode(String productMainPreferredMode) {
        this.productMainPreferredMode = productMainPreferredMode;
    }

    public String getProductMainNarration() {
        return productMainNarration;
    }

    public void setProductMainNarration(String productMainNarration) {
        this.productMainNarration = productMainNarration;
    }

    public String getProductMainCaption() {
        return productMainCaption;
    }

    public void setProductMainCaption(String productMainCaption) {
        this.productMainCaption = productMainCaption;
    }

    public String getProductMainAccountName() {
        return productMainAccountName;
    }

    public void setProductMainAccountName(String productMainAccountName) {
        this.productMainAccountName = productMainAccountName;
    }

    public String getProductMainCanceled() {
        return productMainCanceled;
    }

    public void setProductMainCanceled(String productMainCanceled) {
        this.productMainCanceled = productMainCanceled;
    }

    public String getProductMainTelco() {
        return productMainTelco;
    }

    public void setProductMainTelco(String productMainTelco) {
        this.productMainTelco = productMainTelco;
    }

    public String getProductMainMandateid() {
        return productMainMandateid;
    }

    public void setProductMainMandateid(String productMainMandateid) {
        this.productMainMandateid = productMainMandateid;
    }

    public String getProductMainResponse() {
        return productMainResponse;
    }

    public void setProductMainResponse(String productMainResponse) {
        this.productMainResponse = productMainResponse;
    }

    public String getSetPremium() {
        return setPremium;
    }

    public void setSetPremium(String setPremium) {
        this.setPremium = setPremium;
    }

    public String getProductMainServiceId() {
        return productMainServiceId;
    }

    public void setProductMainServiceId(String productMainServiceId) {
        this.productMainServiceId = productMainServiceId;
    }

    public String getProductMainSmsSent() {
        return productMainSmsSent;
    }

    public void setProductMainSmsSent(String productMainSmsSent) {
        this.productMainSmsSent = productMainSmsSent;
    }

    public String getProductMainStatusComplete() {
        return productMainStatusComplete;
    }

    public void setProductMainStatusComplete(String productMainStatusComplete) {
        this.productMainStatusComplete = productMainStatusComplete;
    }

    public String getProductMainPolicynoSentItc() {
        return productMainPolicynoSentItc;
    }

    public void setProductMainPolicynoSentItc(String productMainPolicynoSentItc) {
        this.productMainPolicynoSentItc = productMainPolicynoSentItc;
    }

    public String getProductMainPremiumSentItc() {
        return productMainPremiumSentItc;
    }

    public void setProductMainPremiumSentItc(String productMainPremiumSentItc) {
        this.productMainPremiumSentItc = productMainPremiumSentItc;
    }

    public String getProductMainStDt() {
        return productMainStDt;
    }

    public void setProductMainStDt(String productMainStDt) {
        this.productMainStDt = productMainStDt;
    }

    public String getProductMainDeductionType() {
        return productMainDeductionType;
    }

    public void setProductMainDeductionType(String productMainDeductionType) {
        this.productMainDeductionType = productMainDeductionType;
    }

    public String getProductMainPolicyOva() {
        return productMainPolicyOva;
    }

    public void setProductMainPolicyOva(String productMainPolicyOva) {
        this.productMainPolicyOva = productMainPolicyOva;
    }

    public String getProductMainType() {
        return productMainType;
    }

    public void setProductMainType(String productMainType) {
        this.productMainType = productMainType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productIndex != null ? productIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazyappPolicyDetails)) {
            return false;
        }
        EazyappPolicyDetails other = (EazyappPolicyDetails) object;
        if ((this.productIndex == null && other.productIndex != null) || (this.productIndex != null && !this.productIndex.equals(other.productIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source2.entity.EazyappPolicyDetails[ productIndex=" + productIndex + " ]";
    }
    
}
