/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolhClmInit;
import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class PolhClmInitModel {
    int pciSysid;
    int pciPolhSysid;
    String pciPolNum;
    String pciClmNum;
    int pciOffId;
    String pciOff;
    String pciRegDt;
    String pciRegSysdt;
    String pciCreateBy;
    String pciApprDt;
    String pciApprBy;
    String pciNarration;
    String pciContactNo;
    int pciCttId;
    String pciIdDesc;
    String pciIdNum;
    int pciPpmSysid;
    String pciMode;
    String pciMmNo;
    String pciBank;
    String pciBankBr;
    String pciBankAcct;
    int pciPctSysid;
    String pciClmType;
    String pciSts;
    String pciClmproDt;
    String pciClmproBy;
    String pciSysprcsSts;
    BigDecimal pcbAmt;

    public PolhClmInitModel() {
    }
    
    
    
    public PolhClmInitModel(PolhClmInit polhInit) {
        this.pciSysid = polhInit.getPciSysid();
        this.pciPolhSysid = polhInit.getPciPolhSysid();
        this.pciPolNum = polhInit.getPciPolNum();
        this.pciClmNum = polhInit.getPciClmNum();
        this.pciOffId = polhInit.getPciOffId();
        this.pciOff = polhInit.getPciOff();
        this.pciRegDt = polhInit.getPciRegDt();
        this.pciRegSysdt = polhInit.getPciRegSysdt();
        this.pciCreateBy = polhInit.getPciCreateBy();
        this.pciApprDt = polhInit.getPciApprDt();
        this.pciApprBy = polhInit.getPciApprBy();
        this.pciNarration = polhInit.getPciNarration();
        this.pciContactNo = polhInit.getPciContactNo();
        this.pciCttId = polhInit.getPciCttId();
        this.pciIdDesc = polhInit.getPciIdDesc();
        this.pciIdNum = polhInit.getPciIdNum();
        this.pciPpmSysid = polhInit.getPciPpmSysid();
        this.pciMode = polhInit.getPciMode();
        this.pciMmNo = polhInit.getPciMmNo();
        this.pciBank = polhInit.getPciBank();
        this.pciBankBr = polhInit.getPciBankBr();
        this.pciBankAcct = polhInit.getPciBankAcct();
        this.pciPctSysid = polhInit.getPciPctSysid();
        this.pciClmType = polhInit.getPciClmType();
        this.pciSts = polhInit.getPciSts();
        this.pciClmproDt = polhInit.getPciClmproDt();
        this.pciClmproBy = polhInit.getPciClmproBy();
        this.pciSysprcsSts = polhInit.getPciSysprcsSts();
    }
    
    public PolhClmInitModel(AosClaimsModel polhInit) {
        this.pciSysid = 0;
        this.pciPolhSysid = 0;
        this.pciPolNum = polhInit.getPolNum();
        this.pciClmNum = "";
        this.pciOffId = polhInit.getBranch();
        this.pciOff = "HEAD OFFICE";
        this.pciRegDt = polhInit.getLogDate();
        this.pciRegSysdt = polhInit.getLogDate();
        this.pciCreateBy = polhInit.getHandlingOfficer();
        this.pciApprDt = polhInit.getProcessDate();
        this.pciApprBy = polhInit.getHandlingOfficer();
        this.pciNarration = polhInit.getTrnxType();
        this.pciContactNo = polhInit.getTelephone();
        this.pciCttId = 5;
        this.pciIdDesc = "VOTER ID";
        this.pciIdNum = "N/A";
        this.pciPpmSysid = 7;
        this.pciMode = polhInit.getPymtMode();
        this.pciMmNo = null;
        this.pciBank = "ADB Bank";
        this.pciBankBr = "Ridge Branch";
        this.pciBankAcct = polhInit.getAccNo();
        this.pciPctSysid = 10;
        this.pciClmType = polhInit.getTrnxType();
        this.pciSts = "P1";
        this.pciClmproDt = polhInit.getProcessDate();
        this.pciClmproBy = polhInit.getHandlingOfficer();
        this.pciSysprcsSts = "N";
    }

    public int getPciSysid() {
        return pciSysid;
    }

    public void setPciSysid(int pciSysid) {
        this.pciSysid = pciSysid;
    }

    public int getPciPolhSysid() {
        return pciPolhSysid;
    }

    public void setPciPolhSysid(int pciPolhSysid) {
        this.pciPolhSysid = pciPolhSysid;
    }

    public String getPciPolNum() {
        return pciPolNum;
    }

    public void setPciPolNum(String pciPolNum) {
        this.pciPolNum = pciPolNum;
    }

    public String getPciClmNum() {
        return pciClmNum;
    }

    public void setPciClmNum(String pciClmNum) {
        this.pciClmNum = pciClmNum;
    }

    public int getPciOffId() {
        return pciOffId;
    }

    public void setPciOffId(int pciOffId) {
        this.pciOffId = pciOffId;
    }

    public String getPciOff() {
        return pciOff;
    }

    public void setPciOff(String pciOff) {
        this.pciOff = pciOff;
    }

    public String getPciRegDt() {
        return pciRegDt;
    }

    public void setPciRegDt(String pciRegDt) {
        this.pciRegDt = pciRegDt;
    }

    public String getPciRegSysdt() {
        return pciRegSysdt;
    }

    public void setPciRegSysdt(String pciRegSysdt) {
        this.pciRegSysdt = pciRegSysdt;
    }

    public String getPciCreateBy() {
        return pciCreateBy;
    }

    public void setPciCreateBy(String pciCreateBy) {
        this.pciCreateBy = pciCreateBy;
    }

    public String getPciApprDt() {
        return pciApprDt;
    }

    public void setPciApprDt(String pciApprDt) {
        this.pciApprDt = pciApprDt;
    }

    public String getPciApprBy() {
        return pciApprBy;
    }

    public void setPciApprBy(String pciApprBy) {
        this.pciApprBy = pciApprBy;
    }

    public String getPciNarration() {
        return pciNarration;
    }

    public void setPciNarration(String pciNarration) {
        this.pciNarration = pciNarration;
    }

    public String getPciContactNo() {
        return pciContactNo;
    }

    public void setPciContactNo(String pciContactNo) {
        this.pciContactNo = pciContactNo;
    }

    public int getPciCttId() {
        return pciCttId;
    }

    public void setPciCttId(int pciCttId) {
        this.pciCttId = pciCttId;
    }

    public String getPciIdDesc() {
        return pciIdDesc;
    }

    public void setPciIdDesc(String pciIdDesc) {
        this.pciIdDesc = pciIdDesc;
    }

    public String getPciIdNum() {
        return pciIdNum;
    }

    public void setPciIdNum(String pciIdNum) {
        this.pciIdNum = pciIdNum;
    }

    public int getPciPpmSysid() {
        return pciPpmSysid;
    }

    public void setPciPpmSysid(int pciPpmSysid) {
        this.pciPpmSysid = pciPpmSysid;
    }

    public String getPciMode() {
        return pciMode;
    }

    public void setPciMode(String pciMode) {
        this.pciMode = pciMode;
    }

    public String getPciMmNo() {
        return pciMmNo;
    }

    public void setPciMmNo(String pciMmNo) {
        this.pciMmNo = pciMmNo;
    }

    public String getPciBank() {
        return pciBank;
    }

    public void setPciBank(String pciBank) {
        this.pciBank = pciBank;
    }

    public String getPciBankBr() {
        return pciBankBr;
    }

    public void setPciBankBr(String pciBankBr) {
        this.pciBankBr = pciBankBr;
    }

    public String getPciBankAcct() {
        return pciBankAcct;
    }

    public void setPciBankAcct(String pciBankAcct) {
        this.pciBankAcct = pciBankAcct;
    }

    public int getPciPctSysid() {
        return pciPctSysid;
    }

    public void setPciPctSysid(int pciPctSysid) {
        this.pciPctSysid = pciPctSysid;
    }

    public String getPciClmType() {
        return pciClmType;
    }

    public void setPciClmType(String pciClmType) {
        this.pciClmType = pciClmType;
    }

    public String getPciSts() {
        return pciSts;
    }

    public void setPciSts(String pciSts) {
        this.pciSts = pciSts;
    }

    public String getPciClmproDt() {
        return pciClmproDt;
    }

    public void setPciClmproDt(String pciClmproDt) {
        this.pciClmproDt = pciClmproDt;
    }

    public String getPciClmproBy() {
        return pciClmproBy;
    }

    public void setPciClmproBy(String pciClmproBy) {
        this.pciClmproBy = pciClmproBy;
    }

    public String getPciSysprcsSts() {
        return pciSysprcsSts;
    }

    public void setPciSysprcsSts(String pciSysprcsSts) {
        this.pciSysprcsSts = pciSysprcsSts;
    }

    public BigDecimal getPcbAmt() {
        return pcbAmt;
    }

    public void setPcbAmt(BigDecimal pcbAmt) {
        this.pcbAmt = pcbAmt;
    }
    
    

    @Override
    public String toString() {
        return "PolhClmInitModel{" + "pciSysid=" + pciSysid + ", pciPolhSysid=" + pciPolhSysid + ", pciPolNum=" + pciPolNum + ", pciClmNum=" + pciClmNum + ", pciOffId=" + pciOffId + ", pciOff=" + pciOff + ", pciRegDt=" + pciRegDt + ", pciRegSysdt=" + pciRegSysdt + ", pciCreateBy=" + pciCreateBy + ", pciApprDt=" + pciApprDt + ", pciApprBy=" + pciApprBy + ", pciNarration=" + pciNarration + ", pciContactNo=" + pciContactNo + ", pciCttId=" + pciCttId + ", pciIdDesc=" + pciIdDesc + ", pciIdNum=" + pciIdNum + ", pciPpmSysid=" + pciPpmSysid + ", pciMode=" + pciMode + ", pciMmNo=" + pciMmNo + ", pciBank=" + pciBank + ", pciBankBr=" + pciBankBr + ", pciBankAcct=" + pciBankAcct + ", pciPctSysid=" + pciPctSysid + ", pciClmType=" + pciClmType + ", pciSts=" + pciSts + ", pciClmproDt=" + pciClmproDt + ", pciClmproBy=" + pciClmproBy + ", pciSysprcsSts=" + pciSysprcsSts + '}';
    }
    
    
}
