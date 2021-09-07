/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source3.entity;

import com.model.EazylifeAgentsTbModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "eazylife_agents_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazylifeAgentsTb.findAll", query = "SELECT e FROM EazylifeAgentsTb e"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsIndex", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsIndex = :agentsIndex"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsId", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsId = :agentsId"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsName", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsName = :agentsName"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsGender", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsGender = :agentsGender"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsDateOfBirth", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsDateOfBirth = :agentsDateOfBirth"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsMobileNo", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsMobileNo = :agentsMobileNo"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsMobileMoneyNo", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsMobileMoneyNo = :agentsMobileMoneyNo"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsBranch", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsBranch = :agentsBranch"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsStatus", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsStatus = :agentsStatus"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsTeamId", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsTeamId = :agentsTeamId"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsBankNameIndex", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsBankNameIndex = :agentsBankNameIndex"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsBankBranchIndex", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsBankBranchIndex = :agentsBankBranchIndex"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsBankBranchAccount", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsBankBranchAccount = :agentsBankBranchAccount"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsBenefitStartDate", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsBenefitStartDate = :agentsBenefitStartDate"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsUserindex", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsUserindex = :agentsUserindex"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsInputdate", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsInputdate = :agentsInputdate"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsRegistrationDate", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsRegistrationDate = :agentsRegistrationDate"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsEmail", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsEmail = :agentsEmail"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsExitDate", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsExitDate = :agentsExitDate"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsMaritalStatus", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsMaritalStatus = :agentsMaritalStatus"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsNicNumber", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsNicNumber = :agentsNicNumber"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsLicensingDate", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsLicensingDate = :agentsLicensingDate"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsRenewalDate", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsRenewalDate = :agentsRenewalDate"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsSourceOfEntry", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsSourceOfEntry = :agentsSourceOfEntry"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsGuarantorName", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsGuarantorName = :agentsGuarantorName"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsGuarantorMobileNo", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsGuarantorMobileNo = :agentsGuarantorMobileNo"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsRefId", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsRefId = :agentsRefId"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsOccupation", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsOccupation = :agentsOccupation"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsWorkExperience", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsWorkExperience = :agentsWorkExperience"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsSalesExperience", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsSalesExperience = :agentsSalesExperience"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsSalesExperienceWording", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsSalesExperienceWording = :agentsSalesExperienceWording"),
    @NamedQuery(name = "EazylifeAgentsTb.findByAgentsSalesTinNumber", query = "SELECT e FROM EazylifeAgentsTb e WHERE e.agentsSalesTinNumber = :agentsSalesTinNumber")})
public class EazylifeAgentsTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "agents_index")
    private Integer agentsIndex;
    @Size(max = 45)
    @Column(name = "agents_id")
    private String agentsId;
    @Size(max = 45)
    @Column(name = "agents_name")
    private String agentsName;
    @Size(max = 15)
    @Column(name = "agents_gender")
    private String agentsGender;
    @Column(name = "agents_date_of_birth")
    private String agentsDateOfBirth;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "agents_address")
    private String agentsAddress;
    @Size(max = 15)
    @Column(name = "agents_mobile_no")
    private String agentsMobileNo;
    @Size(max = 15)
    @Column(name = "agents_mobile_money_no")
    private String agentsMobileMoneyNo;
    @Size(max = 15)
    @Column(name = "agents_branch")
    private String agentsBranch;
    @Size(max = 15)
    @Column(name = "agents_status")
    private String agentsStatus;
    @Size(max = 15)
    @Column(name = "agents_team_id")
    private String agentsTeamId;
    @Size(max = 15)
    @Column(name = "agents_bank_name_index")
    private String agentsBankNameIndex;
    @Size(max = 15)
    @Column(name = "agents_bank_branch_index")
    private String agentsBankBranchIndex;
    @Size(max = 15)
    @Column(name = "agents_bank_branch_account")
    private String agentsBankBranchAccount;
    @Column(name = "agents_benefit_start_date")
    private String agentsBenefitStartDate;
    @Size(max = 15)
    @Column(name = "agents_userindex")
    private String agentsUserindex;
    @Column(name = "agents_inputdate")
    private String agentsInputdate;
    @Column(name = "agents_registration_date")
    private String agentsRegistrationDate;
    @Size(max = 45)
    @Column(name = "agents_email")
    private String agentsEmail;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "agents_photo")
    private String agentsPhoto;
    @Column(name = "agents_exit_date")
    private String agentsExitDate;
    @Size(max = 11)
    @Column(name = "agents_marital_status")
    private String agentsMaritalStatus;
    @Size(max = 30)
    @Column(name = "agents_nic_number")
    private String agentsNicNumber;
    @Column(name = "agents_licensing_date")
    private String agentsLicensingDate;
    @Column(name = "agents_renewal_date")
    private String agentsRenewalDate;
    @Size(max = 50)
    @Column(name = "agents_source_of_entry")
    private String agentsSourceOfEntry;
    @Size(max = 45)
    @Column(name = "agents_guarantor_name")
    private String agentsGuarantorName;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "agents_guarantor_address")
    private String agentsGuarantorAddress;
    @Size(max = 30)
    @Column(name = "agents_guarantor_mobile_no")
    private String agentsGuarantorMobileNo;
    @Size(max = 11)
    @Column(name = "agents_ref_id")
    private String agentsRefId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "agents_qualification")
    private String agentsQualification;
    @Size(max = 45)
    @Column(name = "agents_Occupation")
    private String agentsOccupation;
    @Size(max = 45)
    @Column(name = "agents_work_experience")
    private String agentsWorkExperience;
    @Size(max = 45)
    @Column(name = "agents_sales_experience")
    private String agentsSalesExperience;
    @Size(max = 45)
    @Column(name = "agents_sales_experience_wording")
    private String agentsSalesExperienceWording;
    @Size(max = 45)
    @Column(name = "agents_sales_tin_number")
    private String agentsSalesTinNumber;

    public EazylifeAgentsTb() {
    }
    
    public EazylifeAgentsTb(EazylifeAgentsTbModel elagent) {
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

    public EazylifeAgentsTb(Integer agentsIndex) {
        this.agentsIndex = agentsIndex;
    }

    public Integer getAgentsIndex() {
        return agentsIndex;
    }

    public void setAgentsIndex(Integer agentsIndex) {
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
    public int hashCode() {
        int hash = 0;
        hash += (agentsIndex != null ? agentsIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazylifeAgentsTb)) {
            return false;
        }
        EazylifeAgentsTb other = (EazylifeAgentsTb) object;
        if ((this.agentsIndex == null && other.agentsIndex != null) || (this.agentsIndex != null && !this.agentsIndex.equals(other.agentsIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source3.entity.EazylifeAgentsTb[ agentsIndex=" + agentsIndex + " ]";
    }
    
}
