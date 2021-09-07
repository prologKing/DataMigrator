/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source1.entity.AosClaims;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class AosClaimsModel {

    int id;
    String polNum;
    String trnxType;
    double paidAmount;
    String logDate;
    String processDate;
    String pymtMode;
    int branch;
    String handlingOfficer;
    String telephone;
    String accNo;

    public AosClaimsModel() {
    }

    public AosClaimsModel(AosClaims aosClaims) {
        this.id = aosClaims.getId();
        this.polNum = aosClaims.getPolNum();
        this.trnxType = aosClaims.getTrnxType();
        this.paidAmount = aosClaims.getPaidAmount();
        this.pymtMode = aosClaims.getPymtMode();
        this.logDate = aosClaims.getLogDate();
        this.processDate = aosClaims.getProcessDate();
        this.branch = aosClaims.getBranch();
        this.handlingOfficer = aosClaims.getHandlingOfficer();
        this.telephone = aosClaims.getTelephone();
        this.accNo = aosClaims.getAccNo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolNum() {
        return polNum;
    }

    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }

    public String getTrnxType() {
        return trnxType;
    }

    public void setTrnxType(String trnxType) {
        this.trnxType = trnxType;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getPymtMode() {
        return pymtMode;
    }

    public void setPymtMode(String pymtMode) {
        this.pymtMode = pymtMode;
    }
    
    

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public String getHandlingOfficer() {
        return handlingOfficer;
    }

    public void setHandlingOfficer(String handlingOfficer) {
        this.handlingOfficer = handlingOfficer;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    
    

    @Override
    public String toString() {
        return "AosClaimsModel{" + "id=" + id + ", polNum=" + polNum + ", trnxType=" + trnxType + ", paidAmount=" + paidAmount + ", logDate=" + logDate + ", processDate=" + processDate + ", branch=" + branch + ", handlingOfficer=" + handlingOfficer + ", telephone=" + telephone + '}';
    }
    
    

}
