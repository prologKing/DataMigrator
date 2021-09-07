/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.AosAgentsTbModel;
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
@Table(name = "aos_agents_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AosAgentsTb.findAll", query = "SELECT a FROM AosAgentsTb a"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsIndex", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsIndex = :agentsIndex"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsId", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsId = :agentsId"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsName", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsName = :agentsName"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsBranch", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsBranch = :agentsBranch"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsGender", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsGender = :agentsGender"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsDateOfBirth", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsDateOfBirth = :agentsDateOfBirth"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsMobileNo", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsMobileNo = :agentsMobileNo"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsMobileMoneyNo", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsMobileMoneyNo = :agentsMobileMoneyNo"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsStatus", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsStatus = :agentsStatus"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsTeamId", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsTeamId = :agentsTeamId"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsBankNameIndex", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsBankNameIndex = :agentsBankNameIndex"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsBankBranchIndex", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsBankBranchIndex = :agentsBankBranchIndex"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsBankBranchAccount", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsBankBranchAccount = :agentsBankBranchAccount"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsBenefitStartDate", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsBenefitStartDate = :agentsBenefitStartDate"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsUserindex", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsUserindex = :agentsUserindex"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsInputdate", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsInputdate = :agentsInputdate"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsRegistrationDate", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsRegistrationDate = :agentsRegistrationDate"),
    @NamedQuery(name = "AosAgentsTb.findByAgentsEmail", query = "SELECT a FROM AosAgentsTb a WHERE a.agentsEmail = :agentsEmail")})
public class AosAgentsTb implements Serializable {
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
    @Column(name = "agents_branch")
    private String agentsBranch;
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

    public AosAgentsTb() {
    }
    
    public AosAgentsTb(AosAgentsTbModel aostb) {
        this.agentsIndex = aostb.getAgentsIndex();
        this.agentsId = aostb.getAgentsId();
        this.agentsName = aostb.getAgentsName();
        this.agentsBranch = aostb.getAgentsBranch();
        this.agentsGender = aostb.getAgentsGender();
        this.agentsDateOfBirth = aostb.getAgentsDateOfBirth();
        this.agentsAddress = aostb.getAgentsAddress();
        this.agentsMobileNo = aostb.getAgentsMobileNo();
        this.agentsMobileMoneyNo = aostb.getAgentsMobileMoneyNo();
        this.agentsStatus = aostb.getAgentsStatus();
        this.agentsTeamId = aostb.getAgentsTeamId();
        this.agentsBankNameIndex = aostb.getAgentsBankNameIndex();
        this.agentsBankBranchIndex = aostb.getAgentsBankBranchIndex();
        this.agentsBankBranchAccount = aostb.getAgentsBankBranchAccount();
        this.agentsBenefitStartDate = aostb.getAgentsBenefitStartDate();
        this.agentsUserindex = aostb.getAgentsUserindex();
        this.agentsInputdate = aostb.getAgentsInputdate();
        this.agentsRegistrationDate = aostb.getAgentsRegistrationDate();
        this.agentsEmail = aostb.getAgentsEmail();
        this.agentsPhoto = aostb.getAgentsPhoto();
    }

    public AosAgentsTb(Integer agentsIndex) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agentsIndex != null ? agentsIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AosAgentsTb)) {
            return false;
        }
        AosAgentsTb other = (AosAgentsTb) object;
        if ((this.agentsIndex == null && other.agentsIndex != null) || (this.agentsIndex != null && !this.agentsIndex.equals(other.agentsIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.AosAgentsTb[ agentsIndex=" + agentsIndex + " ]";
    }
    
}
