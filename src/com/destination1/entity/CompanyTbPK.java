/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.CompanyPkModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class CompanyTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMP_SYSID")
    private int cmpSysid;
    @Basic(optional = false)
    @Column(name = "CMP_USER_SYSID")
    private int cmpUserSysid;

    public CompanyTbPK() {
    }

    public CompanyTbPK(int cmpSysid, int cmpUserSysid) {
        this.cmpSysid = cmpSysid;
        this.cmpUserSysid = cmpUserSysid;
    }
    
     public CompanyTbPK(CompanyPkModel comp) {
        this.cmpSysid = comp.getCmpSysid();
        this.cmpUserSysid = comp.getCmpUserSysid();
    }

    public int getCmpSysid() {
        return cmpSysid;
    }

    public void setCmpSysid(int cmpSysid) {
        this.cmpSysid = cmpSysid;
    }

    public int getCmpUserSysid() {
        return cmpUserSysid;
    }

    public void setCmpUserSysid(int cmpUserSysid) {
        this.cmpUserSysid = cmpUserSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cmpSysid;
        hash += (int) cmpUserSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyTbPK)) {
            return false;
        }
        CompanyTbPK other = (CompanyTbPK) object;
        if (this.cmpSysid != other.cmpSysid) {
            return false;
        }
        if (this.cmpUserSysid != other.cmpUserSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.CompanyTbPK[ cmpSysid=" + cmpSysid + ", cmpUserSysid=" + cmpUserSysid + " ]";
    }
    
}
