/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.CustomerIdMappingModel;
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
@Table(name = "customer_id_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerIdMapping.findAll", query = "SELECT c FROM CustomerIdMapping c"),
    @NamedQuery(name = "CustomerIdMapping.findById", query = "SELECT c FROM CustomerIdMapping c WHERE c.id = :id"),
    @NamedQuery(name = "CustomerIdMapping.findByStoredCustomerId", query = "SELECT c FROM CustomerIdMapping c WHERE c.storedCustomerId = :storedCustomerId"),
    @NamedQuery(name = "CustomerIdMapping.findByOtherCustomerId", query = "SELECT c FROM CustomerIdMapping c WHERE c.otherCustomerId = :otherCustomerId")})
public class CustomerIdMapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "stored_customer_id")
    private String storedCustomerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "other_customer_id")
    private String otherCustomerId;

    public CustomerIdMapping() {
    }
    
     public CustomerIdMapping(CustomerIdMappingModel cmapping) {
        this.id = cmapping.getId();
        this.storedCustomerId = cmapping.getStoredCustomerId();
        this.otherCustomerId = cmapping.getOtherCustomerId();
    }

    public CustomerIdMapping(Integer id) {
        this.id = id;
    }

    public CustomerIdMapping(Integer id, String storedCustomerId, String otherCustomerId) {
        this.id = id;
        this.storedCustomerId = storedCustomerId;
        this.otherCustomerId = otherCustomerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoredCustomerId() {
        return storedCustomerId;
    }

    public void setStoredCustomerId(String storedCustomerId) {
        this.storedCustomerId = storedCustomerId;
    }

    public String getOtherCustomerId() {
        return otherCustomerId;
    }

    public void setOtherCustomerId(String otherCustomerId) {
        this.otherCustomerId = otherCustomerId;
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
        if (!(object instanceof CustomerIdMapping)) {
            return false;
        }
        CustomerIdMapping other = (CustomerIdMapping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.CustomerIdMapping[ id=" + id + " ]";
    }
    
}
