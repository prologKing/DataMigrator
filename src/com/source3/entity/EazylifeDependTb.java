/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source3.entity;

import com.model.EazylifeDependTbModel;
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
@Table(name = "eazylife_depend_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazylifeDependTb.findAll", query = "SELECT e FROM EazylifeDependTb e"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndIndex", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndIndex = :productMainDepndIndex"),
    @NamedQuery(name = "EazylifeDependTb.findByProductrRefNo", query = "SELECT e FROM EazylifeDependTb e WHERE e.productrRefNo = :productrRefNo"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndName", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndName = :productMainDepndName"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndDob", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndDob = :productMainDepndDob"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndGender", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndGender = :productMainDepndGender"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndMobileNo", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndMobileNo = :productMainDepndMobileNo"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndSumassured", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndSumassured = :productMainDepndSumassured"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndRelationship", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndRelationship = :productMainDepndRelationship"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndCategory", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndCategory = :productMainDepndCategory"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndInputdate", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndInputdate = :productMainDepndInputdate"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndUserindex", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndUserindex = :productMainDepndUserindex"),
    @NamedQuery(name = "EazylifeDependTb.findByProductMainDepndPremium", query = "SELECT e FROM EazylifeDependTb e WHERE e.productMainDepndPremium = :productMainDepndPremium")})
public class EazylifeDependTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_main_depnd_index")
    private Integer productMainDepndIndex;
    @Size(max = 15)
    @Column(name = "productr_ref_no")
    private String productrRefNo;
    @Size(max = 100)
    @Column(name = "product_main_depnd_name")
    private String productMainDepndName;
    @Column(name = "product_main_depnd_dob")
    private String productMainDepndDob;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_depnd_address")
    private String productMainDepndAddress;
    @Size(max = 15)
    @Column(name = "product_main_depnd_gender")
    private String productMainDepndGender;
    @Size(max = 15)
    @Column(name = "product_main_depnd_mobile_no")
    private String productMainDepndMobileNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "product_main_depnd_sumassured")
    private BigDecimal productMainDepndSumassured;
    @Size(max = 45)
    @Column(name = "product_main_depnd_relationship")
    private String productMainDepndRelationship;
    @Size(max = 45)
    @Column(name = "product_main_depnd_category")
    private String productMainDepndCategory;
    @Column(name = "product_main_depnd_inputdate")
    private String productMainDepndInputdate;
    @Size(max = 15)
    @Column(name = "product_main_depnd_userindex")
    private String productMainDepndUserindex;
    @Column(name = "product_main_depnd_premium")
    private BigDecimal productMainDepndPremium;

    public EazylifeDependTb() {
    }

    public EazylifeDependTb(Integer productMainDepndIndex, String productrRefNo, String productMainDepndName, String productMainDepndDob, String productMainDepndAddress, String productMainDepndGender, String productMainDepndMobileNo, BigDecimal productMainDepndSumassured, String productMainDepndRelationship, String productMainDepndCategory, String productMainDepndInputdate, String productMainDepndUserindex, BigDecimal productMainDepndPremium) {
        this.productMainDepndIndex = productMainDepndIndex;
        this.productrRefNo = productrRefNo;
        this.productMainDepndName = productMainDepndName;
        this.productMainDepndDob = productMainDepndDob;
        this.productMainDepndAddress = productMainDepndAddress;
        this.productMainDepndGender = productMainDepndGender;
        this.productMainDepndMobileNo = productMainDepndMobileNo;
        this.productMainDepndSumassured = productMainDepndSumassured;
        this.productMainDepndRelationship = productMainDepndRelationship;
        this.productMainDepndCategory = productMainDepndCategory;
        this.productMainDepndInputdate = productMainDepndInputdate;
        this.productMainDepndUserindex = productMainDepndUserindex;
        this.productMainDepndPremium = productMainDepndPremium;
    }
    
    public EazylifeDependTb(EazylifeDependTbModel eldtb) {
        this.productMainDepndIndex = eldtb.getProductMainDepndIndex();
        this.productrRefNo = eldtb.getProductrRefNo();
        this.productMainDepndName = eldtb.getProductMainDepndName();
        this.productMainDepndDob = eldtb.getProductMainDepndDob();
        this.productMainDepndAddress = eldtb.getProductMainDepndAddress();
        this.productMainDepndGender = eldtb.getProductMainDepndGender();
        this.productMainDepndMobileNo = eldtb.getProductMainDepndMobileNo();
        this.productMainDepndSumassured = eldtb.getProductMainDepndSumassured();
        this.productMainDepndRelationship = eldtb.getProductMainDepndRelationship();
        this.productMainDepndCategory = eldtb.getProductMainDepndCategory();
        this.productMainDepndInputdate = eldtb.getProductMainDepndInputdate();
        this.productMainDepndUserindex = eldtb.getProductMainDepndUserindex();
        this.productMainDepndPremium = eldtb.getProductMainDepndPremium();
    }

    public EazylifeDependTb(Integer productMainDepndIndex) {
        this.productMainDepndIndex = productMainDepndIndex;
    }

    public Integer getProductMainDepndIndex() {
        return productMainDepndIndex;
    }

    public void setProductMainDepndIndex(Integer productMainDepndIndex) {
        this.productMainDepndIndex = productMainDepndIndex;
    }

    public String getProductrRefNo() {
        return productrRefNo;
    }

    public void setProductrRefNo(String productrRefNo) {
        this.productrRefNo = productrRefNo;
    }

    public String getProductMainDepndName() {
        return productMainDepndName;
    }

    public void setProductMainDepndName(String productMainDepndName) {
        this.productMainDepndName = productMainDepndName;
    }

    public String getProductMainDepndDob() {
        return productMainDepndDob;
    }

    public void setProductMainDepndDob(String productMainDepndDob) {
        this.productMainDepndDob = productMainDepndDob;
    }

    public String getProductMainDepndAddress() {
        return productMainDepndAddress;
    }

    public void setProductMainDepndAddress(String productMainDepndAddress) {
        this.productMainDepndAddress = productMainDepndAddress;
    }

    public String getProductMainDepndGender() {
        return productMainDepndGender;
    }

    public void setProductMainDepndGender(String productMainDepndGender) {
        this.productMainDepndGender = productMainDepndGender;
    }

    public String getProductMainDepndMobileNo() {
        return productMainDepndMobileNo;
    }

    public void setProductMainDepndMobileNo(String productMainDepndMobileNo) {
        this.productMainDepndMobileNo = productMainDepndMobileNo;
    }

    public BigDecimal getProductMainDepndSumassured() {
        return productMainDepndSumassured;
    }

    public void setProductMainDepndSumassured(BigDecimal productMainDepndSumassured) {
        this.productMainDepndSumassured = productMainDepndSumassured;
    }

    public String getProductMainDepndRelationship() {
        return productMainDepndRelationship;
    }

    public void setProductMainDepndRelationship(String productMainDepndRelationship) {
        this.productMainDepndRelationship = productMainDepndRelationship;
    }

    public String getProductMainDepndCategory() {
        return productMainDepndCategory;
    }

    public void setProductMainDepndCategory(String productMainDepndCategory) {
        this.productMainDepndCategory = productMainDepndCategory;
    }

    public String getProductMainDepndInputdate() {
        return productMainDepndInputdate;
    }

    public void setProductMainDepndInputdate(String productMainDepndInputdate) {
        this.productMainDepndInputdate = productMainDepndInputdate;
    }

    public String getProductMainDepndUserindex() {
        return productMainDepndUserindex;
    }

    public void setProductMainDepndUserindex(String productMainDepndUserindex) {
        this.productMainDepndUserindex = productMainDepndUserindex;
    }

    public BigDecimal getProductMainDepndPremium() {
        return productMainDepndPremium;
    }

    public void setProductMainDepndPremium(BigDecimal productMainDepndPremium) {
        this.productMainDepndPremium = productMainDepndPremium;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMainDepndIndex != null ? productMainDepndIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazylifeDependTb)) {
            return false;
        }
        EazylifeDependTb other = (EazylifeDependTb) object;
        if ((this.productMainDepndIndex == null && other.productMainDepndIndex != null) || (this.productMainDepndIndex != null && !this.productMainDepndIndex.equals(other.productMainDepndIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source3.entity.EazylifeDependTb[ productMainDepndIndex=" + productMainDepndIndex + " ]";
    }
    
}
