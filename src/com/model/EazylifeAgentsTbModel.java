/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.source3.entity.EazylifeAgentsTb;

/**
 *
 * @author Developer
 */
public class EazylifeAgentsTbModel {
    int agentsIndex;
    String agentsId;
    String agentsName; 
    String agentsGender;
    String agentsDateOfBirth;
    String agentsAddress;
    String agentsMobileNo;
    String agentsMobileMoneyNo; 
    String agentsBranch;
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
    String agentsExitDate;
    String agentsMaritalStatus;
    String agentsNicNumber;
    String agentsLicensingDate;
    String agentsRenewalDate;
    String agentsSourceOfEntry;
    String agentsGuarantorName;
    String agentsGuarantorAddress;
    String agentsGuarantorMobileNo;
    String agentsRefId;
    String agentsQualification;
    String agentsOccupation;
    String agentsWorkExperience;
    String agentsSalesExperience;
    String agentsSalesExperienceWording;
    String agentsSalesTinNumber;

    public EazylifeAgentsTbModel() {
    }
    
    
    
    public EazylifeAgentsTbModel(EazylifeAgentsTb elagent) {
        this.agentsIndex = elagent.getAgentsIndex();
        this.agentsId = elagent.getAgentsId();
        this.agentsName = elagent.getAgentsName();
        this.agentsGender = elagent.getAgentsGender();
        this.agentsDateOfBirth = elagent.getAgentsDateOfBirth();
        this.agentsAddress = elagent.getAgentsAddress();
        this.agentsMobileNo = elagent.getAgentsMobileNo();
        this.agentsMobileMoneyNo = elagent.getAgentsMobileMoneyNo();
        this.agentsBranch = elagent.getAgentsBranch();
        this.agentsStatus = elagent.getAgentsStatus();
        this.agentsTeamId = elagent.getAgentsTeamId();
        this.agentsBankNameIndex = elagent.getAgentsBankNameIndex();
        this.agentsBankBranchIndex = elagent.getAgentsBankBranchIndex();
        this.agentsBankBranchAccount = elagent.getAgentsBankBranchAccount();
        this.agentsBenefitStartDate = elagent.getAgentsBenefitStartDate();
        this.agentsUserindex = elagent.getAgentsUserindex();
        this.agentsInputdate = elagent.getAgentsInputdate();
        this.agentsRegistrationDate = elagent.getAgentsRegistrationDate();
        this.agentsEmail = elagent.getAgentsEmail();
        this.agentsPhoto = elagent.getAgentsPhoto();
        this.agentsExitDate = elagent.getAgentsExitDate();
        this.agentsMaritalStatus = elagent.getAgentsMaritalStatus();
        this.agentsNicNumber = elagent.getAgentsNicNumber();
        this.agentsLicensingDate = elagent.getAgentsLicensingDate();
        this.agentsRenewalDate = elagent.getAgentsRenewalDate();
        this.agentsSourceOfEntry = elagent.getAgentsSourceOfEntry();
        this.agentsGuarantorName = elagent.getAgentsGuarantorName();
        this.agentsGuarantorAddress = elagent.getAgentsGuarantorAddress();
        this.agentsGuarantorMobileNo = elagent.getAgentsGuarantorMobileNo();
        this.agentsRefId = elagent.getAgentsRefId();
        this.agentsQualification = elagent.getAgentsQualification();
        this.agentsOccupation = elagent.getAgentsOccupation();
        this.agentsWorkExperience = elagent.getAgentsWorkExperience();
        this.agentsSalesExperience = elagent.getAgentsSalesExperience();
        this.agentsSalesExperienceWording = elagent.getAgentsSalesExperienceWording();
        this.agentsSalesTinNumber = elagent.getAgentsSalesTinNumber();
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

    public String getAgentsBranch() {
        return agentsBranch;
    }

    public void setAgentsBranch(String agentsBranch) {
        this.agentsBranch = agentsBranch;
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

    public String getAgentsExitDate() {
        return agentsExitDate;
    }

    public void setAgentsExitDate(String agentsExitDate) {
        this.agentsExitDate = agentsExitDate;
    }

    public String getAgentsMaritalStatus() {
        return agentsMaritalStatus;
    }

    public void setAgentsMaritalStatus(String agentsMaritalStatus) {
        this.agentsMaritalStatus = agentsMaritalStatus;
    }

    public String getAgentsNicNumber() {
        return agentsNicNumber;
    }

    public void setAgentsNicNumber(String agentsNicNumber) {
        this.agentsNicNumber = agentsNicNumber;
    }

    public String getAgentsLicensingDate() {
        return agentsLicensingDate;
    }

    public void setAgentsLicensingDate(String agentsLicensingDate) {
        this.agentsLicensingDate = agentsLicensingDate;
    }

    public String getAgentsRenewalDate() {
        return agentsRenewalDate;
    }

    public void setAgentsRenewalDate(String agentsRenewalDate) {
        this.agentsRenewalDate = agentsRenewalDate;
    }

    public String getAgentsSourceOfEntry() {
        return agentsSourceOfEntry;
    }

    public void setAgentsSourceOfEntry(String agentsSourceOfEntry) {
        this.agentsSourceOfEntry = agentsSourceOfEntry;
    }

    public String getAgentsGuarantorName() {
        return agentsGuarantorName;
    }

    public void setAgentsGuarantorName(String agentsGuarantorName) {
        this.agentsGuarantorName = agentsGuarantorName;
    }

    public String getAgentsGuarantorAddress() {
        return agentsGuarantorAddress;
    }

    public void setAgentsGuarantorAddress(String agentsGuarantorAddress) {
        this.agentsGuarantorAddress = agentsGuarantorAddress;
    }

    public String getAgentsGuarantorMobileNo() {
        return agentsGuarantorMobileNo;
    }

    public void setAgentsGuarantorMobileNo(String agentsGuarantorMobileNo) {
        this.agentsGuarantorMobileNo = agentsGuarantorMobileNo;
    }

    public String getAgentsRefId() {
        return agentsRefId;
    }

    public void setAgentsRefId(String agentsRefId) {
        this.agentsRefId = agentsRefId;
    }

    public String getAgentsQualification() {
        return agentsQualification;
    }

    public void setAgentsQualification(String agentsQualification) {
        this.agentsQualification = agentsQualification;
    }

    public String getAgentsOccupation() {
        return agentsOccupation;
    }

    public void setAgentsOccupation(String agentsOccupation) {
        this.agentsOccupation = agentsOccupation;
    }

    public String getAgentsWorkExperience() {
        return agentsWorkExperience;
    }

    public void setAgentsWorkExperience(String agentsWorkExperience) {
        this.agentsWorkExperience = agentsWorkExperience;
    }

    public String getAgentsSalesExperience() {
        return agentsSalesExperience;
    }

    public void setAgentsSalesExperience(String agentsSalesExperience) {
        this.agentsSalesExperience = agentsSalesExperience;
    }

    public String getAgentsSalesExperienceWording() {
        return agentsSalesExperienceWording;
    }

    public void setAgentsSalesExperienceWording(String agentsSalesExperienceWording) {
        this.agentsSalesExperienceWording = agentsSalesExperienceWording;
    }

    public String getAgentsSalesTinNumber() {
        return agentsSalesTinNumber;
    }

    public void setAgentsSalesTinNumber(String agentsSalesTinNumber) {
        this.agentsSalesTinNumber = agentsSalesTinNumber;
    }

    @Override
    public String toString() {
        return "EazylifeAgentsTbModel{" + "agentsIndex=" + agentsIndex + ", agentsId=" + agentsId + ", agentsName=" + agentsName + ", agentsGender=" + agentsGender + ", agentsDateOfBirth=" + agentsDateOfBirth + ", agentsAddress=" + agentsAddress + ", agentsMobileNo=" + agentsMobileNo + ", agentsMobileMoneyNo=" + agentsMobileMoneyNo + ", agentsBranch=" + agentsBranch + ", agentsStatus=" + agentsStatus + ", agentsTeamId=" + agentsTeamId + ", agentsBankNameIndex=" + agentsBankNameIndex + ", agentsBankBranchIndex=" + agentsBankBranchIndex + ", agentsBankBranchAccount=" + agentsBankBranchAccount + ", agentsBenefitStartDate=" + agentsBenefitStartDate + ", agentsUserindex=" + agentsUserindex + ", agentsInputdate=" + agentsInputdate + ", agentsRegistrationDate=" + agentsRegistrationDate + ", agentsEmail=" + agentsEmail + ", agentsPhoto=" + agentsPhoto + ", agentsExitDate=" + agentsExitDate + ", agentsMaritalStatus=" + agentsMaritalStatus + ", agentsNicNumber=" + agentsNicNumber + ", agentsLicensingDate=" + agentsLicensingDate + ", agentsRenewalDate=" + agentsRenewalDate + ", agentsSourceOfEntry=" + agentsSourceOfEntry + ", agentsGuarantorName=" + agentsGuarantorName + ", agentsGuarantorAddress=" + agentsGuarantorAddress + ", agentsGuarantorMobileNo=" + agentsGuarantorMobileNo + ", agentsRefId=" + agentsRefId + ", agentsQualification=" + agentsQualification + ", agentsOccupation=" + agentsOccupation + ", agentsWorkExperience=" + agentsWorkExperience + ", agentsSalesExperience=" + agentsSalesExperience + ", agentsSalesExperienceWording=" + agentsSalesExperienceWording + ", agentsSalesTinNumber=" + agentsSalesTinNumber + '}';
    }
    
    
}
