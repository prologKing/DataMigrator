/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhClmInitModel;
import java.io.Serializable;
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
@Table(name = "polh_clm_init")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhClmInit.findAll", query = "SELECT p FROM PolhClmInit p"),
    @NamedQuery(name = "PolhClmInit.findByLastRecord", query = "SELECT p FROM PolhClmInit p ORDER BY p.pciSysid DESC"),
    @NamedQuery(name = "PolhClmInit.findByPciSysid", query = "SELECT p FROM PolhClmInit p WHERE p.pciSysid = :pciSysid"),
    @NamedQuery(name = "PolhClmInit.findByPciPolhSysid", query = "SELECT p FROM PolhClmInit p WHERE p.pciPolhSysid = :pciPolhSysid"),
    @NamedQuery(name = "PolhClmInit.findByPciPolNum", query = "SELECT p FROM PolhClmInit p WHERE p.pciPolNum = :pciPolNum"),
    @NamedQuery(name = "PolhClmInit.findByPciClmNum", query = "SELECT p FROM PolhClmInit p WHERE p.pciClmNum = :pciClmNum"),
    @NamedQuery(name = "PolhClmInit.findByPciOffId", query = "SELECT p FROM PolhClmInit p WHERE p.pciOffId = :pciOffId"),
    @NamedQuery(name = "PolhClmInit.findByPciOff", query = "SELECT p FROM PolhClmInit p WHERE p.pciOff = :pciOff"),
    @NamedQuery(name = "PolhClmInit.findByPciRegDt", query = "SELECT p FROM PolhClmInit p WHERE p.pciRegDt = :pciRegDt"),
    @NamedQuery(name = "PolhClmInit.findByPciRegSysdt", query = "SELECT p FROM PolhClmInit p WHERE p.pciRegSysdt = :pciRegSysdt"),
    @NamedQuery(name = "PolhClmInit.findByPciCreateBy", query = "SELECT p FROM PolhClmInit p WHERE p.pciCreateBy = :pciCreateBy"),
    @NamedQuery(name = "PolhClmInit.findByPciApprDt", query = "SELECT p FROM PolhClmInit p WHERE p.pciApprDt = :pciApprDt"),
    @NamedQuery(name = "PolhClmInit.findByPciApprBy", query = "SELECT p FROM PolhClmInit p WHERE p.pciApprBy = :pciApprBy"),
    @NamedQuery(name = "PolhClmInit.findByPciNarration", query = "SELECT p FROM PolhClmInit p WHERE p.pciNarration = :pciNarration"),
    @NamedQuery(name = "PolhClmInit.findByPciContactNo", query = "SELECT p FROM PolhClmInit p WHERE p.pciContactNo = :pciContactNo"),
    @NamedQuery(name = "PolhClmInit.findByPciCttId", query = "SELECT p FROM PolhClmInit p WHERE p.pciCttId = :pciCttId"),
    @NamedQuery(name = "PolhClmInit.findByPciIdDesc", query = "SELECT p FROM PolhClmInit p WHERE p.pciIdDesc = :pciIdDesc"),
    @NamedQuery(name = "PolhClmInit.findByPciIdNum", query = "SELECT p FROM PolhClmInit p WHERE p.pciIdNum = :pciIdNum"),
    @NamedQuery(name = "PolhClmInit.findByPciPpmSysid", query = "SELECT p FROM PolhClmInit p WHERE p.pciPpmSysid = :pciPpmSysid"),
    @NamedQuery(name = "PolhClmInit.findByPciMode", query = "SELECT p FROM PolhClmInit p WHERE p.pciMode = :pciMode"),
    @NamedQuery(name = "PolhClmInit.findByPciMmNo", query = "SELECT p FROM PolhClmInit p WHERE p.pciMmNo = :pciMmNo"),
    @NamedQuery(name = "PolhClmInit.findByPciBank", query = "SELECT p FROM PolhClmInit p WHERE p.pciBank = :pciBank"),
    @NamedQuery(name = "PolhClmInit.findByPciBankBr", query = "SELECT p FROM PolhClmInit p WHERE p.pciBankBr = :pciBankBr"),
    @NamedQuery(name = "PolhClmInit.findByPciBankAcct", query = "SELECT p FROM PolhClmInit p WHERE p.pciBankAcct = :pciBankAcct"),
    @NamedQuery(name = "PolhClmInit.findByPciPctSysid", query = "SELECT p FROM PolhClmInit p WHERE p.pciPctSysid = :pciPctSysid"),
    @NamedQuery(name = "PolhClmInit.findByPciClmType", query = "SELECT p FROM PolhClmInit p WHERE p.pciClmType = :pciClmType"),
    @NamedQuery(name = "PolhClmInit.findByPciSts", query = "SELECT p FROM PolhClmInit p WHERE p.pciSts = :pciSts"),
    @NamedQuery(name = "PolhClmInit.findByPciClmproDt", query = "SELECT p FROM PolhClmInit p WHERE p.pciClmproDt = :pciClmproDt"),
    @NamedQuery(name = "PolhClmInit.findByPciClmproBy", query = "SELECT p FROM PolhClmInit p WHERE p.pciClmproBy = :pciClmproBy"),
    @NamedQuery(name = "PolhClmInit.findByPciSysprcsSts", query = "SELECT p FROM PolhClmInit p WHERE p.pciSysprcsSts = :pciSysprcsSts")})
public class PolhClmInit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PCI_SYSID")
    private Integer pciSysid;
    @Column(name = "PCI_POLH_SYSID")
    private Integer pciPolhSysid;
    @Size(max = 50)
    @Column(name = "PCI_POL_NUM")
    private String pciPolNum;
    @Size(max = 50)
    @Column(name = "PCI_CLM_NUM")
    private String pciClmNum;
    @Column(name = "PCI_OFF_ID")
    private Integer pciOffId;
    @Size(max = 50)
    @Column(name = "PCI_OFF")
    private String pciOff;
    @Column(name = "PCI_REG_DT")
    private String pciRegDt;
    @Column(name = "PCI_REG_SYSDT")
    private String pciRegSysdt;
    @Size(max = 50)
    @Column(name = "PCI_CREATE_BY")
    private String pciCreateBy;
    @Column(name = "PCI_APPR_DT")
    private String pciApprDt;
    @Size(max = 50)
    @Column(name = "PCI_APPR_BY")
    private String pciApprBy;
    @Size(max = 150)
    @Column(name = "PCI_NARRATION")
    private String pciNarration;
    @Size(max = 50)
    @Column(name = "PCI_CONTACT_NO")
    private String pciContactNo;
    @Column(name = "PCI_CTT_ID")
    private Integer pciCttId;
    @Size(max = 150)
    @Column(name = "PCI_ID_DESC")
    private String pciIdDesc;
    @Size(max = 50)
    @Column(name = "PCI_ID_NUM")
    private String pciIdNum;
    @Column(name = "PCI_PPM_SYSID")
    private Integer pciPpmSysid;
    @Size(max = 50)
    @Column(name = "PCI_MODE")
    private String pciMode;
    @Size(max = 15)
    @Column(name = "PCI_MM_NO")
    private String pciMmNo;
    @Size(max = 100)
    @Column(name = "PCI_BANK")
    private String pciBank;
    @Size(max = 100)
    @Column(name = "PCI_BANK_BR")
    private String pciBankBr;
    @Size(max = 50)
    @Column(name = "PCI_BANK_ACCT")
    private String pciBankAcct;
    @Column(name = "PCI_PCT_SYSID")
    private Integer pciPctSysid;
    @Size(max = 150)
    @Column(name = "PCI_CLM_TYPE")
    private String pciClmType;
    @Size(max = 5)
    @Column(name = "PCI_STS")
    private String pciSts;
    @Column(name = "PCI_CLMPRO_DT")
    private String pciClmproDt;
    @Size(max = 50)
    @Column(name = "PCI_CLMPRO_BY")
    private String pciClmproBy;
    @Size(max = 5)
    @Column(name = "PCI_SYSPRCS_STS")
    private String pciSysprcsSts;

    public PolhClmInit() {
    }

    public PolhClmInit(Integer pciSysid, Integer pciPolhSysid, String pciPolNum, String pciClmNum, Integer pciOffId, String pciOff, String pciRegDt, String pciRegSysdt, String pciCreateBy, String pciApprDt, String pciApprBy, String pciNarration, String pciContactNo, Integer pciCttId, String pciIdDesc, String pciIdNum, Integer pciPpmSysid, String pciMode, String pciMmNo, String pciBank, String pciBankBr, String pciBankAcct, Integer pciPctSysid, String pciClmType, String pciSts, String pciClmproDt, String pciClmproBy, String pciSysprcsSts) {
        this.pciSysid = pciSysid;
        this.pciPolhSysid = pciPolhSysid;
        this.pciPolNum = pciPolNum;
        this.pciClmNum = pciClmNum;
        this.pciOffId = pciOffId;
        this.pciOff = pciOff;
        this.pciRegDt = pciRegDt;
        this.pciRegSysdt = pciRegSysdt;
        this.pciCreateBy = pciCreateBy;
        this.pciApprDt = pciApprDt;
        this.pciApprBy = pciApprBy;
        this.pciNarration = pciNarration;
        this.pciContactNo = pciContactNo;
        this.pciCttId = pciCttId;
        this.pciIdDesc = pciIdDesc;
        this.pciIdNum = pciIdNum;
        this.pciPpmSysid = pciPpmSysid;
        this.pciMode = pciMode;
        this.pciMmNo = pciMmNo;
        this.pciBank = pciBank;
        this.pciBankBr = pciBankBr;
        this.pciBankAcct = pciBankAcct;
        this.pciPctSysid = pciPctSysid;
        this.pciClmType = pciClmType;
        this.pciSts = pciSts;
        this.pciClmproDt = pciClmproDt;
        this.pciClmproBy = pciClmproBy;
        this.pciSysprcsSts = pciSysprcsSts;
    }
    
    public PolhClmInit(PolhClmInitModel polhInit) {
        this.pciSysid = polhInit.getPciSysid();
        this.pciPolhSysid = polhInit.getPciPolhSysid();
        this.pciPolNum = polhInit.getPciPolNum();
        this.pciClmNum = polhInit.getPciClmNum();
        this.pciOffId = polhInit.getPciOffId();
        this.pciOff = polhInit.getPciOff();
        this.pciRegDt = polhInit.getPciRegDt();
        this.pciRegSysdt = polhInit.getPciRegSysdt();
        this.pciCreateBy = polhInit.getPciCreateBy();
        this.pciApprDt = polhInit.getPciApprDt();
        this.pciApprBy = polhInit.getPciApprBy();
        this.pciNarration = polhInit.getPciNarration();
        this.pciContactNo = polhInit.getPciContactNo();
        this.pciCttId = polhInit.getPciCttId();
        this.pciIdDesc = polhInit.getPciIdDesc();
        this.pciIdNum = polhInit.getPciIdNum();
        this.pciPpmSysid = polhInit.getPciPpmSysid();
        this.pciMode = polhInit.getPciMode();
        this.pciMmNo = polhInit.getPciMmNo();
        this.pciBank = polhInit.getPciBank();
        this.pciBankBr = polhInit.getPciBankBr();
        this.pciBankAcct = polhInit.getPciBankAcct();
        this.pciPctSysid = polhInit.getPciPctSysid();
        this.pciClmType = polhInit.getPciClmType();
        this.pciSts = polhInit.getPciSts();
        this.pciClmproDt = polhInit.getPciClmproDt();
        this.pciClmproBy = polhInit.getPciClmproBy();
        this.pciSysprcsSts = polhInit.getPciSysprcsSts();
    }

    public PolhClmInit(Integer pciSysid) {
        this.pciSysid = pciSysid;
    }

    public Integer getPciSysid() {
        return pciSysid;
    }

    public void setPciSysid(Integer pciSysid) {
        this.pciSysid = pciSysid;
    }

    public Integer getPciPolhSysid() {
        return pciPolhSysid;
    }

    public void setPciPolhSysid(Integer pciPolhSysid) {
        this.pciPolhSysid = pciPolhSysid;
    }

    public String getPciPolNum() {
        return pciPolNum;
    }

    public void setPciPolNum(String pciPolNum) {
        this.pciPolNum = pciPolNum;
    }

    public String getPciClmNum() {
        return pciClmNum;
    }

    public void setPciClmNum(String pciClmNum) {
        this.pciClmNum = pciClmNum;
    }

    public Integer getPciOffId() {
        return pciOffId;
    }

    public void setPciOffId(Integer pciOffId) {
        this.pciOffId = pciOffId;
    }

    public String getPciOff() {
        return pciOff;
    }

    public void setPciOff(String pciOff) {
        this.pciOff = pciOff;
    }

    public String getPciRegDt() {
        return pciRegDt;
    }

    public void setPciRegDt(String pciRegDt) {
        this.pciRegDt = pciRegDt;
    }

    public String getPciRegSysdt() {
        return pciRegSysdt;
    }

    public void setPciRegSysdt(String pciRegSysdt) {
        this.pciRegSysdt = pciRegSysdt;
    }

    public String getPciCreateBy() {
        return pciCreateBy;
    }

    public void setPciCreateBy(String pciCreateBy) {
        this.pciCreateBy = pciCreateBy;
    }

    public String getPciApprDt() {
        return pciApprDt;
    }

    public void setPciApprDt(String pciApprDt) {
        this.pciApprDt = pciApprDt;
    }

    public String getPciApprBy() {
        return pciApprBy;
    }

    public void setPciApprBy(String pciApprBy) {
        this.pciApprBy = pciApprBy;
    }

    public String getPciNarration() {
        return pciNarration;
    }

    public void setPciNarration(String pciNarration) {
        this.pciNarration = pciNarration;
    }

    public String getPciContactNo() {
        return pciContactNo;
    }

    public void setPciContactNo(String pciContactNo) {
        this.pciContactNo = pciContactNo;
    }

    public Integer getPciCttId() {
        return pciCttId;
    }

    public void setPciCttId(Integer pciCttId) {
        this.pciCttId = pciCttId;
    }

    public String getPciIdDesc() {
        return pciIdDesc;
    }

    public void setPciIdDesc(String pciIdDesc) {
        this.pciIdDesc = pciIdDesc;
    }

    public String getPciIdNum() {
        return pciIdNum;
    }

    public void setPciIdNum(String pciIdNum) {
        this.pciIdNum = pciIdNum;
    }

    public Integer getPciPpmSysid() {
        return pciPpmSysid;
    }

    public void setPciPpmSysid(Integer pciPpmSysid) {
        this.pciPpmSysid = pciPpmSysid;
    }

    public String getPciMode() {
        return pciMode;
    }

    public void setPciMode(String pciMode) {
        this.pciMode = pciMode;
    }

    public String getPciMmNo() {
        return pciMmNo;
    }

    public void setPciMmNo(String pciMmNo) {
        this.pciMmNo = pciMmNo;
    }

    public String getPciBank() {
        return pciBank;
    }

    public void setPciBank(String pciBank) {
        this.pciBank = pciBank;
    }

    public String getPciBankBr() {
        return pciBankBr;
    }

    public void setPciBankBr(String pciBankBr) {
        this.pciBankBr = pciBankBr;
    }

    public String getPciBankAcct() {
        return pciBankAcct;
    }

    public void setPciBankAcct(String pciBankAcct) {
        this.pciBankAcct = pciBankAcct;
    }

    public Integer getPciPctSysid() {
        return pciPctSysid;
    }

    public void setPciPctSysid(Integer pciPctSysid) {
        this.pciPctSysid = pciPctSysid;
    }

    public String getPciClmType() {
        return pciClmType;
    }

    public void setPciClmType(String pciClmType) {
        this.pciClmType = pciClmType;
    }

    public String getPciSts() {
        return pciSts;
    }

    public void setPciSts(String pciSts) {
        this.pciSts = pciSts;
    }

    public String getPciClmproDt() {
        return pciClmproDt;
    }

    public void setPciClmproDt(String pciClmproDt) {
        this.pciClmproDt = pciClmproDt;
    }

    public String getPciClmproBy() {
        return pciClmproBy;
    }

    public void setPciClmproBy(String pciClmproBy) {
        this.pciClmproBy = pciClmproBy;
    }

    public String getPciSysprcsSts() {
        return pciSysprcsSts;
    }

    public void setPciSysprcsSts(String pciSysprcsSts) {
        this.pciSysprcsSts = pciSysprcsSts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pciSysid != null ? pciSysid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhClmInit)) {
            return false;
        }
        PolhClmInit other = (PolhClmInit) object;
        if ((this.pciSysid == null && other.pciSysid != null) || (this.pciSysid != null && !this.pciSysid.equals(other.pciSysid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhClmInit[ pciSysid=" + pciSysid + " ]";
    }
    
}
