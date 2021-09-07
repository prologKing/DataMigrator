/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProductBankBranchTb;

/**
 *
 * @author Developer
 */
public class ProductBankBranchTbModel {
    ProductBankBranchTbPKModel pbbranckPK;
    String pbkbName;
    String pbkbLocation;
    String pbkbCrtDt;
    String pbkbDt;
    String pbkbSortCode;
    String pbkbSts;

    public ProductBankBranchTbModel() {
    }

    public ProductBankBranchTbModel(ProductBankBranchTbPKModel pbbranckPK, String pbkbName, String pbkbLocation, String pbkbCrtDt, String pbkbDt, String pbkbSortCode, String pbkbSts) {
        this.pbbranckPK = pbbranckPK;
        this.pbkbName = pbkbName;
        this.pbkbLocation = pbkbLocation;
        this.pbkbCrtDt = pbkbCrtDt;
        this.pbkbDt = pbkbDt;
        this.pbkbSortCode = pbkbSortCode;
        this.pbkbSts = pbkbSts;
    }
    
    public ProductBankBranchTbModel(ProductBankBranchTb pbbpk) {
        this.pbbranckPK = new ProductBankBranchTbPKModel(pbbpk.getProductBankBranchTbPK());
        this.pbkbName = pbbpk.getPbkbName();
        this.pbkbLocation = pbbpk.getPbkbLocation();
        this.pbkbCrtDt = pbbpk.getPbkbCrtDt();
        this.pbkbDt = pbbpk.getPbkbDt();
        this.pbkbSortCode = pbbpk.getPbkbSortCode();
        this.pbkbSts = pbbpk.getPbkbSts();
    }

    public ProductBankBranchTbPKModel getPbbranckPK() {
        return pbbranckPK;
    }

    public void setPbbranckPK(ProductBankBranchTbPKModel pbbranckPK) {
        this.pbbranckPK = pbbranckPK;
    }

    public String getPbkbName() {
        return pbkbName;
    }

    public void setPbkbName(String pbkbName) {
        this.pbkbName = pbkbName;
    }

    public String getPbkbLocation() {
        return pbkbLocation;
    }

    public void setPbkbLocation(String pbkbLocation) {
        this.pbkbLocation = pbkbLocation;
    }

    public String getPbkbCrtDt() {
        return pbkbCrtDt;
    }

    public void setPbkbCrtDt(String pbkbCrtDt) {
        this.pbkbCrtDt = pbkbCrtDt;
    }

    public String getPbkbDt() {
        return pbkbDt;
    }

    public void setPbkbDt(String pbkbDt) {
        this.pbkbDt = pbkbDt;
    }

    public String getPbkbSortCode() {
        return pbkbSortCode;
    }

    public void setPbkbSortCode(String pbkbSortCode) {
        this.pbkbSortCode = pbkbSortCode;
    }

    public String getPbkbSts() {
        return pbkbSts;
    }

    public void setPbkbSts(String pbkbSts) {
        this.pbkbSts = pbkbSts;
    }
    
    
}
