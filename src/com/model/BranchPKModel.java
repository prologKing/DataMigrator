/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.BranchTbPK;

/**
 *
 * @author Developer
 */
public class BranchPKModel {

    int branchSysid;
    int barnchCmpSysid;
    int branchUserSysid;
    int branchTypId;

    public BranchPKModel(BranchTbPK bpk) {
        this.branchSysid = bpk.getBranchSysid();
        this.barnchCmpSysid = bpk.getBarnchCmpSysid();
        this.branchUserSysid = bpk.getBranchUserSysid();
        this.branchTypId = bpk.getBranchTypId();
    }

    public int getBranchSysid() {
        return branchSysid;
    }

    public void setBranchSysid(int branchSysid) {
        this.branchSysid = branchSysid;
    }

    public int getBarnchCmpSysid() {
        return barnchCmpSysid;
    }

    public void setBarnchCmpSysid(int barnchCmpSysid) {
        this.barnchCmpSysid = barnchCmpSysid;
    }

    public int getBranchUserSysid() {
        return branchUserSysid;
    }

    public void setBranchUserSysid(int branchUserSysid) {
        this.branchUserSysid = branchUserSysid;
    }

    public int getBranchTypId() {
        return branchTypId;
    }

    public void setBranchTypId(int branchTypId) {
        this.branchTypId = branchTypId;
    }
    
    
}
