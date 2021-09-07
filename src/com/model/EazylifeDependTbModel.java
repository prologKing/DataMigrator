/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source3.entity.EazylifeDependTb;
import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class EazylifeDependTbModel {
    int productMainDepndIndex;
    String productrRefNo;
    String productMainDepndName;
    String productMainDepndDob;
    String productMainDepndAddress;
    String productMainDepndGender;
    String productMainDepndMobileNo;
    BigDecimal productMainDepndSumassured;
    String productMainDepndRelationship;
    String productMainDepndCategory;
    String productMainDepndInputdate;
    String productMainDepndUserindex;
    BigDecimal productMainDepndPremium;

    public EazylifeDependTbModel() {
    }
    
    
    
    public EazylifeDependTbModel(EazylifeDependTb eldtb) {
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
    public String toString() {
        return "EazylifeDependTbModel{" + "productMainDepndIndex=" + productMainDepndIndex + ", productrRefNo=" + productrRefNo + ", productMainDepndName=" + productMainDepndName + ", productMainDepndDob=" + productMainDepndDob + ", productMainDepndAddress=" + productMainDepndAddress + ", productMainDepndGender=" + productMainDepndGender + ", productMainDepndMobileNo=" + productMainDepndMobileNo + ", productMainDepndSumassured=" + productMainDepndSumassured + ", productMainDepndRelationship=" + productMainDepndRelationship + ", productMainDepndCategory=" + productMainDepndCategory + ", productMainDepndInputdate=" + productMainDepndInputdate + ", productMainDepndUserindex=" + productMainDepndUserindex + ", productMainDepndPremium=" + productMainDepndPremium + '}';
    }
    
    
}
