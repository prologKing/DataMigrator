/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source3.entity;

import com.model.TrustTbModel;
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
@Table(name = "eazylife_trust_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazylifeTrustTb.findAll", query = "SELECT e FROM EazylifeTrustTb e"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustIndex", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustIndex = :productMainTrustIndex"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductrMainTrustRefNo", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productrMainTrustRefNo = :productrMainTrustRefNo"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustName", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustName = :productMainTrustName"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustDob", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustDob = :productMainTrustDob"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustGender", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustGender = :productMainTrustGender"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustRelationship", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustRelationship = :productMainTrustRelationship"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustPercentage", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustPercentage = :productMainTrustPercentage"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustInputdate", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustInputdate = :productMainTrustInputdate"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustUserindex", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustUserindex = :productMainTrustUserindex"),
    @NamedQuery(name = "EazylifeTrustTb.findByProductMainTrustMobileNo", query = "SELECT e FROM EazylifeTrustTb e WHERE e.productMainTrustMobileNo = :productMainTrustMobileNo")})
public class EazylifeTrustTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_main_trust_index")
    private Integer productMainTrustIndex;
    @Size(max = 15)
    @Column(name = "productr_main_trust_ref_no")
    private String productrMainTrustRefNo;
    @Size(max = 100)
    @Column(name = "product_main_trust_name")
    private String productMainTrustName;
    @Column(name = "product_main_trust_dob")
    private String productMainTrustDob;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_main_trust_address")
    private String productMainTrustAddress;
    @Size(max = 15)
    @Column(name = "product_main_trust_gender")
    private String productMainTrustGender;
    @Size(max = 45)
    @Column(name = "product_main_trust_relationship")
    private String productMainTrustRelationship;
    @Size(max = 15)
    @Column(name = "product_main_trust_percentage")
    private String productMainTrustPercentage;
    @Column(name = "product_main_trust_inputdate")
    private String productMainTrustInputdate;
    @Size(max = 15)
    @Column(name = "product_main_trust_userindex")
    private String productMainTrustUserindex;
    @Size(max = 15)
    @Column(name = "product_main_trust_mobile_no")
    private String productMainTrustMobileNo;

    public EazylifeTrustTb() {
    }
    
    public EazylifeTrustTb(TrustTbModel aostrust) {
        this.productMainTrustIndex = aostrust.getProductMainTrustIndex();
        this.productrMainTrustRefNo = aostrust.getProductrMainTrustRefNo();
        this.productMainTrustName = aostrust.getProductMainTrustName();
        this.productMainTrustDob = aostrust.getProductMainTrustDob();
        this.productMainTrustAddress = aostrust.getProductMainTrustAddress();
        this.productMainTrustGender = aostrust.getProductMainTrustGender();
        this.productMainTrustRelationship = aostrust.getProductMainTrustRelationship();
        this.productMainTrustPercentage = aostrust.getProductMainTrustPercentage();
        this.productMainTrustInputdate = aostrust.getProductMainTrustInputdate();
        this.productMainTrustUserindex = aostrust.getProductMainTrustUserindex();
        this.productMainTrustMobileNo = aostrust.getProductMainTrustMobileNo();
    }

    public EazylifeTrustTb(Integer productMainTrustIndex) {
        this.productMainTrustIndex = productMainTrustIndex;
    }

    public Integer getProductMainTrustIndex() {
        return productMainTrustIndex;
    }

    public void setProductMainTrustIndex(Integer productMainTrustIndex) {
        this.productMainTrustIndex = productMainTrustIndex;
    }

    public String getProductrMainTrustRefNo() {
        return productrMainTrustRefNo;
    }

    public void setProductrMainTrustRefNo(String productrMainTrustRefNo) {
        this.productrMainTrustRefNo = productrMainTrustRefNo;
    }

    public String getProductMainTrustName() {
        return productMainTrustName;
    }

    public void setProductMainTrustName(String productMainTrustName) {
        this.productMainTrustName = productMainTrustName;
    }

    public String getProductMainTrustDob() {
        return productMainTrustDob;
    }

    public void setProductMainTrustDob(String productMainTrustDob) {
        this.productMainTrustDob = productMainTrustDob;
    }

    public String getProductMainTrustAddress() {
        return productMainTrustAddress;
    }

    public void setProductMainTrustAddress(String productMainTrustAddress) {
        this.productMainTrustAddress = productMainTrustAddress;
    }

    public String getProductMainTrustGender() {
        return productMainTrustGender;
    }

    public void setProductMainTrustGender(String productMainTrustGender) {
        this.productMainTrustGender = productMainTrustGender;
    }

    public String getProductMainTrustRelationship() {
        return productMainTrustRelationship;
    }

    public void setProductMainTrustRelationship(String productMainTrustRelationship) {
        this.productMainTrustRelationship = productMainTrustRelationship;
    }

    public String getProductMainTrustPercentage() {
        return productMainTrustPercentage;
    }

    public void setProductMainTrustPercentage(String productMainTrustPercentage) {
        this.productMainTrustPercentage = productMainTrustPercentage;
    }

    public String getProductMainTrustInputdate() {
        return productMainTrustInputdate;
    }

    public void setProductMainTrustInputdate(String productMainTrustInputdate) {
        this.productMainTrustInputdate = productMainTrustInputdate;
    }

    public String getProductMainTrustUserindex() {
        return productMainTrustUserindex;
    }

    public void setProductMainTrustUserindex(String productMainTrustUserindex) {
        this.productMainTrustUserindex = productMainTrustUserindex;
    }

    public String getProductMainTrustMobileNo() {
        return productMainTrustMobileNo;
    }

    public void setProductMainTrustMobileNo(String productMainTrustMobileNo) {
        this.productMainTrustMobileNo = productMainTrustMobileNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMainTrustIndex != null ? productMainTrustIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazylifeTrustTb)) {
            return false;
        }
        EazylifeTrustTb other = (EazylifeTrustTb) object;
        if ((this.productMainTrustIndex == null && other.productMainTrustIndex != null) || (this.productMainTrustIndex != null && !this.productMainTrustIndex.equals(other.productMainTrustIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source3.entity.EazylifeTrustTb[ productMainTrustIndex=" + productMainTrustIndex + " ]";
    }
    
}
