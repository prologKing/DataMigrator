/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.BranchType;

/**
 *
 * @author Developer
 */
public class BranchTypeModel {
    int btId;
    String btDesc;
    
    public BranchTypeModel(BranchType btype) {
        this.btId = btype.getBtId();
        this.btDesc = btype.getBtDesc();
    }

    public int getBtId() {
        return btId;
    }

    public void setBtId(int btId) {
        this.btId = btId;
    }

    public String getBtDesc() {
        return btDesc;
    }

    public void setBtDesc(String btDesc) {
        this.btDesc = btDesc;
    }
    
    
    
}
