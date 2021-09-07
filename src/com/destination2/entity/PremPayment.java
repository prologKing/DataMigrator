/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PremPaymentModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "prem_payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PremPayment.findAll", query = "SELECT p FROM PremPayment p"),
    @NamedQuery(name = "PremPayment.findBySusuTransIndex", query = "SELECT p FROM PremPayment p WHERE p.susuTransIndex = :susuTransIndex"),
    @NamedQuery(name = "PremPayment.findBySusuCode", query = "SELECT p FROM PremPayment p WHERE p.susuCode = :susuCode"),
    @NamedQuery(name = "PremPayment.findBySusuTransPolicyNo", query = "SELECT p FROM PremPayment p WHERE p.susuTransPolicyNo = :susuTransPolicyNo"),
    @NamedQuery(name = "PremPayment.findBySusuTransName", query = "SELECT p FROM PremPayment p WHERE p.susuTransName = :susuTransName"),
    @NamedQuery(name = "PremPayment.findBySusuTransDescription", query = "SELECT p FROM PremPayment p WHERE p.susuTransDescription = :susuTransDescription"),
    @NamedQuery(name = "PremPayment.findBySusuTransDate", query = "SELECT p FROM PremPayment p WHERE p.susuTransDate = :susuTransDate"),
    @NamedQuery(name = "PremPayment.findBySusuTransOpenbalance", query = "SELECT p FROM PremPayment p WHERE p.susuTransOpenbalance = :susuTransOpenbalance"),
    @NamedQuery(name = "PremPayment.findBySusuTransDebit", query = "SELECT p FROM PremPayment p WHERE p.susuTransDebit = :susuTransDebit"),
    @NamedQuery(name = "PremPayment.findBySusuTransCredit", query = "SELECT p FROM PremPayment p WHERE p.susuTransCredit = :susuTransCredit"),
    @NamedQuery(name = "PremPayment.findBySusuTransClosingbalance", query = "SELECT p FROM PremPayment p WHERE p.susuTransClosingbalance = :susuTransClosingbalance"),
    @NamedQuery(name = "PremPayment.findBySusuTransAgentsId", query = "SELECT p FROM PremPayment p WHERE p.susuTransAgentsId = :susuTransAgentsId"),
    @NamedQuery(name = "PremPayment.findBySusuTransUserindex", query = "SELECT p FROM PremPayment p WHERE p.susuTransUserindex = :susuTransUserindex"),
    @NamedQuery(name = "PremPayment.findBySusuTransInputdate", query = "SELECT p FROM PremPayment p WHERE p.susuTransInputdate = :susuTransInputdate"),
    @NamedQuery(name = "PremPayment.findBySusuTransComments", query = "SELECT p FROM PremPayment p WHERE p.susuTransComments = :susuTransComments"),
    @NamedQuery(name = "PremPayment.findByMomTransactionId", query = "SELECT p FROM PremPayment p WHERE p.momTransactionId = :momTransactionId"),
    @NamedQuery(name = "PremPayment.findByUniwalletTransactionId", query = "SELECT p FROM PremPayment p WHERE p.uniwalletTransactionId = :uniwalletTransactionId"),
    @NamedQuery(name = "PremPayment.findByIsExist", query = "SELECT p FROM PremPayment p WHERE p.isExist = :isExist")})
public class PremPayment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "susu_trans_index")
    private Integer susuTransIndex;
    @Size(max = 45)
    @Column(name = "susu_code")
    private String susuCode;
    @Size(max = 45)
    @Column(name = "susu_trans_policy_no")
    private String susuTransPolicyNo;
    @Size(max = 45)
    @Column(name = "susu_trans_name")
    private String susuTransName;
    @Size(max = 45)
    @Column(name = "susu_trans_description")
    private String susuTransDescription;
    @Size(max = 45)
    @Column(name = "susu_trans_date")
    private String susuTransDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "susu_trans_openbalance")
    private Double susuTransOpenbalance;
    @Column(name = "susu_trans_debit")
    private Double susuTransDebit;
    @Column(name = "susu_trans_credit")
    private Double susuTransCredit;
    @Column(name = "susu_trans_closingbalance")
    private Double susuTransClosingbalance;
    @Size(max = 45)
    @Column(name = "susu_trans_agents_id")
    private String susuTransAgentsId;
    @Column(name = "susu_trans_userindex")
    private Integer susuTransUserindex;
    @Size(max = 45)
    @Column(name = "susu_trans_inputdate")
    private String susuTransInputdate;
    @Size(max = 45)
    @Column(name = "susu_trans_comments")
    private String susuTransComments;
    @Size(max = 45)
    @Column(name = "momTransactionId")
    private String momTransactionId;
    @Size(max = 45)
    @Column(name = "uniwalletTransactionId")
    private String uniwalletTransactionId;
    @Column(name = "is_exist")
    private Integer isExist;

    public PremPayment() {
    }
    
    public PremPayment(PremPaymentModel prempay) {
         this.susuTransIndex = prempay.getSusuTransIndex();
        this.susuCode = prempay.getSusuCode();
        this.susuTransPolicyNo = prempay.getSusuTransPolicyNo();
        this.susuTransName = prempay.getSusuTransName();
        this.susuTransDescription = prempay.getSusuTransDescription();
        this.susuTransDate = prempay.getSusuTransDate();
        this.susuTransOpenbalance = prempay.getSusuTransOpenbalance();
        this.susuTransDebit = prempay.getSusuTransDebit();
        this.susuTransCredit = prempay.getSusuTransCredit();
        this.susuTransClosingbalance = prempay.getSusuTransClosingbalance();
        this.susuTransAgentsId = prempay.getSusuTransAgentsId();
        this.susuTransUserindex = prempay.getSusuTransUserindex();
        this.susuTransInputdate = prempay.getSusuTransInputdate();
        this.susuTransComments = prempay.getSusuTransComments();
        this.momTransactionId = prempay.getMomTransactionId();
        this.uniwalletTransactionId = prempay.getUniwalletTransactionId();
        this.isExist = prempay.getIsExist();
    }

    public PremPayment(Integer susuTransIndex, String susuCode, String susuTransPolicyNo, String susuTransName, String susuTransDescription, String susuTransDate, Double susuTransOpenbalance, Double susuTransDebit, Double susuTransCredit, Double susuTransClosingbalance, String susuTransAgentsId, Integer susuTransUserindex, String susuTransInputdate, String susuTransComments, String momTransactionId, String uniwalletTransactionId, Integer isExist) {
        this.susuTransIndex = susuTransIndex;
        this.susuCode = susuCode;
        this.susuTransPolicyNo = susuTransPolicyNo;
        this.susuTransName = susuTransName;
        this.susuTransDescription = susuTransDescription;
        this.susuTransDate = susuTransDate;
        this.susuTransOpenbalance = susuTransOpenbalance;
        this.susuTransDebit = susuTransDebit;
        this.susuTransCredit = susuTransCredit;
        this.susuTransClosingbalance = susuTransClosingbalance;
        this.susuTransAgentsId = susuTransAgentsId;
        this.susuTransUserindex = susuTransUserindex;
        this.susuTransInputdate = susuTransInputdate;
        this.susuTransComments = susuTransComments;
        this.momTransactionId = momTransactionId;
        this.uniwalletTransactionId = uniwalletTransactionId;
        this.isExist = isExist;
    }
    
    

    public PremPayment(Integer susuTransIndex) {
        this.susuTransIndex = susuTransIndex;
    }

    public Integer getSusuTransIndex() {
        return susuTransIndex;
    }

    public void setSusuTransIndex(Integer susuTransIndex) {
        this.susuTransIndex = susuTransIndex;
    }

    public String getSusuCode() {
        return susuCode;
    }

    public void setSusuCode(String susuCode) {
        this.susuCode = susuCode;
    }

    public String getSusuTransPolicyNo() {
        return susuTransPolicyNo;
    }

    public void setSusuTransPolicyNo(String susuTransPolicyNo) {
        this.susuTransPolicyNo = susuTransPolicyNo;
    }

    public String getSusuTransName() {
        return susuTransName;
    }

    public void setSusuTransName(String susuTransName) {
        this.susuTransName = susuTransName;
    }

    public String getSusuTransDescription() {
        return susuTransDescription;
    }

    public void setSusuTransDescription(String susuTransDescription) {
        this.susuTransDescription = susuTransDescription;
    }

    public String getSusuTransDate() {
        return susuTransDate;
    }

    public void setSusuTransDate(String susuTransDate) {
        this.susuTransDate = susuTransDate;
    }

    public Double getSusuTransOpenbalance() {
        return susuTransOpenbalance;
    }

    public void setSusuTransOpenbalance(Double susuTransOpenbalance) {
        this.susuTransOpenbalance = susuTransOpenbalance;
    }

    public Double getSusuTransDebit() {
        return susuTransDebit;
    }

    public void setSusuTransDebit(Double susuTransDebit) {
        this.susuTransDebit = susuTransDebit;
    }

    public Double getSusuTransCredit() {
        return susuTransCredit;
    }

    public void setSusuTransCredit(Double susuTransCredit) {
        this.susuTransCredit = susuTransCredit;
    }

    public Double getSusuTransClosingbalance() {
        return susuTransClosingbalance;
    }

    public void setSusuTransClosingbalance(Double susuTransClosingbalance) {
        this.susuTransClosingbalance = susuTransClosingbalance;
    }

    public String getSusuTransAgentsId() {
        return susuTransAgentsId;
    }

    public void setSusuTransAgentsId(String susuTransAgentsId) {
        this.susuTransAgentsId = susuTransAgentsId;
    }

    public Integer getSusuTransUserindex() {
        return susuTransUserindex;
    }

    public void setSusuTransUserindex(Integer susuTransUserindex) {
        this.susuTransUserindex = susuTransUserindex;
    }

    public String getSusuTransInputdate() {
        return susuTransInputdate;
    }

    public void setSusuTransInputdate(String susuTransInputdate) {
        this.susuTransInputdate = susuTransInputdate;
    }

    public String getSusuTransComments() {
        return susuTransComments;
    }

    public void setSusuTransComments(String susuTransComments) {
        this.susuTransComments = susuTransComments;
    }

    public String getMomTransactionId() {
        return momTransactionId;
    }

    public void setMomTransactionId(String momTransactionId) {
        this.momTransactionId = momTransactionId;
    }

    public String getUniwalletTransactionId() {
        return uniwalletTransactionId;
    }

    public void setUniwalletTransactionId(String uniwalletTransactionId) {
        this.uniwalletTransactionId = uniwalletTransactionId;
    }

    public Integer getIsExist() {
        return isExist;
    }

    public void setIsExist(Integer isExist) {
        this.isExist = isExist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (susuTransIndex != null ? susuTransIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PremPayment)) {
            return false;
        }
        PremPayment other = (PremPayment) object;
        if ((this.susuTransIndex == null && other.susuTransIndex != null) || (this.susuTransIndex != null && !this.susuTransIndex.equals(other.susuTransIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PremPayment[ susuTransIndex=" + susuTransIndex + " ]";
    }
    
}
