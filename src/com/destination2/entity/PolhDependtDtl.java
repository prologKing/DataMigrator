/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhDependDtlModel;
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
@Table(name = "polh_dependt_dtl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhDependtDtl.findAll", query = "SELECT p FROM PolhDependtDtl p"),
    @NamedQuery(name = "PolhDependtDtl.findByPddSysId", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddSysId = :pddSysId"),
    @NamedQuery(name = "PolhDependtDtl.findByPddPolhSysid", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddPolhSysid = :pddPolhSysid"),
    @NamedQuery(name = "PolhDependtDtl.findByPddPdtSysid", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddPdtSysid = :pddPdtSysid"),
    @NamedQuery(name = "PolhDependtDtl.findByPddPptSysid", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddPptSysid = :pddPptSysid"),
    @NamedQuery(name = "PolhDependtDtl.findByPddCusSysid", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddCusSysid = :pddCusSysid"),
    @NamedQuery(name = "PolhDependtDtl.findByPddClSysid", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddClSysid = :pddClSysid"),
    @NamedQuery(name = "PolhDependtDtl.findByPddClName", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddClName = :pddClName"),
    @NamedQuery(name = "PolhDependtDtl.findByPddCode", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddCode = :pddCode"),
    @NamedQuery(name = "PolhDependtDtl.findByPddName", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddName = :pddName"),
    @NamedQuery(name = "PolhDependtDtl.findByPddGndr", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddGndr = :pddGndr"),
    @NamedQuery(name = "PolhDependtDtl.findByPddDob", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddDob = :pddDob"),
    @NamedQuery(name = "PolhDependtDtl.findByPddAge", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddAge = :pddAge"),
    @NamedQuery(name = "PolhDependtDtl.findByPddCreUser", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddCreUser = :pddCreUser"),
    @NamedQuery(name = "PolhDependtDtl.findByPddCreDt", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddCreDt = :pddCreDt"),
    @NamedQuery(name = "PolhDependtDtl.findByPddUpdUser", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddUpdUser = :pddUpdUser"),
    @NamedQuery(name = "PolhDependtDtl.findByPddUpdDt", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddUpdDt = :pddUpdDt"),
    @NamedQuery(name = "PolhDependtDtl.findByPddTitle", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddTitle = :pddTitle"),
    @NamedQuery(name = "PolhDependtDtl.findByPddMobile", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddMobile = :pddMobile"),
    @NamedQuery(name = "PolhDependtDtl.findByPddPrem", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddPrem = :pddPrem"),
    @NamedQuery(name = "PolhDependtDtl.findByPddSa", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddSa = :pddSa"),
    @NamedQuery(name = "PolhDependtDtl.findByPddSts", query = "SELECT p FROM PolhDependtDtl p WHERE p.pddSts = :pddSts")})
public class PolhDependtDtl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PDD_SYS_ID")
    private Integer pddSysId;
    @Column(name = "PDD_POLH_SYSID")
    private Integer pddPolhSysid;
    @Column(name = "PDD_PDT_SYSID")
    private Integer pddPdtSysid;
    @Column(name = "PDD_PPT_SYSID")
    private Integer pddPptSysid;
    @Column(name = "PDD_CUS_SYSID")
    private Integer pddCusSysid;
    @Column(name = "PDD_CL_SYSID")
    private Integer pddClSysid;
    @Size(max = 150)
    @Column(name = "PDD_CL_NAME")
    private String pddClName;
    @Size(max = 25)
    @Column(name = "PDD_CODE")
    private String pddCode;
    @Size(max = 150)
    @Column(name = "PDD_NAME")
    private String pddName;
    @Size(max = 50)
    @Column(name = "PDD_GNDR")
    private String pddGndr;
    @Column(name = "PDD_DOB")
    private String pddDob;
    @Column(name = "PDD_AGE")
    private Integer pddAge;
    @Size(max = 50)
    @Column(name = "PDD_CRE_USER")
    private String pddCreUser;
    @Column(name = "PDD_CRE_DT")
    private String pddCreDt;
    @Size(max = 50)
    @Column(name = "PDD_UPD_USER")
    private String pddUpdUser;
    @Column(name = "PDD_UPD_DT")
    private String pddUpdDt;
    @Size(max = 25)
    @Column(name = "PDD_TITLE")
    private String pddTitle;
    @Size(max = 15)
    @Column(name = "PDD_MOBILE")
    private String pddMobile;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PDD_PREM")
    private BigDecimal pddPrem;
    @Column(name = "PDD_SA")
    private BigDecimal pddSa;
    @Size(max = 5)
    @Column(name = "PDD_STS")
    private String pddSts;

    public PolhDependtDtl() {
    }
    
    public PolhDependtDtl(PolhDependDtlModel pdtail) {
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

    public PolhDependtDtl(Integer pddSysId) {
        this.pddSysId = pddSysId;
    }

    public Integer getPddSysId() {
        return pddSysId;
    }

    public void setPddSysId(Integer pddSysId) {
        this.pddSysId = pddSysId;
    }

    public Integer getPddPolhSysid() {
        return pddPolhSysid;
    }

    public void setPddPolhSysid(Integer pddPolhSysid) {
        this.pddPolhSysid = pddPolhSysid;
    }

    public Integer getPddPdtSysid() {
        return pddPdtSysid;
    }

    public void setPddPdtSysid(Integer pddPdtSysid) {
        this.pddPdtSysid = pddPdtSysid;
    }

    public Integer getPddPptSysid() {
        return pddPptSysid;
    }

    public void setPddPptSysid(Integer pddPptSysid) {
        this.pddPptSysid = pddPptSysid;
    }

    public Integer getPddCusSysid() {
        return pddCusSysid;
    }

    public void setPddCusSysid(Integer pddCusSysid) {
        this.pddCusSysid = pddCusSysid;
    }

    public Integer getPddClSysid() {
        return pddClSysid;
    }

    public void setPddClSysid(Integer pddClSysid) {
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

    public Integer getPddAge() {
        return pddAge;
    }

    public void setPddAge(Integer pddAge) {
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
    public int hashCode() {
        int hash = 0;
        hash += (pddSysId != null ? pddSysId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhDependtDtl)) {
            return false;
        }
        PolhDependtDtl other = (PolhDependtDtl) object;
        if ((this.pddSysId == null && other.pddSysId != null) || (this.pddSysId != null && !this.pddSysId.equals(other.pddSysId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhDependtDtl[ pddSysId=" + pddSysId + " ]";
    }
    
}
