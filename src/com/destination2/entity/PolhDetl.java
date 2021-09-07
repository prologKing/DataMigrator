/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhDetlModel;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "polh_detl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhDetl.findAll", query = "SELECT p FROM PolhDetl p WHERE p.polhPrtCode NOT IN ('AHCP','AFSP')"),
    @NamedQuery(name = "PolhDetl.findByPolhSysid", query = "SELECT p FROM PolhDetl p WHERE p.polhDetlPK.polhSysid = :polhSysid"),
    @NamedQuery(name = "PolhDetl.findByPolhCusSysid", query = "SELECT p FROM PolhDetl p WHERE p.polhDetlPK.polhCusSysid = :polhCusSysid"),
    @NamedQuery(name = "PolhDetl.findByPolhPdtSysid", query = "SELECT p FROM PolhDetl p WHERE p.polhDetlPK.polhPdtSysid = :polhPdtSysid"),
    @NamedQuery(name = "PolhDetl.findByPolhPlnSysid", query = "SELECT p FROM PolhDetl p WHERE p.polhPlnSysid = :polhPlnSysid"),
    @NamedQuery(name = "PolhDetl.findByPolhUserSysid", query = "SELECT p FROM PolhDetl p WHERE p.polhDetlPK.polhUserSysid = :polhUserSysid"),
    @NamedQuery(name = "PolhDetl.findByPolhPrtCode", query = "SELECT p FROM PolhDetl p WHERE p.polhPrtCode = :polhPrtCode"),
    @NamedQuery(name = "PolhDetl.findByPolhPlnCode", query = "SELECT p FROM PolhDetl p WHERE p.polhPlnCode = :polhPlnCode"),
    @NamedQuery(name = "PolhDetl.findByPolhBussSrc", query = "SELECT p FROM PolhDetl p WHERE p.polhBussSrc = :polhBussSrc"),
    @NamedQuery(name = "PolhDetl.findByPolhOff", query = "SELECT p FROM PolhDetl p WHERE p.polhOff = :polhOff"),
    @NamedQuery(name = "PolhDetl.findByPolhNum", query = "SELECT p FROM PolhDetl p WHERE p.polhNum = :polhNum"),
    @NamedQuery(name = "PolhDetl.findByPolhRef", query = "SELECT p FROM PolhDetl p WHERE p.polhRef = :polhRef"),
    @NamedQuery(name = "PolhDetl.findByPolhOldNum1", query = "SELECT p FROM PolhDetl p WHERE p.polhOldNum1 = :polhOldNum1"),
    @NamedQuery(name = "PolhDetl.findByPolhOldNum2", query = "SELECT p FROM PolhDetl p WHERE p.polhOldNum2 = :polhOldNum2"),
    @NamedQuery(name = "PolhDetl.findByPolhOldNum3", query = "SELECT p FROM PolhDetl p WHERE p.polhOldNum3 = :polhOldNum3"),
    @NamedQuery(name = "PolhDetl.findByPolhIssuDt", query = "SELECT p FROM PolhDetl p WHERE p.polhIssuDt = :polhIssuDt"),
    @NamedQuery(name = "PolhDetl.findByPolhEntryDt", query = "SELECT p FROM PolhDetl p WHERE p.polhEntryDt = :polhEntryDt"),
    @NamedQuery(name = "PolhDetl.findByPolhAcceptDt", query = "SELECT p FROM PolhDetl p WHERE p.polhAcceptDt = :polhAcceptDt"),
    @NamedQuery(name = "PolhDetl.findByPolhStDt", query = "SELECT p FROM PolhDetl p WHERE p.polhStDt = :polhStDt"),
    @NamedQuery(name = "PolhDetl.findByPolhEndDt", query = "SELECT p FROM PolhDetl p WHERE p.polhEndDt = :polhEndDt"),
    @NamedQuery(name = "PolhDetl.findByPolhSysDt", query = "SELECT p FROM PolhDetl p WHERE p.polhSysDt = :polhSysDt"),
    @NamedQuery(name = "PolhDetl.findByPolhDudtDt", query = "SELECT p FROM PolhDetl p WHERE p.polhDudtDt = :polhDudtDt"),
    @NamedQuery(name = "PolhDetl.findByPolhTxnSts", query = "SELECT p FROM PolhDetl p WHERE p.polhTxnSts = :polhTxnSts"),
    @NamedQuery(name = "PolhDetl.findByPolhCurr", query = "SELECT p FROM PolhDetl p WHERE p.polhCurr = :polhCurr"),
    @NamedQuery(name = "PolhDetl.findByPolhUw", query = "SELECT p FROM PolhDetl p WHERE p.polhUw = :polhUw"),
    @NamedQuery(name = "PolhDetl.findByPolhCusCode", query = "SELECT p FROM PolhDetl p WHERE p.polhCusCode = :polhCusCode"),
    @NamedQuery(name = "PolhDetl.findByPolhTnr", query = "SELECT p FROM PolhDetl p WHERE p.polhTnr = :polhTnr"),
    @NamedQuery(name = "PolhDetl.findByPolhUwyr", query = "SELECT p FROM PolhDetl p WHERE p.polhUwyr = :polhUwyr"),
    @NamedQuery(name = "PolhDetl.findByPolhSiBc", query = "SELECT p FROM PolhDetl p WHERE p.polhSiBc = :polhSiBc"),
    @NamedQuery(name = "PolhDetl.findByPolhDiscBc", query = "SELECT p FROM PolhDetl p WHERE p.polhDiscBc = :polhDiscBc"),
    @NamedQuery(name = "PolhDetl.findByPolhLoadBc", query = "SELECT p FROM PolhDetl p WHERE p.polhLoadBc = :polhLoadBc"),
    @NamedQuery(name = "PolhDetl.findByPolhFeesBc", query = "SELECT p FROM PolhDetl p WHERE p.polhFeesBc = :polhFeesBc"),
    @NamedQuery(name = "PolhDetl.findByPolhAddPremBc", query = "SELECT p FROM PolhDetl p WHERE p.polhAddPremBc = :polhAddPremBc"),
    @NamedQuery(name = "PolhDetl.findByPolhInvestPremBc", query = "SELECT p FROM PolhDetl p WHERE p.polhInvestPremBc = :polhInvestPremBc"),
    @NamedQuery(name = "PolhDetl.findByPolhAprvYn", query = "SELECT p FROM PolhDetl p WHERE p.polhAprvYn = :polhAprvYn"),
    @NamedQuery(name = "PolhDetl.findByPolhAprvDt", query = "SELECT p FROM PolhDetl p WHERE p.polhAprvDt = :polhAprvDt"),
    @NamedQuery(name = "PolhDetl.findByPolhAprvBy", query = "SELECT p FROM PolhDetl p WHERE p.polhAprvBy = :polhAprvBy"),
    @NamedQuery(name = "PolhDetl.findByPolhCreUserBy", query = "SELECT p FROM PolhDetl p WHERE p.polhCreUserBy = :polhCreUserBy"),
    @NamedQuery(name = "PolhDetl.findByPolhCreDt", query = "SELECT p FROM PolhDetl p WHERE p.polhCreDt = :polhCreDt"),
    @NamedQuery(name = "PolhDetl.findByPolhUpdUserBy", query = "SELECT p FROM PolhDetl p WHERE p.polhUpdUserBy = :polhUpdUserBy"),
    @NamedQuery(name = "PolhDetl.findByPolhUpdDt", query = "SELECT p FROM PolhDetl p WHERE p.polhUpdDt = :polhUpdDt"),
    @NamedQuery(name = "PolhDetl.findByPolhGrossModPremBc", query = "SELECT p FROM PolhDetl p WHERE p.polhGrossModPremBc = :polhGrossModPremBc"),
    @NamedQuery(name = "PolhDetl.findByPolhNetModPremBc", query = "SELECT p FROM PolhDetl p WHERE p.polhNetModPremBc = :polhNetModPremBc"),
    @NamedQuery(name = "PolhDetl.findByPolhAgnt1", query = "SELECT p FROM PolhDetl p WHERE p.polhAgnt1 = :polhAgnt1"),
    @NamedQuery(name = "PolhDetl.findByPolhOvriAgnt2", query = "SELECT p FROM PolhDetl p WHERE p.polhOvriAgnt2 = :polhOvriAgnt2"),
    @NamedQuery(name = "PolhDetl.findByPolhOvriAgnt3", query = "SELECT p FROM PolhDetl p WHERE p.polhOvriAgnt3 = :polhOvriAgnt3"),
    @NamedQuery(name = "PolhDetl.findByPolhOvriAgnt4", query = "SELECT p FROM PolhDetl p WHERE p.polhOvriAgnt4 = :polhOvriAgnt4"),
    @NamedQuery(name = "PolhDetl.findByPolhOvriAgnt5", query = "SELECT p FROM PolhDetl p WHERE p.polhOvriAgnt5 = :polhOvriAgnt5"),
    @NamedQuery(name = "PolhDetl.findByPolhEscPlan", query = "SELECT p FROM PolhDetl p WHERE p.polhEscPlan = :polhEscPlan"),
    @NamedQuery(name = "PolhDetl.findByPolhEscSa", query = "SELECT p FROM PolhDetl p WHERE p.polhEscSa = :polhEscSa"),
    @NamedQuery(name = "PolhDetl.findByPolhEscPrem", query = "SELECT p FROM PolhDetl p WHERE p.polhEscPrem = :polhEscPrem"),
    @NamedQuery(name = "PolhDetl.findByPolhSuspAmt", query = "SELECT p FROM PolhDetl p WHERE p.polhSuspAmt = :polhSuspAmt"),
    @NamedQuery(name = "PolhDetl.findByPolhTotalPrem", query = "SELECT p FROM PolhDetl p WHERE p.polhTotalPrem = :polhTotalPrem"),
    @NamedQuery(name = "PolhDetl.findByPolhLpsDt", query = "SELECT p FROM PolhDetl p WHERE p.polhLpsDt = :polhLpsDt"),
    @NamedQuery(name = "PolhDetl.findByPolhAnnvDt", query = "SELECT p FROM PolhDetl p WHERE p.polhAnnvDt = :polhAnnvDt"),
    @NamedQuery(name = "PolhDetl.findByPolhSignature", query = "SELECT p FROM PolhDetl p WHERE p.polhSignature = :polhSignature"),
    @NamedQuery(name = "PolhDetl.findByPolhSts", query = "SELECT p FROM PolhDetl p WHERE p.polhSts = :polhSts"),
    @NamedQuery(name = "PolhDetl.findByPolhAlisNo", query = "SELECT p FROM PolhDetl p WHERE p.polhAlisNo = :polhAlisNo"),
    @NamedQuery(name = "PolhDetl.findByPolhPerferedMode", query = "SELECT p FROM PolhDetl p WHERE p.polhPerferedMode = :polhPerferedMode"),
    @NamedQuery(name = "PolhDetl.findByPolhNarration", query = "SELECT p FROM PolhDetl p WHERE p.polhNarration = :polhNarration"),
    @NamedQuery(name = "PolhDetl.findByPolhCaption", query = "SELECT p FROM PolhDetl p WHERE p.polhCaption = :polhCaption"),
    @NamedQuery(name = "PolhDetl.findByPolhResponse", query = "SELECT p FROM PolhDetl p WHERE p.polhResponse = :polhResponse"),
    @NamedQuery(name = "PolhDetl.findByPolhNextDue", query = "SELECT p FROM PolhDetl p WHERE p.polhNextDue = :polhNextDue"),
    @NamedQuery(name = "PolhDetl.findByPolhLastPaydt", query = "SELECT p FROM PolhDetl p WHERE p.polhLastPaydt = :polhLastPaydt"),
    @NamedQuery(name = "PolhDetl.findByPolhLastRecno", query = "SELECT p FROM PolhDetl p WHERE p.polhLastRecno = :polhLastRecno")})
public class PolhDetl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PolhDetlPK polhDetlPK;
    @Column(name = "POLH_PLN_SYSID")
    private Integer polhPlnSysid;
    @Size(max = 25)
    @Column(name = "POLH_PRT_CODE")
    private String polhPrtCode;
    @Size(max = 25)
    @Column(name = "POLH_PLN_CODE")
    private String polhPlnCode;
    @Size(max = 50)
    @Column(name = "POLH_BUSS_SRC")
    private String polhBussSrc;
    @Size(max = 50)
    @Column(name = "POLH_OFF")
    private String polhOff;
    @Size(max = 50)
    @Column(name = "POLH_NUM")
    private String polhNum;
    @Size(max = 50)
    @Column(name = "POLH_REF")
    private String polhRef;
    @Size(max = 50)
    @Column(name = "POLH_OLD_NUM1")
    private String polhOldNum1;
    @Size(max = 50)
    @Column(name = "POLH_OLD_NUM2")
    private String polhOldNum2;
    @Size(max = 50)
    @Column(name = "POLH_OLD_NUM3")
    private String polhOldNum3;
    @Column(name = "POLH_ISSU_DT")
    private String polhIssuDt;
    @Column(name = "POLH_ENTRY_DT")
    private String polhEntryDt;
    @Column(name = "POLH_ACCEPT_DT")
    private String polhAcceptDt;
    @Column(name = "POLH_ST_DT")
    private String polhStDt;
    @Column(name = "POLH_END_DT")
    private String polhEndDt;
    @Column(name = "POLH_SYS_DT")
    private String polhSysDt;
    @Size(max = 25)
    @Column(name = "POLH_DUDT_DT")
    private String polhDudtDt;
    @Size(max = 15)
    @Column(name = "POLH_TXN_STS")
    private String polhTxnSts;
    @Size(max = 15)
    @Column(name = "POLH_CURR")
    private String polhCurr;
    @Size(max = 50)
    @Column(name = "POLH_UW")
    private String polhUw;
    @Size(max = 25)
    @Column(name = "POLH_CUS_CODE")
    private String polhCusCode;
    @Column(name = "POLH_TNR")
    private Integer polhTnr;
    @Column(name = "POLH_UWYR")
    private Integer polhUwyr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POLH_SI_BC")
    private BigDecimal polhSiBc;
    @Column(name = "POLH_DISC_BC")
    private BigDecimal polhDiscBc;
    @Column(name = "POLH_LOAD_BC")
    private BigDecimal polhLoadBc;
    @Column(name = "POLH_FEES_BC")
    private BigDecimal polhFeesBc;
    @Column(name = "POLH_ADD_PREM_BC")
    private BigDecimal polhAddPremBc;
    @Column(name = "POLH_INVEST_PREM_BC")
    private BigDecimal polhInvestPremBc;
    @Size(max = 5)
    @Column(name = "POLH_APRV_YN")
    private String polhAprvYn;
    @Column(name = "POLH_APRV_DT")
    private String polhAprvDt;
    @Size(max = 50)
    @Column(name = "POLH_APRV_BY")
    private String polhAprvBy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "POLH_CRE_USER_BY")
    private String polhCreUserBy;
    @Column(name = "POLH_CRE_DT")
    private String polhCreDt;
    @Size(max = 50)
    @Column(name = "POLH_UPD_USER_BY")
    private String polhUpdUserBy;
    @Column(name = "POLH_UPD_DT")
    private String polhUpdDt;
    @Column(name = "POLH_GROSS_MOD_PREM_BC")
    private BigDecimal polhGrossModPremBc;
    @Column(name = "POLH_NET_MOD_PREM_BC")
    private BigDecimal polhNetModPremBc;
    @Size(max = 50)
    @Column(name = "POLH_AGNT1")
    private String polhAgnt1;
    @Size(max = 50)
    @Column(name = "POLH_OVRI_AGNT2")
    private String polhOvriAgnt2;
    @Size(max = 50)
    @Column(name = "POLH_OVRI_AGNT3")
    private String polhOvriAgnt3;
    @Size(max = 50)
    @Column(name = "POLH_OVRI_AGNT4")
    private String polhOvriAgnt4;
    @Size(max = 50)
    @Column(name = "POLH_OVRI_AGNT5")
    private String polhOvriAgnt5;
    @Size(max = 10)
    @Column(name = "POLH_ESC_PLAN")
    private String polhEscPlan;
    @Column(name = "POLH_ESC_SA")
    private BigDecimal polhEscSa;
    @Column(name = "POLH_ESC_PREM")
    private BigDecimal polhEscPrem;
    @Column(name = "POLH_SUSP_AMT")
    private BigDecimal polhSuspAmt;
    @Column(name = "POLH_TOTAL_PREM")
    private BigDecimal polhTotalPrem;
    @Column(name = "POLH_LPS_DT")
    private String polhLpsDt;
    @Column(name = "POLH_ANNV_DT")
    private String polhAnnvDt;
    @Size(max = 250)
    @Column(name = "POLH_SIGNATURE")
    private String polhSignature;
    @Size(max = 15)
    @Column(name = "POLH_STS")
    private String polhSts;
    @Size(max = 10)
    @Column(name = "POLH_ALIS_NO")
    private String polhAlisNo;
    @Size(max = 50)
    @Column(name = "POLH_PERFERED_MODE")
    private String polhPerferedMode;
    @Size(max = 250)
    @Column(name = "POLH_NARRATION")
    private String polhNarration;
    @Size(max = 50)
    @Column(name = "POLH_CAPTION")
    private String polhCaption;
    @Size(max = 250)
    @Column(name = "POLH_RESPONSE")
    private String polhResponse;
    @Column(name = "POLH_NEXT_DUE")
    private String polhNextDue;
    @Column(name = "POLH_LAST_PAYDT")
    private String polhLastPaydt;
    @Size(max = 150)
    @Column(name = "POLH_LAST_RECNO")
    private String polhLastRecno;

    public PolhDetl() {
    }
    
    public PolhDetl(PolhDetlModel pdetail) {
        this.polhDetlPK = new PolhDetlPK(pdetail.getPolhDetlPK());
        this.polhPlnSysid = pdetail.getPolhPlnSysid();
        this.polhPrtCode = pdetail.getPolhPrtCode();
        this.polhPlnCode = pdetail.getPolhPlnCode();
        this.polhBussSrc = pdetail.getPolhBussSrc();
        this.polhOff = pdetail.getPolhOff();
        this.polhNum = pdetail.getPolhNum();
        this.polhRef = pdetail.getPolhRef();
        this.polhOldNum1 = pdetail.getPolhOldNum1();
        this.polhOldNum2 = pdetail.getPolhOldNum2();
        this.polhOldNum3 = pdetail.getPolhOldNum3();
        this.polhIssuDt = pdetail.getPolhIssuDt();
        this.polhEntryDt = pdetail.getPolhEntryDt();
        this.polhAcceptDt = pdetail.getPolhAcceptDt();
        this.polhStDt = pdetail.getPolhStDt();
        this.polhEndDt = pdetail.getPolhEndDt();
        this.polhSysDt = pdetail.getPolhSysDt();
        this.polhDudtDt = pdetail.getPolhDudtDt();
        this.polhTxnSts = pdetail.getPolhTxnSts();
        this.polhCurr = pdetail.getPolhCurr();
        this.polhUw = pdetail.getPolhUw();
        this.polhCusCode = pdetail.getPolhCusCode();
        this.polhTnr = pdetail.getPolhTnr();
        this.polhUwyr = pdetail.getPolhUwyr();
        this.polhSiBc = pdetail.getPolhSiBc();
        this.polhDiscBc = pdetail.getPolhDiscBc();
        this.polhLoadBc = pdetail.getPolhLoadBc();
        this.polhFeesBc = pdetail.getPolhFeesBc();
        this.polhAddPremBc = pdetail.getPolhAddPremBc();
        this.polhInvestPremBc = pdetail.getPolhInvestPremBc();
        this.polhAprvYn = pdetail.getPolhAprvYn();
        this.polhAprvDt = pdetail.getPolhAprvDt();
        this.polhAprvBy = pdetail.getPolhAprvBy();
        this.polhCreUserBy = pdetail.getPolhCreUserBy();
        this.polhCreDt = pdetail.getPolhCreDt();
        this.polhUpdUserBy = pdetail.getPolhUpdUserBy();
        this.polhUpdDt = pdetail.getPolhUpdDt();
        this.polhGrossModPremBc = pdetail.getPolhGrossModPremBc();
        this.polhNetModPremBc = pdetail.getPolhNetModPremBc();
        this.polhAgnt1 = pdetail.getPolhAgnt1();
        this.polhOvriAgnt2 = pdetail.getPolhOvriAgnt2();
        this.polhOvriAgnt3 = pdetail.getPolhOvriAgnt3();
        this.polhOvriAgnt4 = pdetail.getPolhOvriAgnt4();
        this.polhOvriAgnt5 = pdetail.getPolhOvriAgnt5();
        this.polhEscPlan = pdetail.getPolhEscPlan();
        this.polhEscSa = pdetail.getPolhEscSa();
        this.polhEscPrem = pdetail.getPolhEscPrem();
        this.polhSuspAmt = pdetail.getPolhSuspAmt();
        this.polhTotalPrem = pdetail.getPolhTotalPrem();
        this.polhLpsDt = pdetail.getPolhLpsDt();
        this.polhAnnvDt = pdetail.getPolhAnnvDt();
        this.polhSignature = pdetail.getPolhSignature();
        this.polhSts = pdetail.getPolhSts();
        this.polhAlisNo = pdetail.getPolhAlisNo();
        this.polhPerferedMode = pdetail.getPolhPerferedMode();
        this.polhNarration = pdetail.getPolhNarration();
        this.polhCaption = pdetail.getPolhCaption();
        this.polhResponse = pdetail.getPolhResponse();
        this.polhNextDue = pdetail.getPolhNextDue();
        this.polhLastPaydt = pdetail.getPolhLastPaydt();
        this.polhLastRecno = pdetail.getPolhLastRecno();
    }

    public PolhDetl(PolhDetlPK polhDetlPK) {
        this.polhDetlPK = polhDetlPK;
    }

    public PolhDetl(PolhDetlPK polhDetlPK, String polhCreUserBy) {
        this.polhDetlPK = polhDetlPK;
        this.polhCreUserBy = polhCreUserBy;
    }

    public PolhDetl(int polhSysid, int polhCusSysid, int polhPdtSysid, int polhUserSysid) {
        this.polhDetlPK = new PolhDetlPK(polhSysid, polhCusSysid, polhPdtSysid, polhUserSysid);
    }

    public PolhDetlPK getPolhDetlPK() {
        return polhDetlPK;
    }

    public void setPolhDetlPK(PolhDetlPK polhDetlPK) {
        this.polhDetlPK = polhDetlPK;
    }

    public Integer getPolhPlnSysid() {
        return polhPlnSysid;
    }

    public void setPolhPlnSysid(Integer polhPlnSysid) {
        this.polhPlnSysid = polhPlnSysid;
    }

    public String getPolhPrtCode() {
        return polhPrtCode;
    }

    public void setPolhPrtCode(String polhPrtCode) {
        this.polhPrtCode = polhPrtCode;
    }

    public String getPolhPlnCode() {
        return polhPlnCode;
    }

    public void setPolhPlnCode(String polhPlnCode) {
        this.polhPlnCode = polhPlnCode;
    }

    public String getPolhBussSrc() {
        return polhBussSrc;
    }

    public void setPolhBussSrc(String polhBussSrc) {
        this.polhBussSrc = polhBussSrc;
    }

    public String getPolhOff() {
        return polhOff;
    }

    public void setPolhOff(String polhOff) {
        this.polhOff = polhOff;
    }

    public String getPolhNum() {
        return polhNum;
    }

    public void setPolhNum(String polhNum) {
        this.polhNum = polhNum;
    }

    public String getPolhRef() {
        return polhRef;
    }

    public void setPolhRef(String polhRef) {
        this.polhRef = polhRef;
    }

    public String getPolhOldNum1() {
        return polhOldNum1;
    }

    public void setPolhOldNum1(String polhOldNum1) {
        this.polhOldNum1 = polhOldNum1;
    }

    public String getPolhOldNum2() {
        return polhOldNum2;
    }

    public void setPolhOldNum2(String polhOldNum2) {
        this.polhOldNum2 = polhOldNum2;
    }

    public String getPolhOldNum3() {
        return polhOldNum3;
    }

    public void setPolhOldNum3(String polhOldNum3) {
        this.polhOldNum3 = polhOldNum3;
    }

    public String getPolhIssuDt() {
        return polhIssuDt;
    }

    public void setPolhIssuDt(String polhIssuDt) {
        this.polhIssuDt = polhIssuDt;
    }

    public String getPolhEntryDt() {
        return polhEntryDt;
    }

    public void setPolhEntryDt(String polhEntryDt) {
        this.polhEntryDt = polhEntryDt;
    }

    public String getPolhAcceptDt() {
        return polhAcceptDt;
    }

    public void setPolhAcceptDt(String polhAcceptDt) {
        this.polhAcceptDt = polhAcceptDt;
    }

    public String getPolhStDt() {
        return polhStDt;
    }

    public void setPolhStDt(String polhStDt) {
        this.polhStDt = polhStDt;
    }

    public String getPolhEndDt() {
        return polhEndDt;
    }

    public void setPolhEndDt(String polhEndDt) {
        this.polhEndDt = polhEndDt;
    }

    public String getPolhSysDt() {
        return polhSysDt;
    }

    public void setPolhSysDt(String polhSysDt) {
        this.polhSysDt = polhSysDt;
    }

    public String getPolhDudtDt() {
        return polhDudtDt;
    }

    public void setPolhDudtDt(String polhDudtDt) {
        this.polhDudtDt = polhDudtDt;
    }

    public String getPolhTxnSts() {
        return polhTxnSts;
    }

    public void setPolhTxnSts(String polhTxnSts) {
        this.polhTxnSts = polhTxnSts;
    }

    public String getPolhCurr() {
        return polhCurr;
    }

    public void setPolhCurr(String polhCurr) {
        this.polhCurr = polhCurr;
    }

    public String getPolhUw() {
        return polhUw;
    }

    public void setPolhUw(String polhUw) {
        this.polhUw = polhUw;
    }

    public String getPolhCusCode() {
        return polhCusCode;
    }

    public void setPolhCusCode(String polhCusCode) {
        this.polhCusCode = polhCusCode;
    }

    public Integer getPolhTnr() {
        return polhTnr;
    }

    public void setPolhTnr(Integer polhTnr) {
        this.polhTnr = polhTnr;
    }

    public Integer getPolhUwyr() {
        return polhUwyr;
    }

    public void setPolhUwyr(Integer polhUwyr) {
        this.polhUwyr = polhUwyr;
    }

    public BigDecimal getPolhSiBc() {
        return polhSiBc;
    }

    public void setPolhSiBc(BigDecimal polhSiBc) {
        this.polhSiBc = polhSiBc;
    }

    public BigDecimal getPolhDiscBc() {
        return polhDiscBc;
    }

    public void setPolhDiscBc(BigDecimal polhDiscBc) {
        this.polhDiscBc = polhDiscBc;
    }

    public BigDecimal getPolhLoadBc() {
        return polhLoadBc;
    }

    public void setPolhLoadBc(BigDecimal polhLoadBc) {
        this.polhLoadBc = polhLoadBc;
    }

    public BigDecimal getPolhFeesBc() {
        return polhFeesBc;
    }

    public void setPolhFeesBc(BigDecimal polhFeesBc) {
        this.polhFeesBc = polhFeesBc;
    }

    public BigDecimal getPolhAddPremBc() {
        return polhAddPremBc;
    }

    public void setPolhAddPremBc(BigDecimal polhAddPremBc) {
        this.polhAddPremBc = polhAddPremBc;
    }

    public BigDecimal getPolhInvestPremBc() {
        return polhInvestPremBc;
    }

    public void setPolhInvestPremBc(BigDecimal polhInvestPremBc) {
        this.polhInvestPremBc = polhInvestPremBc;
    }

    public String getPolhAprvYn() {
        return polhAprvYn;
    }

    public void setPolhAprvYn(String polhAprvYn) {
        this.polhAprvYn = polhAprvYn;
    }

    public String getPolhAprvDt() {
        return polhAprvDt;
    }

    public void setPolhAprvDt(String polhAprvDt) {
        this.polhAprvDt = polhAprvDt;
    }

    public String getPolhAprvBy() {
        return polhAprvBy;
    }

    public void setPolhAprvBy(String polhAprvBy) {
        this.polhAprvBy = polhAprvBy;
    }

    public String getPolhCreUserBy() {
        return polhCreUserBy;
    }

    public void setPolhCreUserBy(String polhCreUserBy) {
        this.polhCreUserBy = polhCreUserBy;
    }

    public String getPolhCreDt() {
        return polhCreDt;
    }

    public void setPolhCreDt(String polhCreDt) {
        this.polhCreDt = polhCreDt;
    }

    public String getPolhUpdUserBy() {
        return polhUpdUserBy;
    }

    public void setPolhUpdUserBy(String polhUpdUserBy) {
        this.polhUpdUserBy = polhUpdUserBy;
    }

    public String getPolhUpdDt() {
        return polhUpdDt;
    }

    public void setPolhUpdDt(String polhUpdDt) {
        this.polhUpdDt = polhUpdDt;
    }

    public BigDecimal getPolhGrossModPremBc() {
        return polhGrossModPremBc;
    }

    public void setPolhGrossModPremBc(BigDecimal polhGrossModPremBc) {
        this.polhGrossModPremBc = polhGrossModPremBc;
    }

    public BigDecimal getPolhNetModPremBc() {
        return polhNetModPremBc;
    }

    public void setPolhNetModPremBc(BigDecimal polhNetModPremBc) {
        this.polhNetModPremBc = polhNetModPremBc;
    }

    public String getPolhAgnt1() {
        return polhAgnt1;
    }

    public void setPolhAgnt1(String polhAgnt1) {
        this.polhAgnt1 = polhAgnt1;
    }

    public String getPolhOvriAgnt2() {
        return polhOvriAgnt2;
    }

    public void setPolhOvriAgnt2(String polhOvriAgnt2) {
        this.polhOvriAgnt2 = polhOvriAgnt2;
    }

    public String getPolhOvriAgnt3() {
        return polhOvriAgnt3;
    }

    public void setPolhOvriAgnt3(String polhOvriAgnt3) {
        this.polhOvriAgnt3 = polhOvriAgnt3;
    }

    public String getPolhOvriAgnt4() {
        return polhOvriAgnt4;
    }

    public void setPolhOvriAgnt4(String polhOvriAgnt4) {
        this.polhOvriAgnt4 = polhOvriAgnt4;
    }

    public String getPolhOvriAgnt5() {
        return polhOvriAgnt5;
    }

    public void setPolhOvriAgnt5(String polhOvriAgnt5) {
        this.polhOvriAgnt5 = polhOvriAgnt5;
    }

    public String getPolhEscPlan() {
        return polhEscPlan;
    }

    public void setPolhEscPlan(String polhEscPlan) {
        this.polhEscPlan = polhEscPlan;
    }

    public BigDecimal getPolhEscSa() {
        return polhEscSa;
    }

    public void setPolhEscSa(BigDecimal polhEscSa) {
        this.polhEscSa = polhEscSa;
    }

    public BigDecimal getPolhEscPrem() {
        return polhEscPrem;
    }

    public void setPolhEscPrem(BigDecimal polhEscPrem) {
        this.polhEscPrem = polhEscPrem;
    }

    public BigDecimal getPolhSuspAmt() {
        return polhSuspAmt;
    }

    public void setPolhSuspAmt(BigDecimal polhSuspAmt) {
        this.polhSuspAmt = polhSuspAmt;
    }

    public BigDecimal getPolhTotalPrem() {
        return polhTotalPrem;
    }

    public void setPolhTotalPrem(BigDecimal polhTotalPrem) {
        this.polhTotalPrem = polhTotalPrem;
    }

    public String getPolhLpsDt() {
        return polhLpsDt;
    }

    public void setPolhLpsDt(String polhLpsDt) {
        this.polhLpsDt = polhLpsDt;
    }

    public String getPolhAnnvDt() {
        return polhAnnvDt;
    }

    public void setPolhAnnvDt(String polhAnnvDt) {
        this.polhAnnvDt = polhAnnvDt;
    }

    public String getPolhSignature() {
        return polhSignature;
    }

    public void setPolhSignature(String polhSignature) {
        this.polhSignature = polhSignature;
    }

    public String getPolhSts() {
        return polhSts;
    }

    public void setPolhSts(String polhSts) {
        this.polhSts = polhSts;
    }

    public String getPolhAlisNo() {
        return polhAlisNo;
    }

    public void setPolhAlisNo(String polhAlisNo) {
        this.polhAlisNo = polhAlisNo;
    }

    public String getPolhPerferedMode() {
        return polhPerferedMode;
    }

    public void setPolhPerferedMode(String polhPerferedMode) {
        this.polhPerferedMode = polhPerferedMode;
    }

    public String getPolhNarration() {
        return polhNarration;
    }

    public void setPolhNarration(String polhNarration) {
        this.polhNarration = polhNarration;
    }

    public String getPolhCaption() {
        return polhCaption;
    }

    public void setPolhCaption(String polhCaption) {
        this.polhCaption = polhCaption;
    }

    public String getPolhResponse() {
        return polhResponse;
    }

    public void setPolhResponse(String polhResponse) {
        this.polhResponse = polhResponse;
    }

    public String getPolhNextDue() {
        return polhNextDue;
    }

    public void setPolhNextDue(String polhNextDue) {
        this.polhNextDue = polhNextDue;
    }

    public String getPolhLastPaydt() {
        return polhLastPaydt;
    }

    public void setPolhLastPaydt(String polhLastPaydt) {
        this.polhLastPaydt = polhLastPaydt;
    }

    public String getPolhLastRecno() {
        return polhLastRecno;
    }

    public void setPolhLastRecno(String polhLastRecno) {
        this.polhLastRecno = polhLastRecno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (polhDetlPK != null ? polhDetlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhDetl)) {
            return false;
        }
        PolhDetl other = (PolhDetl) object;
        if ((this.polhDetlPK == null && other.polhDetlPK != null) || (this.polhDetlPK != null && !this.polhDetlPK.equals(other.polhDetlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhDetl[ polhDetlPK=" + polhDetlPK + " ]";
    }
    
}
