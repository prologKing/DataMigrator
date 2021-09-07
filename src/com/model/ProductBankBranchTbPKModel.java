/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProductBankBranchTbPK;

/**
 *
 * @author Developer
 */
public class ProductBankBranchTbPKModel {
    int pbkbSysid;
    int pbkbPbkSysid;
    int pbkbUserSysid;

    public ProductBankBranchTbPKModel(int pbkbSysid, int pbkbPbkSysid, int pbkbUserSysid) {
        this.pbkbSysid = pbkbSysid;
        this.pbkbPbkSysid = pbkbPbkSysid;
        this.pbkbUserSysid = pbkbUserSysid;
    }
    
    public ProductBankBranchTbPKModel(ProductBankBranchTbPK pbb) {
       this.pbkbSysid = pbb.getPbkbSysid();
       this.pbkbPbkSysid = pbb.getPbkbPbkSysid();
       this.pbkbUserSysid = pbb.getPbkbUserSysid();
    }

    public int getPbkbSysid() {
        return pbkbSysid;
    }

    public void setPbkbSysid(int pbkbSysid) {
        this.pbkbSysid = pbkbSysid;
    }

    public int getPbkbPbkSysid() {
        return pbkbPbkSysid;
    }

    public void setPbkbPbkSysid(int pbkbPbkSysid) {
        this.pbkbPbkSysid = pbkbPbkSysid;
    }

    public int getPbkbUserSysid() {
        return pbkbUserSysid;
    }

    public void setPbkbUserSysid(int pbkbUserSysid) {
        this.pbkbUserSysid = pbkbUserSysid;
    }

    @Override
    public String toString() {
        return "ProductBankBranchTbPKModel{" + "pbkbSysid=" + pbkbSysid + ", pbkbPbkSysid=" + pbkbPbkSysid + ", pbkbUserSysid=" + pbkbUserSysid + '}';
    }
    
    
}
