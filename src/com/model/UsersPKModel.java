/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.UsersTbPK;

/**
 *
 * @author Developer
 */
public class UsersPKModel {

    private int userSysid;
    private int userUserpvlgSysid;
    private int userDptSysid;
    private int userBranchSysid;
    private int userCmpSysid;
    private int userRigth;

    public UsersPKModel() {
    }

    public UsersPKModel(int userSysid, int userUserpvlgSysid, int userDptSysid, int userBranchSysid, int userCmpSysid, int userRigth) {
        this.userSysid = userSysid;
        this.userUserpvlgSysid = userUserpvlgSysid;
        this.userDptSysid = userDptSysid;
        this.userBranchSysid = userBranchSysid;
        this.userCmpSysid = userCmpSysid;
        this.userRigth = userRigth;
    }
    
    public UsersPKModel(int userSysid, int userUserpvlgSysid, int userDptSysid, String userBranchSysid, int userCmpSysid, int userRigth) {
        this.userSysid = userSysid;
        this.userUserpvlgSysid = userUserpvlgSysid;
        this.userDptSysid = userDptSysid;
        this.userBranchSysid = Integer.parseInt(userBranchSysid);
        this.userCmpSysid = userCmpSysid;
        this.userRigth = userRigth;
    }
    
    
     public UsersPKModel(UsersTbPK user) {
        this.userSysid = user.getUserSysid();
        this.userUserpvlgSysid = user.getUserUserpvlgSysid();
        this.userDptSysid = user.getUserDptSysid();
        this.userBranchSysid = user.getUserBranchSysid();
        this.userCmpSysid = user.getUserCmpSysid();
        this.userRigth = user.getUserRigth();
    }

    public int getUserSysid() {
        return userSysid;
    }

    public void setUserSysid(int userSysid) {
        this.userSysid = userSysid;
    }

    public int getUserUserpvlgSysid() {
        return userUserpvlgSysid;
    }

    public void setUserUserpvlgSysid(int userUserpvlgSysid) {
        this.userUserpvlgSysid = userUserpvlgSysid;
    }

    public int getUserDptSysid() {
        return userDptSysid;
    }

    public void setUserDptSysid(int userDptSysid) {
        this.userDptSysid = userDptSysid;
    }

    public int getUserBranchSysid() {
        return userBranchSysid;
    }

    public void setUserBranchSysid(int userBranchSysid) {
        this.userBranchSysid = userBranchSysid;
    }

    public int getUserCmpSysid() {
        return userCmpSysid;
    }

    public void setUserCmpSysid(int userCmpSysid) {
        this.userCmpSysid = userCmpSysid;
    }

    public int getUserRigth() {
        return userRigth;
    }

    public void setUserRigth(int userRigth) {
        this.userRigth = userRigth;
    }

    @Override
    public String toString() {
        return "UsersPKModel{" + "userSysid=" + userSysid + ", userUserpvlgSysid=" + userUserpvlgSysid + ", userDptSysid=" + userDptSysid + ", userBranchSysid=" + userBranchSysid + ", userCmpSysid=" + userCmpSysid + ", userRigth=" + userRigth + '}';
    }

}
