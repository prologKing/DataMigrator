/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.BeneficiaryTbPKModel;
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
public class BeneficiaryTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BEN_SYSID")
    private int benSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BEN_CUS_SYSID")
    private int benCusSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BEN_POLH_SYSID")
    private int benPolhSysid;

    public BeneficiaryTbPK() {
    }

    public BeneficiaryTbPK(int benSysid, int benCusSysid, int benPolhSysid) {
        this.benSysid = benSysid;
        this.benCusSysid = benCusSysid;
        this.benPolhSysid = benPolhSysid;
    }
    
    public BeneficiaryTbPK(BeneficiaryTbPKModel benpk) {
        this.benSysid = benpk.getBenSysid();
        this.benCusSysid = benpk.getBenSysid();
        this.benPolhSysid = benpk.getBenPolhSysid();
    }

    public int getBenSysid() {
        return benSysid;
    }

    public void setBenSysid(int benSysid) {
        this.benSysid = benSysid;
    }

    public int getBenCusSysid() {
        return benCusSysid;
    }

    public void setBenCusSysid(int benCusSysid) {
        this.benCusSysid = benCusSysid;
    }

    public int getBenPolhSysid() {
        return benPolhSysid;
    }

    public void setBenPolhSysid(int benPolhSysid) {
        this.benPolhSysid = benPolhSysid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) benSysid;
        hash += (int) benCusSysid;
        hash += (int) benPolhSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiaryTbPK)) {
            return false;
        }
        BeneficiaryTbPK other = (BeneficiaryTbPK) object;
        if (this.benSysid != other.benSysid) {
            return false;
        }
        if (this.benCusSysid != other.benCusSysid) {
            return false;
        }
        if (this.benPolhSysid != other.benPolhSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.BeneficiaryTbPK[ benSysid=" + benSysid + ", benCusSysid=" + benCusSysid + ", benPolhSysid=" + benPolhSysid + " ]";
    }
    
}
