/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.BeneficiaryTbPK;

/**
 *
 * @author Developer
 */
public class BeneficiaryTbPKModel {
    int benSysid;
    int benCusSysid;
    int benPolhSysid;

    public BeneficiaryTbPKModel() {
    }
    
    
    public BeneficiaryTbPKModel(BeneficiaryTbPK benpk) {
        this.benSysid = benpk.getBenSysid();
        this.benCusSysid = benpk.getBenSysid();
        this.benPolhSysid = benpk.getBenPolhSysid();
    }

    public BeneficiaryTbPKModel(int benSysid, int benCusSysid, int benPolhSysid) {
        this.benSysid = benSysid;
        this.benCusSysid = benCusSysid;
        this.benPolhSysid = benPolhSysid;
    }
    
    

    public int getBenSysid() {
        return benSysid;
    }

    public void setBenSysid(int benSysid) {
        this.benSysid = benSysid;
    }

    public int getBenCusSysid() {
        return benCusSysid;
    }

    public void setBenCusSysid(int benCusSysid) {
        this.benCusSysid = benCusSysid;
    }

    public int getBenPolhSysid() {
        return benPolhSysid;
    }

    public void setBenPolhSysid(int benPolhSysid) {
        this.benPolhSysid = benPolhSysid;
    }

    @Override
    public String toString() {
        return "BeneficiaryTbPKModel{" + "benSysid=" + benSysid + ", benCusSysid=" + benCusSysid + ", benPolhSysid=" + benPolhSysid + '}';
    }
    
}
