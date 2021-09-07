/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.TeamIdMappingModel;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "team_id_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeamIdMapping.findAll", query = "SELECT t FROM TeamIdMapping t"),
    @NamedQuery(name = "TeamIdMapping.findById", query = "SELECT t FROM TeamIdMapping t WHERE t.id = :id"),
    @NamedQuery(name = "TeamIdMapping.findByV1teamId", query = "SELECT t FROM TeamIdMapping t WHERE t.v1teamId = :v1teamId"),
    @NamedQuery(name = "TeamIdMapping.findByV2teamId", query = "SELECT t FROM TeamIdMapping t WHERE t.v2teamId = :v2teamId")})
public class TeamIdMapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "v1team_id")
    private String v1teamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "v2team_id")
    private int v2teamId;

    public TeamIdMapping() {
    }
    
     public TeamIdMapping(TeamIdMappingModel mapp) {
        this.id = mapp.getId();
        this.v1teamId = mapp.getV1teamId();
        this.v2teamId = mapp.getV2teamId();
    }

    public TeamIdMapping(Integer id) {
        this.id = id;
    }

    public TeamIdMapping(Integer id, String v1teamId, int v2teamId) {
        this.id = id;
        this.v1teamId = v1teamId;
        this.v2teamId = v2teamId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getV1teamId() {
        return v1teamId;
    }

    public void setV1teamId(String v1teamId) {
        this.v1teamId = v1teamId;
    }

    public int getV2teamId() {
        return v2teamId;
    }

    public void setV2teamId(int v2teamId) {
        this.v2teamId = v2teamId;
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
        if (!(object instanceof TeamIdMapping)) {
            return false;
        }
        TeamIdMapping other = (TeamIdMapping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination.entity.TeamIdMapping[ id=" + id + " ]";
    }
    
}
