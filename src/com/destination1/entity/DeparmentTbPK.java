/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.DepartmentPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class DeparmentTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DPT_SYSID")
    private int dptSysid;
    @Basic(optional = false)
    @Column(name = "DPT_USER_SYSID")
    private int dptUserSysid;

    public DeparmentTbPK() {
    }

    public DeparmentTbPK(int dptSysid, int dptUserSysid) {
        this.dptSysid = dptSysid;
        this.dptUserSysid = dptUserSysid;
    }
    
    public DeparmentTbPK(DepartmentPKModel dptm) {
        this.dptSysid = dptm.getDptSysid();
        this.dptUserSysid = dptm.getDptUserSysid();
    }

    public int getDptSysid() {
        return dptSysid;
    }

    public void setDptSysid(int dptSysid) {
        this.dptSysid = dptSysid;
    }

    public int getDptUserSysid() {
        return dptUserSysid;
    }

    public void setDptUserSysid(int dptUserSysid) {
        this.dptUserSysid = dptUserSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dptSysid;
        hash += (int) dptUserSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeparmentTbPK)) {
            return false;
        }
        DeparmentTbPK other = (DeparmentTbPK) object;
        if (this.dptSysid != other.dptSysid) {
            return false;
        }
        if (this.dptUserSysid != other.dptUserSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.DeparmentTbPK[ dptSysid=" + dptSysid + ", dptUserSysid=" + dptUserSysid + " ]";
    }
    
}
