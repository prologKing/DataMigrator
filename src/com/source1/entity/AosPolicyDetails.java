/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.AosPolicyDetailsModel;
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
@Table(name = "aos_policy_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AosPolicyDetails.findAll", query = "SELECT a FROM AosPolicyDetails a"),
    @NamedQuery(name = "AosPolicyDetails.findByProductIndex", query = "SELECT a FROM AosPolicyDetails a WHERE a.productIndex = :productIndex"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainCustomerindexId", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainCustomerindexId = :productMainCustomerindexId"),
    @NamedQuery(name = "AosPolicyDetails.findByProductNameIndex", query = "SELECT a FROM AosPolicyDetails a WHERE a.productNameIndex = :productNameIndex"),
    @NamedQuery(name = "AosPolicyDetails.findByProductrRefNo", query = "SELECT a FROM AosPolicyDetails a WHERE a.productrRefNo = :productrRefNo"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyNo", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyNo = :productMainPolicyNo"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainRateindex", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainRateindex = :productMainRateindex"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPremium", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPremium = :productMainPremium"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainSusu", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainSusu = :productMainSusu"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainSumassured", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainSumassured = :productMainSumassured"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPaymentFreq", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPaymentFreq = :productMainPaymentFreq"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyTerm", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyTerm = :productMainPolicyTerm"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyAcceptedDate", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyAcceptedDate = :productMainPolicyAcceptedDate"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyStatus", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyStatus = :productMainPolicyStatus"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainBankName", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainBankName = :productMainBankName"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainBankAccount", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainBankAccount = :productMainBankAccount"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainBankBranch", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainBankBranch = :productMainBankBranch"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainMobileMoneyNo", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainMobileMoneyNo = :productMainMobileMoneyNo"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainInputdate", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainInputdate = :productMainInputdate"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainUserindex", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainUserindex = :productMainUserindex"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainDate", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainDate = :productMainDate"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainAgentsId", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainAgentsId = :productMainAgentsId"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainBenefitAmt", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainBenefitAmt = :productMainBenefitAmt"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPremiumAmt", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPremiumAmt = :productMainPremiumAmt"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainDeductionStartDate", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainDeductionStartDate = :productMainDeductionStartDate"),
    @NamedQuery(name = "AosPolicyDetails.findByPremiumMailAnnualPremiumIncrease", query = "SELECT a FROM AosPolicyDetails a WHERE a.premiumMailAnnualPremiumIncrease = :premiumMailAnnualPremiumIncrease"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainCanceled", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainCanceled = :productMainCanceled"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainTelco", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainTelco = :productMainTelco"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainMandateid", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainMandateid = :productMainMandateid"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyNoCount", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyNoCount = :productMainPolicyNoCount"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyRefCount", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyRefCount = :productMainPolicyRefCount"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicyOva", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicyOva = :productMainPolicyOva"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainSmsSent", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainSmsSent = :productMainSmsSent"),
    @NamedQuery(name = "AosPolicyDetails.findByPlanId", query = "SELECT a FROM AosPolicyDetails a WHERE a.planId = :planId"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainDeductionType", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainDeductionType = :productMainDeductionType"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPolicynoSentItc", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPolicynoSentItc = :productMainPolicynoSentItc"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainPremiumSentItc", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainPremiumSentItc = :productMainPremiumSentItc"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainStDt", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainStDt = :productMainStDt"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainStatusComplete", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainStatusComplete = :productMainStatusComplete"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainMandateStatus", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainMandateStatus = :productMainMandateStatus"),
    @NamedQuery(name = "AosPolicyDetails.findByProductMainType", query = "SELECT a FROM AosPolicyDetails a WHERE a.productMainType = :productMainType")})
public class AosPolicyDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_index")
    private Integer productIndex;
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
    @Size(max = 15)
    @Column(name = "product_main_rateindex")
    private String productMainRateindex;
    @Size(max = 50)
    @Column(name = "product_main_premium")
    private String productMainPremium;
    @Size(max = 45)
    @Column(name = "product_main_susu")
    private String productMainSusu;
    @Size(max = 45)
    @Column(name = "product_main_sumassured")
    private String productMainSumassured;
    @Size(max = 15)
    @Column(name = "product_main_payment_freq")
    private String productMainPaymentFreq;
    @Size(max = 15)
    @Column(name = "product_main_policy_term")
    private String productMainPolicyTerm;
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
    @Size(max = 15)
    @Column(name = "product_main_userindex")
    private String productMainUserindex;
    @Column(name = "product_main_date")
    private String productMainDate;
    @Size(max = 15)
    @Column(name = "product_main_agents_id")
    private String productMainAgentsId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_photo")
    private String productMainPhoto;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_path")
    private String productMainPath;
    @Size(max = 50)
    @Column(name = "product_main_benefit_amt")
    private String productMainBenefitAmt;
    @Size(max = 50)
    @Column(name = "product_main_premium_amt")
    private String productMainPremiumAmt;
    @Column(name = "product_main_deduction_start_date")
    private String productMainDeductionStartDate;
    @Size(max = 15)
    @Column(name = "premium_mail_annual_premium_increase")
    private String premiumMailAnnualPremiumIncrease;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_signature")
    private String productMainSignature;
    @Size(max = 45)
    @Column(name = "product_main_canceled")
    private String productMainCanceled;
    @Size(max = 14)
    @Column(name = "product_main_telco")
    private String productMainTelco;
    @Size(max = 45)
    @Column(name = "product_main_mandateid")
    private String productMainMandateid;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_response")
    private String productMainResponse;
    @Size(max = 15)
    @Column(name = "product_main_policy_no_count")
    private String productMainPolicyNoCount;
    @Size(max = 15)
    @Column(name = "product_main_policy_ref_count")
    private String productMainPolicyRefCount;
    @Size(max = 15)
    @Column(name = "product_main_policy_ova")
    private String productMainPolicyOva;
    @Size(max = 1)
    @Column(name = "product_main_sms_sent")
    private String productMainSmsSent;
    @Size(max = 45)
    @Column(name = "plan_id")
    private String planId;
    @Size(max = 45)
    @Column(name = "product_main_deduction_type")
    private String productMainDeductionType;
    @Size(max = 45)
    @Column(name = "product_main_policyno_sent_itc")
    private String productMainPolicynoSentItc;
    @Size(max = 45)
    @Column(name = "product_main_premium_sent_itc")
    private String productMainPremiumSentItc;
    @Column(name = "product_main_st_dt")
    private String productMainStDt;
    @Size(max = 15)
    @Column(name = "product_main_status_complete")
    private String productMainStatusComplete;
    @Size(max = 45)
    @Column(name = "product_main_mandate_status")
    private String productMainMandateStatus;
    @Size(max = 1)
    @Column(name = "product_main_type")
    private String productMainType;

    public AosPolicyDetails() {
    }

    public AosPolicyDetails(Integer productIndex, String productMainCustomerindexId, String productNameIndex, String productrRefNo, String productMainPolicyNo, String productMainRateindex, String productMainPremium, String productMainSusu, String productMainSumassured, String productMainPaymentFreq, String productMainPolicyTerm, String productMainPolicyAcceptedDate, String productMainPolicyStatus, String productMainBankName, String productMainBankAccount, String productMainBankBranch, String productMainMobileMoneyNo, String productMainInputdate, String productMainUserindex, String productMainDate, String productMainAgentsId, String productMainPhoto, String productMainPath, String productMainBenefitAmt, String productMainPremiumAmt, String productMainDeductionStartDate, String premiumMailAnnualPremiumIncrease, String productMainSignature, String productMainCanceled, String productMainTelco, String productMainMandateid, String productMainResponse, String productMainPolicyNoCount, String productMainPolicyRefCount, String productMainPolicyOva, String productMainSmsSent, String planId, String productMainDeductionType, String productMainPolicynoSentItc, String productMainPremiumSentItc, String productMainStDt, String productMainStatusComplete, String productMainMandateStatus, String productMainType) {
        this.productIndex = productIndex;
        this.productMainCustomerindexId = productMainCustomerindexId;
        this.productNameIndex = productNameIndex;
        this.productrRefNo = productrRefNo;
        this.productMainPolicyNo = productMainPolicyNo;
        this.productMainRateindex = productMainRateindex;
        this.productMainPremium = productMainPremium;
        this.productMainSusu = productMainSusu;
        this.productMainSumassured = productMainSumassured;
        this.productMainPaymentFreq = productMainPaymentFreq;
        this.productMainPolicyTerm = productMainPolicyTerm;
        this.productMainPolicyAcceptedDate = productMainPolicyAcceptedDate;
        this.productMainPolicyStatus = productMainPolicyStatus;
        this.productMainBankName = productMainBankName;
        this.productMainBankAccount = productMainBankAccount;
        this.productMainBankBranch = productMainBankBranch;
        this.productMainMobileMoneyNo = productMainMobileMoneyNo;
        this.productMainInputdate = productMainInputdate;
        this.productMainUserindex = productMainUserindex;
        this.productMainDate = productMainDate;
        this.productMainAgentsId = productMainAgentsId;
        this.productMainPhoto = productMainPhoto;
        this.productMainPath = productMainPath;
        this.productMainBenefitAmt = productMainBenefitAmt;
        this.productMainPremiumAmt = productMainPremiumAmt;
        this.productMainDeductionStartDate = productMainDeductionStartDate;
        this.premiumMailAnnualPremiumIncrease = premiumMailAnnualPremiumIncrease;
        this.productMainSignature = productMainSignature;
        this.productMainCanceled = productMainCanceled;
        this.productMainTelco = productMainTelco;
        this.productMainMandateid = productMainMandateid;
        this.productMainResponse = productMainResponse;
        this.productMainPolicyNoCount = productMainPolicyNoCount;
        this.productMainPolicyRefCount = productMainPolicyRefCount;
        this.productMainPolicyOva = productMainPolicyOva;
        this.productMainSmsSent = productMainSmsSent;
        this.planId = planId;
        this.productMainDeductionType = productMainDeductionType;
        this.productMainPolicynoSentItc = productMainPolicynoSentItc;
        this.productMainPremiumSentItc = productMainPremiumSentItc;
        this.productMainStDt = productMainStDt;
        this.productMainStatusComplete = productMainStatusComplete;
        this.productMainMandateStatus = productMainMandateStatus;
        this.productMainType = productMainType;
    }
    
    public AosPolicyDetails(AosPolicyDetailsModel aospolicy) {
        this.productIndex = aospolicy.getProductIndex();
        this.productMainCustomerindexId = aospolicy.getProductMainCustomerindexId();
        this.productNameIndex = aospolicy.getProductNameIndex();
        this.productrRefNo = aospolicy.getProductrRefNo();
        this.productMainPolicyNo = aospolicy.getProductMainPolicyNo();
        this.productMainRateindex = aospolicy.getProductMainRateindex();
        this.productMainPremium = aospolicy.getProductMainPremium();
        this.productMainSusu = aospolicy.getProductMainSusu();
        this.productMainSumassured = aospolicy.getProductMainSumassured();
        this.productMainPaymentFreq = aospolicy.getProductMainPaymentFreq();
        this.productMainPolicyTerm = aospolicy.getProductMainPolicyTerm();
        this.productMainPolicyAcceptedDate = aospolicy.getProductMainPolicyAcceptedDate();
        this.productMainPolicyStatus = aospolicy.getProductMainPolicyStatus();
        this.productMainBankName = aospolicy.getProductMainBankName();
        this.productMainBankAccount = aospolicy.getProductMainBankAccount();
        this.productMainBankBranch = aospolicy.getProductMainBankBranch();
        this.productMainMobileMoneyNo = aospolicy.getProductMainMobileMoneyNo();
        this.productMainInputdate = aospolicy.getProductMainInputdate();
        this.productMainUserindex = aospolicy.getProductMainUserindex();
        this.productMainDate = aospolicy.getProductMainDate();
        this.productMainAgentsId = aospolicy.getProductMainAgentsId();
        this.productMainPhoto = aospolicy.getProductMainPhoto();
        this.productMainPath = aospolicy.getProductMainPath();
        this.productMainBenefitAmt = aospolicy.getProductMainBenefitAmt();
        this.productMainPremiumAmt = aospolicy.getProductMainPremiumAmt();
        this.productMainDeductionStartDate = aospolicy.getProductMainDeductionStartDate();
        this.premiumMailAnnualPremiumIncrease = aospolicy.getPremiumMailAnnualPremiumIncrease();
        this.productMainSignature = aospolicy.getProductMainSignature();
        this.productMainCanceled = aospolicy.getProductMainCanceled();
        this.productMainTelco = aospolicy.getProductMainTelco();
        this.productMainMandateid = aospolicy.getProductMainMandateid();
        this.productMainResponse = aospolicy.getProductMainResponse();
        this.productMainPolicyNoCount = aospolicy.getProductMainPolicyNoCount();
        this.productMainPolicyRefCount = aospolicy.getProductMainPolicyRefCount();
        this.productMainPolicyOva = aospolicy.getProductMainPolicyOva();
        this.productMainSmsSent = aospolicy.getProductMainSmsSent();
        this.planId = aospolicy.getPlanId();
        this.productMainDeductionType = aospolicy.getProductMainDeductionType();
        this.productMainPolicynoSentItc = aospolicy.getProductMainPolicynoSentItc();
        this.productMainPremiumSentItc = aospolicy.getProductMainPremiumSentItc();
        this.productMainStDt = aospolicy.getProductMainStDt();
        this.productMainStatusComplete = aospolicy.getProductMainStatusComplete();
        this.productMainMandateStatus = aospolicy.getProductMainMandateStatus();
        this.productMainType = aospolicy.getProductMainType();
    }

    public AosPolicyDetails(Integer productIndex) {
        this.productIndex = productIndex;
    }

    public Integer getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(Integer productIndex) {
        this.productIndex = productIndex;
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

    public String getProductMainRateindex() {
        return productMainRateindex;
    }

    public void setProductMainRateindex(String productMainRateindex) {
        this.productMainRateindex = productMainRateindex;
    }

    public String getProductMainPremium() {
        return productMainPremium;
    }

    public void setProductMainPremium(String productMainPremium) {
        this.productMainPremium = productMainPremium;
    }

    public String getProductMainSusu() {
        return productMainSusu;
    }

    public void setProductMainSusu(String productMainSusu) {
        this.productMainSusu = productMainSusu;
    }

    public String getProductMainSumassured() {
        return productMainSumassured;
    }

    public void setProductMainSumassured(String productMainSumassured) {
        this.productMainSumassured = productMainSumassured;
    }

    public String getProductMainPaymentFreq() {
        return productMainPaymentFreq;
    }

    public void setProductMainPaymentFreq(String productMainPaymentFreq) {
        this.productMainPaymentFreq = productMainPaymentFreq;
    }

    public String getProductMainPolicyTerm() {
        return productMainPolicyTerm;
    }

    public void setProductMainPolicyTerm(String productMainPolicyTerm) {
        this.productMainPolicyTerm = productMainPolicyTerm;
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

    public String getProductMainUserindex() {
        return productMainUserindex;
    }

    public void setProductMainUserindex(String productMainUserindex) {
        this.productMainUserindex = productMainUserindex;
    }

    public String getProductMainDate() {
        return productMainDate;
    }

    public void setProductMainDate(String productMainDate) {
        this.productMainDate = productMainDate;
    }

    public String getProductMainAgentsId() {
        return productMainAgentsId;
    }

    public void setProductMainAgentsId(String productMainAgentsId) {
        this.productMainAgentsId = productMainAgentsId;
    }

    public String getProductMainPhoto() {
        return productMainPhoto;
    }

    public void setProductMainPhoto(String productMainPhoto) {
        this.productMainPhoto = productMainPhoto;
    }

    public String getProductMainPath() {
        return productMainPath;
    }

    public void setProductMainPath(String productMainPath) {
        this.productMainPath = productMainPath;
    }

    public String getProductMainBenefitAmt() {
        return productMainBenefitAmt;
    }

    public void setProductMainBenefitAmt(String productMainBenefitAmt) {
        this.productMainBenefitAmt = productMainBenefitAmt;
    }

    public String getProductMainPremiumAmt() {
        return productMainPremiumAmt;
    }

    public void setProductMainPremiumAmt(String productMainPremiumAmt) {
        this.productMainPremiumAmt = productMainPremiumAmt;
    }

    public String getProductMainDeductionStartDate() {
        return productMainDeductionStartDate;
    }

    public void setProductMainDeductionStartDate(String productMainDeductionStartDate) {
        this.productMainDeductionStartDate = productMainDeductionStartDate;
    }

    public String getPremiumMailAnnualPremiumIncrease() {
        return premiumMailAnnualPremiumIncrease;
    }

    public void setPremiumMailAnnualPremiumIncrease(String premiumMailAnnualPremiumIncrease) {
        this.premiumMailAnnualPremiumIncrease = premiumMailAnnualPremiumIncrease;
    }

    public String getProductMainSignature() {
        return productMainSignature;
    }

    public void setProductMainSignature(String productMainSignature) {
        this.productMainSignature = productMainSignature;
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

    public String getProductMainPolicyNoCount() {
        return productMainPolicyNoCount;
    }

    public void setProductMainPolicyNoCount(String productMainPolicyNoCount) {
        this.productMainPolicyNoCount = productMainPolicyNoCount;
    }

    public String getProductMainPolicyRefCount() {
        return productMainPolicyRefCount;
    }

    public void setProductMainPolicyRefCount(String productMainPolicyRefCount) {
        this.productMainPolicyRefCount = productMainPolicyRefCount;
    }

    public String getProductMainPolicyOva() {
        return productMainPolicyOva;
    }

    public void setProductMainPolicyOva(String productMainPolicyOva) {
        this.productMainPolicyOva = productMainPolicyOva;
    }

    public String getProductMainSmsSent() {
        return productMainSmsSent;
    }

    public void setProductMainSmsSent(String productMainSmsSent) {
        this.productMainSmsSent = productMainSmsSent;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getProductMainDeductionType() {
        return productMainDeductionType;
    }

    public void setProductMainDeductionType(String productMainDeductionType) {
        this.productMainDeductionType = productMainDeductionType;
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

    public String getProductMainStatusComplete() {
        return productMainStatusComplete;
    }

    public void setProductMainStatusComplete(String productMainStatusComplete) {
        this.productMainStatusComplete = productMainStatusComplete;
    }

    public String getProductMainMandateStatus() {
        return productMainMandateStatus;
    }

    public void setProductMainMandateStatus(String productMainMandateStatus) {
        this.productMainMandateStatus = productMainMandateStatus;
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
        if (!(object instanceof AosPolicyDetails)) {
            return false;
        }
        AosPolicyDetails other = (AosPolicyDetails) object;
        if ((this.productIndex == null && other.productIndex != null) || (this.productIndex != null && !this.productIndex.equals(other.productIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.AosPolicyDetails[ productIndex=" + productIndex + " ]";
    }
    
}
