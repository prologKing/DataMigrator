/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductAgentsPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class ProductAgentsTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAGT_SYSID")
    private int pagtSysid;
    @Basic(optional = false)
    @Column(name = "PAGT_USER_SYSID")
    private int pagtUserSysid;
    @Basic(optional = false)
    @Column(name = "PAGT_BRANCH_SYSID")
    private int pagtBranchSysid;
    @Basic(optional = false)
    @Column(name = "PAGT_PBK_SYSID")
    private int pagtPbkSysid;
    @Basic(optional = false)
    @Column(name = "PAGT_PBKB_SYSID")
    private int pagtPbkbSysid;
    @Basic(optional = false)
    @Column(name = "PAGT_PAH_SYSID")
    private int pagtPahSysid;
    @Basic(optional = false)
    @Column(name = "PAGT_PAL_LEVEL_ID")
    private int pagtPalLevelId;

    public ProductAgentsTbPK() {
    }

    public ProductAgentsTbPK(int pagtSysid, int pagtUserSysid, int pagtBranchSysid, int pagtPbkSysid, int pagtPbkbSysid, int pagtPahSysid, int pagtPalLevelId) {
        this.pagtSysid = pagtSysid;
        this.pagtUserSysid = pagtUserSysid;
        this.pagtBranchSysid = pagtBranchSysid;
        this.pagtPbkSysid = pagtPbkSysid;
        this.pagtPbkbSysid = pagtPbkbSysid;
        this.pagtPahSysid = pagtPahSysid;
        this.pagtPalLevelId = pagtPalLevelId;
    }
    
    public ProductAgentsTbPK(ProductAgentsPKModel patb) {
        this.pagtSysid = patb.getPagtSysid();
        this.pagtUserSysid = patb.getPagtUserSysid();
        this.pagtBranchSysid = patb.getPagtBranchSysid();
        this.pagtPbkSysid = patb.getPagtPbkSysid();
        this.pagtPbkbSysid = patb.getPagtPbkbSysid();
        this.pagtPahSysid = patb.getPagtPahSysid();
        this.pagtPalLevelId = patb.getPagtPalLevelId();
    }  

    public int getPagtSysid() {
        return pagtSysid;
    }

    public void setPagtSysid(int pagtSysid) {
        this.pagtSysid = pagtSysid;
    }

    public int getPagtUserSysid() {
        return pagtUserSysid;
    }

    public void setPagtUserSysid(int pagtUserSysid) {
        this.pagtUserSysid = pagtUserSysid;
    }

    public int getPagtBranchSysid() {
        return pagtBranchSysid;
    }

    public void setPagtBranchSysid(int pagtBranchSysid) {
        this.pagtBranchSysid = pagtBranchSysid;
    }

    public int getPagtPbkSysid() {
        return pagtPbkSysid;
    }

    public void setPagtPbkSysid(int pagtPbkSysid) {
        this.pagtPbkSysid = pagtPbkSysid;
    }

    public int getPagtPbkbSysid() {
        return pagtPbkbSysid;
    }

    public void setPagtPbkbSysid(int pagtPbkbSysid) {
        this.pagtPbkbSysid = pagtPbkbSysid;
    }

    public int getPagtPahSysid() {
        return pagtPahSysid;
    }

    public void setPagtPahSysid(int pagtPahSysid) {
        this.pagtPahSysid = pagtPahSysid;
    }

    public int getPagtPalLevelId() {
        return pagtPalLevelId;
    }

    public void setPagtPalLevelId(int pagtPalLevelId) {
        this.pagtPalLevelId = pagtPalLevelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pagtSysid;
        hash += (int) pagtUserSysid;
        hash += (int) pagtBranchSysid;
        hash += (int) pagtPbkSysid;
        hash += (int) pagtPbkbSysid;
        hash += (int) pagtPahSysid;
        hash += (int) pagtPalLevelId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAgentsTbPK)) {
            return false;
        }
        ProductAgentsTbPK other = (ProductAgentsTbPK) object;
        if (this.pagtSysid != other.pagtSysid) {
            return false;
        }
        if (this.pagtUserSysid != other.pagtUserSysid) {
            return false;
        }
        if (this.pagtBranchSysid != other.pagtBranchSysid) {
            return false;
        }
        if (this.pagtPbkSysid != other.pagtPbkSysid) {
            return false;
        }
        if (this.pagtPbkbSysid != other.pagtPbkbSysid) {
            return false;
        }
        if (this.pagtPahSysid != other.pagtPahSysid) {
            return false;
        }
        if (this.pagtPalLevelId != other.pagtPalLevelId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ProductAgentsTbPK[ pagtSysid=" + pagtSysid + ", pagtUserSysid=" + pagtUserSysid + ", pagtBranchSysid=" + pagtBranchSysid + ", pagtPbkSysid=" + pagtPbkSysid + ", pagtPbkbSysid=" + pagtPbkbSysid + ", pagtPahSysid=" + pagtPahSysid + ", pagtPalLevelId=" + pagtPalLevelId + " ]";
    }
    
}
