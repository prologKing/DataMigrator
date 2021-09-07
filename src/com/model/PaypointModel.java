/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Developer
 */
public class PaypointModel {
    int PPT_SYSID;
    String PPT_NAME;

    public PaypointModel() {
    }
    
    public PaypointModel(Object[] obj) {
        this.PPT_SYSID = Integer.parseInt(String.valueOf(obj[0]));
        this.PPT_NAME = String.valueOf(obj[1]);
    }
    
    public PaypointModel(Object[] obj, String v) {
        this.PPT_SYSID = Integer.parseInt(String.valueOf(obj[0]));
        this.PPT_NAME = String.valueOf(obj[2]);
    }

    public int getPPT_SYSID() {
        return PPT_SYSID;
    }

    public void setPPT_SYSID(int PPT_SYSID) {
        this.PPT_SYSID = PPT_SYSID;
    }

    public String getPPT_NAME() {
        return PPT_NAME;
    }

    public void setPPT_NAME(String PPT_NAME) {
        this.PPT_NAME = PPT_NAME;
    }
    
    
}
