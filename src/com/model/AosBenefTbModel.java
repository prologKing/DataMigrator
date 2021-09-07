/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source1.entity.AosBenefTb;

/**
 *
 * @author Developer
 */
public class AosBenefTbModel {
    int productBeneIndex;
    String productrBeneRefNo;
    String productBeneName;
    String productBeneDob;
    String productBeneAddress;
    String productBeneGender;
    String productBeneRelationship;
    String productBenePercentage;
    String productBeneInputdate;
    String productBeneUserindex;
    String productBeneMobileNo;

    public AosBenefTbModel() {
    }
    
    
    
 public AosBenefTbModel(AosBenefTb aosB) {
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

    public int getProductBeneIndex() {
        return productBeneIndex;
    }

    public void setProductBeneIndex(int productBeneIndex) {
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
    public String toString() {
        return "AosBenefTbModel{" + "productBeneIndex=" + productBeneIndex + ", productrBeneRefNo=" + productrBeneRefNo + ", productBeneName=" + productBeneName + ", productBeneDob=" + productBeneDob + ", productBeneAddress=" + productBeneAddress + ", productBeneGender=" + productBeneGender + ", productBeneRelationship=" + productBeneRelationship + ", productBenePercentage=" + productBenePercentage + ", productBeneInputdate=" + productBeneInputdate + ", productBeneUserindex=" + productBeneUserindex + ", productBeneMobileNo=" + productBeneMobileNo + '}';
    }
 
 
        
}
