/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.BranchTypeModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "branch_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BranchType.findAll", query = "SELECT b FROM BranchType b"),
    @NamedQuery(name = "BranchType.findByBtId", query = "SELECT b FROM BranchType b WHERE b.btId = :btId"),
    @NamedQuery(name = "BranchType.findByBtDesc", query = "SELECT b FROM BranchType b WHERE b.btDesc = :btDesc")})
public class BranchType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BT_ID")
    private Integer btId;
    @Basic(optional = false)
    @Column(name = "BT_DESC")
    private String btDesc;

    public BranchType() {
    }

    public BranchType(Integer btId) {
        this.btId = btId;
    }
    
    public BranchType(BranchTypeModel btype) {
        this.btId = btype.getBtId();
        this.btDesc = btype.getBtDesc();
    }

    public BranchType(Integer btId, String btDesc) {
        this.btId = btId;
        this.btDesc = btDesc;
    }

    public Integer getBtId() {
        return btId;
    }

    public void setBtId(Integer btId) {
        this.btId = btId;
    }

    public String getBtDesc() {
        return btDesc;
    }

    public void setBtDesc(String btDesc) {
        this.btDesc = btDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (btId != null ? btId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchType)) {
            return false;
        }
        BranchType other = (BranchType) object;
        if ((this.btId == null && other.btId != null) || (this.btId != null && !this.btId.equals(other.btId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.BranchType[ btId=" + btId + " ]";
    }
    
}
