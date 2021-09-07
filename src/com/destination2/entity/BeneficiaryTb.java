/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.BeneficiaryTbModel;
import com.model.BeneficiaryTbPKModel;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "beneficiary_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BeneficiaryTb.findAll", query = "SELECT b FROM BeneficiaryTb b"),
    @NamedQuery(name = "BeneficiaryTb.findByBenSysid", query = "SELECT b FROM BeneficiaryTb b WHERE b.beneficiaryTbPK.benSysid = :benSysid"),
    @NamedQuery(name = "BeneficiaryTb.findByBenCusSysid", query = "SELECT b FROM BeneficiaryTb b WHERE b.beneficiaryTbPK.benCusSysid = :benCusSysid"),
    @NamedQuery(name = "BeneficiaryTb.findByBenPolhSysid", query = "SELECT b FROM BeneficiaryTb b WHERE b.beneficiaryTbPK.benPolhSysid = :benPolhSysid"),
    @NamedQuery(name = "BeneficiaryTb.findByBenCode", query = "SELECT b FROM BeneficiaryTb b WHERE b.benCode = :benCode"),
    @NamedQuery(name = "BeneficiaryTb.findByBenName", query = "SELECT b FROM BeneficiaryTb b WHERE b.benName = :benName"),
    @NamedQuery(name = "BeneficiaryTb.findByBenDob", query = "SELECT b FROM BeneficiaryTb b WHERE b.benDob = :benDob"),
    @NamedQuery(name = "BeneficiaryTb.findByBenAge", query = "SELECT b FROM BeneficiaryTb b WHERE b.benAge = :benAge"),
    @NamedQuery(name = "BeneficiaryTb.findByBenAddrs", query = "SELECT b FROM BeneficiaryTb b WHERE b.benAddrs = :benAddrs"),
    @NamedQuery(name = "BeneficiaryTb.findByBenGender", query = "SELECT b FROM BeneficiaryTb b WHERE b.benGender = :benGender"),
    @NamedQuery(name = "BeneficiaryTb.findByBenRelation", query = "SELECT b FROM BeneficiaryTb b WHERE b.benRelation = :benRelation"),
    @NamedQuery(name = "BeneficiaryTb.findByBenSharePercent", query = "SELECT b FROM BeneficiaryTb b WHERE b.benSharePercent = :benSharePercent"),
    @NamedQuery(name = "BeneficiaryTb.findByBenMomoNo", query = "SELECT b FROM BeneficiaryTb b WHERE b.benMomoNo = :benMomoNo"),
    @NamedQuery(name = "BeneficiaryTb.findByBenCrtDt", query = "SELECT b FROM BeneficiaryTb b WHERE b.benCrtDt = :benCrtDt"),
    @NamedQuery(name = "BeneficiaryTb.findByBenSysDt", query = "SELECT b FROM BeneficiaryTb b WHERE b.benSysDt = :benSysDt"),
    @NamedQuery(name = "BeneficiaryTb.findByBenCrtUser", query = "SELECT b FROM BeneficiaryTb b WHERE b.benCrtUser = :benCrtUser"),
    @NamedQuery(name = "BeneficiaryTb.findByBenBfSysId", query = "SELECT b FROM BeneficiaryTb b WHERE b.benBfSysId = :benBfSysId"),
    @NamedQuery(name = "BeneficiaryTb.findByBenBfDesc", query = "SELECT b FROM BeneficiaryTb b WHERE b.benBfDesc = :benBfDesc"),
    @NamedQuery(name = "BeneficiaryTb.findByBenSts", query = "SELECT b FROM BeneficiaryTb b WHERE b.benSts = :benSts")})
public class BeneficiaryTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BeneficiaryTbPK beneficiaryTbPK;
    @Size(max = 15)
    @Column(name = "BEN_CODE")
    private String benCode;
    @Size(max = 150)
    @Column(name = "BEN_NAME")
    private String benName;
    @Column(name = "BEN_DOB")
    private String benDob;
    @Column(name = "BEN_AGE")
    private Integer benAge;
    @Size(max = 250)
    @Column(name = "BEN_ADDRS")
    private String benAddrs;
    @Size(max = 50)
    @Column(name = "BEN_GENDER")
    private String benGender;
    @Size(max = 150)
    @Column(name = "BEN_RELATION")
    private String benRelation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BEN_SHARE_PERCENT")
    private BigDecimal benSharePercent;
    @Size(max = 15)
    @Column(name = "BEN_MOMO_NO")
    private String benMomoNo;
    @Column(name = "BEN_CRT_DT")
    private String benCrtDt;
    @Column(name = "BEN_SYS_DT")
    private String benSysDt;
    @Size(max = 50)
    @Column(name = "BEN_CRT_USER")
    private String benCrtUser;
    @Column(name = "BEN_BF_SYS_ID")
    private Integer benBfSysId;
    @Size(max = 50)
    @Column(name = "BEN_BF_DESC")
    private String benBfDesc;
    @Size(max = 5)
    @Column(name = "BEN_STS")
    private String benSts;

    public BeneficiaryTb() {
    }
    
    public BeneficiaryTb(BeneficiaryTbModel benTb) {
        this.beneficiaryTbPK = new BeneficiaryTbPK(benTb.getBeneficiaryTbPK().getBenSysid(), benTb.getBeneficiaryTbPK().getBenCusSysid(), benTb.getBeneficiaryTbPK().getBenPolhSysid());
        this.benCode = benTb.getBenCode();
        this.benName = benTb.getBenName();
        this.benDob = benTb.getBenDob();
        this.benAge = benTb.getBenAge();
        this.benAddrs = benTb.getBenAddrs();
        this.benGender = benTb.getBenGender();
        this.benRelation = benTb.getBenRelation();
        this.benSharePercent = benTb.getBenSharePercent();
        this.benMomoNo = benTb.getBenMomoNo();
        this.benCrtDt = benTb.getBenCrtDt();
        this.benSysDt = benTb.getBenSysDt();
        this.benCrtUser = benTb.getBenCrtUser();
        this.benBfSysId = benTb.getBenBfSysId();
        this.benBfDesc = benTb.getBenBfDesc();
        this.benSts = benTb.getBenSts();
    }

    public BeneficiaryTb(BeneficiaryTbPK beneficiaryTbPK) {
        this.beneficiaryTbPK = beneficiaryTbPK;
    }

    public BeneficiaryTb(int benSysid, int benCusSysid, int benPolhSysid) {
        this.beneficiaryTbPK = new BeneficiaryTbPK(benSysid, benCusSysid, benPolhSysid);
    }

    public BeneficiaryTbPK getBeneficiaryTbPK() {
        return beneficiaryTbPK;
    }

    public void setBeneficiaryTbPK(BeneficiaryTbPK beneficiaryTbPK) {
        this.beneficiaryTbPK = beneficiaryTbPK;
    }

    public String getBenCode() {
        return benCode;
    }

    public void setBenCode(String benCode) {
        this.benCode = benCode;
    }

    public String getBenName() {
        return benName;
    }

    public void setBenName(String benName) {
        this.benName = benName;
    }

    public String getBenDob() {
        return benDob;
    }

    public void setBenDob(String benDob) {
        this.benDob = benDob;
    }

    public Integer getBenAge() {
        return benAge;
    }

    public void setBenAge(Integer benAge) {
        this.benAge = benAge;
    }

    public String getBenAddrs() {
        return benAddrs;
    }

    public void setBenAddrs(String benAddrs) {
        this.benAddrs = benAddrs;
    }

    public String getBenGender() {
        return benGender;
    }

    public void setBenGender(String benGender) {
        this.benGender = benGender;
    }

    public String getBenRelation() {
        return benRelation;
    }

    public void setBenRelation(String benRelation) {
        this.benRelation = benRelation;
    }

    public BigDecimal getBenSharePercent() {
        return benSharePercent;
    }

    public void setBenSharePercent(BigDecimal benSharePercent) {
        this.benSharePercent = benSharePercent;
    }

    public String getBenMomoNo() {
        return benMomoNo;
    }

    public void setBenMomoNo(String benMomoNo) {
        this.benMomoNo = benMomoNo;
    }

    public String getBenCrtDt() {
        return benCrtDt;
    }

    public void setBenCrtDt(String benCrtDt) {
        this.benCrtDt = benCrtDt;
    }

    public String getBenSysDt() {
        return benSysDt;
    }

    public void setBenSysDt(String benSysDt) {
        this.benSysDt = benSysDt;
    }

    public String getBenCrtUser() {
        return benCrtUser;
    }

    public void setBenCrtUser(String benCrtUser) {
        this.benCrtUser = benCrtUser;
    }

    public Integer getBenBfSysId() {
        return benBfSysId;
    }

    public void setBenBfSysId(Integer benBfSysId) {
        this.benBfSysId = benBfSysId;
    }

    public String getBenBfDesc() {
        return benBfDesc;
    }

    public void setBenBfDesc(String benBfDesc) {
        this.benBfDesc = benBfDesc;
    }

    public String getBenSts() {
        return benSts;
    }

    public void setBenSts(String benSts) {
        this.benSts = benSts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beneficiaryTbPK != null ? beneficiaryTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiaryTb)) {
            return false;
        }
        BeneficiaryTb other = (BeneficiaryTb) object;
        if ((this.beneficiaryTbPK == null && other.beneficiaryTbPK != null) || (this.beneficiaryTbPK != null && !this.beneficiaryTbPK.equals(other.beneficiaryTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.BeneficiaryTb[ beneficiaryTbPK=" + beneficiaryTbPK + " ]";
    }
    
}
