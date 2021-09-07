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
public class V2ProductModel {
    private int PDT_SYSID;
    private String PDT_CODE;
    private String PDT_NAME;

    public V2ProductModel() {
    }
    
     public V2ProductModel(Object[] obj){
      this.PDT_SYSID = Integer.parseInt(String.valueOf(obj[0]));
      this.PDT_CODE = String.valueOf(obj[1]);
      this.PDT_NAME = String.valueOf(obj[2]);
    }

    public int getPDT_SYSID() {
        return PDT_SYSID;
    }

    public void setPDT_SYSID(int PDT_SYSID) {
        this.PDT_SYSID = PDT_SYSID;
    }

    public String getPDT_CODE() {
        return PDT_CODE;
    }

    public void setPDT_CODE(String PDT_CODE) {
        this.PDT_CODE = PDT_CODE;
    }

    public String getPDT_NAME() {
        return PDT_NAME;
    }

    public void setPDT_NAME(String PDT_NAME) {
        this.PDT_NAME = PDT_NAME;
    }

    @Override
    public String toString() {
        return "V2ProductModel{" + "PDT_SYSID=" + PDT_SYSID + ", PDT_CODE=" + PDT_CODE + ", PDT_NAME=" + PDT_NAME + '}';
    }
    
    
}
