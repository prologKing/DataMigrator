/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source3.entity.EazylifeTeamTb;

/**
 *
 * @author Developer
 */
public class EazylifeTeamTbModel {
    int teamIndex;
    String teamId;
    String teamTitle;
    String teamNo;
    String teamName;
    String teamGender;
    String teamDateOfBirth;
    String teamAddress;
    String teamMobileNo;
    String teamMobileMoneyNo;
    String teamBranch;
    String teamStatus;
    String teamBankNameIndex;
    String teamBankBranchIndex;
    String teamBankBranchAccount;
    String teamBenefitStartDate;
    String teamUserindex;
    String teamInputdate;
    String teamEmail;
    String teamDate;
    String teamExitDate;

    public EazylifeTeamTbModel() {
    }
    
    
    
   public EazylifeTeamTbModel(EazylifeTeamTb elteam) {
        this.teamIndex = elteam.getTeamIndex();
        this.teamId = elteam.getTeamId();
        this.teamTitle = elteam.getTeamTitle();
        this.teamNo = elteam.getTeamNo();
        this.teamName = elteam.getTeamName();
        this.teamGender = elteam.getTeamGender();
        this.teamDateOfBirth = elteam.getTeamDateOfBirth();
        this.teamAddress = elteam.getTeamAddress();
        this.teamMobileNo = elteam.getTeamMobileNo();
        this.teamMobileMoneyNo = elteam.getTeamMobileMoneyNo();
        this.teamBranch = elteam.getTeamBranch();
        this.teamStatus = elteam.getTeamStatus();
        this.teamBankNameIndex = elteam.getTeamBankNameIndex();
        this.teamBankBranchIndex = elteam.getTeamBankBranchIndex();
        this.teamBankBranchAccount = elteam.getTeamBankBranchAccount();
        this.teamBenefitStartDate = elteam.getTeamBenefitStartDate();
        this.teamUserindex = elteam.getTeamUserindex();
        this.teamInputdate = elteam.getTeamInputdate();
        this.teamEmail = elteam.getTeamEmail();
        this.teamDate = elteam.getTeamDate();
        this.teamExitDate = elteam.getTeamExitDate();
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

    public String getTeamTitle() {
        return teamTitle;
    }

    public void setTeamTitle(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public String getTeamBranch() {
        return teamBranch;
    }

    public void setTeamBranch(String teamBranch) {
        this.teamBranch = teamBranch;
    }

    public String getTeamStatus() {
        return teamStatus;
    }

    public void setTeamStatus(String teamStatus) {
        this.teamStatus = teamStatus;
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

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail;
    }

    public String getTeamDate() {
        return teamDate;
    }

    public void setTeamDate(String teamDate) {
        this.teamDate = teamDate;
    }

    public String getTeamExitDate() {
        return teamExitDate;
    }

    public void setTeamExitDate(String teamExitDate) {
        this.teamExitDate = teamExitDate;
    }

    @Override
    public String toString() {
        return "EazylifeTeamTbModel{" + "teamIndex=" + teamIndex + ", teamId=" + teamId + ", teamTitle=" + teamTitle + ", teamNo=" + teamNo + ", teamName=" + teamName + ", teamGender=" + teamGender + ", teamDateOfBirth=" + teamDateOfBirth + ", teamAddress=" + teamAddress + ", teamMobileNo=" + teamMobileNo + ", teamMobileMoneyNo=" + teamMobileMoneyNo + ", teamBranch=" + teamBranch + ", teamStatus=" + teamStatus + ", teamBankNameIndex=" + teamBankNameIndex + ", teamBankBranchIndex=" + teamBankBranchIndex + ", teamBankBranchAccount=" + teamBankBranchAccount + ", teamBenefitStartDate=" + teamBenefitStartDate + ", teamUserindex=" + teamUserindex + ", teamInputdate=" + teamInputdate + ", teamEmail=" + teamEmail + ", teamDate=" + teamDate + ", teamExitDate=" + teamExitDate + '}';
    }
   
   
}
