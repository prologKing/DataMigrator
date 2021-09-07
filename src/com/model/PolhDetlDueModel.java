/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolhDetlDue;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class PolhDetlDueModel {

    private Integer dueSysId;
    private Integer duePolhExtNum;
    private String dueBprod;
    private Integer duePdtSysid;
    private String duePolNum;
    private String dueRefNum;
    private Date dueDt;
    private BigDecimal dueAmtBc;
    private String dueCurr;
    private String dueAcctBillYn;
    private Date dueAcctBillDt;
    private String dueDuePeriod;
    private String dueSettledYn;
    private Date dueSettledDt;
    private BigDecimal dueSettledAmtBc;
    private Integer dueSrno;
    private String dueFreq;
    private String dueBatchId;
    private Date dueBatchDt;
    private BigDecimal dueRiPremBc;
    private Date dueLapseDt;
    private String dueOff;
    private String dueOldNum;
    private Date dueAltDt;
    private BigDecimal dueDiscBc;
    private BigDecimal dueLoadBc;
    private BigDecimal dueFeesBc;
    private BigDecimal dueExtraPremBc;
    private BigDecimal dueInvestPremBc;
    private BigDecimal dueModlPremBc;
    private String dueCreUserBy;
    private Date dueCreDt;
    private String dueUpdUserBy;
    private Date dueUpdDt;
    private Date dueAprvDt;
    private BigDecimal dueCommPremBc;
    private Integer dueCommCalSts;
    private Date dueCommCalDt;
    private String duePolSts;
    private Integer duePolYr;
    private String dueBussSrc;

    public PolhDetlDueModel() {
    }

    public PolhDetlDueModel(PolhDetlDue pdd) {
        this.dueSysId = pdd.getDueSysId();
        this.duePolhExtNum = pdd.getDuePolhExtNum();
        this.dueBprod = pdd.getDueBprod();
        this.duePdtSysid = pdd.getDuePdtSysid();
        this.duePolNum = pdd.getDuePolNum();
        this.dueRefNum = pdd.getDueRefNum();
        this.dueDt = pdd.getDueDt();
        this.dueAmtBc = pdd.getDueAmtBc();
        this.dueCurr = pdd.getDueCurr();
        this.dueAcctBillYn = pdd.getDueAcctBillYn();
        this.dueAcctBillDt = pdd.getDueAcctBillDt();
        this.dueDuePeriod = pdd.getDueDuePeriod();
        this.dueSettledYn = pdd.getDueSettledYn();
        this.dueSettledDt = pdd.getDueSettledDt();
        this.dueSettledAmtBc = pdd.getDueSettledAmtBc();
        this.dueSrno = pdd.getDueSrno();
        this.dueFreq = pdd.getDueFreq();
        this.dueBatchId = pdd.getDueBatchId();
        this.dueBatchDt = pdd.getDueBatchDt();
        this.dueRiPremBc = pdd.getDueRiPremBc();
        this.dueLapseDt = pdd.getDueLapseDt();
        this.dueOff = pdd.getDueOff();
        this.dueOldNum = pdd.getDueOldNum();
        this.dueAltDt = pdd.getDueAltDt();
        this.dueDiscBc = pdd.getDueDiscBc();
        this.dueLoadBc = pdd.getDueLoadBc();
        this.dueFeesBc = pdd.getDueFeesBc();
        this.dueExtraPremBc = pdd.getDueExtraPremBc();
        this.dueInvestPremBc = pdd.getDueInvestPremBc();
        this.dueModlPremBc = pdd.getDueModlPremBc();
        this.dueCreUserBy = pdd.getDueCreUserBy();
        this.dueCreDt = pdd.getDueCreDt();
        this.dueUpdUserBy = pdd.getDueUpdUserBy();
        this.dueUpdDt = pdd.getDueUpdDt();
        this.dueAprvDt = pdd.getDueAprvDt();
        this.dueCommPremBc = pdd.getDueCommPremBc();
        this.dueCommCalSts = pdd.getDueCommCalSts();
        this.dueCommCalDt = pdd.getDueCommCalDt();
        this.duePolSts = pdd.getDuePolSts();
        this.duePolYr = pdd.getDuePolYr();
        this.dueBussSrc = pdd.getDueBussSrc();
    }

    public Integer getDueSysId() {
        return dueSysId;
    }

    public void setDueSysId(Integer dueSysId) {
        this.dueSysId = dueSysId;
    }

    public Integer getDuePolhExtNum() {
        return duePolhExtNum;
    }

    public void setDuePolhExtNum(Integer duePolhExtNum) {
        this.duePolhExtNum = duePolhExtNum;
    }

    public String getDueBprod() {
        return dueBprod;
    }

    public void setDueBprod(String dueBprod) {
        this.dueBprod = dueBprod;
    }

    public Integer getDuePdtSysid() {
        return duePdtSysid;
    }

    public void setDuePdtSysid(Integer duePdtSysid) {
        this.duePdtSysid = duePdtSysid;
    }

    public String getDuePolNum() {
        return duePolNum;
    }

    public void setDuePolNum(String duePolNum) {
        this.duePolNum = duePolNum;
    }

    public String getDueRefNum() {
        return dueRefNum;
    }

    public void setDueRefNum(String dueRefNum) {
        this.dueRefNum = dueRefNum;
    }

    public Date getDueDt() {
        return dueDt;
    }

    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
    }

    public BigDecimal getDueAmtBc() {
        return dueAmtBc;
    }

    public void setDueAmtBc(BigDecimal dueAmtBc) {
        this.dueAmtBc = dueAmtBc;
    }

    public String getDueCurr() {
        return dueCurr;
    }

    public void setDueCurr(String dueCurr) {
        this.dueCurr = dueCurr;
    }

    public String getDueAcctBillYn() {
        return dueAcctBillYn;
    }

    public void setDueAcctBillYn(String dueAcctBillYn) {
        this.dueAcctBillYn = dueAcctBillYn;
    }

    public Date getDueAcctBillDt() {
        return dueAcctBillDt;
    }

    public void setDueAcctBillDt(Date dueAcctBillDt) {
        this.dueAcctBillDt = dueAcctBillDt;
    }

    public String getDueDuePeriod() {
        return dueDuePeriod;
    }

    public void setDueDuePeriod(String dueDuePeriod) {
        this.dueDuePeriod = dueDuePeriod;
    }

    public String getDueSettledYn() {
        return dueSettledYn;
    }

    public void setDueSettledYn(String dueSettledYn) {
        this.dueSettledYn = dueSettledYn;
    }

    public Date getDueSettledDt() {
        return dueSettledDt;
    }

    public void setDueSettledDt(Date dueSettledDt) {
        this.dueSettledDt = dueSettledDt;
    }

    public BigDecimal getDueSettledAmtBc() {
        return dueSettledAmtBc;
    }

    public void setDueSettledAmtBc(BigDecimal dueSettledAmtBc) {
        this.dueSettledAmtBc = dueSettledAmtBc;
    }

    public Integer getDueSrno() {
        return dueSrno;
    }

    public void setDueSrno(Integer dueSrno) {
        this.dueSrno = dueSrno;
    }

    public String getDueFreq() {
        return dueFreq;
    }

    public void setDueFreq(String dueFreq) {
        this.dueFreq = dueFreq;
    }

    public String getDueBatchId() {
        return dueBatchId;
    }

    public void setDueBatchId(String dueBatchId) {
        this.dueBatchId = dueBatchId;
    }

    public Date getDueBatchDt() {
        return dueBatchDt;
    }

    public void setDueBatchDt(Date dueBatchDt) {
        this.dueBatchDt = dueBatchDt;
    }

    public BigDecimal getDueRiPremBc() {
        return dueRiPremBc;
    }

    public void setDueRiPremBc(BigDecimal dueRiPremBc) {
        this.dueRiPremBc = dueRiPremBc;
    }

    public Date getDueLapseDt() {
        return dueLapseDt;
    }

    public void setDueLapseDt(Date dueLapseDt) {
        this.dueLapseDt = dueLapseDt;
    }

    public String getDueOff() {
        return dueOff;
    }

    public void setDueOff(String dueOff) {
        this.dueOff = dueOff;
    }

    public String getDueOldNum() {
        return dueOldNum;
    }

    public void setDueOldNum(String dueOldNum) {
        this.dueOldNum = dueOldNum;
    }

    public Date getDueAltDt() {
        return dueAltDt;
    }

    public void setDueAltDt(Date dueAltDt) {
        this.dueAltDt = dueAltDt;
    }

    public BigDecimal getDueDiscBc() {
        return dueDiscBc;
    }

    public void setDueDiscBc(BigDecimal dueDiscBc) {
        this.dueDiscBc = dueDiscBc;
    }

    public BigDecimal getDueLoadBc() {
        return dueLoadBc;
    }

    public void setDueLoadBc(BigDecimal dueLoadBc) {
        this.dueLoadBc = dueLoadBc;
    }

    public BigDecimal getDueFeesBc() {
        return dueFeesBc;
    }

    public void setDueFeesBc(BigDecimal dueFeesBc) {
        this.dueFeesBc = dueFeesBc;
    }

    public BigDecimal getDueExtraPremBc() {
        return dueExtraPremBc;
    }

    public void setDueExtraPremBc(BigDecimal dueExtraPremBc) {
        this.dueExtraPremBc = dueExtraPremBc;
    }

    public BigDecimal getDueInvestPremBc() {
        return dueInvestPremBc;
    }

    public void setDueInvestPremBc(BigDecimal dueInvestPremBc) {
        this.dueInvestPremBc = dueInvestPremBc;
    }

    public BigDecimal getDueModlPremBc() {
        return dueModlPremBc;
    }

    public void setDueModlPremBc(BigDecimal dueModlPremBc) {
        this.dueModlPremBc = dueModlPremBc;
    }

    public String getDueCreUserBy() {
        return dueCreUserBy;
    }

    public void setDueCreUserBy(String dueCreUserBy) {
        this.dueCreUserBy = dueCreUserBy;
    }

    public Date getDueCreDt() {
        return dueCreDt;
    }

    public void setDueCreDt(Date dueCreDt) {
        this.dueCreDt = dueCreDt;
    }

    public String getDueUpdUserBy() {
        return dueUpdUserBy;
    }

    public void setDueUpdUserBy(String dueUpdUserBy) {
        this.dueUpdUserBy = dueUpdUserBy;
    }

    public Date getDueUpdDt() {
        return dueUpdDt;
    }

    public void setDueUpdDt(Date dueUpdDt) {
        this.dueUpdDt = dueUpdDt;
    }

    public Date getDueAprvDt() {
        return dueAprvDt;
    }

    public void setDueAprvDt(Date dueAprvDt) {
        this.dueAprvDt = dueAprvDt;
    }

    public BigDecimal getDueCommPremBc() {
        return dueCommPremBc;
    }

    public void setDueCommPremBc(BigDecimal dueCommPremBc) {
        this.dueCommPremBc = dueCommPremBc;
    }

    public Integer getDueCommCalSts() {
        return dueCommCalSts;
    }

    public void setDueCommCalSts(Integer dueCommCalSts) {
        this.dueCommCalSts = dueCommCalSts;
    }

    public Date getDueCommCalDt() {
        return dueCommCalDt;
    }

    public void setDueCommCalDt(Date dueCommCalDt) {
        this.dueCommCalDt = dueCommCalDt;
    }

    public String getDuePolSts() {
        return duePolSts;
    }

    public void setDuePolSts(String duePolSts) {
        this.duePolSts = duePolSts;
    }

    public Integer getDuePolYr() {
        return duePolYr;
    }

    public void setDuePolYr(Integer duePolYr) {
        this.duePolYr = duePolYr;
    }

    public String getDueBussSrc() {
        return dueBussSrc;
    }

    public void setDueBussSrc(String dueBussSrc) {
        this.dueBussSrc = dueBussSrc;
    }
    
    

}
