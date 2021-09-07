/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.UsersPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class UsersTbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_SYSID")
    private int userSysid;
    @Basic(optional = false)
    @Column(name = "USER_USERPVLG_SYSID")
    private int userUserpvlgSysid;
    @Basic(optional = false)
    @Column(name = "USER_DPT_SYSID")
    private int userDptSysid;
    @Basic(optional = false)
    @Column(name = "USER_BRANCH_SYSID")
    private int userBranchSysid;
    @Basic(optional = false)
    @Column(name = "USER_CMP_SYSID")
    private int userCmpSysid;
    @Basic(optional = false)
    @Column(name = "USER_RIGTH")
    private int userRigth;

    public UsersTbPK() {
    }    

    public UsersTbPK(int userSysid, int userUserpvlgSysid, int userDptSysid, int userBranchSysid, int userCmpSysid, int userRigth) {
        this.userSysid = userSysid;
        this.userUserpvlgSysid = userUserpvlgSysid;
        this.userDptSysid = userDptSysid;
        this.userBranchSysid = userBranchSysid;
        this.userCmpSysid = userCmpSysid;
        this.userRigth = userRigth;
    }
    
    public UsersTbPK(UsersPKModel user) {
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
    public int hashCode() {
        int hash = 0;
        hash += (int) userSysid;
        hash += (int) userUserpvlgSysid;
        hash += (int) userDptSysid;
        hash += (int) userBranchSysid;
        hash += (int) userCmpSysid;
        hash += (int) userRigth;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersTbPK)) {
            return false;
        }
        UsersTbPK other = (UsersTbPK) object;
        if (this.userSysid != other.userSysid) {
            return false;
        }
        if (this.userUserpvlgSysid != other.userUserpvlgSysid) {
            return false;
        }
        if (this.userDptSysid != other.userDptSysid) {
            return false;
        }
        if (this.userBranchSysid != other.userBranchSysid) {
            return false;
        }
        if (this.userCmpSysid != other.userCmpSysid) {
            return false;
        }
        if (this.userRigth != other.userRigth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.UsersTbPK[ userSysid=" + userSysid + ", userUserpvlgSysid=" + userUserpvlgSysid + ", userDptSysid=" + userDptSysid + ", userBranchSysid=" + userBranchSysid + ", userCmpSysid=" + userCmpSysid + ", userRigth=" + userRigth + " ]";
    }
    
}
