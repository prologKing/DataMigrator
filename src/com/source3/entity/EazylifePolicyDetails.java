/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source3.entity;

import com.model.EazylifePolicyDetailsModel;
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
@Table(name = "eazylife_policy_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazylifePolicyDetails.findAll", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPaymentMethod IN ('CAGD', 'Employer Deduction')"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductIndex", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productIndex = :productIndex"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainRefNo", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainRefNo = :productMainRefNo"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainCustomerindexId", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainCustomerindexId = :productMainCustomerindexId"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductNameIndex", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productNameIndex = :productNameIndex"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductrRefNo", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productrRefNo = :productrRefNo"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPolicyNo", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPolicyNo = :productMainPolicyNo"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductPlanMainRateindex", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productPlanMainRateindex = :productPlanMainRateindex"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPaymentFreq", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPaymentFreq = :productMainPaymentFreq"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPolicyAcceptedDate", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPolicyAcceptedDate = :productMainPolicyAcceptedDate"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPolicyStatus", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPolicyStatus = :productMainPolicyStatus"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainBankName", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainBankName = :productMainBankName"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainBankAccount", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainBankAccount = :productMainBankAccount"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainBankBranch", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainBankBranch = :productMainBankBranch"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainMobileMoneyNo", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainMobileMoneyNo = :productMainMobileMoneyNo"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainInputdate", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainInputdate = :productMainInputdate"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPaymentMethod", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPaymentMethod = :productMainPaymentMethod"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainUserindex", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainUserindex = :productMainUserindex"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainAgentsId", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainAgentsId = :productMainAgentsId"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainDeductionStartDate", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainDeductionStartDate = :productMainDeductionStartDate"),
    @NamedQuery(name = "EazylifePolicyDetails.findByPremiumMainAnnualPremiumIncrease", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.premiumMainAnnualPremiumIncrease = :premiumMainAnnualPremiumIncrease"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainEmployerDeduction", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainEmployerDeduction = :productMainEmployerDeduction"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainEmployerStaffPayrollNo", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainEmployerStaffPayrollNo = :productMainEmployerStaffPayrollNo"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainRefno", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainRefno = :productMainRefno"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainAalisNo", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainAalisNo = :productMainAalisNo"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainSumassured", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainSumassured = :productMainSumassured"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPremium", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPremium = :productMainPremium"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPolicyTerm", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPolicyTerm = :productMainPolicyTerm"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainPreferredMode", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainPreferredMode = :productMainPreferredMode"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainCaption", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainCaption = :productMainCaption"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainAccountName", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainAccountName = :productMainAccountName"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainCanceled", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainCanceled = :productMainCanceled"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainTelco", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainTelco = :productMainTelco"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainMandateid", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainMandateid = :productMainMandateid"),
    @NamedQuery(name = "EazylifePolicyDetails.findBySetPremium", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.setPremium = :setPremium"),
    @NamedQuery(name = "EazylifePolicyDetails.findByProductMainDate", query = "SELECT e FROM EazylifePolicyDetails e WHERE e.productMainDate = :productMainDate")})
public class EazylifePolicyDetails implements Serializable {
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
    @Size(max = 50)
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
    @Size(max = 45)
    @Column(name = "product_main_telco")
    private String productMainTelco;
    @Size(max = 45)
    @Column(name = "product_main_mandateid")
    private String productMainMandateid;
    @Size(max = 45)
    @Column(name = "set_premium")
    private String setPremium;
    @Size(max = 45)
    @Column(name = "product_main_date")
    private String productMainDate;

    public EazylifePolicyDetails() {
    }

    public EazylifePolicyDetails(Integer productIndex, String productMainRefNo, String productMainCustomerindexId, String productNameIndex, String productrRefNo, String productMainPolicyNo, String productPlanMainRateindex, String productMainPaymentFreq, String productMainPolicyAcceptedDate, String productMainPolicyStatus, String productMainBankName, String productMainBankAccount, String productMainBankBranch, String productMainMobileMoneyNo, String productMainInputdate, String productMainPaymentMethod, String productMainUserindex, String productMainAgentsId, String productMainDeductionStartDate, String premiumMainAnnualPremiumIncrease, String productMainEmployerDeduction, String productMainEmployerStaffPayrollNo, String productMainSignature, String productMainRefno, String productMainAalisNo, String productMainSumassured, String productMainPremium, String productMainPolicyTerm, String productMainPreferredMode, String productMainNarration, String productMainCaption, String productMainAccountName, String productMainCanceled, String productMainTelco, String productMainMandateid, String setPremium, String productMainDate) {
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
        this.productMainSignature = productMainSignature;
        this.productMainRefno = productMainRefno;
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
        this.setPremium = setPremium;
        this.productMainDate = productMainDate;
    }
    
    public EazylifePolicyDetails(EazylifePolicyDetailsModel eazylifepo) {
        this.productIndex = eazylifepo.getProductIndex();
        this.productMainRefNo = eazylifepo.getProductMainRefNo();
        this.productMainCustomerindexId = eazylifepo.getProductMainCustomerindexId();
        this.productNameIndex = eazylifepo.getProductNameIndex();
        this.productrRefNo = eazylifepo.getProductrRefNo();
        this.productMainPolicyNo = eazylifepo.getProductMainPolicyNo();
        this.productPlanMainRateindex = eazylifepo.getProductPlanMainRateindex();
        this.productMainPaymentFreq = eazylifepo.getProductMainPaymentFreq();
        this.productMainPolicyAcceptedDate = eazylifepo.getProductMainPolicyAcceptedDate();
        this.productMainPolicyStatus = eazylifepo.getProductMainPolicyStatus();
        this.productMainBankName = eazylifepo.getProductMainBankName();
        this.productMainBankAccount = eazylifepo.getProductMainBankAccount();
        this.productMainBankBranch = eazylifepo.getProductMainBankBranch();
        this.productMainMobileMoneyNo = eazylifepo.getProductMainMobileMoneyNo();
        this.productMainInputdate = eazylifepo.getProductMainInputdate();
        this.productMainPaymentMethod = eazylifepo.getProductMainPaymentMethod();
        this.productMainUserindex = eazylifepo.getProductMainUserindex();
        this.productMainAgentsId = eazylifepo.getProductMainAgentsId();
        this.productMainDeductionStartDate = eazylifepo.getProductMainDeductionStartDate();
        this.premiumMainAnnualPremiumIncrease = eazylifepo.getPremiumMainAnnualPremiumIncrease();
        this.productMainEmployerDeduction = eazylifepo.getProductMainEmployerDeduction();
        this.productMainEmployerStaffPayrollNo = eazylifepo.getProductMainEmployerStaffPayrollNo();
        this.productMainSignature = eazylifepo.getProductMainSignature();
        this.productMainRefno = eazylifepo.getProductMainRefNo();
        this.productMainAalisNo = eazylifepo.getProductMainAalisNo();
        this.productMainSumassured = eazylifepo.getProductMainSumassured();
        this.productMainPremium = eazylifepo.getProductMainPremium();
        this.productMainPolicyTerm = eazylifepo.getProductMainPolicyTerm();
        this.productMainPreferredMode = eazylifepo.getProductMainPreferredMode();
        this.productMainNarration = eazylifepo.getProductMainNarration();
        this.productMainCaption = eazylifepo.getProductMainCaption();
        this.productMainAccountName = eazylifepo.getProductMainAccountName();
        this.productMainCanceled = eazylifepo.getProductMainCanceled();
        this.productMainTelco = eazylifepo.getProductMainTelco();
        this.productMainMandateid = eazylifepo.getProductMainMandateid();
        this.setPremium = eazylifepo.getSetPremium();
        this.productMainDate = eazylifepo.getProductMainDate();
    }

    public EazylifePolicyDetails(Integer productIndex) {
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

    public String getSetPremium() {
        return setPremium;
    }

    public void setSetPremium(String setPremium) {
        this.setPremium = setPremium;
    }

    public String getProductMainDate() {
        return productMainDate;
    }

    public void setProductMainDate(String productMainDate) {
        this.productMainDate = productMainDate;
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
        if (!(object instanceof EazylifePolicyDetails)) {
            return false;
        }
        EazylifePolicyDetails other = (EazylifePolicyDetails) object;
        if ((this.productIndex == null && other.productIndex != null) || (this.productIndex != null && !this.productIndex.equals(other.productIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source3.entity.EazylifePolicyDetails[ productIndex=" + productIndex + " ]";
    }
    
}
