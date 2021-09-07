/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductAgentsModel;
import com.model.ProductAgentsPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "product_agents_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductAgentsTb.findAll", query = "SELECT p FROM ProductAgentsTb p"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtSysid = :pagtSysid"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtUserSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtUserSysid = :pagtUserSysid"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtBranchSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtBranchSysid = :pagtBranchSysid"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtReportId", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtReportId = :pagtReportId"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtReportMgr", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtReportMgr = :pagtReportMgr"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtPbkSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtPbkSysid = :pagtPbkSysid"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtPbkbSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtPbkbSysid = :pagtPbkbSysid"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtCode", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtCode = :pagtCode"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtSurname", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtSurname = :pagtSurname"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtOthname", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtOthname = :pagtOthname"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtGender", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtGender = :pagtGender"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtDob", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtDob = :pagtDob"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtAddrs", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtAddrs = :pagtAddrs"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtMobile", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtMobile = :pagtMobile"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtMomoNo", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtMomoNo = :pagtMomoNo"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtStatus", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtStatus = :pagtStatus"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtAcctNo", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtAcctNo = :pagtAcctNo"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtRegDt", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtRegDt = :pagtRegDt"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtCrtDt", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtCrtDt = :pagtCrtDt"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtEmail", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtEmail = :pagtEmail"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtPhoto", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtPhoto = :pagtPhoto"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtExitDt", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtExitDt = :pagtExitDt"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtMaritalSts", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtMaritalSts = :pagtMaritalSts"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtBfitStdt", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtBfitStdt = :pagtBfitStdt"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtEntSource", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtEntSource = :pagtEntSource"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtUsed", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtUsed = :pagtUsed"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtPahSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtPahSysid = :pagtPahSysid"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtLevel", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtLevel = :pagtLevel"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtHierarchy", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtHierarchy = :pagtHierarchy"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtPalLevelId", query = "SELECT p FROM ProductAgentsTb p WHERE p.productAgentsTbPK.pagtPalLevelId = :pagtPalLevelId"),
    @NamedQuery(name = "ProductAgentsTb.findByPagtSubbranchSysid", query = "SELECT p FROM ProductAgentsTb p WHERE p.pagtSubbranchSysid = :pagtSubbranchSysid")})
public class ProductAgentsTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductAgentsTbPK productAgentsTbPK;
    @Column(name = "PAGT_REPORT_ID")
    private Integer pagtReportId;
    @Column(name = "PAGT_REPORT_MGR")
    private String pagtReportMgr;
    @Column(name = "PAGT_CODE")
    private String pagtCode;
    @Basic(optional = false)
    @Column(name = "PAGT_SURNAME")
    private String pagtSurname;
    @Basic(optional = false)
    @Column(name = "PAGT_OTHNAME")
    private String pagtOthname;
    @Basic(optional = false)
    @Column(name = "PAGT_GENDER")
    private String pagtGender;
    @Basic(optional = false)
    @Column(name = "PAGT_DOB")
    private String pagtDob;
    @Column(name = "PAGT_ADDRS")
    private String pagtAddrs;
    @Column(name = "PAGT_MOBILE")
    private String pagtMobile;
    @Column(name = "PAGT_MOMO_NO")
    private String pagtMomoNo;
    @Basic(optional = false)
    @Column(name = "PAGT_STATUS")
    private String pagtStatus;
    @Column(name = "PAGT_ACCT_NO")
    private String pagtAcctNo;
    @Column(name = "PAGT_REG_DT")
    private String pagtRegDt;
    @Basic(optional = false)
    @Column(name = "PAGT_CRT_DT")
    private String pagtCrtDt;
    @Column(name = "PAGT_EMAIL")
    private String pagtEmail;
    @Basic(optional = false)
    @Column(name = "PAGT_PHOTO")
    private String pagtPhoto;
    @Column(name = "PAGT_EXIT_DT")
    private String pagtExitDt;
    @Basic(optional = false)
    @Column(name = "PAGT_MARITAL_STS")
    private String pagtMaritalSts;
    @Basic(optional = false)
    @Column(name = "PAGT_BFIT_STDT")
    private String pagtBfitStdt;
    @Basic(optional = false)
    @Column(name = "PAGT_ENT_SOURCE")
    private String pagtEntSource;
    @Basic(optional = false)
    @Column(name = "PAGT_USED")
    private String pagtUsed;
    @Basic(optional = false)
    @Column(name = "PAGT_LEVEL")
    private String pagtLevel;
    @Basic(optional = false)
    @Column(name = "PAGT_HIERARCHY")
    private String pagtHierarchy;
    @Column(name = "PAGT_SUBBRANCH_SYSID")
    private Integer pagtSubbranchSysid;
  
    public ProductAgentsTb() {
    }

    public ProductAgentsTb(ProductAgentsTbPK productAgentsTbPK) {
        this.productAgentsTbPK = productAgentsTbPK;
    }

    public ProductAgentsTb(ProductAgentsTbPK productAgentsTbPK, String pagtSurname, String pagtOthname, String pagtGender, String pagtDob, String pagtStatus, String pagtCrtDt, String pagtPhoto, String pagtMaritalSts, String pagtBfitStdt, String pagtEntSource, String pagtUsed, String pagtLevel, String pagtHierarchy) {
        this.productAgentsTbPK = productAgentsTbPK;
        this.pagtSurname = pagtSurname;
        this.pagtOthname = pagtOthname;
        this.pagtGender = pagtGender;
        this.pagtDob = pagtDob;
        this.pagtStatus = pagtStatus;
        this.pagtCrtDt = pagtCrtDt;
        this.pagtPhoto = pagtPhoto;
        this.pagtMaritalSts = pagtMaritalSts;
        this.pagtBfitStdt = pagtBfitStdt;
        this.pagtEntSource = pagtEntSource;
        this.pagtUsed = pagtUsed;
        this.pagtLevel = pagtLevel;
        this.pagtHierarchy = pagtHierarchy;
    }
    
    public ProductAgentsTb(ProductAgentsModel patb) {
        this.productAgentsTbPK = new ProductAgentsTbPK(patb.getProductAgentsTbPK());
        this.pagtReportId = patb.getPagtReportId();
        this.pagtReportMgr = patb.getPagtReportMgr();
        this.pagtCode = patb.getPagtCode();
        this.pagtSurname = patb.getPagtSurname();
        this.pagtOthname = patb.getPagtOthname();
        this.pagtGender = patb.getPagtGender();
        this.pagtDob = patb.getPagtDob();
        this.pagtAddrs = patb.getPagtAddrs();
        this.pagtMobile = patb.getPagtMobile();
        this.pagtMomoNo = patb.getPagtMomoNo();
        this.pagtStatus = patb.getPagtStatus();
        this.pagtAcctNo = patb.getPagtAcctNo();
        this.pagtRegDt = patb.getPagtRegDt();
        this.pagtCrtDt = patb.getPagtCrtDt();
        this.pagtEmail = patb.getPagtEmail();
        this.pagtPhoto = patb.getPagtPhoto();
        this.pagtExitDt = patb.getPagtExitDt();
        this.pagtMaritalSts = patb.getPagtMaritalSts();
        this.pagtBfitStdt = patb.getPagtBfitStdt();
        this.pagtEntSource = patb.getPagtEntSource();
        this.pagtUsed = patb.getPagtUsed();
        this.pagtLevel = patb.getPagtLevel();
        this.pagtHierarchy = patb.getPagtHierarchy();
        this.pagtSubbranchSysid = patb.getPagtSubbranchSysid();
    } 

    public ProductAgentsTb(int pagtSysid, int pagtUserSysid, int pagtBranchSysid, int pagtPbkSysid, int pagtPbkbSysid, int pagtPahSysid, int pagtPalLevelId) {
        this.productAgentsTbPK = new ProductAgentsTbPK(pagtSysid, pagtUserSysid, pagtBranchSysid, pagtPbkSysid, pagtPbkbSysid, pagtPahSysid, pagtPalLevelId);
    }

    public ProductAgentsTbPK getProductAgentsTbPK() {
        return productAgentsTbPK;
    }

    public void setProductAgentsTbPK(ProductAgentsTbPK productAgentsTbPK) {
        this.productAgentsTbPK = productAgentsTbPK;
    }

    public Integer getPagtReportId() {
        return pagtReportId;
    }

    public void setPagtReportId(Integer pagtReportId) {
        this.pagtReportId = pagtReportId;
    }

    public String getPagtReportMgr() {
        return pagtReportMgr;
    }

    public void setPagtReportMgr(String pagtReportMgr) {
        this.pagtReportMgr = pagtReportMgr;
    }

    public String getPagtCode() {
        return pagtCode;
    }

    public void setPagtCode(String pagtCode) {
        this.pagtCode = pagtCode;
    }

    public String getPagtSurname() {
        return pagtSurname;
    }

    public void setPagtSurname(String pagtSurname) {
        this.pagtSurname = pagtSurname;
    }

    public String getPagtOthname() {
        return pagtOthname;
    }

    public void setPagtOthname(String pagtOthname) {
        this.pagtOthname = pagtOthname;
    }

    public String getPagtGender() {
        return pagtGender;
    }

    public void setPagtGender(String pagtGender) {
        this.pagtGender = pagtGender;
    }

    public String getPagtDob() {
        return pagtDob;
    }

    public void setPagtDob(String pagtDob) {
        this.pagtDob = pagtDob;
    }

    public String getPagtAddrs() {
        return pagtAddrs;
    }

    public void setPagtAddrs(String pagtAddrs) {
        this.pagtAddrs = pagtAddrs;
    }

    public String getPagtMobile() {
        return pagtMobile;
    }

    public void setPagtMobile(String pagtMobile) {
        this.pagtMobile = pagtMobile;
    }

    public String getPagtMomoNo() {
        return pagtMomoNo;
    }

    public void setPagtMomoNo(String pagtMomoNo) {
        this.pagtMomoNo = pagtMomoNo;
    }

    public String getPagtStatus() {
        return pagtStatus;
    }

    public void setPagtStatus(String pagtStatus) {
        this.pagtStatus = pagtStatus;
    }

    public String getPagtAcctNo() {
        return pagtAcctNo;
    }

    public void setPagtAcctNo(String pagtAcctNo) {
        this.pagtAcctNo = pagtAcctNo;
    }

    public String getPagtRegDt() {
        return pagtRegDt;
    }

    public void setPagtRegDt(String pagtRegDt) {
        this.pagtRegDt = pagtRegDt;
    }

    public String getPagtCrtDt() {
        return pagtCrtDt;
    }

    public void setPagtCrtDt(String pagtCrtDt) {
        this.pagtCrtDt = pagtCrtDt;
    }

    public String getPagtEmail() {
        return pagtEmail;
    }

    public void setPagtEmail(String pagtEmail) {
        this.pagtEmail = pagtEmail;
    }

    public String getPagtPhoto() {
        return pagtPhoto;
    }

    public void setPagtPhoto(String pagtPhoto) {
        this.pagtPhoto = pagtPhoto;
    }

    public String getPagtExitDt() {
        return pagtExitDt;
    }

    public void setPagtExitDt(String pagtExitDt) {
        this.pagtExitDt = pagtExitDt;
    }

    public String getPagtMaritalSts() {
        return pagtMaritalSts;
    }

    public void setPagtMaritalSts(String pagtMaritalSts) {
        this.pagtMaritalSts = pagtMaritalSts;
    }

    public String getPagtBfitStdt() {
        return pagtBfitStdt;
    }

    public void setPagtBfitStdt(String pagtBfitStdt) {
        this.pagtBfitStdt = pagtBfitStdt;
    }

    public String getPagtEntSource() {
        return pagtEntSource;
    }

    public void setPagtEntSource(String pagtEntSource) {
        this.pagtEntSource = pagtEntSource;
    }

    public String getPagtUsed() {
        return pagtUsed;
    }

    public void setPagtUsed(String pagtUsed) {
        this.pagtUsed = pagtUsed;
    }

    public String getPagtLevel() {
        return pagtLevel;
    }

    public void setPagtLevel(String pagtLevel) {
        this.pagtLevel = pagtLevel;
    }

    public String getPagtHierarchy() {
        return pagtHierarchy;
    }

    public void setPagtHierarchy(String pagtHierarchy) {
        this.pagtHierarchy = pagtHierarchy;
    }

    public Integer getPagtSubbranchSysid() {
        return pagtSubbranchSysid;
    }

    public void setPagtSubbranchSysid(Integer pagtSubbranchSysid) {
        this.pagtSubbranchSysid = pagtSubbranchSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productAgentsTbPK != null ? productAgentsTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAgentsTb)) {
            return false;
        }
        ProductAgentsTb other = (ProductAgentsTb) object;
        if ((this.productAgentsTbPK == null && other.productAgentsTbPK != null) || (this.productAgentsTbPK != null && !this.productAgentsTbPK.equals(other.productAgentsTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ProductAgentsTb[ productAgentsTbPK=" + productAgentsTbPK + " ]";
    }
    
}
