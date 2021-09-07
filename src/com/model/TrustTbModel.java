/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source1.entity.AosTrustTb;
import com.source2.entity.EazyappTrustTb;
import com.source3.entity.EazylifeTrustTb;

/**
 *
 * @author Developer
 */
public class TrustTbModel {
    int productMainTrustIndex;
    String productrMainTrustRefNo;
    String productMainTrustName;
    String productMainTrustDob; 
    String productMainTrustAddress;
    String productMainTrustGender;
    String productMainTrustRelationship;
    String productMainTrustPercentage;
    String productMainTrustInputdate;
    String productMainTrustUserindex;
    String productMainTrustMobileNo;

    public TrustTbModel() {
    }
    
    
    
    public TrustTbModel(AosTrustTb aostrust) {
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
    public TrustTbModel(EazyappTrustTb aostrust) {
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
    public TrustTbModel(EazylifeTrustTb aostrust) {
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

    public int getProductMainTrustIndex() {
        return productMainTrustIndex;
    }

    public void setProductMainTrustIndex(int productMainTrustIndex) {
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
    public String toString() {
        return "TrustTbModel{" + "productMainTrustIndex=" + productMainTrustIndex + ", productrMainTrustRefNo=" + productrMainTrustRefNo + ", productMainTrustName=" + productMainTrustName + ", productMainTrustDob=" + productMainTrustDob + ", productMainTrustAddress=" + productMainTrustAddress + ", productMainTrustGender=" + productMainTrustGender + ", productMainTrustRelationship=" + productMainTrustRelationship + ", productMainTrustPercentage=" + productMainTrustPercentage + ", productMainTrustInputdate=" + productMainTrustInputdate + ", productMainTrustUserindex=" + productMainTrustUserindex + ", productMainTrustMobileNo=" + productMainTrustMobileNo + '}';
    }
    
    
}
