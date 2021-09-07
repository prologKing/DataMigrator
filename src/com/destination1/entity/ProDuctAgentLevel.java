/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductAgentLevelModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "pro_duct_agent_level")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProDuctAgentLevel.findAll", query = "SELECT p FROM ProDuctAgentLevel p"),
    @NamedQuery(name = "ProDuctAgentLevel.findByPalLevelId", query = "SELECT p FROM ProDuctAgentLevel p WHERE p.palLevelId = :palLevelId"),
    @NamedQuery(name = "ProDuctAgentLevel.findByPalLevelName", query = "SELECT p FROM ProDuctAgentLevel p WHERE p.palLevelName = :palLevelName"),
    @NamedQuery(name = "ProDuctAgentLevel.findByPalLevelCode", query = "SELECT p FROM ProDuctAgentLevel p WHERE p.palLevelCode = :palLevelCode")})
public class ProDuctAgentLevel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAL_LEVEL_ID")
    private Integer palLevelId;
    @Basic(optional = false)
    @Column(name = "PAL_LEVEL_NAME")
    private String palLevelName;
    @Basic(optional = false)
    @Column(name = "PAL_LEVEL_CODE")
    private String palLevelCode;

    public ProDuctAgentLevel() {
    }

    public ProDuctAgentLevel(Integer palLevelId) {
        this.palLevelId = palLevelId;
    }

    public ProDuctAgentLevel(Integer palLevelId, String palLevelName, String palLevelCode) {
        this.palLevelId = palLevelId;
        this.palLevelName = palLevelName;
        this.palLevelCode = palLevelCode;
    }
    
     public ProDuctAgentLevel(ProductAgentLevelModel pal) {
        this.palLevelId = pal.getPalLevelId();
        this.palLevelName = pal.getPalLevelName();
        this.palLevelCode = pal.getPalLevelCode();
    }

    public Integer getPalLevelId() {
        return palLevelId;
    }

    public void setPalLevelId(Integer palLevelId) {
        this.palLevelId = palLevelId;
    }

    public String getPalLevelName() {
        return palLevelName;
    }

    public void setPalLevelName(String palLevelName) {
        this.palLevelName = palLevelName;
    }

    public String getPalLevelCode() {
        return palLevelCode;
    }

    public void setPalLevelCode(String palLevelCode) {
        this.palLevelCode = palLevelCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (palLevelId != null ? palLevelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProDuctAgentLevel)) {
            return false;
        }
        ProDuctAgentLevel other = (ProDuctAgentLevel) object;
        if ((this.palLevelId == null && other.palLevelId != null) || (this.palLevelId != null && !this.palLevelId.equals(other.palLevelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ProDuctAgentLevel[ palLevelId=" + palLevelId + " ]";
    }
    
}
