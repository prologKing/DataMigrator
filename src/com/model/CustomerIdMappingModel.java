/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.CustomerIdMapping;

/**
 *
 * @author Developer
 */
public class CustomerIdMappingModel {
    int id; 
    String storedCustomerId; 
    String otherCustomerId;

    public CustomerIdMappingModel() {
    }

    public CustomerIdMappingModel(int id, String storedCustomerId, String otherCustomerId) {
        this.id = id;
        this.storedCustomerId = storedCustomerId;
        this.otherCustomerId = otherCustomerId;
    }
    
    
    
    public CustomerIdMappingModel(CustomerIdMapping cmapping) {
        this.id = cmapping.getId();
        this.storedCustomerId = cmapping.getStoredCustomerId();
        this.otherCustomerId = cmapping.getOtherCustomerId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    
    
}
