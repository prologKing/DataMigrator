/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source2.entity.EazyappDependTb;
import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class EazyappDependTbModel {
    int productMainDepndIndex;
    String productrRefNo;
    String productMainDepndName;
    String productMainDepndDob;
    String productMainDepndAddres;
    String productMainDepndGender;
    String productMainDepndMobileNo;
    BigDecimal productMainDepndSumassured;
    String productMainDepndRelationship;
    String productMainDepndCategory;
    String productMainDepndInputdate;
    String productMainDepndUserindex;
    BigDecimal productMainDepndPremium;

    public EazyappDependTbModel() {
    }
    
    
    
    public EazyappDependTbModel(EazyappDependTb eazyapp) {
        this.productMainDepndIndex = eazyapp.getProductMainDepndIndex();
        this.productrRefNo = eazyapp.getProductrRefNo();
        this.productMainDepndName = eazyapp.getProductMainDepndName();
        this.productMainDepndDob = eazyapp.getProductMainDepndDob();
        this.productMainDepndAddres = eazyapp.getProductMainDepndAddress();
        this.productMainDepndGender = eazyapp.getProductMainDepndGender();
        this.productMainDepndMobileNo = eazyapp.getProductMainDepndMobileNo();
        this.productMainDepndSumassured = eazyapp.getProductMainDepndSumassured();
        this.productMainDepndRelationship = eazyapp.getProductMainDepndRelationship();
        this.productMainDepndCategory = eazyapp.getProductMainDepndCategory();
        this.productMainDepndInputdate = eazyapp.getProductMainDepndInputdate();
        this.productMainDepndUserindex = eazyapp.getProductMainDepndUserindex();
        this.productMainDepndPremium = eazyapp.getProductMainDepndPremium();
    }

    public int getProductMainDepndIndex() {
        return productMainDepndIndex;
    }

    public void setProductMainDepndIndex(int productMainDepndIndex) {
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

    public String getProductMainDepndAddres() {
        return productMainDepndAddres;
    }

    public void setProductMainDepndAddres(String productMainDepndAddres) {
        this.productMainDepndAddres = productMainDepndAddres;
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
    public String toString() {
        return "EazyappDependTbModel{" + "productMainDepndIndex=" + productMainDepndIndex + ", productrRefNo=" + productrRefNo + ", productMainDepndName=" + productMainDepndName + ", productMainDepndDob=" + productMainDepndDob + ", productMainDepndAddres=" + productMainDepndAddres + ", productMainDepndGender=" + productMainDepndGender + ", productMainDepndMobileNo=" + productMainDepndMobileNo + ", productMainDepndSumassured=" + productMainDepndSumassured + ", productMainDepndRelationship=" + productMainDepndRelationship + ", productMainDepndCategory=" + productMainDepndCategory + ", productMainDepndInputdate=" + productMainDepndInputdate + ", productMainDepndUserindex=" + productMainDepndUserindex + ", productMainDepndPremium=" + productMainDepndPremium + '}';
    }
    
    
    
}
