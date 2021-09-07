/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductAgentHierarchyModel;
import com.model.ProductAgentHierarchyPKModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "product_agent_hierarchy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductAgentHierarchy.findAll", query = "SELECT p FROM ProductAgentHierarchy p"),
    @NamedQuery(name = "ProductAgentHierarchy.findByPahSysid", query = "SELECT p FROM ProductAgentHierarchy p WHERE p.productAgentHierarchyPK.pahSysid = :pahSysid"),
    @NamedQuery(name = "ProductAgentHierarchy.findByPahPalLevelId", query = "SELECT p FROM ProductAgentHierarchy p WHERE p.productAgentHierarchyPK.pahPalLevelId = :pahPalLevelId"),
    @NamedQuery(name = "ProductAgentHierarchy.findByPahLevel", query = "SELECT p FROM ProductAgentHierarchy p WHERE p.pahLevel = :pahLevel"),
    @NamedQuery(name = "ProductAgentHierarchy.findByPahHierarchy", query = "SELECT p FROM ProductAgentHierarchy p WHERE p.pahHierarchy = :pahHierarchy")})
public class ProductAgentHierarchy implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductAgentHierarchyPK productAgentHierarchyPK;
    @Basic(optional = false)
    @Column(name = "PAH_LEVEL")
    private String pahLevel;
    @Basic(optional = false)
    @Column(name = "PAH_HIERARCHY")
    private String pahHierarchy;

    public ProductAgentHierarchy() {
    }

    public ProductAgentHierarchy(ProductAgentHierarchyPK productAgentHierarchyPK) {
        this.productAgentHierarchyPK = productAgentHierarchyPK;
    } 
    

    public ProductAgentHierarchy(ProductAgentHierarchyPK productAgentHierarchyPK, String pahLevel, String pahHierarchy) {
        this.productAgentHierarchyPK = productAgentHierarchyPK;
        this.pahLevel = pahLevel;
        this.pahHierarchy = pahHierarchy;
    }

    public ProductAgentHierarchy(int pahSysid, int pahPalLevelId) {
        this.productAgentHierarchyPK = new ProductAgentHierarchyPK(pahSysid, pahPalLevelId);
    }
    
    public ProductAgentHierarchy(ProductAgentHierarchyModel pah) {
        this.productAgentHierarchyPK = new ProductAgentHierarchyPK(pah.getProductAgentHierarchyPK());
        this.pahLevel = pah.getPahLevel();
        this.pahHierarchy = pah.getPahHierarchy();
    }

    public ProductAgentHierarchyPK getProductAgentHierarchyPK() {
        return productAgentHierarchyPK;
    }

    public void setProductAgentHierarchyPK(ProductAgentHierarchyPK productAgentHierarchyPK) {
        this.productAgentHierarchyPK = productAgentHierarchyPK;
    }

    public String getPahLevel() {
        return pahLevel;
    }

    public void setPahLevel(String pahLevel) {
        this.pahLevel = pahLevel;
    }

    public String getPahHierarchy() {
        return pahHierarchy;
    }

    public void setPahHierarchy(String pahHierarchy) {
        this.pahHierarchy = pahHierarchy;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productAgentHierarchyPK != null ? productAgentHierarchyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAgentHierarchy)) {
            return false;
        }
        ProductAgentHierarchy other = (ProductAgentHierarchy) object;
        if ((this.productAgentHierarchyPK == null && other.productAgentHierarchyPK != null) || (this.productAgentHierarchyPK != null && !this.productAgentHierarchyPK.equals(other.productAgentHierarchyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ProductAgentHierarchy[ productAgentHierarchyPK=" + productAgentHierarchyPK + " ]";
    }
    
}
