/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolStartDateTbModel;
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
@Table(name = "pol_start_date_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolStartDateTb.findAll", query = "SELECT p FROM PolStartDateTb p"),
    @NamedQuery(name = "PolStartDateTb.findById", query = "SELECT p FROM PolStartDateTb p WHERE p.id = :id"),
    @NamedQuery(name = "PolStartDateTb.findByPolicyNum", query = "SELECT p FROM PolStartDateTb p WHERE p.policyNum = :policyNum"),
    @NamedQuery(name = "PolStartDateTb.findByStartDate", query = "SELECT p FROM PolStartDateTb p WHERE p.startDate = :startDate")})
public class PolStartDateTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "policy_num")
    private String policyNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "start_date")
    private String startDate;

    public PolStartDateTb() {
    }
    
    public PolStartDateTb(PolStartDateTbModel poldat) {
        this.id = poldat.getId();
        this.policyNum = poldat.getPolicyNum();
        this.startDate = poldat.getStartDate();
    }

    public PolStartDateTb(Integer id) {
        this.id = id;
    }

    public PolStartDateTb(Integer id, String policyNum, String startDate) {
        this.id = id;
        this.policyNum = policyNum;
        this.startDate = startDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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
        if (!(object instanceof PolStartDateTb)) {
            return false;
        }
        PolStartDateTb other = (PolStartDateTb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination1.entity.PolStartDateTb[ id=" + id + " ]";
    }
    
}
