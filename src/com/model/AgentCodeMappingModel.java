/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.AgentCodeMapping;

/**
 *
 * @author Developer
 */
public class AgentCodeMappingModel {
    int id;
    String storedCode;
    String otherCode;

    public AgentCodeMappingModel() {
    }

    public AgentCodeMappingModel(int id, String storedCode, String otherCode) {
        this.id = id;
        this.storedCode = storedCode;
        this.otherCode = otherCode;
    }
    
    public AgentCodeMappingModel(AgentCodeMapping acmapping) {
        this.id = acmapping.getId();
        this.storedCode = acmapping.getStoredCode();
        this.otherCode = acmapping.getOtherCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public String toString() {
        return "AgentCodeMappingModel{" + "id=" + id + ", storedCode=" + storedCode + ", otherCode=" + otherCode + '}';
    }
    
}
