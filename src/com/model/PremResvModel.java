/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PremResv;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class PremResvModel {
    int psSysid;
    int psPolhSysid;
    int psUserSysid;
    String psTrnCode;
    String psPolhNum;
    String psTrnName;
    String psTrnDesc;
    String psTrnDt; 
    String psSysDt;
    BigDecimal psAmt;
    BigDecimal psCrAmt;
    BigDecimal psDrAmt;
    BigDecimal psAmtBal;
    String psPayMode;
    String psPaySource;
    String psChqDt;
    String psChqNo;
    String psDepBank;
    String psPayInfo;
    String psChqClrDt;
    String psSts;
    String psAuthSts;
    String psAuthDt;
    String psAuthUser;
    String psPrcsSts;
    String psPrcsDt;
    String fvSts;

    public PremResvModel() {
    }
    
    
    
    public PremResvModel(PremResv prsesv) {
        this.psSysid = prsesv.getPsSysid();
        this.psPolhSysid = prsesv.getPsPolhSysid();
        this.psUserSysid = prsesv.getPsUserSysid();
        this.psTrnCode = prsesv.getPsTrnCode();
        this.psPolhNum = prsesv.getPsPolhNum();
        this.psTrnName = prsesv.getPsTrnName();
        this.psTrnDesc = prsesv.getPsTrnDesc();
        this.psTrnDt = prsesv.getPsTrnDt();
        this.psSysDt = prsesv.getPsSysDt();
        this.psAmt = prsesv.getPsAmt();
        this.psCrAmt = prsesv.getPsCrAmt();
        this.psDrAmt = prsesv.getPsDrAmt();
        this.psAmtBal = prsesv.getPsAmtBal();
        this.psPayMode = prsesv.getPsPayMode();
        this.psPaySource = prsesv.getPsPaySource();
        this.psChqDt = prsesv.getPsChqNo();
        this.psChqNo = prsesv.getPsChqNo();
        this.psDepBank = prsesv.getPsDepBank();
        this.psPayInfo = prsesv.getPsPayInfo();
        this.psChqClrDt = prsesv.getPsChqClrDt();
        this.psSts = prsesv.getPsSts();
        this.psAuthSts = prsesv.getPsAuthSts();
        this.psAuthDt = prsesv.getPsAuthDt();
        this.psAuthUser = prsesv.getPsAuthUser();
        this.psPrcsSts = prsesv.getPsPrcsSts();
        this.psPrcsDt = prsesv.getPsPrcsDt();
        this.fvSts = prsesv.getFvSts();
    }
    
    public PremResvModel(ProductTransSusuTbModel prsesv) {
        this.psSysid = 0;
        this.psPolhSysid = 0;
        this.psUserSysid = 43;
        this.psTrnCode = "";
        this.psPolhNum = prsesv.getSusuTransPolicyNo();
        this.psTrnName = "Payment of Premium";
        this.psTrnDesc = "Payment of Premium";
        this.psTrnDt = prsesv.getSusuTransDate();
        this.psSysDt = prsesv.getSusuTransDate();
        this.psAmt = prsesv.getSusuTransCredit();
        this.psCrAmt = prsesv.getSusuTransCredit();
        this.psDrAmt = BigDecimal.ZERO;
        this.psAmtBal = BigDecimal.ZERO;
        this.psPayMode = prsesv.getSusuTransDescription();
        this.psPaySource = prsesv.getSusuTransDescription();
        this.psChqDt = null;
        this.psChqNo = null;
        this.psDepBank = null;
        this.psPayInfo = null;
        this.psChqClrDt = null;
        this.psSts = "POST";
        this.psAuthSts = "POST";
        this.psAuthDt = null;
        this.psAuthUser = null;
        this.psPrcsSts = null;
        this.psPrcsDt = null;
        this.fvSts = null;
    }

    public int getPsSysid() {
        return psSysid;
    }

    public void setPsSysid(int psSysid) {
        this.psSysid = psSysid;
    }

    public int getPsPolhSysid() {
        return psPolhSysid;
    }

    public void setPsPolhSysid(int psPolhSysid) {
        this.psPolhSysid = psPolhSysid;
    }

    public int getPsUserSysid() {
        return psUserSysid;
    }

    public void setPsUserSysid(int psUserSysid) {
        this.psUserSysid = psUserSysid;
    }

    public String getPsTrnCode() {
        return psTrnCode;
    }

    public void setPsTrnCode(String psTrnCode) {
        this.psTrnCode = psTrnCode;
    }

    public String getPsPolhNum() {
        return psPolhNum;
    }

    public void setPsPolhNum(String psPolhNum) {
        this.psPolhNum = psPolhNum;
    }

    public String getPsTrnName() {
        return psTrnName;
    }

    public void setPsTrnName(String psTrnName) {
        this.psTrnName = psTrnName;
    }

    public String getPsTrnDesc() {
        return psTrnDesc;
    }

    public void setPsTrnDesc(String psTrnDesc) {
        this.psTrnDesc = psTrnDesc;
    }

    public String getPsTrnDt() {
        return psTrnDt;
    }

    public void setPsTrnDt(String psTrnDt) {
        this.psTrnDt = psTrnDt;
    }

    public String getPsSysDt() {
        return psSysDt;
    }

    public void setPsSysDt(String psSysDt) {
        this.psSysDt = psSysDt;
    }

    public BigDecimal getPsAmt() {
        return psAmt;
    }

    public void setPsAmt(BigDecimal psAmt) {
        this.psAmt = psAmt;
    }

    public BigDecimal getPsCrAmt() {
        return psCrAmt;
    }

    public void setPsCrAmt(BigDecimal psCrAmt) {
        this.psCrAmt = psCrAmt;
    }

    public BigDecimal getPsDrAmt() {
        return psDrAmt;
    }

    public void setPsDrAmt(BigDecimal psDrAmt) {
        this.psDrAmt = psDrAmt;
    }

    public BigDecimal getPsAmtBal() {
        return psAmtBal;
    }

    public void setPsAmtBal(BigDecimal psAmtBal) {
        this.psAmtBal = psAmtBal;
    }

    public String getPsPayMode() {
        return psPayMode;
    }

    public void setPsPayMode(String psPayMode) {
        this.psPayMode = psPayMode;
    }

    public String getPsPaySource() {
        return psPaySource;
    }

    public void setPsPaySource(String psPaySource) {
        this.psPaySource = psPaySource;
    }

    public String getPsChqDt() {
        return psChqDt;
    }

    public void setPsChqDt(String psChqDt) {
        this.psChqDt = psChqDt;
    }

    public String getPsChqNo() {
        return psChqNo;
    }

    public void setPsChqNo(String psChqNo) {
        this.psChqNo = psChqNo;
    }

    public String getPsDepBank() {
        return psDepBank;
    }

    public void setPsDepBank(String psDepBank) {
        this.psDepBank = psDepBank;
    }

    public String getPsPayInfo() {
        return psPayInfo;
    }

    public void setPsPayInfo(String psPayInfo) {
        this.psPayInfo = psPayInfo;
    }

    public String getPsChqClrDt() {
        return psChqClrDt;
    }

    public void setPsChqClrDt(String psChqClrDt) {
        this.psChqClrDt = psChqClrDt;
    }

    public String getPsSts() {
        return psSts;
    }

    public void setPsSts(String psSts) {
        this.psSts = psSts;
    }

    public String getPsAuthSts() {
        return psAuthSts;
    }

    public void setPsAuthSts(String psAuthSts) {
        this.psAuthSts = psAuthSts;
    }

    public String getPsAuthDt() {
        return psAuthDt;
    }

    public void setPsAuthDt(String psAuthDt) {
        this.psAuthDt = psAuthDt;
    }

    public String getPsAuthUser() {
        return psAuthUser;
    }

    public void setPsAuthUser(String psAuthUser) {
        this.psAuthUser = psAuthUser;
    }

    public String getPsPrcsSts() {
        return psPrcsSts;
    }

    public void setPsPrcsSts(String psPrcsSts) {
        this.psPrcsSts = psPrcsSts;
    }

    public String getPsPrcsDt() {
        return psPrcsDt;
    }

    public void setPsPrcsDt(String psPrcsDt) {
        this.psPrcsDt = psPrcsDt;
    }

    public String getFvSts() {
        return fvSts;
    }

    public void setFvSts(String fvSts) {
        this.fvSts = fvSts;
    }

    @Override
    public String toString() {
        return "PremResvModel{" + "psSysid=" + psSysid + ", psPolhSysid=" + psPolhSysid + ", psUserSysid=" + psUserSysid + ", psTrnCode=" + psTrnCode + ", psPolhNum=" + psPolhNum + ", psTrnName=" + psTrnName + ", psTrnDesc=" + psTrnDesc + ", psTrnDt=" + psTrnDt + ", psSysDt=" + psSysDt + ", psAmt=" + psAmt + ", psCrAmt=" + psCrAmt + ", psDrAmt=" + psDrAmt + ", psAmtBal=" + psAmtBal + ", psPayMode=" + psPayMode + ", psPaySource=" + psPaySource + ", psChqDt=" + psChqDt + ", psChqNo=" + psChqNo + ", psDepBank=" + psDepBank + ", psPayInfo=" + psPayInfo + ", psChqClrDt=" + psChqClrDt + ", psSts=" + psSts + ", psAuthSts=" + psAuthSts + ", psAuthDt=" + psAuthDt + ", psAuthUser=" + psAuthUser + ", psPrcsSts=" + psPrcsSts + ", psPrcsDt=" + psPrcsDt + ", fvSts=" + fvSts + '}';
    }
    
    
    
}
