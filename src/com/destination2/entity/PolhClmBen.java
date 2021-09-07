/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhClmBenModel;
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
@Table(name = "polh_clm_ben")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhClmBen.findAll", query = "SELECT p FROM PolhClmBen p"),
    @NamedQuery(name = "PolhClmBen.findByLastRecord", query = "SELECT p FROM PolhClmBen p ORDER BY p.pcbSysid DESC"),
    @NamedQuery(name = "PolhClmBen.findByPcbSysid", query = "SELECT p FROM PolhClmBen p WHERE p.pcbSysid = :pcbSysid"),
    @NamedQuery(name = "PolhClmBen.findByPcbPolhSysid", query = "SELECT p FROM PolhClmBen p WHERE p.pcbPolhSysid = :pcbPolhSysid"),
    @NamedQuery(name = "PolhClmBen.findByPcbPciSysid", query = "SELECT p FROM PolhClmBen p WHERE p.pcbPciSysid = :pcbPciSysid"),
    @NamedQuery(name = "PolhClmBen.findByPcbDesc", query = "SELECT p FROM PolhClmBen p WHERE p.pcbDesc = :pcbDesc"),
    @NamedQuery(name = "PolhClmBen.findByPcbTraxTyp", query = "SELECT p FROM PolhClmBen p WHERE p.pcbTraxTyp = :pcbTraxTyp"),
    @NamedQuery(name = "PolhClmBen.findByPcbCurr", query = "SELECT p FROM PolhClmBen p WHERE p.pcbCurr = :pcbCurr"),
    @NamedQuery(name = "PolhClmBen.findByPcbAmt", query = "SELECT p FROM PolhClmBen p WHERE p.pcbAmt = :pcbAmt"),
    @NamedQuery(name = "PolhClmBen.findByPcbAmtDrBc", query = "SELECT p FROM PolhClmBen p WHERE p.pcbAmtDrBc = :pcbAmtDrBc"),
    @NamedQuery(name = "PolhClmBen.findByPcbAmtDrFc", query = "SELECT p FROM PolhClmBen p WHERE p.pcbAmtDrFc = :pcbAmtDrFc"),
    @NamedQuery(name = "PolhClmBen.findByPcbAmtCrBc", query = "SELECT p FROM PolhClmBen p WHERE p.pcbAmtCrBc = :pcbAmtCrBc"),
    @NamedQuery(name = "PolhClmBen.findByPcbAmtCrFc", query = "SELECT p FROM PolhClmBen p WHERE p.pcbAmtCrFc = :pcbAmtCrFc"),
    @NamedQuery(name = "PolhClmBen.findByPcbRemark", query = "SELECT p FROM PolhClmBen p WHERE p.pcbRemark = :pcbRemark"),
    @NamedQuery(name = "PolhClmBen.findByPcbSysdt", query = "SELECT p FROM PolhClmBen p WHERE p.pcbSysdt = :pcbSysdt"),
    @NamedQuery(name = "PolhClmBen.findByPcbSts", query = "SELECT p FROM PolhClmBen p WHERE p.pcbSts = :pcbSts")})
public class PolhClmBen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PCB_SYSID")
    private Integer pcbSysid;
    @Column(name = "PCB_POLH_SYSID")
    private Integer pcbPolhSysid;
    @Column(name = "PCB_PCI_SYSID")
    private Integer pcbPciSysid;
    @Size(max = 150)
    @Column(name = "PCB_DESC")
    private String pcbDesc;
    @Size(max = 15)
    @Column(name = "PCB_TRAX_TYP")
    private String pcbTraxTyp;
    @Size(max = 15)
    @Column(name = "PCB_CURR")
    private String pcbCurr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PCB_AMT")
    private BigDecimal pcbAmt;
    @Column(name = "PCB_AMT_DR_BC")
    private BigDecimal pcbAmtDrBc;
    @Column(name = "PCB_AMT_DR_FC")
    private BigDecimal pcbAmtDrFc;
    @Column(name = "PCB_AMT_CR_BC")
    private BigDecimal pcbAmtCrBc;
    @Column(name = "PCB_AMT_CR_FC")
    private BigDecimal pcbAmtCrFc;
    @Size(max = 250)
    @Column(name = "PCB_REMARK")
    private String pcbRemark;
    @Column(name = "PCB_SYSDT")
    private String pcbSysdt;
    @Size(max = 15)
    @Column(name = "PCB_STS")
    private String pcbSts;

    public PolhClmBen() {
    }
    
    public PolhClmBen(PolhClmBenModel polBen) {
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

    public PolhClmBen(Integer pcbSysid) {
        this.pcbSysid = pcbSysid;
    }

    public Integer getPcbSysid() {
        return pcbSysid;
    }

    public void setPcbSysid(Integer pcbSysid) {
        this.pcbSysid = pcbSysid;
    }

    public Integer getPcbPolhSysid() {
        return pcbPolhSysid;
    }

    public void setPcbPolhSysid(Integer pcbPolhSysid) {
        this.pcbPolhSysid = pcbPolhSysid;
    }

    public Integer getPcbPciSysid() {
        return pcbPciSysid;
    }

    public void setPcbPciSysid(Integer pcbPciSysid) {
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
    public int hashCode() {
        int hash = 0;
        hash += (pcbSysid != null ? pcbSysid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhClmBen)) {
            return false;
        }
        PolhClmBen other = (PolhClmBen) object;
        if ((this.pcbSysid == null && other.pcbSysid != null) || (this.pcbSysid != null && !this.pcbSysid.equals(other.pcbSysid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhClmBen[ pcbSysid=" + pcbSysid + " ]";
    }
    
}
