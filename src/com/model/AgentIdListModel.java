/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.AgentIdList;

/**
 *
 * @author Developer
 */
public class AgentIdListModel {
    int id;
    String policyNumber;
    String oldAgentId;
    String newAgentId;

    public AgentIdListModel() {
    }
    
    
    
    public AgentIdListModel(AgentIdList aglist) {
        this.id = aglist.getId();
        this.policyNumber = aglist.getPolicyNumber();
        this.oldAgentId = aglist.getOldAgentId();
        this.newAgentId = aglist.getNewAgentId();
    } 
    
    public AgentIdListModel(int id, String policyNumber, String oldAgentId, String newAgentId) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.oldAgentId = oldAgentId;
        this.newAgentId = newAgentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public String toString() {
        return "AgentIdListModel{" + "id=" + id + ", policyNumber=" + policyNumber + ", oldAgentId=" + oldAgentId + ", newAgentId=" + newAgentId + '}';
    }
    
    
}
