/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.BranchPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class BranchTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BRANCH_SYSID")
    private int branchSysid;
    @Basic(optional = false)
    @Column(name = "BARNCH_CMP_SYSID")
    private int barnchCmpSysid;
    @Basic(optional = false)
    @Column(name = "BRANCH_USER_SYSID")
    private int branchUserSysid;
    @Basic(optional = false)
    @Column(name = "BRANCH_TYP_ID")
    private int branchTypId;

    public BranchTbPK() {
    }

    public BranchTbPK(int branchSysid, int barnchCmpSysid, int branchUserSysid, int branchTypId) {
        this.branchSysid = branchSysid;
        this.barnchCmpSysid = barnchCmpSysid;
        this.branchUserSysid = branchUserSysid;
        this.branchTypId = branchTypId;
    }
    
    public BranchTbPK(BranchPKModel bpk) {
        this.branchSysid = bpk.getBranchSysid();
        this.barnchCmpSysid = bpk.getBarnchCmpSysid();
        this.branchUserSysid = bpk.getBranchUserSysid();
        this.branchTypId = bpk.getBranchTypId();
    }

    public int getBranchSysid() {
        return branchSysid;
    }

    public void setBranchSysid(int branchSysid) {
        this.branchSysid = branchSysid;
    }

    public int getBarnchCmpSysid() {
        return barnchCmpSysid;
    }

    public void setBarnchCmpSysid(int barnchCmpSysid) {
        this.barnchCmpSysid = barnchCmpSysid;
    }

    public int getBranchUserSysid() {
        return branchUserSysid;
    }

    public void setBranchUserSysid(int branchUserSysid) {
        this.branchUserSysid = branchUserSysid;
    }

    public int getBranchTypId() {
        return branchTypId;
    }

    public void setBranchTypId(int branchTypId) {
        this.branchTypId = branchTypId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) branchSysid;
        hash += (int) barnchCmpSysid;
        hash += (int) branchUserSysid;
        hash += (int) branchTypId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchTbPK)) {
            return false;
        }
        BranchTbPK other = (BranchTbPK) object;
        if (this.branchSysid != other.branchSysid) {
            return false;
        }
        if (this.barnchCmpSysid != other.barnchCmpSysid) {
            return false;
        }
        if (this.branchUserSysid != other.branchUserSysid) {
            return false;
        }
        if (this.branchTypId != other.branchTypId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.BranchTbPK[ branchSysid=" + branchSysid + ", barnchCmpSysid=" + barnchCmpSysid + ", branchUserSysid=" + branchUserSysid + ", branchTypId=" + branchTypId + " ]";
    }
    
}
