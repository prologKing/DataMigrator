/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.AosDependTbModel;
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
@Table(name = "aos_depend_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AosDependTb.findAll", query = "SELECT a FROM AosDependTb a"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndIndex", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndIndex = :productMainDepndIndex"),
    @NamedQuery(name = "AosDependTb.findByProductrRefNo", query = "SELECT a FROM AosDependTb a WHERE a.productrRefNo = :productrRefNo"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndName", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndName = :productMainDepndName"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndDob", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndDob = :productMainDepndDob"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndGender", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndGender = :productMainDepndGender"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndMobileNo", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndMobileNo = :productMainDepndMobileNo"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndSumassured", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndSumassured = :productMainDepndSumassured"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndRelationship", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndRelationship = :productMainDepndRelationship"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndInputdate", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndInputdate = :productMainDepndInputdate"),
    @NamedQuery(name = "AosDependTb.findByProductMainDepndUserindex", query = "SELECT a FROM AosDependTb a WHERE a.productMainDepndUserindex = :productMainDepndUserindex")})
public class AosDependTb implements Serializable {
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
    @Column(name = "product_main_depnd_inputdate")
    private String productMainDepndInputdate;
    @Size(max = 15)
    @Column(name = "product_main_depnd_userindex")
    private String productMainDepndUserindex;

    public AosDependTb() {
    }
    
    public AosDependTb(AosDependTbModel aosD) {
        this.productMainDepndIndex = aosD.getProductMainDepndIndex();
        this.productrRefNo = aosD.getProductrRefNo();
        this.productMainDepndName = aosD.getProductMainDepndName();
        this.productMainDepndDob = aosD.getProductMainDepndDob();
        this.productMainDepndAddress = aosD.getProductMainDepndAddress();
        this.productMainDepndGender = aosD.getProductMainDepndGender();
        this.productMainDepndMobileNo = aosD.getProductMainDepndMobileNo();
        this.productMainDepndSumassured = aosD.getProductMainDepndSumassured();
        this.productMainDepndRelationship = aosD.getProductMainDepndRelationship();
        this.productMainDepndInputdate = aosD.getProductMainDepndInputdate();
        this.productMainDepndUserindex = aosD.getProductMainDepndUserindex();
    }
    

    public AosDependTb(Integer productMainDepndIndex) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMainDepndIndex != null ? productMainDepndIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AosDependTb)) {
            return false;
        }
        AosDependTb other = (AosDependTb) object;
        if ((this.productMainDepndIndex == null && other.productMainDepndIndex != null) || (this.productMainDepndIndex != null && !this.productMainDepndIndex.equals(other.productMainDepndIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.AosDependTb[ productMainDepndIndex=" + productMainDepndIndex + " ]";
    }
    
}
