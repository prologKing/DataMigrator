/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.CompanyTbPK;

/**
 *
 * @author Developer
 */
public class CompanyPkModel {
    private int cmpSysid; 
    private int cmpUserSysid;

    public CompanyPkModel(CompanyTbPK comp) {
        this.cmpSysid = comp.getCmpSysid();
        this.cmpUserSysid = comp.getCmpUserSysid();
    }

    

    public int getCmpSysid() {
        return cmpSysid;
    }

    public void setCmpSysid(int cmpSysid) {
        this.cmpSysid = cmpSysid;
    }

    public int getCmpUserSysid() {
        return cmpUserSysid;
    }

    public void setCmpUserSysid(int cmpUserSysid) {
        this.cmpUserSysid = cmpUserSysid;
    }
    
    
}
