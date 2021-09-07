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
public class BankBranchModel {

    int PBK_SYSID;
    String PBK_NAME;
    int PBKB_PBK_SYSID;
    String PBKB_NAME;
    String PBKB_SORT_CODE;

    public BankBranchModel() {
    }

    public BankBranchModel(int PBK_SYSID, String PBK_NAME, int PBKB_PBK_SYSID, String PBKB_NAME, String PBKB_SORT_CODE) {
        this.PBK_SYSID = PBK_SYSID;
        this.PBK_NAME = PBK_NAME;
        this.PBKB_PBK_SYSID = PBKB_PBK_SYSID;
        this.PBKB_NAME = PBKB_NAME;
        this.PBKB_SORT_CODE = PBKB_SORT_CODE;
    }

    public BankBranchModel(Object[] obj) {
        this.PBK_SYSID = Integer.parseInt(String.valueOf(obj[0]));
        this.PBK_NAME = String.valueOf(obj[1]);
        this.PBKB_PBK_SYSID = Integer.parseInt(String.valueOf(obj[2]));
        this.PBKB_NAME = String.valueOf(obj[3]);
        this.PBKB_SORT_CODE = String.valueOf(obj[4]);
    }

    public int getPBK_SYSID() {
        return PBK_SYSID;
    }

    public void setPBK_SYSID(int PBK_SYSID) {
        this.PBK_SYSID = PBK_SYSID;
    }

    public String getPBK_NAME() {
        return PBK_NAME;
    }

    public void setPBK_NAME(String PBK_NAME) {
        this.PBK_NAME = PBK_NAME;
    }

    public int getPBKB_PBK_SYSID() {
        return PBKB_PBK_SYSID;
    }

    public void setPBKB_PBK_SYSID(int PBKB_PBK_SYSID) {
        this.PBKB_PBK_SYSID = PBKB_PBK_SYSID;
    }

    public String getPBKB_NAME() {
        return PBKB_NAME;
    }

    public void setPBKB_NAME(String PBKB_NAME) {
        this.PBKB_NAME = PBKB_NAME;
    }

    public String getPBKB_SORT_CODE() {
        return PBKB_SORT_CODE;
    }

    public void setPBKB_SORT_CODE(String PBKB_SORT_CODE) {
        this.PBKB_SORT_CODE = PBKB_SORT_CODE;
    }

    @Override
    public String toString() {
        return "BankBranchModel{" + "PBK_SYSID=" + PBK_SYSID + ", PBK_NAME=" + PBK_NAME + ", PBKB_PBK_SYSID=" + PBKB_PBK_SYSID + ", PBKB_NAME=" + PBKB_NAME + ", PBKB_SORT_CODE=" + PBKB_SORT_CODE + '}';
    }

}
