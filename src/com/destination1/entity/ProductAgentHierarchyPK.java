/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductAgentHierarchyPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class ProductAgentHierarchyPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PAH_SYSID")
    private int pahSysid;
    @Basic(optional = false)
    @Column(name = "PAH_PAL_LEVEL_ID")
    private int pahPalLevelId;

    public ProductAgentHierarchyPK() {
    }

    public ProductAgentHierarchyPK(int pahSysid, int pahPalLevelId) {
        this.pahSysid = pahSysid;
        this.pahPalLevelId = pahPalLevelId;
    }
    
    public ProductAgentHierarchyPK(ProductAgentHierarchyPKModel pahpk) {
        this.pahSysid = pahpk.getPahSysid();
        this.pahPalLevelId = pahpk.getPahPalLevelId();
    }

    public int getPahSysid() {
        return pahSysid;
    }

    public void setPahSysid(int pahSysid) {
        this.pahSysid = pahSysid;
    }

    public int getPahPalLevelId() {
        return pahPalLevelId;
    }

    public void setPahPalLevelId(int pahPalLevelId) {
        this.pahPalLevelId = pahPalLevelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pahSysid;
        hash += (int) pahPalLevelId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAgentHierarchyPK)) {
            return false;
        }
        ProductAgentHierarchyPK other = (ProductAgentHierarchyPK) object;
        if (this.pahSysid != other.pahSysid) {
            return false;
        }
        if (this.pahPalLevelId != other.pahPalLevelId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ProductAgentHierarchyPK[ pahSysid=" + pahSysid + ", pahPalLevelId=" + pahPalLevelId + " ]";
    }
    
}
