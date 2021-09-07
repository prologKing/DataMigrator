/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhDetlDueModel;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "polh_detl_due")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhDetlDue.findAll", query = "SELECT p FROM PolhDetlDue p"),
    @NamedQuery(name = "PolhDetlDue.findByDueSysId", query = "SELECT p FROM PolhDetlDue p WHERE p.dueSysId = :dueSysId"),
    @NamedQuery(name = "PolhDetlDue.findByDuePolhExtNum", query = "SELECT p FROM PolhDetlDue p WHERE p.duePolhExtNum = :duePolhExtNum"),
    @NamedQuery(name = "PolhDetlDue.findByDueBprod", query = "SELECT p FROM PolhDetlDue p WHERE p.dueBprod = :dueBprod"),
    @NamedQuery(name = "PolhDetlDue.findByDuePdtSysid", query = "SELECT p FROM PolhDetlDue p WHERE p.duePdtSysid = :duePdtSysid"),
    @NamedQuery(name = "PolhDetlDue.findByDuePolNum", query = "SELECT p FROM PolhDetlDue p WHERE p.duePolNum = :duePolNum"),
    @NamedQuery(name = "PolhDetlDue.findByDueRefNum", query = "SELECT p FROM PolhDetlDue p WHERE p.dueRefNum = :dueRefNum"),
    @NamedQuery(name = "PolhDetlDue.findByDueDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueDt = :dueDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueAmtBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueAmtBc = :dueAmtBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueCurr", query = "SELECT p FROM PolhDetlDue p WHERE p.dueCurr = :dueCurr"),
    @NamedQuery(name = "PolhDetlDue.findByDueAcctBillYn", query = "SELECT p FROM PolhDetlDue p WHERE p.dueAcctBillYn = :dueAcctBillYn"),
    @NamedQuery(name = "PolhDetlDue.findByDueAcctBillDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueAcctBillDt = :dueAcctBillDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueDuePeriod", query = "SELECT p FROM PolhDetlDue p WHERE p.dueDuePeriod = :dueDuePeriod"),
    @NamedQuery(name = "PolhDetlDue.findByDueSettledYn", query = "SELECT p FROM PolhDetlDue p WHERE p.dueSettledYn = :dueSettledYn"),
    @NamedQuery(name = "PolhDetlDue.findByDueSettledDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueSettledDt = :dueSettledDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueSettledAmtBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueSettledAmtBc = :dueSettledAmtBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueSrno", query = "SELECT p FROM PolhDetlDue p WHERE p.dueSrno = :dueSrno"),
    @NamedQuery(name = "PolhDetlDue.findByDueFreq", query = "SELECT p FROM PolhDetlDue p WHERE p.dueFreq = :dueFreq"),
    @NamedQuery(name = "PolhDetlDue.findByDueBatchId", query = "SELECT p FROM PolhDetlDue p WHERE p.dueBatchId = :dueBatchId"),
    @NamedQuery(name = "PolhDetlDue.findByDueBatchDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueBatchDt = :dueBatchDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueRiPremBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueRiPremBc = :dueRiPremBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueLapseDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueLapseDt = :dueLapseDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueOff", query = "SELECT p FROM PolhDetlDue p WHERE p.dueOff = :dueOff"),
    @NamedQuery(name = "PolhDetlDue.findByDueOldNum", query = "SELECT p FROM PolhDetlDue p WHERE p.dueOldNum = :dueOldNum"),
    @NamedQuery(name = "PolhDetlDue.findByDueAltDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueAltDt = :dueAltDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueDiscBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueDiscBc = :dueDiscBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueLoadBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueLoadBc = :dueLoadBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueFeesBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueFeesBc = :dueFeesBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueExtraPremBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueExtraPremBc = :dueExtraPremBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueInvestPremBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueInvestPremBc = :dueInvestPremBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueModlPremBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueModlPremBc = :dueModlPremBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueCreUserBy", query = "SELECT p FROM PolhDetlDue p WHERE p.dueCreUserBy = :dueCreUserBy"),
    @NamedQuery(name = "PolhDetlDue.findByDueCreDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueCreDt = :dueCreDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueUpdUserBy", query = "SELECT p FROM PolhDetlDue p WHERE p.dueUpdUserBy = :dueUpdUserBy"),
    @NamedQuery(name = "PolhDetlDue.findByDueUpdDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueUpdDt = :dueUpdDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueAprvDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueAprvDt = :dueAprvDt"),
    @NamedQuery(name = "PolhDetlDue.findByDueCommPremBc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueCommPremBc = :dueCommPremBc"),
    @NamedQuery(name = "PolhDetlDue.findByDueCommCalSts", query = "SELECT p FROM PolhDetlDue p WHERE p.dueCommCalSts = :dueCommCalSts"),
    @NamedQuery(name = "PolhDetlDue.findByDueCommCalDt", query = "SELECT p FROM PolhDetlDue p WHERE p.dueCommCalDt = :dueCommCalDt"),
    @NamedQuery(name = "PolhDetlDue.findByDuePolSts", query = "SELECT p FROM PolhDetlDue p WHERE p.duePolSts = :duePolSts"),
    @NamedQuery(name = "PolhDetlDue.findByDuePolYr", query = "SELECT p FROM PolhDetlDue p WHERE p.duePolYr = :duePolYr"),
    @NamedQuery(name = "PolhDetlDue.findByDueBussSrc", query = "SELECT p FROM PolhDetlDue p WHERE p.dueBussSrc = :dueBussSrc")})
public class PolhDetlDue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DUE_SYS_ID")
    private Integer dueSysId;
    @Column(name = "DUE_POLH_EXT_NUM")
    private Integer duePolhExtNum;
    @Size(max = 15)
    @Column(name = "DUE_BPROD")
    private String dueBprod;
    @Column(name = "DUE_PDT_SYSID")
    private Integer duePdtSysid;
    @Size(max = 50)
    @Column(name = "DUE_POL_NUM")
    private String duePolNum;
    @Size(max = 50)
    @Column(name = "DUE_REF_NUM")
    private String dueRefNum;
    @Column(name = "DUE_DT")
    @Temporal(TemporalType.DATE)
    private Date dueDt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DUE_AMT_BC")
    private BigDecimal dueAmtBc;
    @Size(max = 15)
    @Column(name = "DUE_CURR")
    private String dueCurr;
    @Size(max = 5)
    @Column(name = "DUE_ACCT_BILL_YN")
    private String dueAcctBillYn;
    @Column(name = "DUE_ACCT_BILL_DT")
    @Temporal(TemporalType.DATE)
    private Date dueAcctBillDt;
    @Size(max = 10)
    @Column(name = "DUE_DUE_PERIOD")
    private String dueDuePeriod;
    @Size(max = 5)
    @Column(name = "DUE_SETTLED_YN")
    private String dueSettledYn;
    @Column(name = "DUE_SETTLED_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueSettledDt;
    @Column(name = "DUE_SETTLED_AMT_BC")
    private BigDecimal dueSettledAmtBc;
    @Column(name = "DUE_SRNO")
    private Integer dueSrno;
    @Size(max = 15)
    @Column(name = "DUE_FREQ")
    private String dueFreq;
    @Size(max = 25)
    @Column(name = "DUE_BATCH_ID")
    private String dueBatchId;
    @Column(name = "DUE_BATCH_DT")
    @Temporal(TemporalType.DATE)
    private Date dueBatchDt;
    @Column(name = "DUE_RI_PREM_BC")
    private BigDecimal dueRiPremBc;
    @Column(name = "DUE_LAPSE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueLapseDt;
    @Size(max = 10)
    @Column(name = "DUE_OFF")
    private String dueOff;
    @Size(max = 50)
    @Column(name = "DUE_OLD_NUM")
    private String dueOldNum;
    @Column(name = "DUE_ALT_DT")
    @Temporal(TemporalType.DATE)
    private Date dueAltDt;
    @Column(name = "DUE_DISC_BC")
    private BigDecimal dueDiscBc;
    @Column(name = "DUE_LOAD_BC")
    private BigDecimal dueLoadBc;
    @Column(name = "DUE_FEES_BC")
    private BigDecimal dueFeesBc;
    @Column(name = "DUE_EXTRA_PREM_BC")
    private BigDecimal dueExtraPremBc;
    @Column(name = "DUE_INVEST_PREM_BC")
    private BigDecimal dueInvestPremBc;
    @Column(name = "DUE_MODL_PREM_BC")
    private BigDecimal dueModlPremBc;
    @Size(max = 50)
    @Column(name = "DUE_CRE_USER_BY")
    private String dueCreUserBy;
    @Column(name = "DUE_CRE_DT")
    @Temporal(TemporalType.DATE)
    private Date dueCreDt;
    @Size(max = 50)
    @Column(name = "DUE_UPD_USER_BY")
    private String dueUpdUserBy;
    @Column(name = "DUE_UPD_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueUpdDt;
    @Column(name = "DUE_APRV_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueAprvDt;
    @Column(name = "DUE_COMM_PREM_BC")
    private BigDecimal dueCommPremBc;
    @Column(name = "DUE_COMM_CAL_STS")
    private Integer dueCommCalSts;
    @Column(name = "DUE_COMM_CAL_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueCommCalDt;
    @Size(max = 5)
    @Column(name = "DUE_POL_STS")
    private String duePolSts;
    @Column(name = "DUE_POL_YR")
    private Integer duePolYr;
    @Size(max = 10)
    @Column(name = "DUE_BUSS_SRC")
    private String dueBussSrc;

    public PolhDetlDue() {
    }

    public PolhDetlDue(Integer dueSysId, Integer duePolhExtNum, String dueBprod, Integer duePdtSysid, String duePolNum, String dueRefNum, Date dueDt, BigDecimal dueAmtBc, String dueCurr, String dueAcctBillYn, Date dueAcctBillDt, String dueDuePeriod, String dueSettledYn, Date dueSettledDt, BigDecimal dueSettledAmtBc, Integer dueSrno, String dueFreq, String dueBatchId, Date dueBatchDt, BigDecimal dueRiPremBc, Date dueLapseDt, String dueOff, String dueOldNum, Date dueAltDt, BigDecimal dueDiscBc, BigDecimal dueLoadBc, BigDecimal dueFeesBc, BigDecimal dueExtraPremBc, BigDecimal dueInvestPremBc, BigDecimal dueModlPremBc, String dueCreUserBy, Date dueCreDt, String dueUpdUserBy, Date dueUpdDt, Date dueAprvDt, BigDecimal dueCommPremBc, Integer dueCommCalSts, Date dueCommCalDt, String duePolSts, Integer duePolYr, String dueBussSrc) {
        this.dueSysId = dueSysId;
        this.duePolhExtNum = duePolhExtNum;
        this.dueBprod = dueBprod;
        this.duePdtSysid = duePdtSysid;
        this.duePolNum = duePolNum;
        this.dueRefNum = dueRefNum;
        this.dueDt = dueDt;
        this.dueAmtBc = dueAmtBc;
        this.dueCurr = dueCurr;
        this.dueAcctBillYn = dueAcctBillYn;
        this.dueAcctBillDt = dueAcctBillDt;
        this.dueDuePeriod = dueDuePeriod;
        this.dueSettledYn = dueSettledYn;
        this.dueSettledDt = dueSettledDt;
        this.dueSettledAmtBc = dueSettledAmtBc;
        this.dueSrno = dueSrno;
        this.dueFreq = dueFreq;
        this.dueBatchId = dueBatchId;
        this.dueBatchDt = dueBatchDt;
        this.dueRiPremBc = dueRiPremBc;
        this.dueLapseDt = dueLapseDt;
        this.dueOff = dueOff;
        this.dueOldNum = dueOldNum;
        this.dueAltDt = dueAltDt;
        this.dueDiscBc = dueDiscBc;
        this.dueLoadBc = dueLoadBc;
        this.dueFeesBc = dueFeesBc;
        this.dueExtraPremBc = dueExtraPremBc;
        this.dueInvestPremBc = dueInvestPremBc;
        this.dueModlPremBc = dueModlPremBc;
        this.dueCreUserBy = dueCreUserBy;
        this.dueCreDt = dueCreDt;
        this.dueUpdUserBy = dueUpdUserBy;
        this.dueUpdDt = dueUpdDt;
        this.dueAprvDt = dueAprvDt;
        this.dueCommPremBc = dueCommPremBc;
        this.dueCommCalSts = dueCommCalSts;
        this.dueCommCalDt = dueCommCalDt;
        this.duePolSts = duePolSts;
        this.duePolYr = duePolYr;
        this.dueBussSrc = dueBussSrc;
    }
    
    

    public PolhDetlDue(Integer dueSysId) {
        this.dueSysId = dueSysId;
    }
    
    public PolhDetlDue(PolhDetlDueModel pdd) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dueSysId != null ? dueSysId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhDetlDue)) {
            return false;
        }
        PolhDetlDue other = (PolhDetlDue) object;
        if ((this.dueSysId == null && other.dueSysId != null) || (this.dueSysId != null && !this.dueSysId.equals(other.dueSysId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhDetlDue[ dueSysId=" + dueSysId + " ]";
    }
    
}
