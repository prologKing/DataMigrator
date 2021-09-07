/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductBankBranchTbPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Developer
 */
@Embeddable
public class ProductBankBranchTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PBKB_SYSID")
    private int pbkbSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PBKB_PBK_SYSID")
    private int pbkbPbkSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PBKB_USER_SYSID")
    private int pbkbUserSysid;

    public ProductBankBranchTbPK() {
    }

    public ProductBankBranchTbPK(int pbkbSysid, int pbkbPbkSysid, int pbkbUserSysid) {
        this.pbkbSysid = pbkbSysid;
        this.pbkbPbkSysid = pbkbPbkSysid;
        this.pbkbUserSysid = pbkbUserSysid;
    }
    
    public ProductBankBranchTbPK(ProductBankBranchTbPKModel pbb) {
       this.pbkbSysid = pbb.getPbkbSysid();
       this.pbkbPbkSysid = pbb.getPbkbPbkSysid();
       this.pbkbUserSysid = pbb.getPbkbUserSysid();
    }

    public int getPbkbSysid() {
        return pbkbSysid;
    }

    public void setPbkbSysid(int pbkbSysid) {
        this.pbkbSysid = pbkbSysid;
    }

    public int getPbkbPbkSysid() {
        return pbkbPbkSysid;
    }

    public void setPbkbPbkSysid(int pbkbPbkSysid) {
        this.pbkbPbkSysid = pbkbPbkSysid;
    }

    public int getPbkbUserSysid() {
        return pbkbUserSysid;
    }

    public void setPbkbUserSysid(int pbkbUserSysid) {
        this.pbkbUserSysid = pbkbUserSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pbkbSysid;
        hash += (int) pbkbPbkSysid;
        hash += (int) pbkbUserSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductBankBranchTbPK)) {
            return false;
        }
        ProductBankBranchTbPK other = (ProductBankBranchTbPK) object;
        if (this.pbkbSysid != other.pbkbSysid) {
            return false;
        }
        if (this.pbkbPbkSysid != other.pbkbPbkSysid) {
            return false;
        }
        if (this.pbkbUserSysid != other.pbkbUserSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination1.entity.ProductBankBranchTbPK[ pbkbSysid=" + pbkbSysid + ", pbkbPbkSysid=" + pbkbPbkSysid + ", pbkbUserSysid=" + pbkbUserSysid + " ]";
    }
    
}
