/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.BranchMapping;

/**
 *
 * @author Developer
 */
public class BranchMappingModel {
    int id;
    int v1Id;
    int v2Id;

    public BranchMappingModel() {
    }
    
    public BranchMappingModel(BranchMapping bmapping) {
        this.id = bmapping.getId();
        this.v1Id = bmapping.getV1Id();
        this.v2Id = bmapping.getV2Id();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getV1Id() {
        return v1Id;
    }

    public void setV1Id(int v1Id) {
        this.v1Id = v1Id;
    }

    public int getV2Id() {
        return v2Id;
    }

    public void setV2Id(int v2Id) {
        this.v2Id = v2Id;
    }
    
    
}
