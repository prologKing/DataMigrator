/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProductAgentHierarchy;

/**
 *
 * @author Developer
 */
public class ProductAgentHierarchyModel {
    ProductAgentHierarchyPKModel productAgentHierarchyPK; 
    String pahLevel; 
    String pahHierarchy;
    
     public ProductAgentHierarchyModel(ProductAgentHierarchy pah) {
        this.productAgentHierarchyPK = new ProductAgentHierarchyPKModel(pah.getProductAgentHierarchyPK());
        this.pahLevel = pah.getPahLevel();
        this.pahHierarchy = pah.getPahHierarchy();
    }

    public ProductAgentHierarchyPKModel getProductAgentHierarchyPK() {
        return productAgentHierarchyPK;
    }

    public void setProductAgentHierarchyPK(ProductAgentHierarchyPKModel productAgentHierarchyPK) {
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
     
     
     
}
