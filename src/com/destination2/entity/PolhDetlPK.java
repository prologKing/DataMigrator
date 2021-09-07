/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhDetlPKModel;
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
public class PolhDetlPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "POLH_SYSID")
    private int polhSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POLH_CUS_SYSID")
    private int polhCusSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POLH_PDT_SYSID")
    private int polhPdtSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POLH_USER_SYSID")
    private int polhUserSysid;

    public PolhDetlPK() {
    }

    public PolhDetlPK(int polhSysid, int polhCusSysid, int polhPdtSysid, int polhUserSysid) {
        this.polhSysid = polhSysid;
        this.polhCusSysid = polhCusSysid;
        this.polhPdtSysid = polhPdtSysid;
        this.polhUserSysid = polhUserSysid;
    }
    
     public PolhDetlPK(PolhDetlPKModel pdpk) {
        this.polhSysid = pdpk.getPolhSysid();
        this.polhCusSysid = pdpk.getPolhCusSysid();
        this.polhPdtSysid = pdpk.getPolhPdtSysid();
        this.polhUserSysid = pdpk.getPolhUserSysid();
    } 

    public int getPolhSysid() {
        return polhSysid;
    }

    public void setPolhSysid(int polhSysid) {
        this.polhSysid = polhSysid;
    }

    public int getPolhCusSysid() {
        return polhCusSysid;
    }

    public void setPolhCusSysid(int polhCusSysid) {
        this.polhCusSysid = polhCusSysid;
    }

    public int getPolhPdtSysid() {
        return polhPdtSysid;
    }

    public void setPolhPdtSysid(int polhPdtSysid) {
        this.polhPdtSysid = polhPdtSysid;
    }

    public int getPolhUserSysid() {
        return polhUserSysid;
    }

    public void setPolhUserSysid(int polhUserSysid) {
        this.polhUserSysid = polhUserSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) polhSysid;
        hash += (int) polhCusSysid;
        hash += (int) polhPdtSysid;
        hash += (int) polhUserSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhDetlPK)) {
            return false;
        }
        PolhDetlPK other = (PolhDetlPK) object;
        if (this.polhSysid != other.polhSysid) {
            return false;
        }
        if (this.polhCusSysid != other.polhCusSysid) {
            return false;
        }
        if (this.polhPdtSysid != other.polhPdtSysid) {
            return false;
        }
        if (this.polhUserSysid != other.polhUserSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhDetlPK[ polhSysid=" + polhSysid + ", polhCusSysid=" + polhCusSysid + ", polhPdtSysid=" + polhPdtSysid + ", polhUserSysid=" + polhUserSysid + " ]";
    }
    
}
