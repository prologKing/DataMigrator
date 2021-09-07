/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProductAgentsTbPK;

/**
 *
 * @author Developer
 */
public class ProductAgentsPKModel {
    int pagtSysid;
    int pagtUserSysid;
    int pagtBranchSysid;
    int pagtPbkSysid;
    int pagtPbkbSysid;
    int pagtPahSysid;
    int pagtPalLevelId;

    public ProductAgentsPKModel() {
    }
    
    
    
  public ProductAgentsPKModel(ProductAgentsTbPK patb) {
        this.pagtSysid = patb.getPagtSysid();
        this.pagtUserSysid = patb.getPagtUserSysid();
        this.pagtBranchSysid = patb.getPagtBranchSysid();
        this.pagtPbkSysid = patb.getPagtPbkSysid();
        this.pagtPbkbSysid = patb.getPagtPbkbSysid();
        this.pagtPahSysid = patb.getPagtPahSysid();
        this.pagtPalLevelId = patb.getPagtPalLevelId();
    }

    public ProductAgentsPKModel(int pagtSysid, int pagtUserSysid, int pagtBranchSysid, int pagtPbkSysid, int pagtPbkbSysid, int pagtPahSysid, int pagtPalLevelId) {
        this.pagtSysid = pagtSysid;
        this.pagtUserSysid = pagtUserSysid;
        this.pagtBranchSysid = pagtBranchSysid;
        this.pagtPbkSysid = pagtPbkSysid;
        this.pagtPbkbSysid = pagtPbkbSysid;
        this.pagtPahSysid = pagtPahSysid;
        this.pagtPalLevelId = pagtPalLevelId;
    }
  
  

    public int getPagtSysid() {
        return pagtSysid;
    }

    public void setPagtSysid(int pagtSysid) {
        this.pagtSysid = pagtSysid;
    }

    public int getPagtUserSysid() {
        return pagtUserSysid;
    }

    public void setPagtUserSysid(int pagtUserSysid) {
        this.pagtUserSysid = pagtUserSysid;
    }

    public int getPagtBranchSysid() {
        return pagtBranchSysid;
    }

    public void setPagtBranchSysid(int pagtBranchSysid) {
        this.pagtBranchSysid = pagtBranchSysid;
    }

    public int getPagtPbkSysid() {
        return pagtPbkSysid;
    }

    public void setPagtPbkSysid(int pagtPbkSysid) {
        this.pagtPbkSysid = pagtPbkSysid;
    }

    public int getPagtPbkbSysid() {
        return pagtPbkbSysid;
    }

    public void setPagtPbkbSysid(int pagtPbkbSysid) {
        this.pagtPbkbSysid = pagtPbkbSysid;
    }

    public int getPagtPahSysid() {
        return pagtPahSysid;
    }

    public void setPagtPahSysid(int pagtPahSysid) {
        this.pagtPahSysid = pagtPahSysid;
    }

    public int getPagtPalLevelId() {
        return pagtPalLevelId;
    }

    public void setPagtPalLevelId(int pagtPalLevelId) {
        this.pagtPalLevelId = pagtPalLevelId;
    }

    @Override
    public String toString() {
        return "ProductAgentsPKModel{" + "pagtSysid=" + pagtSysid + ", pagtUserSysid=" + pagtUserSysid + ", pagtBranchSysid=" + pagtBranchSysid + ", pagtPbkSysid=" + pagtPbkSysid + ", pagtPbkbSysid=" + pagtPbkbSysid + ", pagtPahSysid=" + pagtPahSysid + ", pagtPalLevelId=" + pagtPalLevelId + '}';
    }
  
  
}
