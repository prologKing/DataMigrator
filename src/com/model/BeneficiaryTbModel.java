/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.BeneficiaryTb;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Developer
 */
public class BeneficiaryTbModel {

    BeneficiaryTbPKModel beneficiaryTbPK;
    String benCode;
    String benName;
    String benDob;
    int benAge;
    String benAddrs;
    String benGender;
    String benRelation;
    BigDecimal benSharePercent;
    String benMomoNo;
    String benCrtDt;
    String benSysDt;
    String benCrtUser;
    int benBfSysId;
    String benBfDesc;
    String benSts;

    public BeneficiaryTbModel() {
        this.beneficiaryTbPK = new BeneficiaryTbPKModel();
    }

    public BeneficiaryTbModel(BeneficiaryTb benTb) {
        this.beneficiaryTbPK = new BeneficiaryTbPKModel(benTb.getBeneficiaryTbPK());
        this.benCode = benTb.getBenCode();
        this.benName = benTb.getBenName();
        this.benDob = benTb.getBenDob();
        this.benAge = benTb.getBenAge();
        this.benAddrs = benTb.getBenAddrs();
        this.benGender = benTb.getBenGender();
        this.benRelation = benTb.getBenRelation();
        this.benSharePercent = benTb.getBenSharePercent();
        this.benMomoNo = benTb.getBenMomoNo();
        this.benCrtDt = benTb.getBenCrtDt();
        this.benSysDt = benTb.getBenSysDt();
        this.benCrtUser = benTb.getBenCrtUser();
        this.benBfSysId = benTb.getBenBfSysId();
        this.benBfDesc = benTb.getBenBfDesc();
        this.benSts = benTb.getBenSts();
    }
    
    public BeneficiaryTbModel(AosBenefTbModel benTb) {
        this.beneficiaryTbPK = new BeneficiaryTbPKModel(0, 0, 0);
        this.benCode = "";
        this.benName = benTb.getProductBeneName();
        this.benDob = benTb.getProductBeneDob();
        this.benAge = 0;
        this.benAddrs = benTb.getProductBeneAddress();
        this.benGender = benTb.getProductBeneGender();
        this.benRelation = benTb.getProductBeneRelationship();
        this.benSharePercent = new BigDecimal("".equals(benTb.getProductBenePercentage()) || benTb.getProductBenePercentage() == null ? "0.00": benTb.getProductBenePercentage());
        this.benMomoNo = benTb.getProductBeneMobileNo();
        this.benCrtDt = benTb.getProductBeneInputdate();
        this.benSysDt = benTb.getProductBeneInputdate();
        this.benCrtUser = "";
        this.benBfSysId = 1;
        this.benBfDesc = "Beneficiary";
        this.benSts = "N";
    }
    
    public BeneficiaryTbModel(TrustTbModel benTb) {
        this.beneficiaryTbPK = new BeneficiaryTbPKModel(0, 0, 0);
        this.benCode = "";
        this.benName = benTb.getProductMainTrustName();
        this.benDob = benTb.getProductMainTrustDob();
        this.benAge = 0;
        this.benAddrs = benTb.getProductMainTrustAddress();
        this.benGender = benTb.getProductMainTrustGender();
        this.benRelation = benTb.getProductMainTrustRelationship();
        this.benSharePercent = new BigDecimal("".equals(benTb.getProductMainTrustPercentage()) || benTb.getProductMainTrustPercentage() == null ? "0.00": benTb.getProductMainTrustPercentage());
        this.benMomoNo = benTb.getProductMainTrustMobileNo();
        this.benCrtDt = benTb.getProductMainTrustInputdate();
        this.benSysDt = benTb.getProductMainTrustInputdate();
        this.benCrtUser = "";
        this.benBfSysId = 2;
        this.benBfDesc = "Trustee";
        this.benSts = "N";
    }
    
    public BeneficiaryTbModel(EazyappBenefTbModel benTb) {
        this.beneficiaryTbPK = new BeneficiaryTbPKModel(0, 0, 0);
        this.benCode = "";
        this.benName = benTb.getProductBeneName();
        this.benDob = benTb.getProductBeneDob();
        this.benAge = 0;
        this.benAddrs = benTb.getProductBeneAddress();
        this.benGender = benTb.getProductBeneGender();
        this.benRelation = benTb.getProductBeneRelationship();
        this.benSharePercent = new BigDecimal("".equals(benTb.getProductBenePercentage()) || benTb.getProductBenePercentage() == null ? "0.00": benTb.getProductBenePercentage());
        this.benMomoNo = benTb.getProductBeneMobileNo();
        this.benCrtDt = benTb.getProductBeneInputdate();
        this.benSysDt = benTb.getProductBeneInputdate();
        this.benCrtUser = "";
        this.benBfSysId = 1;
        this.benBfDesc = "Beneficiary";
        this.benSts = "N";
    }
    
    public BeneficiaryTbModel(EazylifeBenefTbModel benTb) {
        this.beneficiaryTbPK = new BeneficiaryTbPKModel(0, 0, 0);
        this.benCode = "";
        this.benName = benTb.getProductBeneName();
        this.benDob = benTb.getProductBeneDob();
        this.benAge = 0;
        this.benAddrs = benTb.getProductBeneAddress();
        this.benGender = benTb.getProductBeneGender();
        this.benRelation = benTb.getProductBeneRelationship();
        this.benSharePercent = new BigDecimal("".equals(benTb.getProductBenePercentage()) || benTb.getProductBenePercentage() == null ? "0.00": benTb.getProductBenePercentage());
        this.benMomoNo = benTb.getProductBeneMobileNo();
        this.benCrtDt = benTb.getProductBeneInputdate();
        this.benSysDt = benTb.getProductBeneInputdate();
        this.benCrtUser = "";
        this.benBfSysId = 1;
        this.benBfDesc = "Beneficiary";
        this.benSts = "N";
    }

    public BeneficiaryTbPKModel getBeneficiaryTbPK() {
        return this.beneficiaryTbPK;
    }

    public void setBeneficiaryTbPK(BeneficiaryTbPKModel beneficiaryTbPK) {
        this.beneficiaryTbPK = beneficiaryTbPK;
    }

    public String getBenCode() {
        return benCode;
    }

    public void setBenCode(String benCode) {
        this.benCode = benCode;
    }

    public String getBenName() {
        return benName;
    }

    public void setBenName(String benName) {
        this.benName = benName;
    }

    public String getBenDob() {
        return benDob;
    }

    public void setBenDob(String benDob) {
        this.benDob = benDob;
    }

    public int getBenAge() {
        return benAge;
    }

    public void setBenAge(int benAge) {
        this.benAge = benAge;
    }

    public String getBenAddrs() {
        return benAddrs;
    }

    public void setBenAddrs(String benAddrs) {
        this.benAddrs = benAddrs;
    }

    public String getBenGender() {
        return benGender;
    }

    public void setBenGender(String benGender) {
        this.benGender = benGender;
    }

    public String getBenRelation() {
        return benRelation;
    }

    public void setBenRelation(String benRelation) {
        this.benRelation = benRelation;
    }

    public BigDecimal getBenSharePercent() {
        return benSharePercent;
    }

    public void setBenSharePercent(BigDecimal benSharePercent) {
        this.benSharePercent = benSharePercent;
    }

    public String getBenMomoNo() {
        return benMomoNo;
    }

    public void setBenMomoNo(String benMomoNo) {
        this.benMomoNo = benMomoNo;
    }

    public String getBenCrtDt() {
        return benCrtDt;
    }

    public void setBenCrtDt(String benCrtDt) {
        this.benCrtDt = benCrtDt;
    }

    public String getBenSysDt() {
        return benSysDt;
    }

    public void setBenSysDt(String benSysDt) {
        this.benSysDt = benSysDt;
    }

    public String getBenCrtUser() {
        return benCrtUser;
    }

    public void setBenCrtUser(String benCrtUser) {
        this.benCrtUser = benCrtUser;
    }

    public int getBenBfSysId() {
        return benBfSysId;
    }

    public void setBenBfSysId(int benBfSysId) {
        this.benBfSysId = benBfSysId;
    }

    public String getBenBfDesc() {
        return benBfDesc;
    }

    public void setBenBfDesc(String benBfDesc) {
        this.benBfDesc = benBfDesc;
    }

    public String getBenSts() {
        return benSts;
    }

    public void setBenSts(String benSts) {
        this.benSts = benSts;
    }

    @Override
    public String toString() {
        return "BeneficiaryTbModel{" + "beneficiaryTbPK=" + beneficiaryTbPK + ", benCode=" + benCode + ", benName=" + benName + ", benDob=" + benDob + ", benAge=" + benAge + ", benAddrs=" + benAddrs + ", benGender=" + benGender + ", benRelation=" + benRelation + ", benSharePercent=" + benSharePercent + ", benMomoNo=" + benMomoNo + ", benCrtDt=" + benCrtDt + ", benSysDt=" + benSysDt + ", benCrtUser=" + benCrtUser + ", benBfSysId=" + benBfSysId + ", benBfDesc=" + benBfDesc + ", benSts=" + benSts + '}';
    }

}
