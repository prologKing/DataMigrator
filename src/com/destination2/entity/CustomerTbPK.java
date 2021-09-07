/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.CustomerTbPKModel;
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
public class CustomerTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CUS_SYSID")
    private int cusSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUS_USER_SYSID")
    private int cusUserSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUS_BRANCH_SYSID")
    private int cusBranchSysid;

    public CustomerTbPK() {
    }
    
    public CustomerTbPK(CustomerTbPKModel cpk) {
        this.cusSysid = cpk.getCusSysid();
        this.cusUserSysid = cpk.getCusUserSysid();
        this.cusBranchSysid = cpk.getCusBranchSysid();
    }

    public CustomerTbPK(int cusSysid, int cusUserSysid, int cusBranchSysid) {
        this.cusSysid = cusSysid;
        this.cusUserSysid = cusUserSysid;
        this.cusBranchSysid = cusBranchSysid;
    }

    public int getCusSysid() {
        return cusSysid;
    }

    public void setCusSysid(int cusSysid) {
        this.cusSysid = cusSysid;
    }

    public int getCusUserSysid() {
        return cusUserSysid;
    }

    public void setCusUserSysid(int cusUserSysid) {
        this.cusUserSysid = cusUserSysid;
    }

    public int getCusBranchSysid() {
        return cusBranchSysid;
    }

    public void setCusBranchSysid(int cusBranchSysid) {
        this.cusBranchSysid = cusBranchSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cusSysid;
        hash += (int) cusUserSysid;
        hash += (int) cusBranchSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerTbPK)) {
            return false;
        }
        CustomerTbPK other = (CustomerTbPK) object;
        if (this.cusSysid != other.cusSysid) {
            return false;
        }
        if (this.cusUserSysid != other.cusUserSysid) {
            return false;
        }
        if (this.cusBranchSysid != other.cusBranchSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.CustomerTbPK[ cusSysid=" + cusSysid + ", cusUserSysid=" + cusUserSysid + ", cusBranchSysid=" + cusBranchSysid + " ]";
    }
    
}
