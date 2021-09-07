/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProDuctAgentLevel;

/**
 *
 * @author Developer
 */
public class ProductAgentLevelModel {
    int palLevelId;
    String palLevelName;
    String palLevelCode;
    
     public ProductAgentLevelModel(ProDuctAgentLevel pal) {
        this.palLevelId = pal.getPalLevelId();
        this.palLevelName = pal.getPalLevelName();
        this.palLevelCode = pal.getPalLevelCode();
    }

    public int getPalLevelId() {
        return palLevelId;
    }

    public void setPalLevelId(int palLevelId) {
        this.palLevelId = palLevelId;
    }

    public String getPalLevelName() {
        return palLevelName;
    }

    public void setPalLevelName(String palLevelName) {
        this.palLevelName = palLevelName;
    }

    public String getPalLevelCode() {
        return palLevelCode;
    }

    public void setPalLevelCode(String palLevelCode) {
        this.palLevelCode = palLevelCode;
    }
     
     
}
