/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.BranchTb;

/**
 *
 * @author Developer
 */
public class BranchModel {
    private BranchPKModel branchTbPK; 
    private String branchCode; 
    private String branchName; 
    private String branchAddrs; 
    private String branchCrtDt;
    private String branchMgr; 
    private String branchSts; 
    private String branchRegion; 
    private String branchBrkCode;

    public BranchModel() {
    }
    
    public BranchModel(BranchTb branch) {
        this.branchTbPK = new BranchPKModel(branch.getBranchTbPK());
        this.branchCode = branch.getBranchCode();
        this.branchName = branch.getBranchName();
        this.branchAddrs = branch.getBranchAddrs();
        this.branchCrtDt = branch.getBranchCrtDt();
        this.branchMgr = branch.getBranchMgr();
        this.branchSts = branch.getBranchSts();
        this.branchRegion = branch.getBranchRegion();
        this.branchBrkCode = branch.getBranchBrkCode();
    }

    public BranchPKModel getBranchTbPK() {
        return branchTbPK;
    }

    public void setBranchTbPK(BranchPKModel branchTbPK) {
        this.branchTbPK = branchTbPK;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddrs() {
        return branchAddrs;
    }

    public void setBranchAddrs(String branchAddrs) {
        this.branchAddrs = branchAddrs;
    }

    public String getBranchCrtDt() {
        return branchCrtDt;
    }

    public void setBranchCrtDt(String branchCrtDt) {
        this.branchCrtDt = branchCrtDt;
    }

    public String getBranchMgr() {
        return branchMgr;
    }

    public void setBranchMgr(String branchMgr) {
        this.branchMgr = branchMgr;
    }

    public String getBranchSts() {
        return branchSts;
    }

    public void setBranchSts(String branchSts) {
        this.branchSts = branchSts;
    }

    public String getBranchRegion() {
        return branchRegion;
    }

    public void setBranchRegion(String branchRegion) {
        this.branchRegion = branchRegion;
    }

    public String getBranchBrkCode() {
        return branchBrkCode;
    }

    public void setBranchBrkCode(String branchBrkCode) {
        this.branchBrkCode = branchBrkCode;
    }

    @Override
    public String toString() {
        return "BranchModel{" + "branchTbPK=" + branchTbPK + ", branchCode=" + branchCode + ", branchName=" + branchName + ", branchAddrs=" + branchAddrs + ", branchCrtDt=" + branchCrtDt + ", branchMgr=" + branchMgr + ", branchSts=" + branchSts + ", branchRegion=" + branchRegion + ", branchBrkCode=" + branchBrkCode + '}';
    }
    
    
}
