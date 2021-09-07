/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.AosTeamTbModel;
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
@Table(name = "aos_team_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AosTeamTb.findAll", query = "SELECT a FROM AosTeamTb a"),
    @NamedQuery(name = "AosTeamTb.findByTeamIndex", query = "SELECT a FROM AosTeamTb a WHERE a.teamIndex = :teamIndex"),
    @NamedQuery(name = "AosTeamTb.findByLeadId", query = "SELECT a FROM AosTeamTb a WHERE a.leadId = :leadId"),
    @NamedQuery(name = "AosTeamTb.findByTeamName", query = "SELECT a FROM AosTeamTb a WHERE a.teamName = :teamName"),
    @NamedQuery(name = "AosTeamTb.findByTeamBranch", query = "SELECT a FROM AosTeamTb a WHERE a.teamBranch = :teamBranch"),
    @NamedQuery(name = "AosTeamTb.findByTeamGender", query = "SELECT a FROM AosTeamTb a WHERE a.teamGender = :teamGender"),
    @NamedQuery(name = "AosTeamTb.findByTeamDateOfBirth", query = "SELECT a FROM AosTeamTb a WHERE a.teamDateOfBirth = :teamDateOfBirth"),
    @NamedQuery(name = "AosTeamTb.findByTeamMobileNo", query = "SELECT a FROM AosTeamTb a WHERE a.teamMobileNo = :teamMobileNo"),
    @NamedQuery(name = "AosTeamTb.findByTeamMobileMoneyNo", query = "SELECT a FROM AosTeamTb a WHERE a.teamMobileMoneyNo = :teamMobileMoneyNo"),
    @NamedQuery(name = "AosTeamTb.findByTeamStatus", query = "SELECT a FROM AosTeamTb a WHERE a.teamStatus = :teamStatus"),
    @NamedQuery(name = "AosTeamTb.findByTeamid", query = "SELECT a FROM AosTeamTb a WHERE a.teamId = :teamId"),
    @NamedQuery(name = "AosTeamTb.findByTeamBankNameIndex", query = "SELECT a FROM AosTeamTb a WHERE a.teamBankNameIndex = :teamBankNameIndex"),
    @NamedQuery(name = "AosTeamTb.findByTeamBankBranchIndex", query = "SELECT a FROM AosTeamTb a WHERE a.teamBankBranchIndex = :teamBankBranchIndex"),
    @NamedQuery(name = "AosTeamTb.findByTeamBankBranchAccount", query = "SELECT a FROM AosTeamTb a WHERE a.teamBankBranchAccount = :teamBankBranchAccount"),
    @NamedQuery(name = "AosTeamTb.findByTeamBenefitStartDate", query = "SELECT a FROM AosTeamTb a WHERE a.teamBenefitStartDate = :teamBenefitStartDate"),
    @NamedQuery(name = "AosTeamTb.findByTeamUserindex", query = "SELECT a FROM AosTeamTb a WHERE a.teamUserindex = :teamUserindex"),
    @NamedQuery(name = "AosTeamTb.findByTeamInputdate", query = "SELECT a FROM AosTeamTb a WHERE a.teamInputdate = :teamInputdate"),
    @NamedQuery(name = "AosTeamTb.findByTeamDate", query = "SELECT a FROM AosTeamTb a WHERE a.teamDate = :teamDate"),
    @NamedQuery(name = "AosTeamTb.findByTeamEmail", query = "SELECT a FROM AosTeamTb a WHERE a.teamEmail = :teamEmail"),
    @NamedQuery(name = "AosTeamTb.findByPhoto", query = "SELECT a FROM AosTeamTb a WHERE a.photo = :photo")})
public class AosTeamTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "team_index")
    private Integer teamIndex;
    @Size(max = 15)
    @Column(name = "lead_id")
    private String leadId;
    @Size(max = 45)
    @Column(name = "team_name")
    private String teamName;
    @Size(max = 15)
    @Column(name = "team_branch")
    private String teamBranch;
    @Size(max = 15)
    @Column(name = "team_gender")
    private String teamGender;
    @Column(name = "team_date_of_birth")
    private String teamDateOfBirth;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "team_address")
    private String teamAddress;
    @Size(max = 15)
    @Column(name = "team_mobile_no")
    private String teamMobileNo;
    @Size(max = 15)
    @Column(name = "team_mobile_money_no")
    private String teamMobileMoneyNo;
    @Size(max = 15)
    @Column(name = "team_status")
    private String teamStatus;
    @Size(max = 45)
    @Column(name = "team_id")
    private String teamId;
    @Size(max = 15)
    @Column(name = "team_bank_name_index")
    private String teamBankNameIndex;
    @Size(max = 15)
    @Column(name = "team_bank_branch_index")
    private String teamBankBranchIndex;
    @Size(max = 15)
    @Column(name = "team_bank_branch_account")
    private String teamBankBranchAccount;
    @Column(name = "team_benefit_start_date")
    private String teamBenefitStartDate;
    @Size(max = 15)
    @Column(name = "team_userindex")
    private String teamUserindex;
    @Column(name = "team_inputdate")
    private String teamInputdate;
    @Column(name = "team_date")
    private String teamDate;
    @Size(max = 45)
    @Column(name = "team_email")
    private String teamEmail;
    @Size(max = 45)
    @Column(name = "photo")
    private String photo;

    public AosTeamTb() {
    }
    
    public AosTeamTb(AosTeamTbModel aosteam) {
        this.teamIndex = aosteam.getTeamIndex();
        this.leadId = aosteam.getTeamId();
        this.teamName = aosteam.getTeamName();
        this.teamBranch = aosteam.getTeamBranch();
        this.teamGender = aosteam.getTeamGender();
        this.teamDateOfBirth = aosteam.getTeamDateOfBirth();
        this.teamAddress = aosteam.getTeamAddress();
        this.teamMobileNo = aosteam.getTeamMobileNo();
        this.teamMobileMoneyNo = aosteam.getTeamMobileMoneyNo();
        this.teamStatus = aosteam.getTeamStatus();
        this.teamId = aosteam.getTeamId();
        this.teamBankNameIndex = aosteam.getTeamBankNameIndex();
        this.teamBankBranchIndex = aosteam.getTeamBankBranchIndex();
        this.teamBankBranchAccount = aosteam.getTeamBankBranchAccount();
        this.teamBenefitStartDate = aosteam.getTeamBenefitStartDate();
        this.teamUserindex = aosteam.getTeamUserindex();
        this.teamInputdate = aosteam.getTeamInputdate();
        this.teamDate = aosteam.getTeamDate();
        this.teamEmail = aosteam.getTeamEmail();
        this.photo = aosteam.getPhoto();
    }

    public AosTeamTb(Integer teamIndex) {
        this.teamIndex = teamIndex;
    }

    public Integer getTeamIndex() {
        return teamIndex;
    }

    public void setTeamIndex(Integer teamIndex) {
        this.teamIndex = teamIndex;
    }

    public String getTeamId() {
        return leadId;
    }

    public void setTeamId(String teamId) {
        this.leadId = teamId;
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

    public String getTeamid() {
        return teamId;
    }

    public void setTeamid(String teamid) {
        this.teamId = teamid;
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
    public int hashCode() {
        int hash = 0;
        hash += (teamIndex != null ? teamIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AosTeamTb)) {
            return false;
        }
        AosTeamTb other = (AosTeamTb) object;
        if ((this.teamIndex == null && other.teamIndex != null) || (this.teamIndex != null && !this.teamIndex.equals(other.teamIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.AosTeamTb[ teamIndex=" + teamIndex + " ]";
    }
    
}
