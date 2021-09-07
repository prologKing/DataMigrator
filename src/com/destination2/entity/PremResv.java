/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PremResvModel;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "prem_resv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PremResv.findAll", query = "SELECT p FROM PremResv p"),
    @NamedQuery(name = "PremResv.findByPsSysid", query = "SELECT p FROM PremResv p WHERE p.psSysid = :psSysid"),
    @NamedQuery(name = "PremResv.findByPsPolhSysid", query = "SELECT p FROM PremResv p WHERE p.psPolhSysid = :psPolhSysid"),
    @NamedQuery(name = "PremResv.findByCriteria", query = "SELECT p FROM PremResv p WHERE p.psPolhNum = :psPolhNum AND p.psTrnDt = :psTrnDt AND p.psAmt = :psAmt"),
    @NamedQuery(name = "PremResv.findByPsUserSysid", query = "SELECT p FROM PremResv p WHERE p.psUserSysid = :psUserSysid"),
    @NamedQuery(name = "PremResv.findByPsTrnCode", query = "SELECT p FROM PremResv p WHERE p.psTrnCode = :psTrnCode"),
    @NamedQuery(name = "PremResv.findByPsPolhNum", query = "SELECT p FROM PremResv p WHERE p.psPolhNum = :psPolhNum"),
    @NamedQuery(name = "PremResv.findByPsTrnName", query = "SELECT p FROM PremResv p WHERE p.psTrnName = :psTrnName"),
    @NamedQuery(name = "PremResv.findByPsTrnDesc", query = "SELECT p FROM PremResv p WHERE p.psTrnDesc = :psTrnDesc"),
    @NamedQuery(name = "PremResv.findByPsTrnDt", query = "SELECT p FROM PremResv p WHERE p.psTrnDt = :psTrnDt"),
    @NamedQuery(name = "PremResv.findByPsSysDt", query = "SELECT p FROM PremResv p WHERE p.psSysDt = :psSysDt"),
    @NamedQuery(name = "PremResv.findByPsAmt", query = "SELECT p FROM PremResv p WHERE p.psAmt = :psAmt"),
    @NamedQuery(name = "PremResv.findByPsCrAmt", query = "SELECT p FROM PremResv p WHERE p.psCrAmt = :psCrAmt"),
    @NamedQuery(name = "PremResv.findByPsDrAmt", query = "SELECT p FROM PremResv p WHERE p.psDrAmt = :psDrAmt"),
    @NamedQuery(name = "PremResv.findByPsAmtBal", query = "SELECT p FROM PremResv p WHERE p.psAmtBal = :psAmtBal"),
    @NamedQuery(name = "PremResv.findByPsPayMode", query = "SELECT p FROM PremResv p WHERE p.psPayMode = :psPayMode"),
    @NamedQuery(name = "PremResv.findByPsPaySource", query = "SELECT p FROM PremResv p WHERE p.psPaySource = :psPaySource"),
    @NamedQuery(name = "PremResv.findByPsChqDt", query = "SELECT p FROM PremResv p WHERE p.psChqDt = :psChqDt"),
    @NamedQuery(name = "PremResv.findByPsChqNo", query = "SELECT p FROM PremResv p WHERE p.psChqNo = :psChqNo"),
    @NamedQuery(name = "PremResv.findByPsDepBank", query = "SELECT p FROM PremResv p WHERE p.psDepBank = :psDepBank"),
    @NamedQuery(name = "PremResv.findByPsPayInfo", query = "SELECT p FROM PremResv p WHERE p.psPayInfo = :psPayInfo"),
    @NamedQuery(name = "PremResv.findByPsChqClrDt", query = "SELECT p FROM PremResv p WHERE p.psChqClrDt = :psChqClrDt"),
    @NamedQuery(name = "PremResv.findByPsSts", query = "SELECT p FROM PremResv p WHERE p.psSts = :psSts"),
    @NamedQuery(name = "PremResv.findByPsAuthSts", query = "SELECT p FROM PremResv p WHERE p.psAuthSts = :psAuthSts"),
    @NamedQuery(name = "PremResv.findByPsAuthDt", query = "SELECT p FROM PremResv p WHERE p.psAuthDt = :psAuthDt"),
    @NamedQuery(name = "PremResv.findByPsAuthUser", query = "SELECT p FROM PremResv p WHERE p.psAuthUser = :psAuthUser"),
    @NamedQuery(name = "PremResv.findByPsPrcsSts", query = "SELECT p FROM PremResv p WHERE p.psPrcsSts = :psPrcsSts"),
    @NamedQuery(name = "PremResv.findByPsPrcsDt", query = "SELECT p FROM PremResv p WHERE p.psPrcsDt = :psPrcsDt"),
    @NamedQuery(name = "PremResv.findByFvSts", query = "SELECT p FROM PremResv p WHERE p.fvSts = :fvSts")})
public class PremResv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PS_SYSID")
    private Integer psSysid;
    @Column(name = "PS_POLH_SYSID")
    private Integer psPolhSysid;
    @Column(name = "PS_USER_SYSID")
    private Integer psUserSysid;
    @Size(max = 15)
    @Column(name = "PS_TRN_CODE")
    private String psTrnCode;
    @Size(max = 50)
    @Column(name = "PS_POLH_NUM")
    private String psPolhNum;
    @Size(max = 50)
    @Column(name = "PS_TRN_NAME")
    private String psTrnName;
    @Size(max = 250)
    @Column(name = "PS_TRN_DESC")
    private String psTrnDesc;
    @Column(name = "PS_TRN_DT")
    private String psTrnDt;
    @Column(name = "PS_SYS_DT")
    private String psSysDt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PS_AMT")
    private BigDecimal psAmt;
    @Column(name = "PS_CR_AMT")
    private BigDecimal psCrAmt;
    @Column(name = "PS_DR_AMT")
    private BigDecimal psDrAmt;
    @Column(name = "PS_AMT_BAL")
    private BigDecimal psAmtBal;
    @Size(max = 50)
    @Column(name = "PS_PAY_MODE")
    private String psPayMode;
    @Size(max = 150)
    @Column(name = "PS_PAY_SOURCE")
    private String psPaySource;
    @Column(name = "PS_CHQ_DT")
    private String psChqDt;
    @Size(max = 50)
    @Column(name = "PS_CHQ_NO")
    private String psChqNo;
    @Size(max = 150)
    @Column(name = "PS_DEP_BANK")
    private String psDepBank;
    @Size(max = 150)
    @Column(name = "PS_PAY_INFO")
    private String psPayInfo;
    @Column(name = "PS_CHQ_CLR_DT")
    private String psChqClrDt;
    @Size(max = 5)
    @Column(name = "PS_STS")
    private String psSts;
    @Size(max = 15)
    @Column(name = "PS_AUTH_STS")
    private String psAuthSts;
    @Column(name = "PS_AUTH_DT")
    private String psAuthDt;
    @Size(max = 50)
    @Column(name = "PS_AUTH_USER")
    private String psAuthUser;
    @Size(max = 5)
    @Column(name = "PS_PRCS_STS")
    private String psPrcsSts;
    @Column(name = "PS_PRCS_DT")
    private String psPrcsDt;
    @Size(max = 50)
    @Column(name = "FV_STS")
    private String fvSts;

    public PremResv() {
    }
    
    public PremResv(PremResvModel prsesv) {
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

    public PremResv(Integer psSysid) {
        this.psSysid = psSysid;
    }

    public Integer getPsSysid() {
        return psSysid;
    }

    public void setPsSysid(Integer psSysid) {
        this.psSysid = psSysid;
    }

    public Integer getPsPolhSysid() {
        return psPolhSysid;
    }

    public void setPsPolhSysid(Integer psPolhSysid) {
        this.psPolhSysid = psPolhSysid;
    }

    public Integer getPsUserSysid() {
        return psUserSysid;
    }

    public void setPsUserSysid(Integer psUserSysid) {
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
    public int hashCode() {
        int hash = 0;
        hash += (psSysid != null ? psSysid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PremResv)) {
            return false;
        }
        PremResv other = (PremResv) object;
        if ((this.psSysid == null && other.psSysid != null) || (this.psSysid != null && !this.psSysid.equals(other.psSysid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PremResv[ psSysid=" + psSysid + " ]";
    }
    
}
