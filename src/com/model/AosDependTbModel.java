/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source1.entity.AosDependTb;
import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class AosDependTbModel {
    int productMainDepndIndex;
    String productrRefNo;
    String productMainDepndName;
    String productMainDepndDob;
    String productMainDepndAddress;
    String productMainDepndGender;
    String productMainDepndMobileNo;
    BigDecimal productMainDepndSumassured;
    String productMainDepndRelationship;
    String productMainDepndInputdate;
    String productMainDepndUserindex;

    public AosDependTbModel() {
    }
    
    
  public AosDependTbModel(AosDependTb aosD) {
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
    public String toString() {
        return "AosDependTbModel{" + "productMainDepndIndex=" + productMainDepndIndex + ", productrRefNo=" + productrRefNo + ", productMainDepndName=" + productMainDepndName + ", productMainDepndDob=" + productMainDepndDob + ", productMainDepndAddress=" + productMainDepndAddress + ", productMainDepndGender=" + productMainDepndGender + ", productMainDepndMobileNo=" + productMainDepndMobileNo + ", productMainDepndSumassured=" + productMainDepndSumassured + ", productMainDepndRelationship=" + productMainDepndRelationship + ", productMainDepndInputdate=" + productMainDepndInputdate + ", productMainDepndUserindex=" + productMainDepndUserindex + '}';
    }
  
  
}
