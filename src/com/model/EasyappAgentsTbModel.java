/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source2.entity.EasyappAgentsTb;

/**
 *
 * @author Developer
 */
public class EasyappAgentsTbModel {
    int agentsIndex;
    String agentsId;
    String agentsName;
    String agentsBranch;
    String agentsGender;
    String agentsDateOfBirth;
    String agentsAddress;
    String agentsMobileNo;
    String agentsMobileMoneyNo;
    String agentsStatus; 
    String agentsTeamId; 
    String agentsBankNameIndex; 
    String agentsBankBranchIndex;
    String agentsBankBranchAccount; 
    String agentsBenefitStartDate; 
    String agentsUserindex; 
    String agentsInputdate; 
    String agentsRegistrationDate;
    String agentsEmail;
    String agentsPhoto;
   
    public EasyappAgentsTbModel(EasyappAgentsTb easytb) {
        this.agentsIndex = easytb.getAgentsIndex();
        this.agentsId = easytb.getAgentsId();
        this.agentsName = easytb.getAgentsName();
        this.agentsBranch = easytb.getAgentsBranch();
        this.agentsGender = easytb.getAgentsGender();
        this.agentsDateOfBirth = easytb.getAgentsDateOfBirth();
        this.agentsAddress = easytb.getAgentsAddress();
        this.agentsMobileNo = easytb.getAgentsMobileNo();
        this.agentsMobileMoneyNo = easytb.getAgentsMobileMoneyNo();
        this.agentsStatus = easytb.getAgentsStatus();
        this.agentsTeamId = easytb.getAgentsTeamId();
        this.agentsBankNameIndex = easytb.getAgentsBankNameIndex();
        this.agentsBankBranchIndex = easytb.getAgentsBankBranchIndex();
        this.agentsBankBranchAccount = easytb.getAgentsBankBranchAccount();
        this.agentsBenefitStartDate = easytb.getAgentsBenefitStartDate();
        this.agentsUserindex = easytb.getAgentsUserindex();
        this.agentsInputdate = easytb.getAgentsInputdate();
        this.agentsRegistrationDate = easytb.getAgentsRegistrationDate();
        this.agentsEmail = easytb.getAgentsEmail();
        this.agentsPhoto = easytb.getAgentsPhoto();
    }

    public EasyappAgentsTbModel() {
    }
    
    

    public int getAgentsIndex() {
        return agentsIndex;
    }

    public void setAgentsIndex(int agentsIndex) {
        this.agentsIndex = agentsIndex;
    }

    public String getAgentsId() {
        return agentsId;
    }

    public void setAgentsId(String agentsId) {
        this.agentsId = agentsId;
    }

    public String getAgentsName() {
        return agentsName;
    }

    public void setAgentsName(String agentsName) {
        this.agentsName = agentsName;
    }

    public String getAgentsBranch() {
        return agentsBranch;
    }

    public void setAgentsBranch(String agentsBranch) {
        this.agentsBranch = agentsBranch;
    }

    public String getAgentsGender() {
        return agentsGender;
    }

    public void setAgentsGender(String agentsGender) {
        this.agentsGender = agentsGender;
    }

    public String getAgentsDateOfBirth() {
        return agentsDateOfBirth;
    }

    public void setAgentsDateOfBirth(String agentsDateOfBirth) {
        this.agentsDateOfBirth = agentsDateOfBirth;
    }

    public String getAgentsAddress() {
        return agentsAddress;
    }

    public void setAgentsAddress(String agentsAddress) {
        this.agentsAddress = agentsAddress;
    }

    public String getAgentsMobileNo() {
        return agentsMobileNo;
    }

    public void setAgentsMobileNo(String agentsMobileNo) {
        this.agentsMobileNo = agentsMobileNo;
    }

    public String getAgentsMobileMoneyNo() {
        return agentsMobileMoneyNo;
    }

    public void setAgentsMobileMoneyNo(String agentsMobileMoneyNo) {
        this.agentsMobileMoneyNo = agentsMobileMoneyNo;
    }

    public String getAgentsStatus() {
        return agentsStatus;
    }

    public void setAgentsStatus(String agentsStatus) {
        this.agentsStatus = agentsStatus;
    }

    public String getAgentsTeamId() {
        return agentsTeamId;
    }

    public void setAgentsTeamId(String agentsTeamId) {
        this.agentsTeamId = agentsTeamId;
    }

    public String getAgentsBankNameIndex() {
        return agentsBankNameIndex;
    }

    public void setAgentsBankNameIndex(String agentsBankNameIndex) {
        this.agentsBankNameIndex = agentsBankNameIndex;
    }

    public String getAgentsBankBranchIndex() {
        return agentsBankBranchIndex;
    }

    public void setAgentsBankBranchIndex(String agentsBankBranchIndex) {
        this.agentsBankBranchIndex = agentsBankBranchIndex;
    }

    public String getAgentsBankBranchAccount() {
        return agentsBankBranchAccount;
    }

    public void setAgentsBankBranchAccount(String agentsBankBranchAccount) {
        this.agentsBankBranchAccount = agentsBankBranchAccount;
    }

    public String getAgentsBenefitStartDate() {
        return agentsBenefitStartDate;
    }

    public void setAgentsBenefitStartDate(String agentsBenefitStartDate) {
        this.agentsBenefitStartDate = agentsBenefitStartDate;
    }

    public String getAgentsUserindex() {
        return agentsUserindex;
    }

    public void setAgentsUserindex(String agentsUserindex) {
        this.agentsUserindex = agentsUserindex;
    }

    public String getAgentsInputdate() {
        return agentsInputdate;
    }

    public void setAgentsInputdate(String agentsInputdate) {
        this.agentsInputdate = agentsInputdate;
    }

    public String getAgentsRegistrationDate() {
        return agentsRegistrationDate;
    }

    public void setAgentsRegistrationDate(String agentsRegistrationDate) {
        this.agentsRegistrationDate = agentsRegistrationDate;
    }

    public String getAgentsEmail() {
        return agentsEmail;
    }

    public void setAgentsEmail(String agentsEmail) {
        this.agentsEmail = agentsEmail;
    }

    public String getAgentsPhoto() {
        return agentsPhoto;
    }

    public void setAgentsPhoto(String agentsPhoto) {
        this.agentsPhoto = agentsPhoto;
    }
    
    
}
