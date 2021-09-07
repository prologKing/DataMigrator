/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.BranchMappingModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "branch_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BranchMapping.findAll", query = "SELECT b FROM BranchMapping b"),
    @NamedQuery(name = "BranchMapping.findById", query = "SELECT b FROM BranchMapping b WHERE b.id = :id"),
    @NamedQuery(name = "BranchMapping.findByV1Id", query = "SELECT b FROM BranchMapping b WHERE b.v1Id = :v1Id"),
    @NamedQuery(name = "BranchMapping.findByV2Id", query = "SELECT b FROM BranchMapping b WHERE b.v2Id = :v2Id")})
public class BranchMapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "v1_id")
    private int v1Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "v2_id")
    private int v2Id;

    public BranchMapping() {
    }
    
    public BranchMapping(BranchMappingModel bmapping) {
        this.id = bmapping.getId();
        this.v1Id = bmapping.getV1Id();
        this.v2Id = bmapping.getV2Id();
    }

    public BranchMapping(Integer id) {
        this.id = id;
    }

    public BranchMapping(Integer id, int v1Id, int v2Id) {
        this.id = id;
        this.v1Id = v1Id;
        this.v2Id = v2Id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getV1Id() {
        return v1Id;
    }

    public void setV1Id(int v1Id) {
        this.v1Id = v1Id;
    }

    public int getV2Id() {
        return v2Id;
    }

    public void setV2Id(int v2Id) {
        this.v2Id = v2Id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchMapping)) {
            return false;
        }
        BranchMapping other = (BranchMapping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination.entity.BranchMapping[ id=" + id + " ]";
    }
    
}
