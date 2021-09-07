/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolhClmBen;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Developer
 */
public class PolhClmBenModel {
    int pcbSysid;
    int pcbPolhSysid;
    int pcbPciSysid;
    String pcbDesc;
    String pcbTraxTyp;
    String pcbCurr;
    BigDecimal pcbAmt;
    BigDecimal pcbAmtDrBc;
    BigDecimal pcbAmtDrFc;
    BigDecimal pcbAmtCrBc;
    BigDecimal pcbAmtCrFc;
    String pcbRemark;
    String pcbSysdt;
    String pcbSts;

    public PolhClmBenModel() {
    }
    
    
  
    public PolhClmBenModel(PolhClmBen polBen) {
        this.pcbSysid = polBen.getPcbSysid();
        this.pcbPolhSysid = polBen.getPcbPolhSysid();
        this.pcbPciSysid = polBen.getPcbPciSysid();
        this.pcbDesc = polBen.getPcbDesc();
        this.pcbTraxTyp = polBen.getPcbTraxTyp();
        this.pcbCurr = polBen.getPcbCurr();
        this.pcbAmt = polBen.getPcbAmt();
        this.pcbAmtDrBc = polBen.getPcbAmtDrBc();
        this.pcbAmtDrFc = polBen.getPcbAmtDrFc();
        this.pcbAmtCrBc = polBen.getPcbAmtCrBc();
        this.pcbAmtCrFc = polBen.getPcbAmtCrFc();
        this.pcbRemark = polBen.getPcbRemark();
        this.pcbSysdt = polBen.getPcbSysdt();
        this.pcbSts = polBen.getPcbSts();
    }
    
    public PolhClmBenModel(PolhClmInitModel polBen) {
        this.pcbSysid = 0;
        this.pcbPolhSysid = polBen.getPciPolhSysid();
        this.pcbPciSysid = polBen.getPciSysid();
        this.pcbDesc = "SVAL";
        this.pcbTraxTyp = "CR";
        this.pcbCurr = "GHS";
        this.pcbAmt = polBen.getPcbAmt();
        this.pcbAmtDrBc = new BigDecimal(BigInteger.ZERO);
        this.pcbAmtDrFc = new BigDecimal(BigInteger.ZERO);
        this.pcbAmtCrBc = polBen.getPcbAmt();
        this.pcbAmtCrFc = polBen.getPcbAmt();
        this.pcbRemark = "SURRENDER BENEFIT";
        this.pcbSysdt = polBen.getPciApprDt();
        this.pcbSts = "Y";
    }
    
    public PolhClmBenModel(PolhClmInitModel polBen, String charge) {
        this.pcbSysid = 0;
        this.pcbPolhSysid = polBen.getPciPolhSysid();
        this.pcbPciSysid = polBen.getPciSysid();
        this.pcbDesc = "SCHR";
        this.pcbTraxTyp = "DR";
        this.pcbCurr = "GHS";
        this.pcbAmt = new BigDecimal(charge);
        this.pcbAmtCrBc = new BigDecimal(BigInteger.ZERO);
        this.pcbAmtCrFc = new BigDecimal(BigInteger.ZERO);
        this.pcbAmtDrBc = new BigDecimal(charge);
        this.pcbAmtDrFc = new BigDecimal(charge);
        this.pcbRemark = "SURRENDER CHARGE";
        this.pcbSysdt = polBen.getPciApprDt();
        this.pcbSts = "Y";
    }

    public int getPcbSysid() {
        return pcbSysid;
    }

    public void setPcbSysid(int pcbSysid) {
        this.pcbSysid = pcbSysid;
    }

    public int getPcbPolhSysid() {
        return pcbPolhSysid;
    }

    public void setPcbPolhSysid(int pcbPolhSysid) {
        this.pcbPolhSysid = pcbPolhSysid;
    }

    public int getPcbPciSysid() {
        return pcbPciSysid;
    }

    public void setPcbPciSysid(int pcbPciSysid) {
        this.pcbPciSysid = pcbPciSysid;
    }

    public String getPcbDesc() {
        return pcbDesc;
    }

    public void setPcbDesc(String pcbDesc) {
        this.pcbDesc = pcbDesc;
    }

    public String getPcbTraxTyp() {
        return pcbTraxTyp;
    }

    public void setPcbTraxTyp(String pcbTraxTyp) {
        this.pcbTraxTyp = pcbTraxTyp;
    }

    public String getPcbCurr() {
        return pcbCurr;
    }

    public void setPcbCurr(String pcbCurr) {
        this.pcbCurr = pcbCurr;
    }

    public BigDecimal getPcbAmt() {
        return pcbAmt;
    }

    public void setPcbAmt(BigDecimal pcbAmt) {
        this.pcbAmt = pcbAmt;
    }

    public BigDecimal getPcbAmtDrBc() {
        return pcbAmtDrBc;
    }

    public void setPcbAmtDrBc(BigDecimal pcbAmtDrBc) {
        this.pcbAmtDrBc = pcbAmtDrBc;
    }

    public BigDecimal getPcbAmtDrFc() {
        return pcbAmtDrFc;
    }

    public void setPcbAmtDrFc(BigDecimal pcbAmtDrFc) {
        this.pcbAmtDrFc = pcbAmtDrFc;
    }

    public BigDecimal getPcbAmtCrBc() {
        return pcbAmtCrBc;
    }

    public void setPcbAmtCrBc(BigDecimal pcbAmtCrBc) {
        this.pcbAmtCrBc = pcbAmtCrBc;
    }

    public BigDecimal getPcbAmtCrFc() {
        return pcbAmtCrFc;
    }

    public void setPcbAmtCrFc(BigDecimal pcbAmtCrFc) {
        this.pcbAmtCrFc = pcbAmtCrFc;
    }

    public String getPcbRemark() {
        return pcbRemark;
    }

    public void setPcbRemark(String pcbRemark) {
        this.pcbRemark = pcbRemark;
    }

    public String getPcbSysdt() {
        return pcbSysdt;
    }

    public void setPcbSysdt(String pcbSysdt) {
        this.pcbSysdt = pcbSysdt;
    }

    public String getPcbSts() {
        return pcbSts;
    }

    public void setPcbSts(String pcbSts) {
        this.pcbSts = pcbSts;
    }

    @Override
    public String toString() {
        return "PolhClmBenModel{" + "pcbSysid=" + pcbSysid + ", pcbPolhSysid=" + pcbPolhSysid + ", pcbPciSysid=" + pcbPciSysid + ", pcbDesc=" + pcbDesc + ", pcbTraxTyp=" + pcbTraxTyp + ", pcbCurr=" + pcbCurr + ", pcbAmt=" + pcbAmt + ", pcbAmtDrBc=" + pcbAmtDrBc + ", pcbAmtDrFc=" + pcbAmtDrFc + ", pcbAmtCrBc=" + pcbAmtCrBc + ", pcbAmtCrFc=" + pcbAmtCrFc + ", pcbRemark=" + pcbRemark + ", pcbSysdt=" + pcbSysdt + ", pcbSts=" + pcbSts + '}';
    }
    
    
}
