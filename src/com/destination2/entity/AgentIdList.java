/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.AgentIdListModel;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "agent_id_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgentIdList.findAll", query = "SELECT a FROM AgentIdList a"),
    @NamedQuery(name = "AgentIdList.findById", query = "SELECT a FROM AgentIdList a WHERE a.id = :id"),
    @NamedQuery(name = "AgentIdList.findByPolicyNumber", query = "SELECT a FROM AgentIdList a WHERE a.policyNumber = :policyNumber"),
    @NamedQuery(name = "AgentIdList.findByOldAgentId", query = "SELECT a FROM AgentIdList a WHERE a.oldAgentId = :oldAgentId"),
    @NamedQuery(name = "AgentIdList.findByNewAgentId", query = "SELECT a FROM AgentIdList a WHERE a.newAgentId = :newAgentId")})
public class AgentIdList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "policy_number")
    private String policyNumber;
    @Size(max = 45)
    @Column(name = "old_agent_id")
    private String oldAgentId;
    @Size(max = 45)
    @Column(name = "new_agent_id")
    private String newAgentId;

    public AgentIdList() {
    }
    
    public AgentIdList(AgentIdListModel aglist) {
        this.id = aglist.getId();
        this.policyNumber = aglist.getPolicyNumber();
        this.oldAgentId = aglist.getOldAgentId();
        this.newAgentId = aglist.getNewAgentId();
    }  

    public AgentIdList(Integer id, String policyNumber, String oldAgentId, String newAgentId) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.oldAgentId = oldAgentId;
        this.newAgentId = newAgentId;
    }
    
    

    public AgentIdList(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getOldAgentId() {
        return oldAgentId;
    }

    public void setOldAgentId(String oldAgentId) {
        this.oldAgentId = oldAgentId;
    }

    public String getNewAgentId() {
        return newAgentId;
    }

    public void setNewAgentId(String newAgentId) {
        this.newAgentId = newAgentId;
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
        if (!(object instanceof AgentIdList)) {
            return false;
        }
        AgentIdList other = (AgentIdList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.AgentIdList[ id=" + id + " ]";
    }
    
}
