/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source2.entity.EasyappTeamTb;

/**
 *
 * @author Developer
 */
public class EasyappTeamTbModel {
    int teamIndex;
    String teamId; 
    String teamName; 
    String teamBranch; 
    String teamGender; 
    String teamDateOfBirth;
    String teamAddress;
    String teamMobileNo;
    String teamMobileMoneyNo;
    String teamStatus;
    String teamNo;
    String teamBankNameIndex;
    String teamBankBranchIndex;
    String teamBankBranchAccount;
    String teamBenefitStartDate;
    String teamUserindex; 
    String teamInputdate;
    String teamDate;
    String teamEmail;
    String photo;

    public EasyappTeamTbModel() {
    }
    
    
   
    public EasyappTeamTbModel(EasyappTeamTb easyteam) {
        this.teamIndex = easyteam.getTeamIndex();
        this.teamId = easyteam.getTeamId();
        this.teamName = easyteam.getTeamName();
        this.teamBranch = easyteam.getTeamBranch();
        this.teamGender = easyteam.getTeamGender();
        this.teamDateOfBirth = easyteam.getTeamDateOfBirth();
        this.teamAddress = easyteam.getTeamAddress();
        this.teamMobileNo = easyteam.getTeamMobileNo();
        this.teamMobileMoneyNo = easyteam.getTeamMobileMoneyNo();
        this.teamStatus = easyteam.getTeamStatus();
        this.teamNo = easyteam.getTeamNo();
        this.teamBankNameIndex = easyteam.getTeamBankNameIndex();
        this.teamBankBranchIndex = easyteam.getTeamBankBranchIndex();
        this.teamBankBranchAccount = easyteam.getTeamBankBranchAccount();
        this.teamBenefitStartDate = easyteam.getTeamBenefitStartDate();
        this.teamUserindex = easyteam.getTeamUserindex();
        this.teamInputdate = easyteam.getTeamInputdate();
        this.teamDate = easyteam.getTeamDate();
        this.teamEmail = easyteam.getTeamEmail();
        this.photo = easyteam.getPhoto();
    }

    public int getTeamIndex() {
        return teamIndex;
    }

    public void setTeamIndex(int teamIndex) {
        this.teamIndex = teamIndex;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamBranch() {
        return teamBranch;
    }

    public void setTeamBranch(String teamBranch) {
        this.teamBranch = teamBranch;
    }

    public String getTeamGender() {
        return teamGender;
    }

    public void setTeamGender(String teamGender) {
        this.teamGender = teamGender;
    }

    public String getTeamDateOfBirth() {
        return teamDateOfBirth;
    }

    public void setTeamDateOfBirth(String teamDateOfBirth) {
        this.teamDateOfBirth = teamDateOfBirth;
    }

    public String getTeamAddress() {
        return teamAddress;
    }

    public void setTeamAddress(String teamAddress) {
        this.teamAddress = teamAddress;
    }

    public String getTeamMobileNo() {
        return teamMobileNo;
    }

    public void setTeamMobileNo(String teamMobileNo) {
        this.teamMobileNo = teamMobileNo;
    }

    public String getTeamMobileMoneyNo() {
        return teamMobileMoneyNo;
    }

    public void setTeamMobileMoneyNo(String teamMobileMoneyNo) {
        this.teamMobileMoneyNo = teamMobileMoneyNo;
    }

    public String getTeamStatus() {
        return teamStatus;
    }

    public void setTeamStatus(String teamStatus) {
        this.teamStatus = teamStatus;
    }

    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo;
    }

    public String getTeamBankNameIndex() {
        return teamBankNameIndex;
    }

    public void setTeamBankNameIndex(String teamBankNameIndex) {
        this.teamBankNameIndex = teamBankNameIndex;
    }

    public String getTeamBankBranchIndex() {
        return teamBankBranchIndex;
    }

    public void setTeamBankBranchIndex(String teamBankBranchIndex) {
        this.teamBankBranchIndex = teamBankBranchIndex;
    }

    public String getTeamBankBranchAccount() {
        return teamBankBranchAccount;
    }

    public void setTeamBankBranchAccount(String teamBankBranchAccount) {
        this.teamBankBranchAccount = teamBankBranchAccount;
    }

    public String getTeamBenefitStartDate() {
        return teamBenefitStartDate;
    }

    public void setTeamBenefitStartDate(String teamBenefitStartDate) {
        this.teamBenefitStartDate = teamBenefitStartDate;
    }

    public String getTeamUserindex() {
        return teamUserindex;
    }

    public void setTeamUserindex(String teamUserindex) {
        this.teamUserindex = teamUserindex;
    }

    public String getTeamInputdate() {
        return teamInputdate;
    }

    public void setTeamInputdate(String teamInputdate) {
        this.teamInputdate = teamInputdate;
    }

    public String getTeamDate() {
        return teamDate;
    }

    public void setTeamDate(String teamDate) {
        this.teamDate = teamDate;
    }

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "EasyappTeamTbModel{" + "teamIndex=" + teamIndex + ", teamId=" + teamId + ", teamName=" + teamName + ", teamBranch=" + teamBranch + ", teamGender=" + teamGender + ", teamDateOfBirth=" + teamDateOfBirth + ", teamAddress=" + teamAddress + ", teamMobileNo=" + teamMobileNo + ", teamMobileMoneyNo=" + teamMobileMoneyNo + ", teamStatus=" + teamStatus + ", teamNo=" + teamNo + ", teamBankNameIndex=" + teamBankNameIndex + ", teamBankBranchIndex=" + teamBankBranchIndex + ", teamBankBranchAccount=" + teamBankBranchAccount + ", teamBenefitStartDate=" + teamBenefitStartDate + ", teamUserindex=" + teamUserindex + ", teamInputdate=" + teamInputdate + ", teamDate=" + teamDate + ", teamEmail=" + teamEmail + ", photo=" + photo + '}';
    }
    
    
}
