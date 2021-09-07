/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.AosBenefTbModel;
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
@Table(name = "aos_benef_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AosBenefTb.findAll", query = "SELECT a FROM AosBenefTb a"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneIndex", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneIndex = :productBeneIndex"),
    @NamedQuery(name = "AosBenefTb.findByProductrBeneRefNo", query = "SELECT a FROM AosBenefTb a WHERE a.productrBeneRefNo = :productrBeneRefNo"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneName", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneName = :productBeneName"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneDob", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneDob = :productBeneDob"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneGender", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneGender = :productBeneGender"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneRelationship", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneRelationship = :productBeneRelationship"),
    @NamedQuery(name = "AosBenefTb.findByProductBenePercentage", query = "SELECT a FROM AosBenefTb a WHERE a.productBenePercentage = :productBenePercentage"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneInputdate", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneInputdate = :productBeneInputdate"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneUserindex", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneUserindex = :productBeneUserindex"),
    @NamedQuery(name = "AosBenefTb.findByProductBeneMobileNo", query = "SELECT a FROM AosBenefTb a WHERE a.productBeneMobileNo = :productBeneMobileNo")})
public class AosBenefTb implements Serializable {
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

    public AosBenefTb() {
    }
    
    public AosBenefTb(AosBenefTbModel aosB) {
        this.productBeneIndex = aosB.getProductBeneIndex();
        this.productrBeneRefNo = aosB.getProductrBeneRefNo();
        this.productBeneName = aosB.getProductBeneName();
        this.productBeneDob = aosB.getProductBeneDob();
        this.productBeneAddress = aosB.getProductBeneAddress();
        this.productBeneGender = aosB.getProductBeneGender();
        this.productBeneRelationship = aosB.getProductBeneRelationship();
        this.productBenePercentage = aosB.getProductBenePercentage();
        this.productBeneInputdate = aosB.getProductBeneInputdate();
        this.productBeneUserindex = aosB.getProductBeneUserindex();
        this.productBeneMobileNo = aosB.getProductBeneMobileNo();
    }

    public AosBenefTb(Integer productBeneIndex) {
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
        if (!(object instanceof AosBenefTb)) {
            return false;
        }
        AosBenefTb other = (AosBenefTb) object;
        if ((this.productBeneIndex == null && other.productBeneIndex != null) || (this.productBeneIndex != null && !this.productBeneIndex.equals(other.productBeneIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.AosBenefTb[ productBeneIndex=" + productBeneIndex + " ]";
    }
    
}
