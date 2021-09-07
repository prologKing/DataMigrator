/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.BranchModel;
import com.model.BranchPKModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "branch_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BranchTb.findAll", query = "SELECT b FROM BranchTb b"),
    @NamedQuery(name = "BranchTb.findByBranchSysid", query = "SELECT b FROM BranchTb b WHERE b.branchTbPK.branchSysid = :branchSysid"),
    @NamedQuery(name = "BranchTb.findByBarnchCmpSysid", query = "SELECT b FROM BranchTb b WHERE b.branchTbPK.barnchCmpSysid = :barnchCmpSysid"),
    @NamedQuery(name = "BranchTb.findByBranchUserSysid", query = "SELECT b FROM BranchTb b WHERE b.branchTbPK.branchUserSysid = :branchUserSysid"),
    @NamedQuery(name = "BranchTb.findByBranchCode", query = "SELECT b FROM BranchTb b WHERE b.branchCode = :branchCode"),
    @NamedQuery(name = "BranchTb.findByBranchName", query = "SELECT b FROM BranchTb b WHERE b.branchName = :branchName"),
    @NamedQuery(name = "BranchTb.findByBranchAddrs", query = "SELECT b FROM BranchTb b WHERE b.branchAddrs = :branchAddrs"),
    @NamedQuery(name = "BranchTb.findByBranchCrtDt", query = "SELECT b FROM BranchTb b WHERE b.branchCrtDt = :branchCrtDt"),
    @NamedQuery(name = "BranchTb.findByBranchMgr", query = "SELECT b FROM BranchTb b WHERE b.branchMgr = :branchMgr"),
    @NamedQuery(name = "BranchTb.findByBranchSts", query = "SELECT b FROM BranchTb b WHERE b.branchSts = :branchSts"),
    @NamedQuery(name = "BranchTb.findByBranchTypId", query = "SELECT b FROM BranchTb b WHERE b.branchTbPK.branchTypId = :branchTypId"),
    @NamedQuery(name = "BranchTb.findByBranchRegion", query = "SELECT b FROM BranchTb b WHERE b.branchRegion = :branchRegion"),
    @NamedQuery(name = "BranchTb.findByBranchBrkCode", query = "SELECT b FROM BranchTb b WHERE b.branchBrkCode = :branchBrkCode")})
public class BranchTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BranchTbPK branchTbPK;
    @Basic(optional = false)
    @Column(name = "BRANCH_CODE")
    private String branchCode;
    @Basic(optional = false)
    @Column(name = "BRANCH_NAME")
    private String branchName;
    @Column(name = "BRANCH_ADDRS")
    private String branchAddrs;
    @Column(name = "BRANCH_CRT_DT")
    private String branchCrtDt;
    @Column(name = "BRANCH_MGR")
    private String branchMgr;
    @Basic(optional = false)
    @Column(name = "BRANCH_STS")
    private String branchSts;
    @Basic(optional = false)
    @Column(name = "BRANCH_REGION")
    private String branchRegion;
    @Basic(optional = false)
    @Column(name = "BRANCH_BRK_CODE")
    private String branchBrkCode;
    

    public BranchTb() {
    }

    public BranchTb(BranchTbPK branchTbPK) {
        this.branchTbPK = branchTbPK;
    }

    public BranchTb(BranchTbPK branchTbPK, String branchCode, String branchName, String branchSts, String branchRegion, String branchBrkCode) {
        this.branchTbPK = branchTbPK;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.branchSts = branchSts;
        this.branchRegion = branchRegion;
        this.branchBrkCode = branchBrkCode;
    }
    
    public BranchTb(BranchModel branch) {
        this.branchTbPK = new BranchTbPK(branch.getBranchTbPK());
        this.branchCode = branch.getBranchCode();
        this.branchName = branch.getBranchName();
        this.branchAddrs = branch.getBranchAddrs();
        this.branchCrtDt = branch.getBranchCrtDt();
        this.branchMgr = branch.getBranchMgr();
        this.branchSts = branch.getBranchSts();
        this.branchRegion = branch.getBranchRegion();
        this.branchBrkCode = branch.getBranchBrkCode();
    }

    public BranchTb(int branchSysid, int barnchCmpSysid, int branchUserSysid, int branchTypId) {
        this.branchTbPK = new BranchTbPK(branchSysid, barnchCmpSysid, branchUserSysid, branchTypId);
    }

    public BranchTbPK getBranchTbPK() {
        return branchTbPK;
    }

    public void setBranchTbPK(BranchTbPK branchTbPK) {
        this.branchTbPK = branchTbPK;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddrs() {
        return branchAddrs;
    }

    public void setBranchAddrs(String branchAddrs) {
        this.branchAddrs = branchAddrs;
    }

    public String getBranchCrtDt() {
        return branchCrtDt;
    }

    public void setBranchCrtDt(String branchCrtDt) {
        this.branchCrtDt = branchCrtDt;
    }

    public String getBranchMgr() {
        return branchMgr;
    }

    public void setBranchMgr(String branchMgr) {
        this.branchMgr = branchMgr;
    }

    public String getBranchSts() {
        return branchSts;
    }

    public void setBranchSts(String branchSts) {
        this.branchSts = branchSts;
    }

    public String getBranchRegion() {
        return branchRegion;
    }

    public void setBranchRegion(String branchRegion) {
        this.branchRegion = branchRegion;
    }

    public String getBranchBrkCode() {
        return branchBrkCode;
    }

    public void setBranchBrkCode(String branchBrkCode) {
        this.branchBrkCode = branchBrkCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchTbPK != null ? branchTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchTb)) {
            return false;
        }
        BranchTb other = (BranchTb) object;
        if ((this.branchTbPK == null && other.branchTbPK != null) || (this.branchTbPK != null && !this.branchTbPK.equals(other.branchTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.BranchTb[ branchTbPK=" + branchTbPK + " ]";
    }
    
}
