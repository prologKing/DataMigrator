/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.DeparmentTbPK;

/**
 *
 * @author Developer
 */
public class DepartmentPKModel {
    int dptSysid; 
    int dptUserSysid;

    public DepartmentPKModel(DeparmentTbPK dptm) {
        this.dptSysid = dptm.getDptSysid();
        this.dptUserSysid = dptm.getDptUserSysid();
    }

    public int getDptSysid() {
        return dptSysid;
    }

    public void setDptSysid(int dptSysid) {
        this.dptSysid = dptSysid;
    }

    public int getDptUserSysid() {
        return dptUserSysid;
    }

    public void setDptUserSysid(int dptUserSysid) {
        this.dptUserSysid = dptUserSysid;
    }
    
    
}
