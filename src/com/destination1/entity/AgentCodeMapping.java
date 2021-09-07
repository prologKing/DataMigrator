/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.AgentCodeMappingModel;
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
@Table(name = "agent_code_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgentCodeMapping.findAll", query = "SELECT a FROM AgentCodeMapping a"),
    @NamedQuery(name = "AgentCodeMapping.findById", query = "SELECT a FROM AgentCodeMapping a WHERE a.id = :id"),
    @NamedQuery(name = "AgentCodeMapping.findByStoredCode", query = "SELECT a FROM AgentCodeMapping a WHERE a.storedCode = :storedCode"),
    @NamedQuery(name = "AgentCodeMapping.findByOtherCode", query = "SELECT a FROM AgentCodeMapping a WHERE a.otherCode = :otherCode")})
public class AgentCodeMapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "stored_code")
    private String storedCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "other_code")
    private String otherCode;

    public AgentCodeMapping() {
    }

    public AgentCodeMapping(Integer id) {
        this.id = id;
    }
    
    public AgentCodeMapping(AgentCodeMappingModel acmapping) {
        this.id = acmapping.getId();
        this.storedCode = acmapping.getStoredCode();
        this.otherCode = acmapping.getOtherCode();
    }

    public AgentCodeMapping(Integer id, String storedCode, String otherCode) {
        this.id = id;
        this.storedCode = storedCode;
        this.otherCode = otherCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoredCode() {
        return storedCode;
    }

    public void setStoredCode(String storedCode) {
        this.storedCode = storedCode;
    }

    public String getOtherCode() {
        return otherCode;
    }

    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
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
        if (!(object instanceof AgentCodeMapping)) {
            return false;
        }
        AgentCodeMapping other = (AgentCodeMapping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.migration.AgentCodeMapping[ id=" + id + " ]";
    }
    
}
