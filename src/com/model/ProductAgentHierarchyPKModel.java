/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProductAgentHierarchyPK;

/**
 *
 * @author Developer
 */
public class ProductAgentHierarchyPKModel {
    int pahSysid;
    int pahPalLevelId;
    
    public ProductAgentHierarchyPKModel(ProductAgentHierarchyPK pahpk) {
        this.pahSysid = pahpk.getPahSysid();
        this.pahPalLevelId = pahpk.getPahPalLevelId();
    }

    public int getPahSysid() {
        return pahSysid;
    }

    public void setPahSysid(int pahSysid) {
        this.pahSysid = pahSysid;
    }

    public int getPahPalLevelId() {
        return pahPalLevelId;
    }

    public void setPahPalLevelId(int pahPalLevelId) {
        this.pahPalLevelId = pahPalLevelId;
    }
    
    
}
