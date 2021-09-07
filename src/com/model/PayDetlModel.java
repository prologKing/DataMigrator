/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PayDetl;


/**
 *
 * @author Developer
 */
public class PayDetlModel {
    int pymtSysId;
    int pymtExtNum; 
    int pymtPolhSysid;
    int pymtBnkId;
    int pymtBrnchId;
    int pymtPayptId;
    String pymtFreq;
    String pymtMode;
    String pymtBnk;
    String pymtBrnch;
    String pymtBbkScode;
    String pymtAccName;
    String pymtAcc;
    String pymtPayPoint;
    String pymtStaffNo;
    String pymtMomoNo;
    String pymtCreUserBy;
    String pymtCreDt;
    int pymtFreqId;
    String pymtMandateMomo;
    String pymtMandateBkCode;
    String pymtDrawerBkCode;
    String pymtDedtStdt;
    String pymtPic;
    String pymtMandateCheck;
    String pymtMandateSts;

    public PayDetlModel() {
    }
    
    
    public PayDetlModel(PayDetl pdail) {
        this.pymtSysId = pdail.getPymtSysId();
        this.pymtExtNum = pdail.getPymtExtNum();
        this.pymtPolhSysid = pdail.getPymtPolhSysid();
        this.pymtBnkId = pdail.getPymtBnkId();
        this.pymtBrnchId = pdail.getPymtBrnchId();
        this.pymtPayptId = pdail.getPymtPayptId();
        this.pymtFreq = pdail.getPymtFreq();
        this.pymtMode = pdail.getPymtMode();
        this.pymtBnk = pdail.getPymtBnk();
        this.pymtBrnch = pdail.getPymtBrnch();
        this.pymtBbkScode = pdail.getPymtBbkScode();
        this.pymtAccName = pdail.getPymtAccName();
        this.pymtAcc = pdail.getPymtAcc();
        this.pymtPayPoint = pdail.getPymtPayPoint();
        this.pymtStaffNo = pdail.getPymtStaffNo();
        this.pymtMomoNo = pdail.getPymtMomoNo();
        this.pymtCreUserBy = pdail.getPymtCreUserBy();
        this.pymtCreDt = pdail.getPymtCreDt();
        this.pymtFreqId = pdail.getPymtFreqId();
        this.pymtMandateMomo = pdail.getPymtMandateMomo();
        this.pymtMandateBkCode = pdail.getPymtMandateBkCode();
        this.pymtDrawerBkCode = pdail.getPymtDrawerBkCode();
        this.pymtDedtStdt = pdail.getPymtDedtStdt();
        this.pymtPic = pdail.getPymtPic();
        this.pymtMandateCheck = pdail.getPymtMandateCheck();
        this.pymtMandateSts = pdail.getPymtMandateSts();
    }

    public int getPymtSysId() {
        return pymtSysId;
    }

    public void setPymtSysId(int pymtSysId) {
        this.pymtSysId = pymtSysId;
    }

    public int getPymtExtNum() {
        return pymtExtNum;
    }

    public void setPymtExtNum(int pymtExtNum) {
        this.pymtExtNum = pymtExtNum;
    }

    public int getPymtPolhSysid() {
        return pymtPolhSysid;
    }

    public void setPymtPolhSysid(int pymtPolhSysid) {
        this.pymtPolhSysid = pymtPolhSysid;
    }

    public int getPymtBnkId() {
        return pymtBnkId;
    }

    public void setPymtBnkId(int pymtBnkId) {
        this.pymtBnkId = pymtBnkId;
    }

    public int getPymtBrnchId() {
        return pymtBrnchId;
    }

    public void setPymtBrnchId(int pymtBrnchId) {
        this.pymtBrnchId = pymtBrnchId;
    }

    public int getPymtPayptId() {
        return pymtPayptId;
    }

    public void setPymtPayptId(int pymtPayptId) {
        this.pymtPayptId = pymtPayptId;
    }

    public String getPymtFreq() {
        return pymtFreq;
    }

    public void setPymtFreq(String pymtFreq) {
        this.pymtFreq = pymtFreq;
    }

    public String getPymtMode() {
        return pymtMode;
    }

    public void setPymtMode(String pymtMode) {
        this.pymtMode = pymtMode;
    }

    public String getPymtBnk() {
        return pymtBnk;
    }

    public void setPymtBnk(String pymtBnk) {
        this.pymtBnk = pymtBnk;
    }

    public String getPymtBrnch() {
        return pymtBrnch;
    }

    public void setPymtBrnch(String pymtBrnch) {
        this.pymtBrnch = pymtBrnch;
    }

    public String getPymtBbkScode() {
        return pymtBbkScode;
    }

    public void setPymtBbkScode(String pymtBbkScode) {
        this.pymtBbkScode = pymtBbkScode;
    }

    public String getPymtAccName() {
        return pymtAccName;
    }

    public void setPymtAccName(String pymtAccName) {
        this.pymtAccName = pymtAccName;
    }

    public String getPymtAcc() {
        return pymtAcc;
    }

    public void setPymtAcc(String pymtAcc) {
        this.pymtAcc = pymtAcc;
    }

    public String getPymtPayPoint() {
        return pymtPayPoint;
    }

    public void setPymtPayPoint(String pymtPayPoint) {
        this.pymtPayPoint = pymtPayPoint;
    }

    public String getPymtStaffNo() {
        return pymtStaffNo;
    }

    public void setPymtStaffNo(String pymtStaffNo) {
        this.pymtStaffNo = pymtStaffNo;
    }

    public String getPymtMomoNo() {
        return pymtMomoNo;
    }

    public void setPymtMomoNo(String pymtMomoNo) {
        this.pymtMomoNo = pymtMomoNo;
    }

    public String getPymtCreUserBy() {
        return pymtCreUserBy;
    }

    public void setPymtCreUserBy(String pymtCreUserBy) {
        this.pymtCreUserBy = pymtCreUserBy;
    }

    public String getPymtCreDt() {
        return pymtCreDt;
    }

    public void setPymtCreDt(String pymtCreDt) {
        this.pymtCreDt = pymtCreDt;
    }

    public int getPymtFreqId() {
        return pymtFreqId;
    }

    public void setPymtFreqId(int pymtFreqId) {
        this.pymtFreqId = pymtFreqId;
    }

    public String getPymtMandateMomo() {
        return pymtMandateMomo;
    }

    public void setPymtMandateMomo(String pymtMandateMomo) {
        this.pymtMandateMomo = pymtMandateMomo;
    }

    public String getPymtMandateBkCode() {
        return pymtMandateBkCode;
    }

    public void setPymtMandateBkCode(String pymtMandateBkCode) {
        this.pymtMandateBkCode = pymtMandateBkCode;
    }

    public String getPymtDrawerBkCode() {
        return pymtDrawerBkCode;
    }

    public void setPymtDrawerBkCode(String pymtDrawerBkCode) {
        this.pymtDrawerBkCode = pymtDrawerBkCode;
    }

    public String getPymtDedtStdt() {
        return pymtDedtStdt;
    }

    public void setPymtDedtStdt(String pymtDedtStdt) {
        this.pymtDedtStdt = pymtDedtStdt;
    }

    public String getPymtPic() {
        return pymtPic;
    }

    public void setPymtPic(String pymtPic) {
        this.pymtPic = pymtPic;
    }

    public String getPymtMandateCheck() {
        return pymtMandateCheck;
    }

    public void setPymtMandateCheck(String pymtMandateCheck) {
        this.pymtMandateCheck = pymtMandateCheck;
    }

    public String getPymtMandateSts() {
        return pymtMandateSts;
    }

    public void setPymtMandateSts(String pymtMandateSts) {
        this.pymtMandateSts = pymtMandateSts;
    }

    @Override
    public String toString() {
        return "PayDetlModel{" + "pymtSysId=" + pymtSysId + ", pymtExtNum=" + pymtExtNum + ", pymtPolhSysid=" + pymtPolhSysid + ", pymtBnkId=" + pymtBnkId + ", pymtBrnchId=" + pymtBrnchId + ", pymtPayptId=" + pymtPayptId + ", pymtFreq=" + pymtFreq + ", pymtMode=" + pymtMode + ", pymtBnk=" + pymtBnk + ", pymtBrnch=" + pymtBrnch + ", pymtBbkScode=" + pymtBbkScode + ", pymtAccName=" + pymtAccName + ", pymtAcc=" + pymtAcc + ", pymtPayPoint=" + pymtPayPoint + ", pymtStaffNo=" + pymtStaffNo + ", pymtMomoNo=" + pymtMomoNo + ", pymtCreUserBy=" + pymtCreUserBy + ", pymtCreDt=" + pymtCreDt + ", pymtFreqId=" + pymtFreqId + ", pymtMandateMomo=" + pymtMandateMomo + ", pymtMandateBkCode=" + pymtMandateBkCode + ", pymtDrawerBkCode=" + pymtDrawerBkCode + ", pymtDedtStdt=" + pymtDedtStdt + ", pymtPic=" + pymtPic + ", pymtMandateCheck=" + pymtMandateCheck + ", pymtMandateSts=" + pymtMandateSts + '}';
    }
    
    
}
