/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.ProductTransSusuTbModel;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "product_trans_susu_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductTransSusuTb.findAll", query = "SELECT p FROM ProductTransSusuTb p"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransIndex", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransIndex = :susuTransIndex"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuCode", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuCode = :susuCode"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransPolicyNo", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransPolicyNo = :susuTransPolicyNo ORDER BY p.susuTransDate ASC"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransName", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransName = :susuTransName"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransDate", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransDate = :susuTransDate"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransOpenbalance", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransOpenbalance = :susuTransOpenbalance"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransDebit", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransDebit = :susuTransDebit"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransCredit", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransCredit = :susuTransCredit"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransClosingbalance", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransClosingbalance = :susuTransClosingbalance"),
    @NamedQuery(name = "ProductTransSusuTb.findByAgentsIdAndPolnum", query = "SELECT p FROM ProductTransSusuTb p WHERE  p.susuTransPolicyNo = :susuTransPolicyNo AND p.susuTransAgentsId = :susuTransAgentsId"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransUserindex", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransUserindex = :susuTransUserindex"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuTransInputdate", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuTransInputdate = :susuTransInputdate"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuPStatus", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuPStatus = :susuPStatus"),
    @NamedQuery(name = "ProductTransSusuTb.findBySusuUpdateStatus", query = "SELECT p FROM ProductTransSusuTb p WHERE p.susuUpdateStatus = :susuUpdateStatus")})
public class ProductTransSusuTb implements Serializable {
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
    @Lob
    @Size(max = 2147483647)
    @Column(name = "susu_trans_description")
    private String susuTransDescription;
    @Column(name = "susu_trans_date")
    private String susuTransDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "susu_trans_openbalance")
    private BigDecimal susuTransOpenbalance;
    @Column(name = "susu_trans_debit")
    private BigDecimal susuTransDebit;
    @Column(name = "susu_trans_credit")
    private BigDecimal susuTransCredit;
    @Column(name = "susu_trans_closingbalance")
    private BigDecimal susuTransClosingbalance;
    @Size(max = 11)
    @Column(name = "susu_trans_agents_id")
    private String susuTransAgentsId;
    @Size(max = 11)
    @Column(name = "susu_trans_userindex")
    private String susuTransUserindex;
    @Column(name = "susu_trans_inputdate")
    private String susuTransInputdate;
    @Size(max = 20)
    @Column(name = "susu_p_status")
    private String susuPStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "susu_comment")
    private String susuComment;
    @Size(max = 15)
    @Column(name = "susu_update_status")
    private String susuUpdateStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "momTransactionId")
    private String momTransactionId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "uniwalletTransactionId")
    private String uniwalletTransactionId;

    public ProductTransSusuTb() {
    } 
    
    public ProductTransSusuTb(ProductTransSusuTbModel psusu) {
        this.susuTransIndex = psusu.getSusuTransIndex();
        this.susuCode = psusu.getSusuCode();
        this.susuTransPolicyNo = psusu.getSusuTransPolicyNo();
        this.susuTransName = psusu.getSusuTransName();
        this.susuTransDescription = psusu.getSusuTransDescription();
        this.susuTransDate = psusu.getSusuTransDate();
        this.susuTransOpenbalance = psusu.getSusuTransOpenbalance();
        this.susuTransDebit = psusu.getSusuTransDebit();
        this.susuTransCredit = psusu.getSusuTransCredit();
        this.susuTransClosingbalance = psusu.getSusuTransClosingbalance();
        this.susuTransAgentsId = psusu.getSusuTransAgentsId();
        this.susuTransUserindex = psusu.getSusuTransUserindex();
        this.susuTransInputdate = psusu.getSusuTransInputdate();
        this.susuPStatus = psusu.getSusuPStatus();
        this.susuComment = psusu.getSusuComment();
        this.susuUpdateStatus = psusu.getSusuUpdateStatus();
        this.momTransactionId = psusu.getMomTransactionId();
        this.uniwalletTransactionId = psusu.getUniwalletTransactionId();
    }

    public ProductTransSusuTb(Integer susuTransIndex) {
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

    public BigDecimal getSusuTransOpenbalance() {
        return susuTransOpenbalance;
    }

    public void setSusuTransOpenbalance(BigDecimal susuTransOpenbalance) {
        this.susuTransOpenbalance = susuTransOpenbalance;
    }

    public BigDecimal getSusuTransDebit() {
        return susuTransDebit;
    }

    public void setSusuTransDebit(BigDecimal susuTransDebit) {
        this.susuTransDebit = susuTransDebit;
    }

    public BigDecimal getSusuTransCredit() {
        return susuTransCredit;
    }

    public void setSusuTransCredit(BigDecimal susuTransCredit) {
        this.susuTransCredit = susuTransCredit;
    }

    public BigDecimal getSusuTransClosingbalance() {
        return susuTransClosingbalance;
    }

    public void setSusuTransClosingbalance(BigDecimal susuTransClosingbalance) {
        this.susuTransClosingbalance = susuTransClosingbalance;
    }

    public String getSusuTransAgentsId() {
        return susuTransAgentsId;
    }

    public void setSusuTransAgentsId(String susuTransAgentsId) {
        this.susuTransAgentsId = susuTransAgentsId;
    }

    public String getSusuTransUserindex() {
        return susuTransUserindex;
    }

    public void setSusuTransUserindex(String susuTransUserindex) {
        this.susuTransUserindex = susuTransUserindex;
    }

    public String getSusuTransInputdate() {
        return susuTransInputdate;
    }

    public void setSusuTransInputdate(String susuTransInputdate) {
        this.susuTransInputdate = susuTransInputdate;
    }

    public String getSusuPStatus() {
        return susuPStatus;
    }

    public void setSusuPStatus(String susuPStatus) {
        this.susuPStatus = susuPStatus;
    }

    public String getSusuComment() {
        return susuComment;
    }

    public void setSusuComment(String susuComment) {
        this.susuComment = susuComment;
    }

    public String getSusuUpdateStatus() {
        return susuUpdateStatus;
    }

    public void setSusuUpdateStatus(String susuUpdateStatus) {
        this.susuUpdateStatus = susuUpdateStatus;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (susuTransIndex != null ? susuTransIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTransSusuTb)) {
            return false;
        }
        ProductTransSusuTb other = (ProductTransSusuTb) object;
        if ((this.susuTransIndex == null && other.susuTransIndex != null) || (this.susuTransIndex != null && !this.susuTransIndex.equals(other.susuTransIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.ProductTransSusuTb[ susuTransIndex=" + susuTransIndex + " ]";
    }
    
}
