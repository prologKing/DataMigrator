/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.UsersModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "users_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersTb.findAll", query = "SELECT u FROM UsersTb u"),
    @NamedQuery(name = "UsersTb.findByUserSysid", query = "SELECT u FROM UsersTb u WHERE u.usersTbPK.userSysid = :userSysid"),
    @NamedQuery(name = "UsersTb.findByUserUserpvlgSysid", query = "SELECT u FROM UsersTb u WHERE u.usersTbPK.userUserpvlgSysid = :userUserpvlgSysid"),
    @NamedQuery(name = "UsersTb.findByUserDptSysid", query = "SELECT u FROM UsersTb u WHERE u.usersTbPK.userDptSysid = :userDptSysid"),
    @NamedQuery(name = "UsersTb.findByUserBranchSysid", query = "SELECT u FROM UsersTb u WHERE u.usersTbPK.userBranchSysid = :userBranchSysid"),
    @NamedQuery(name = "UsersTb.findByUserCmpSysid", query = "SELECT u FROM UsersTb u WHERE u.usersTbPK.userCmpSysid = :userCmpSysid"),
    @NamedQuery(name = "UsersTb.findByUserPagtSysid", query = "SELECT u FROM UsersTb u WHERE u.userPagtSysid = :userPagtSysid"),
    @NamedQuery(name = "UsersTb.findByUserPteamSysid", query = "SELECT u FROM UsersTb u WHERE u.userPteamSysid = :userPteamSysid"),
    @NamedQuery(name = "UsersTb.findByUserTitle", query = "SELECT u FROM UsersTb u WHERE u.userTitle = :userTitle"),
    @NamedQuery(name = "UsersTb.findByUserSurname", query = "SELECT u FROM UsersTb u WHERE u.userSurname = :userSurname"),
    @NamedQuery(name = "UsersTb.findByUserOthname", query = "SELECT u FROM UsersTb u WHERE u.userOthname = :userOthname"),
    @NamedQuery(name = "UsersTb.findByUserName", query = "SELECT u FROM UsersTb u WHERE u.userName = :userName"),
    @NamedQuery(name = "UsersTb.findByUserPwd", query = "SELECT u FROM UsersTb u WHERE u.userPwd = :userPwd"),
    @NamedQuery(name = "UsersTb.findByUserAddress", query = "SELECT u FROM UsersTb u WHERE u.userAddress = :userAddress"),
    @NamedQuery(name = "UsersTb.findByUserRegDt", query = "SELECT u FROM UsersTb u WHERE u.userRegDt = :userRegDt"),
    @NamedQuery(name = "UsersTb.findByUserEmail", query = "SELECT u FROM UsersTb u WHERE u.userEmail = :userEmail"),
    @NamedQuery(name = "UsersTb.findByUserStatus", query = "SELECT u FROM UsersTb u WHERE u.userStatus = :userStatus"),
    @NamedQuery(name = "UsersTb.findByUserAgreed", query = "SELECT u FROM UsersTb u WHERE u.userAgreed = :userAgreed"),
    @NamedQuery(name = "UsersTb.findByUserCrtDt", query = "SELECT u FROM UsersTb u WHERE u.userCrtDt = :userCrtDt"),
    @NamedQuery(name = "UsersTb.findByUserPhoto", query = "SELECT u FROM UsersTb u WHERE u.userPhoto = :userPhoto"),
    @NamedQuery(name = "UsersTb.findByUserLoginDt", query = "SELECT u FROM UsersTb u WHERE u.userLoginDt = :userLoginDt"),
    @NamedQuery(name = "UsersTb.findByUserOnline", query = "SELECT u FROM UsersTb u WHERE u.userOnline = :userOnline"),
    @NamedQuery(name = "UsersTb.findByUserMobile", query = "SELECT u FROM UsersTb u WHERE u.userMobile = :userMobile"),
    @NamedQuery(name = "UsersTb.findByUserGrade", query = "SELECT u FROM UsersTb u WHERE u.userGrade = :userGrade"),
    @NamedQuery(name = "UsersTb.findByUserMaxtime", query = "SELECT u FROM UsersTb u WHERE u.userMaxtime = :userMaxtime"),
    @NamedQuery(name = "UsersTb.findByUserEnddt", query = "SELECT u FROM UsersTb u WHERE u.userEnddt = :userEnddt"),
    @NamedQuery(name = "UsersTb.findByUserChgPwd", query = "SELECT u FROM UsersTb u WHERE u.userChgPwd = :userChgPwd"),
    @NamedQuery(name = "UsersTb.findByUserFolderPath", query = "SELECT u FROM UsersTb u WHERE u.userFolderPath = :userFolderPath"),
    @NamedQuery(name = "UsersTb.findByUserCrtBy", query = "SELECT u FROM UsersTb u WHERE u.userCrtBy = :userCrtBy"),
    @NamedQuery(name = "UsersTb.findByUserRigth", query = "SELECT u FROM UsersTb u WHERE u.usersTbPK.userRigth = :userRigth"),
    @NamedQuery(name = "UsersTb.findByUserUsage", query = "SELECT u FROM UsersTb u WHERE u.userUsage = :userUsage")})
public class UsersTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersTbPK usersTbPK;
    @Column(name = "USER_PAGT_SYSID")
    private Integer userPagtSysid;
    @Column(name = "USER_PTEAM_SYSID")
    private Integer userPteamSysid;
    @Column(name = "USER_TITLE")
    private String userTitle;
    @Column(name = "USER_SURNAME")
    private String userSurname;
    @Column(name = "USER_OTHNAME")
    private String userOthname;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_PWD")
    private String userPwd;
    @Column(name = "USER_ADDRESS")
    private String userAddress;
    @Column(name = "USER_REG_DT")
    private String userRegDt;
    @Column(name = "USER_EMAIL")
    private String userEmail;
    @Column(name = "USER_STATUS")
    private String userStatus;
    @Column(name = "USER_AGREED")
    private String userAgreed;
    @Column(name = "USER_CRT_DT")
    private String userCrtDt;
    @Column(name = "USER_PHOTO")
    private String userPhoto;
    @Column(name = "USER_LOGIN_DT")
    private String userLoginDt;
    @Column(name = "USER_ONLINE")
    private String userOnline;
    @Column(name = "USER_MOBILE")
    private String userMobile;
    @Column(name = "USER_GRADE")
    private String userGrade;
    @Column(name = "USER_MAXTIME")
    private Integer userMaxtime;
    @Column(name = "USER_ENDDT")
    private String userEnddt;
    @Column(name = "USER_CHG_PWD")
    private String userChgPwd;
    @Column(name = "USER_FOLDER_PATH")
    private String userFolderPath;
    @Column(name = "USER_CRT_BY")
    private String userCrtBy;
    @Column(name = "USER_USAGE")
    private String userUsage;
    

    public UsersTb() {
    }

    public UsersTb(UsersTbPK usersTbPK) {
        this.usersTbPK = usersTbPK;
    }

    public UsersTb(UsersModel users) {
        this.usersTbPK = new UsersTbPK(users.getUsersTbPK());
        this.userPagtSysid = users.getUserPagtSysid();
        this.userPteamSysid = users.getUserPteamSysid();
        this.userTitle = users.getUserTitle();
        this.userSurname = users.getUserSurname();
        this.userOthname = users.getUserOthname();
        this.userName = users.getUserName();
        this.userPwd = users.getUserPwd();
        this.userAddress = users.getUserAddress();
        this.userRegDt = users.getUserRegDt();
        this.userEmail = users.getUserEmail();
        this.userStatus = users.getUserStatus();
        this.userAgreed = users.getUserAgreed();
        this.userCrtDt = users.getUserCrtDt();
        this.userPhoto = users.getUserPhoto();
        this.userLoginDt = users.getUserLoginDt();
        this.userOnline = users.getUserOnline();
        this.userMobile = users.getUserMobile();
        this.userGrade = users.getUserGrade();
        this.userMaxtime = users.getUserMaxtime();
        this.userEnddt = users.getUserEnddt();
        this.userChgPwd = users.getUserChgPwd();
        this.userFolderPath = users.getUserFolderPath();
        this.userCrtBy = users.getUserCrtBy();
        this.userUsage = users.getUserUsage();
    }
    
    

    public UsersTb(int userSysid, int userUserpvlgSysid, int userDptSysid, int userBranchSysid, int userCmpSysid, int userRigth) {
        this.usersTbPK = new UsersTbPK(userSysid, userUserpvlgSysid, userDptSysid, userBranchSysid, userCmpSysid, userRigth);
    }

    public UsersTbPK getUsersTbPK() {
        return usersTbPK;
    }

    public void setUsersTbPK(UsersTbPK usersTbPK) {
        this.usersTbPK = usersTbPK;
    }

    public Integer getUserPagtSysid() {
        return userPagtSysid;
    }

    public void setUserPagtSysid(Integer userPagtSysid) {
        this.userPagtSysid = userPagtSysid;
    }

    public Integer getUserPteamSysid() {
        return userPteamSysid;
    }

    public void setUserPteamSysid(Integer userPteamSysid) {
        this.userPteamSysid = userPteamSysid;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserOthname() {
        return userOthname;
    }

    public void setUserOthname(String userOthname) {
        this.userOthname = userOthname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserRegDt() {
        return userRegDt;
    }

    public void setUserRegDt(String userRegDt) {
        this.userRegDt = userRegDt;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserAgreed() {
        return userAgreed;
    }

    public void setUserAgreed(String userAgreed) {
        this.userAgreed = userAgreed;
    }

    public String getUserCrtDt() {
        return userCrtDt;
    }

    public void setUserCrtDt(String userCrtDt) {
        this.userCrtDt = userCrtDt;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserLoginDt() {
        return userLoginDt;
    }

    public void setUserLoginDt(String userLoginDt) {
        this.userLoginDt = userLoginDt;
    }

    public String getUserOnline() {
        return userOnline;
    }

    public void setUserOnline(String userOnline) {
        this.userOnline = userOnline;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public Integer getUserMaxtime() {
        return userMaxtime;
    }

    public void setUserMaxtime(Integer userMaxtime) {
        this.userMaxtime = userMaxtime;
    }

    public String getUserEnddt() {
        return userEnddt;
    }

    public void setUserEnddt(String userEnddt) {
        this.userEnddt = userEnddt;
    }

    public String getUserChgPwd() {
        return userChgPwd;
    }

    public void setUserChgPwd(String userChgPwd) {
        this.userChgPwd = userChgPwd;
    }

    public String getUserFolderPath() {
        return userFolderPath;
    }

    public void setUserFolderPath(String userFolderPath) {
        this.userFolderPath = userFolderPath;
    }

    public String getUserCrtBy() {
        return userCrtBy;
    }

    public void setUserCrtBy(String userCrtBy) {
        this.userCrtBy = userCrtBy;
    }

    public String getUserUsage() {
        return userUsage;
    }

    public void setUserUsage(String userUsage) {
        this.userUsage = userUsage;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersTbPK != null ? usersTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersTb)) {
            return false;
        }
        UsersTb other = (UsersTb) object;
        if ((this.usersTbPK == null && other.usersTbPK != null) || (this.usersTbPK != null && !this.usersTbPK.equals(other.usersTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.UsersTb[ usersTbPK=" + usersTbPK + " ]";
    }
    
}
