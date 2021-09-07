/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source2.entity;

import com.model.EasyappAgentsTbModel;
import java.io.Serializable;
import java.util.Date;
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
@Table(name = "easyapp_agents_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EasyappAgentsTb.findAll", query = "SELECT e FROM EasyappAgentsTb e"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsIndex", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsIndex = :agentsIndex"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsId", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsId = :agentsId"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsName", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsName = :agentsName"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsBranch", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsBranch = :agentsBranch"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsGender", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsGender = :agentsGender"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsDateOfBirth", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsDateOfBirth = :agentsDateOfBirth"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsMobileNo", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsMobileNo = :agentsMobileNo"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsMobileMoneyNo", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsMobileMoneyNo = :agentsMobileMoneyNo"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsStatus", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsStatus = :agentsStatus"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsTeamId", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsTeamId = :agentsTeamId"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsBankNameIndex", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsBankNameIndex = :agentsBankNameIndex"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsBankBranchIndex", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsBankBranchIndex = :agentsBankBranchIndex"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsBankBranchAccount", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsBankBranchAccount = :agentsBankBranchAccount"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsBenefitStartDate", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsBenefitStartDate = :agentsBenefitStartDate"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsUserindex", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsUserindex = :agentsUserindex"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsInputdate", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsInputdate = :agentsInputdate"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsRegistrationDate", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsRegistrationDate = :agentsRegistrationDate"),
    @NamedQuery(name = "EasyappAgentsTb.findByAgentsEmail", query = "SELECT e FROM EasyappAgentsTb e WHERE e.agentsEmail = :agentsEmail")})
public class EasyappAgentsTb implements Serializable {
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
    @Size(max = 45)
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

    public EasyappAgentsTb() {
    }
    
    public EasyappAgentsTb(EasyappAgentsTbModel easytb) {
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

    public EasyappAgentsTb(Integer agentsIndex, String agentsId, String agentsName, String agentsBranch, String agentsGender, String agentsDateOfBirth, String agentsAddress, String agentsMobileNo, String agentsMobileMoneyNo, String agentsStatus, String agentsTeamId, String agentsBankNameIndex, String agentsBankBranchIndex, String agentsBankBranchAccount, String agentsBenefitStartDate, String agentsUserindex, String agentsInputdate, String agentsRegistrationDate, String agentsEmail, String agentsPhoto) {
        this.agentsIndex = agentsIndex;
        this.agentsId = agentsId;
        this.agentsName = agentsName;
        this.agentsBranch = agentsBranch;
        this.agentsGender = agentsGender;
        this.agentsDateOfBirth = agentsDateOfBirth;
        this.agentsAddress = agentsAddress;
        this.agentsMobileNo = agentsMobileNo;
        this.agentsMobileMoneyNo = agentsMobileMoneyNo;
        this.agentsStatus = agentsStatus;
        this.agentsTeamId = agentsTeamId;
        this.agentsBankNameIndex = agentsBankNameIndex;
        this.agentsBankBranchIndex = agentsBankBranchIndex;
        this.agentsBankBranchAccount = agentsBankBranchAccount;
        this.agentsBenefitStartDate = agentsBenefitStartDate;
        this.agentsUserindex = agentsUserindex;
        this.agentsInputdate = agentsInputdate;
        this.agentsRegistrationDate = agentsRegistrationDate;
        this.agentsEmail = agentsEmail;
        this.agentsPhoto = agentsPhoto;
    }
    
    

    public EasyappAgentsTb(Integer agentsIndex) {
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
        if (!(object instanceof EasyappAgentsTb)) {
            return false;
        }
        EasyappAgentsTb other = (EasyappAgentsTb) object;
        if ((this.agentsIndex == null && other.agentsIndex != null) || (this.agentsIndex != null && !this.agentsIndex.equals(other.agentsIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source2.entity.EasyappAgentsTb[ agentsIndex=" + agentsIndex + " ]";
    }
    
}
