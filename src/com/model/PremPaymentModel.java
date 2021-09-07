/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PremPayment;

/**
 *
 * @author Developer
 */
public class PremPaymentModel {
    
    int susuTransIndex;
    String susuCode;
    String susuTransPolicyNo;
    String susuTransName;
    String susuTransDescription;
    String susuTransDate;
    Double susuTransOpenbalance;
    Double susuTransDebit;
    Double susuTransCredit;
    Double susuTransClosingbalance;
    String susuTransAgentsId;
    Integer susuTransUserindex;
    String susuTransInputdate;
    String susuTransComments;
    String momTransactionId;
    String uniwalletTransactionId;
    Integer isExist;

    public PremPaymentModel() {
    }

    public PremPaymentModel(PremPayment prempay) {
         this.susuTransIndex = prempay.getSusuTransIndex();
        this.susuCode = prempay.getSusuCode();
        this.susuTransPolicyNo = prempay.getSusuTransPolicyNo();
        this.susuTransName = prempay.getSusuTransName();
        this.susuTransDescription = prempay.getSusuTransDescription();
        this.susuTransDate = prempay.getSusuTransDate();
        this.susuTransOpenbalance = prempay.getSusuTransOpenbalance();
        this.susuTransDebit = prempay.getSusuTransDebit();
        this.susuTransCredit = prempay.getSusuTransCredit();
        this.susuTransClosingbalance = prempay.getSusuTransClosingbalance();
        this.susuTransAgentsId = prempay.getSusuTransAgentsId();
        this.susuTransUserindex = prempay.getSusuTransUserindex();
        this.susuTransInputdate = prempay.getSusuTransInputdate();
        this.susuTransComments = prempay.getSusuTransComments();
        this.momTransactionId = prempay.getMomTransactionId();
        this.uniwalletTransactionId = prempay.getUniwalletTransactionId();
        this.isExist = prempay.getIsExist();
    }
    
    
    
    public PremPaymentModel(Integer susuTransIndex, String susuCode, String susuTransPolicyNo, String susuTransName, String susuTransDescription, String susuTransDate, Double susuTransOpenbalance, Double susuTransDebit, Double susuTransCredit, Double susuTransClosingbalance, String susuTransAgentsId, Integer susuTransUserindex, String susuTransInputdate, String susuTransComments, String momTransactionId, String uniwalletTransactionId, Integer isExist) {
        this.susuTransIndex = susuTransIndex;
        this.susuCode = susuCode;
        this.susuTransPolicyNo = susuTransPolicyNo;
        this.susuTransName = susuTransName;
        this.susuTransDescription = susuTransDescription;
        this.susuTransDate = susuTransDate;
        this.susuTransOpenbalance = susuTransOpenbalance;
        this.susuTransDebit = susuTransDebit;
        this.susuTransCredit = susuTransCredit;
        this.susuTransClosingbalance = susuTransClosingbalance;
        this.susuTransAgentsId = susuTransAgentsId;
        this.susuTransUserindex = susuTransUserindex;
        this.susuTransInputdate = susuTransInputdate;
        this.susuTransComments = susuTransComments;
        this.momTransactionId = momTransactionId;
        this.uniwalletTransactionId = uniwalletTransactionId;
        this.isExist = isExist;
    }

    public int getSusuTransIndex() {
        return susuTransIndex;
    }

    public void setSusuTransIndex(int susuTransIndex) {
        this.susuTransIndex = susuTransIndex;
    }

    public String getSusuCode() {
        return susuCode;
    }

    public void setSusuCode(String susuCode) {
        this.susuCode = susuCode;
    }

    public String getSusuTransPolicyNo() {
        return susuTransPolicyNo;
    }

    public void setSusuTransPolicyNo(String susuTransPolicyNo) {
        this.susuTransPolicyNo = susuTransPolicyNo;
    }

    public String getSusuTransName() {
        return susuTransName;
    }

    public void setSusuTransName(String susuTransName) {
        this.susuTransName = susuTransName;
    }

    public String getSusuTransDescription() {
        return susuTransDescription;
    }

    public void setSusuTransDescription(String susuTransDescription) {
        this.susuTransDescription = susuTransDescription;
    }

    public String getSusuTransDate() {
        return susuTransDate;
    }

    public void setSusuTransDate(String susuTransDate) {
        this.susuTransDate = susuTransDate;
    }

    public Double getSusuTransOpenbalance() {
        return susuTransOpenbalance;
    }

    public void setSusuTransOpenbalance(Double susuTransOpenbalance) {
        this.susuTransOpenbalance = susuTransOpenbalance;
    }

    public Double getSusuTransDebit() {
        return susuTransDebit;
    }

    public void setSusuTransDebit(Double susuTransDebit) {
        this.susuTransDebit = susuTransDebit;
    }

    public Double getSusuTransCredit() {
        return susuTransCredit;
    }

    public void setSusuTransCredit(Double susuTransCredit) {
        this.susuTransCredit = susuTransCredit;
    }

    public Double getSusuTransClosingbalance() {
        return susuTransClosingbalance;
    }

    public void setSusuTransClosingbalance(Double susuTransClosingbalance) {
        this.susuTransClosingbalance = susuTransClosingbalance;
    }

    public String getSusuTransAgentsId() {
        return susuTransAgentsId;
    }

    public void setSusuTransAgentsId(String susuTransAgentsId) {
        this.susuTransAgentsId = susuTransAgentsId;
    }

    public Integer getSusuTransUserindex() {
        return susuTransUserindex;
    }

    public void setSusuTransUserindex(Integer susuTransUserindex) {
        this.susuTransUserindex = susuTransUserindex;
    }

    public String getSusuTransInputdate() {
        return susuTransInputdate;
    }

    public void setSusuTransInputdate(String susuTransInputdate) {
        this.susuTransInputdate = susuTransInputdate;
    }

    public String getSusuTransComments() {
        return susuTransComments;
    }

    public void setSusuTransComments(String susuTransComments) {
        this.susuTransComments = susuTransComments;
    }

    public String getMomTransactionId() {
        return momTransactionId;
    }

    public void setMomTransactionId(String momTransactionId) {
        this.momTransactionId = momTransactionId;
    }

    public String getUniwalletTransactionId() {
        return uniwalletTransactionId;
    }

    public void setUniwalletTransactionId(String uniwalletTransactionId) {
        this.uniwalletTransactionId = uniwalletTransactionId;
    }

    public Integer getIsExist() {
        return isExist;
    }

    public void setIsExist(Integer isExist) {
        this.isExist = isExist;
    }

    @Override
    public String toString() {
        return "PremPaymentModel{" + "susuTransIndex=" + susuTransIndex + ", susuCode=" + susuCode + ", susuTransPolicyNo=" + susuTransPolicyNo + ", susuTransName=" + susuTransName + ", susuTransDescription=" + susuTransDescription + ", susuTransDate=" + susuTransDate + ", susuTransOpenbalance=" + susuTransOpenbalance + ", susuTransDebit=" + susuTransDebit + ", susuTransCredit=" + susuTransCredit + ", susuTransClosingbalance=" + susuTransClosingbalance + ", susuTransAgentsId=" + susuTransAgentsId + ", susuTransUserindex=" + susuTransUserindex + ", susuTransInputdate=" + susuTransInputdate + ", susuTransComments=" + susuTransComments + ", momTransactionId=" + momTransactionId + ", uniwalletTransactionId=" + uniwalletTransactionId + ", isExist=" + isExist + '}';
    }
    
}
