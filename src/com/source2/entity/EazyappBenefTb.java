/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source2.entity;

import com.model.EazyappBenefTbModel;
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
@Table(name = "eazyapp_benef_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazyappBenefTb.findAll", query = "SELECT e FROM EazyappBenefTb e"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneIndex", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneIndex = :productBeneIndex"),
    @NamedQuery(name = "EazyappBenefTb.findByProductrBeneRefNo", query = "SELECT e FROM EazyappBenefTb e WHERE e.productrBeneRefNo = :productrBeneRefNo"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneName", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneName = :productBeneName"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneDob", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneDob = :productBeneDob"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneGender", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneGender = :productBeneGender"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneRelationship", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneRelationship = :productBeneRelationship"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBenePercentage", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBenePercentage = :productBenePercentage"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneInputdate", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneInputdate = :productBeneInputdate"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneUserindex", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneUserindex = :productBeneUserindex"),
    @NamedQuery(name = "EazyappBenefTb.findByProductBeneMobileNo", query = "SELECT e FROM EazyappBenefTb e WHERE e.productBeneMobileNo = :productBeneMobileNo")})
public class EazyappBenefTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_bene_index")
    private Integer productBeneIndex;
    @Size(max = 15)
    @Column(name = "productr_bene_ref_no")
    private String productrBeneRefNo;
    @Size(max = 100)
    @Column(name = "product_bene_name")
    private String productBeneName;
    @Column(name = "product_bene_dob")
    private String productBeneDob;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "product_bene_address")
    private String productBeneAddress;
    @Size(max = 15)
    @Column(name = "product_bene_gender")
    private String productBeneGender;
    @Size(max = 45)
    @Column(name = "product_bene_relationship")
    private String productBeneRelationship;
    @Size(max = 15)
    @Column(name = "product_bene_percentage")
    private String productBenePercentage;
    @Column(name = "product_bene_inputdate")
    private String productBeneInputdate;
    @Size(max = 15)
    @Column(name = "product_bene_userindex")
    private String productBeneUserindex;
    @Size(max = 15)
    @Column(name = "product_bene_mobile_no")
    private String productBeneMobileNo;

    public EazyappBenefTb() {
    }
    
    public EazyappBenefTb(EazyappBenefTbModel eaBe) {
        this.productBeneIndex = eaBe.getProductBeneIndex();
        this.productrBeneRefNo = eaBe.getProductrBeneRefNo();
        this.productBeneName = eaBe.getProductBeneName();
        this.productBeneDob = eaBe.getProductBeneDob();
        this.productBeneAddress = eaBe.getProductBeneAddress();
        this.productBeneGender = eaBe.getProductBeneGender();
        this.productBeneRelationship = eaBe.getProductBeneRelationship();
        this.productBenePercentage = eaBe.getProductBenePercentage();
        this.productBeneInputdate = eaBe.getProductBeneInputdate();
        this.productBeneUserindex = eaBe.getProductBeneUserindex();
        this.productBeneMobileNo = eaBe.getProductBeneMobileNo();
    }

    public EazyappBenefTb(Integer productBeneIndex) {
        this.productBeneIndex = productBeneIndex;
    }

    public Integer getProductBeneIndex() {
        return productBeneIndex;
    }

    public void setProductBeneIndex(Integer productBeneIndex) {
        this.productBeneIndex = productBeneIndex;
    }

    public String getProductrBeneRefNo() {
        return productrBeneRefNo;
    }

    public void setProductrBeneRefNo(String productrBeneRefNo) {
        this.productrBeneRefNo = productrBeneRefNo;
    }

    public String getProductBeneName() {
        return productBeneName;
    }

    public void setProductBeneName(String productBeneName) {
        this.productBeneName = productBeneName;
    }

    public String getProductBeneDob() {
        return productBeneDob;
    }

    public void setProductBeneDob(String productBeneDob) {
        this.productBeneDob = productBeneDob;
    }

    public String getProductBeneAddress() {
        return productBeneAddress;
    }

    public void setProductBeneAddress(String productBeneAddress) {
        this.productBeneAddress = productBeneAddress;
    }

    public String getProductBeneGender() {
        return productBeneGender;
    }

    public void setProductBeneGender(String productBeneGender) {
        this.productBeneGender = productBeneGender;
    }

    public String getProductBeneRelationship() {
        return productBeneRelationship;
    }

    public void setProductBeneRelationship(String productBeneRelationship) {
        this.productBeneRelationship = productBeneRelationship;
    }

    public String getProductBenePercentage() {
        return productBenePercentage;
    }

    public void setProductBenePercentage(String productBenePercentage) {
        this.productBenePercentage = productBenePercentage;
    }

    public String getProductBeneInputdate() {
        return productBeneInputdate;
    }

    public void setProductBeneInputdate(String productBeneInputdate) {
        this.productBeneInputdate = productBeneInputdate;
    }

    public String getProductBeneUserindex() {
        return productBeneUserindex;
    }

    public void setProductBeneUserindex(String productBeneUserindex) {
        this.productBeneUserindex = productBeneUserindex;
    }

    public String getProductBeneMobileNo() {
        return productBeneMobileNo;
    }

    public void setProductBeneMobileNo(String productBeneMobileNo) {
        this.productBeneMobileNo = productBeneMobileNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productBeneIndex != null ? productBeneIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazyappBenefTb)) {
            return false;
        }
        EazyappBenefTb other = (EazyappBenefTb) object;
        if ((this.productBeneIndex == null && other.productBeneIndex != null) || (this.productBeneIndex != null && !this.productBeneIndex.equals(other.productBeneIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source2.entity.EazyappBenefTb[ productBeneIndex=" + productBeneIndex + " ]";
    }
    
}
