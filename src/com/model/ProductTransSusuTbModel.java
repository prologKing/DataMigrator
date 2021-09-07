/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source1.entity.ProductTransSusuTb;
import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class ProductTransSusuTbModel {
    int susuTransIndex; 
    String susuCode;
    String susuTransPolicyNo;
    String susuTransName;
    String susuTransDescription;
    String susuTransDate;
    BigDecimal susuTransOpenbalance;
    BigDecimal susuTransDebit;
    BigDecimal susuTransCredit;
    BigDecimal susuTransClosingbalance;
    String susuTransAgentsId;
    String susuTransUserindex;
    String susuTransInputdate;
    String susuPStatus;
    String susuComment;
    String susuUpdateStatus;
    String momTransactionId;
    String uniwalletTransactionId;

    public ProductTransSusuTbModel() {
    }
    
    public ProductTransSusuTbModel(ProductTransSusuTb psusu) {
        this.susuTransIndex = psusu.getSusuTransIndex();
        this.susuCode = psusu.getSusuCode();
        this.susuTransPolicyNo = psusu.getSusuTransPolicyNo();
        this.susuTransName = psusu.getSusuTransName();
        this.susuTransDescription = psusu.getSusuTransDescription();
        this.susuTransDate = psusu.getSusuTransDate();
        this.susuTransOpenbalance = psusu.getSusuTransOpenbalance();
        this.susuTransDebit = psusu.getSusuTransDebit();
        this.susuTransCredit = psusu.getSusuTransCredit();
        this.susuTransClosingbalance = psusu.getSusuTransClosingbalance();
        this.susuTransAgentsId = psusu.getSusuTransAgentsId();
        this.susuTransUserindex = psusu.getSusuTransUserindex();
        this.susuTransInputdate = psusu.getSusuTransInputdate();
        this.susuPStatus = psusu.getSusuPStatus();
        this.susuComment = psusu.getSusuComment();
        this.susuUpdateStatus = psusu.getSusuUpdateStatus();
        this.momTransactionId = psusu.getMomTransactionId();
        this.uniwalletTransactionId = psusu.getUniwalletTransactionId();
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

    public BigDecimal getSusuTransOpenbalance() {
        return susuTransOpenbalance;
    }

    public void setSusuTransOpenbalance(BigDecimal susuTransOpenbalance) {
        this.susuTransOpenbalance = susuTransOpenbalance;
    }

    public BigDecimal getSusuTransDebit() {
        return susuTransDebit;
    }

    public void setSusuTransDebit(BigDecimal susuTransDebit) {
        this.susuTransDebit = susuTransDebit;
    }

    public BigDecimal getSusuTransCredit() {
        return susuTransCredit;
    }

    public void setSusuTransCredit(BigDecimal susuTransCredit) {
        this.susuTransCredit = susuTransCredit;
    }

    public BigDecimal getSusuTransClosingbalance() {
        return susuTransClosingbalance;
    }

    public void setSusuTransClosingbalance(BigDecimal susuTransClosingbalance) {
        this.susuTransClosingbalance = susuTransClosingbalance;
    }

    public String getSusuTransAgentsId() {
        return susuTransAgentsId;
    }

    public void setSusuTransAgentsId(String susuTransAgentsId) {
        this.susuTransAgentsId = susuTransAgentsId;
    }

    public String getSusuTransUserindex() {
        return susuTransUserindex;
    }

    public void setSusuTransUserindex(String susuTransUserindex) {
        this.susuTransUserindex = susuTransUserindex;
    }

    public String getSusuTransInputdate() {
        return susuTransInputdate;
    }

    public void setSusuTransInputdate(String susuTransInputdate) {
        this.susuTransInputdate = susuTransInputdate;
    }

    public String getSusuPStatus() {
        return susuPStatus;
    }

    public void setSusuPStatus(String susuPStatus) {
        this.susuPStatus = susuPStatus;
    }

    public String getSusuComment() {
        return susuComment;
    }

    public void setSusuComment(String susuComment) {
        this.susuComment = susuComment;
    }

    public String getSusuUpdateStatus() {
        return susuUpdateStatus;
    }

    public void setSusuUpdateStatus(String susuUpdateStatus) {
        this.susuUpdateStatus = susuUpdateStatus;
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

    @Override
    public String toString() {
        return "ProductTransSusuTbModel{" + "susuTransIndex=" + susuTransIndex + ", susuCode=" + susuCode + ", susuTransPolicyNo=" + susuTransPolicyNo + ", susuTransName=" + susuTransName + ", susuTransDescription=" + susuTransDescription + ", susuTransDate=" + susuTransDate + ", susuTransOpenbalance=" + susuTransOpenbalance + ", susuTransDebit=" + susuTransDebit + ", susuTransCredit=" + susuTransCredit + ", susuTransClosingbalance=" + susuTransClosingbalance + ", susuTransAgentsId=" + susuTransAgentsId + ", susuTransUserindex=" + susuTransUserindex + ", susuTransInputdate=" + susuTransInputdate + ", susuPStatus=" + susuPStatus + ", susuComment=" + susuComment + ", susuUpdateStatus=" + susuUpdateStatus + ", momTransactionId=" + momTransactionId + ", uniwalletTransactionId=" + uniwalletTransactionId + '}';
    }
    
    
}
