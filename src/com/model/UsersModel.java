/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.UsersTb;



/**
 *
 * @author Developer
 */
public class UsersModel {
    private UsersPKModel usersTbPK; 
    private int userPagtSysid; 
    private int userPteamSysid; 
    private String userTitle; 
    private String userSurname; 
    private String userOthname; 
    private String userName; 
    private String userPwd; 
    private String userAddress; 
    private String userRegDt; 
    private String userEmail; 
    private String userStatus; 
    private String userAgreed; 
    private String userCrtDt; 
    private String userPhoto; 
    private String userLoginDt; 
    private String userOnline; 
    private String userMobile; 
    private String userGrade; 
    private int userMaxtime; 
    private String userEnddt; 
    private String userChgPwd; 
    private String userFolderPath; 
    private String userCrtBy;
    private String userUsage;

    public UsersModel() {
        this.usersTbPK = new UsersPKModel();
    }
    
    public UsersModel(UsersTb users) {
        this.usersTbPK = new UsersPKModel(users.getUsersTbPK());
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
    
    public UsersModel(Object[] obj){
      this.usersTbPK = new UsersPKModel(Integer.parseInt(String.valueOf(obj[0])), 0, 0, String.valueOf(obj[1]),0,0);
      this.userName = String.valueOf(obj[2]);
      this.userSurname = String.valueOf(obj[3]);
      this.userMobile = String.valueOf(obj[4]);
    }
    
    public UsersModel(Object[] obj, String action){
      this.usersTbPK = new UsersPKModel(Integer.parseInt(String.valueOf(obj[0])), 0, 0, String.valueOf(obj[1]) == null ?"0":String.valueOf(obj[1]),0,0);
      this.userName = String.valueOf(obj[2]);
      this.userSurname = String.valueOf(obj[3]);
      this.userMobile = String.valueOf(obj[4]);
    }
    
    public UsersModel(ProductAgentsModel pamodel) {
        this.usersTbPK = new UsersPKModel(0, pamodel.getPagtCode().contains("SM") ? 5:4, 10, pamodel.getProductAgentsTbPK().getPagtBranchSysid(), 1, 1);
        this.userPagtSysid = pamodel.getProductAgentsTbPK().getPagtSysid();
        this.userPteamSysid = pamodel.getPagtReportId();
        this.userTitle = "AGT";
        this.userSurname = pamodel.getPagtSurname();
        this.userOthname = pamodel.getPagtOthname();
        this.userName = pamodel.getPagtCode();
        this.userPwd = "";
        this.userAddress = pamodel.getPagtAddrs();
        this.userRegDt = pamodel.getPagtRegDt();
        this.userEmail = pamodel.getPagtEmail();
        this.userStatus = pamodel.getPagtStatus();
        this.userAgreed = "N";
        this.userCrtDt = pamodel.getPagtRegDt();
        this.userPhoto = "users_images/no_image.png";
        this.userLoginDt = null;
        this.userOnline = "N";
        this.userMobile = pamodel.getPagtMobile();
        this.userGrade = null;
        this.userMaxtime = 30;
        this.userEnddt = "2021-04-01";
        this.userChgPwd = "1";
        this.userFolderPath = null;
        this.userCrtBy = "ddanso";
        this.userUsage = "SALEAGT";
    }

    public UsersPKModel getUsersTbPK() {
        return usersTbPK;
    }

    public void setUsersTbPK(UsersPKModel usersTbPK) {
        this.usersTbPK = usersTbPK;
    }

    public int getUserPagtSysid() {
        return userPagtSysid;
    }

    public void setUserPagtSysid(int userPagtSysid) {
        this.userPagtSysid = userPagtSysid;
    }

    public int getUserPteamSysid() {
        return userPteamSysid;
    }

    public void setUserPteamSysid(int userPteamSysid) {
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

    public int getUserMaxtime() {
        return userMaxtime;
    }

    public void setUserMaxtime(int userMaxtime) {
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
    public String toString() {
        return "UsersModel{" + "usersTbPK=" + usersTbPK + ", userPagtSysid=" + userPagtSysid + ", userPteamSysid=" + userPteamSysid + ", userTitle=" + userTitle + ", userSurname=" + userSurname + ", userOthname=" + userOthname + ", userName=" + userName + ", userPwd=" + userPwd + ", userAddress=" + userAddress + ", userRegDt=" + userRegDt + ", userEmail=" + userEmail + ", userStatus=" + userStatus + ", userAgreed=" + userAgreed + ", userCrtDt=" + userCrtDt + ", userPhoto=" + userPhoto + ", userLoginDt=" + userLoginDt + ", userOnline=" + userOnline + ", userMobile=" + userMobile + ", userGrade=" + userGrade + ", userMaxtime=" + userMaxtime + ", userEnddt=" + userEnddt + ", userChgPwd=" + userChgPwd + ", userFolderPath=" + userFolderPath + ", userCrtBy=" + userCrtBy + ", userUsage=" + userUsage + '}';
    }
    
    
}
