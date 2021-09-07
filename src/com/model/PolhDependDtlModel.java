/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolhDependtDtl;
import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class PolhDependDtlModel {
    int pddSysId; 
    int pddPolhSysid;
    int pddPdtSysid;
    int pddPptSysid; 
    int pddCusSysid; 
    int pddClSysid;
    String pddClName;
    String pddCode; 
    String pddName;
    String pddGndr;
    String pddDob; 
    int pddAge;
    String pddCreUser; 
    String pddCreDt;
    String pddUpdUser;
    String pddUpdDt;
    String pddTitle; 
    String pddMobile; 
    BigDecimal pddPrem;
    BigDecimal pddSa;
    String pddSts;

    public PolhDependDtlModel() {
    }
    
    public PolhDependDtlModel(Object[] obj) {
        this.pddSysId = (Integer)obj[0];
    }
    
    public PolhDependDtlModel(PolhDependtDtl pdtail) {
        this.pddSysId = pdtail.getPddSysId();
        this.pddPolhSysid = pdtail.getPddPolhSysid();
        this.pddPdtSysid = pdtail.getPddPdtSysid();
        this.pddPptSysid = pdtail.getPddPptSysid();
        this.pddCusSysid = pdtail.getPddCusSysid();
        this.pddClSysid = pdtail.getPddClSysid();
        this.pddClName = pdtail.getPddClName();
        this.pddCode = pdtail.getPddCode();
        this.pddName = pdtail.getPddName();
        this.pddGndr = pdtail.getPddGndr();
        this.pddDob = pdtail.getPddDob();
        this.pddAge = pdtail.getPddAge();
        this.pddCreUser = pdtail.getPddCreUser();
        this.pddCreDt = pdtail.getPddCreDt();
        this.pddUpdUser = pdtail.getPddUpdUser();
        this.pddUpdDt = pdtail.getPddUpdDt();
        this.pddTitle = pdtail.getPddTitle();
        this.pddMobile = pdtail.getPddMobile();
        this.pddPrem = pdtail.getPddPrem();
        this.pddSa = pdtail.getPddSa();
        this.pddSts = pdtail.getPddSts();
    }
    
    public PolhDependDtlModel(AosDependTbModel pdtail) {
        this.pddSysId = 0;
        this.pddPolhSysid = 0;
        this.pddPdtSysid = 0;
        this.pddPptSysid = 0;
        this.pddCusSysid = 0;
        this.pddClSysid = 0;
        this.pddClName = "";
        this.pddCode = "";
        this.pddName = pdtail.getProductMainDepndName();
        this.pddGndr = pdtail.getProductMainDepndGender();
        this.pddDob = pdtail.getProductMainDepndDob();
        this.pddAge = 0;
        this.pddCreUser = "";
        this.pddCreDt = pdtail.getProductMainDepndInputdate();
        this.pddUpdUser = null;
        this.pddUpdDt = null;
        this.pddTitle = null;
        this.pddMobile = pdtail.getProductMainDepndMobileNo();
        this.pddPrem = BigDecimal.ZERO;
        this.pddSa = pdtail.getProductMainDepndSumassured();
        this.pddSts = "N";
    }
    
    public PolhDependDtlModel(EazyappDependTbModel pdtail) {
        this.pddSysId = 0;
        this.pddPolhSysid = 0;
        this.pddPdtSysid = 0;
        this.pddPptSysid = 0;
        this.pddCusSysid = 0;
        this.pddClSysid = 0;
        this.pddClName = "";
        this.pddCode = "";
        this.pddName = pdtail.getProductMainDepndName();
        this.pddGndr = pdtail.getProductMainDepndGender();
        this.pddDob = pdtail.getProductMainDepndDob();
        this.pddAge = 0;
        this.pddCreUser = "";
        this.pddCreDt = pdtail.getProductMainDepndInputdate();
        this.pddUpdUser = null;
        this.pddUpdDt = null;
        this.pddTitle = null;
        this.pddMobile = pdtail.getProductMainDepndMobileNo();
        this.pddPrem = pdtail.getProductMainDepndPremium();
        this.pddSa = pdtail.getProductMainDepndSumassured();
        this.pddSts = "N";
    }
    
    public PolhDependDtlModel(EazylifeDependTbModel pdtail) {
        this.pddSysId = 0;
        this.pddPolhSysid = 0;
        this.pddPdtSysid = 0;
        this.pddPptSysid = 0;
        this.pddCusSysid = 0;
        this.pddClSysid = 0;
        this.pddClName = "";
        this.pddCode = "";
        this.pddName = pdtail.getProductMainDepndName();
        this.pddGndr = pdtail.getProductMainDepndGender();
        this.pddDob = pdtail.getProductMainDepndDob();
        this.pddAge = 0;
        this.pddCreUser = "";
        this.pddCreDt = pdtail.getProductMainDepndInputdate();
        this.pddUpdUser = null;
        this.pddUpdDt = null;
        this.pddTitle = null;
        this.pddMobile = pdtail.getProductMainDepndMobileNo();
        this.pddPrem = pdtail.getProductMainDepndPremium();
        this.pddSa = pdtail.getProductMainDepndSumassured();
        this.pddSts = "N";
    }

    public int getPddSysId() {
        return pddSysId;
    }

    public void setPddSysId(int pddSysId) {
        this.pddSysId = pddSysId;
    }

    public int getPddPolhSysid() {
        return pddPolhSysid;
    }

    public void setPddPolhSysid(int pddPolhSysid) {
        this.pddPolhSysid = pddPolhSysid;
    }

    public int getPddPdtSysid() {
        return pddPdtSysid;
    }

    public void setPddPdtSysid(int pddPdtSysid) {
        this.pddPdtSysid = pddPdtSysid;
    }

    public int getPddPptSysid() {
        return pddPptSysid;
    }

    public void setPddPptSysid(int pddPptSysid) {
        this.pddPptSysid = pddPptSysid;
    }

    public int getPddCusSysid() {
        return pddCusSysid;
    }

    public void setPddCusSysid(int pddCusSysid) {
        this.pddCusSysid = pddCusSysid;
    }

    public int getPddClSysid() {
        return pddClSysid;
    }

    public void setPddClSysid(int pddClSysid) {
        this.pddClSysid = pddClSysid;
    }

    public String getPddClName() {
        return pddClName;
    }

    public void setPddClName(String pddClName) {
        this.pddClName = pddClName;
    }

    public String getPddCode() {
        return pddCode;
    }

    public void setPddCode(String pddCode) {
        this.pddCode = pddCode;
    }

    public String getPddName() {
        return pddName;
    }

    public void setPddName(String pddName) {
        this.pddName = pddName;
    }

    public String getPddGndr() {
        return pddGndr;
    }

    public void setPddGndr(String pddGndr) {
        this.pddGndr = pddGndr;
    }

    public String getPddDob() {
        return pddDob;
    }

    public void setPddDob(String pddDob) {
        this.pddDob = pddDob;
    }

    public int getPddAge() {
        return pddAge;
    }

    public void setPddAge(int pddAge) {
        this.pddAge = pddAge;
    }

    public String getPddCreUser() {
        return pddCreUser;
    }

    public void setPddCreUser(String pddCreUser) {
        this.pddCreUser = pddCreUser;
    }

    public String getPddCreDt() {
        return pddCreDt;
    }

    public void setPddCreDt(String pddCreDt) {
        this.pddCreDt = pddCreDt;
    }

    public String getPddUpdUser() {
        return pddUpdUser;
    }

    public void setPddUpdUser(String pddUpdUser) {
        this.pddUpdUser = pddUpdUser;
    }

    public String getPddUpdDt() {
        return pddUpdDt;
    }

    public void setPddUpdDt(String pddUpdDt) {
        this.pddUpdDt = pddUpdDt;
    }

    public String getPddTitle() {
        return pddTitle;
    }

    public void setPddTitle(String pddTitle) {
        this.pddTitle = pddTitle;
    }

    public String getPddMobile() {
        return pddMobile;
    }

    public void setPddMobile(String pddMobile) {
        this.pddMobile = pddMobile;
    }

    public BigDecimal getPddPrem() {
        return pddPrem;
    }

    public void setPddPrem(BigDecimal pddPrem) {
        this.pddPrem = pddPrem;
    }

    public BigDecimal getPddSa() {
        return pddSa;
    }

    public void setPddSa(BigDecimal pddSa) {
        this.pddSa = pddSa;
    }

    public String getPddSts() {
        return pddSts;
    }

    public void setPddSts(String pddSts) {
        this.pddSts = pddSts;
    }

    @Override
    public String toString() {
        return "PolhDependDtlModel{" + "pddSysId=" + pddSysId + ", pddPolhSysid=" + pddPolhSysid + ", pddPdtSysid=" + pddPdtSysid + ", pddPptSysid=" + pddPptSysid + ", pddCusSysid=" + pddCusSysid + ", pddClSysid=" + pddClSysid + ", pddClName=" + pddClName + ", pddCode=" + pddCode + ", pddName=" + pddName + ", pddGndr=" + pddGndr + ", pddDob=" + pddDob + ", pddAge=" + pddAge + ", pddCreUser=" + pddCreUser + ", pddCreDt=" + pddCreDt + ", pddUpdUser=" + pddUpdUser + ", pddUpdDt=" + pddUpdDt + ", pddTitle=" + pddTitle + ", pddMobile=" + pddMobile + ", pddPrem=" + pddPrem + ", pddSa=" + pddSa + ", pddSts=" + pddSts + '}';
    }
    
    
}
