/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source3.entity;

import com.model.EazylifeTeamTbModel;
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
@Table(name = "eazylife_team_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazylifeTeamTb.findAll", query = "SELECT e FROM EazylifeTeamTb e"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamIndex", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamIndex = :teamIndex"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamId", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamId = :teamId"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamTitle", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamTitle = :teamTitle"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamNo", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamNo = :teamNo"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamName", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamName = :teamName"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamGender", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamGender = :teamGender"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamDateOfBirth", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamDateOfBirth = :teamDateOfBirth"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamMobileNo", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamMobileNo = :teamMobileNo"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamMobileMoneyNo", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamMobileMoneyNo = :teamMobileMoneyNo"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamBranch", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamBranch = :teamBranch"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamStatus", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamStatus = :teamStatus"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamBankNameIndex", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamBankNameIndex = :teamBankNameIndex"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamBankBranchIndex", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamBankBranchIndex = :teamBankBranchIndex"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamBankBranchAccount", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamBankBranchAccount = :teamBankBranchAccount"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamBenefitStartDate", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamBenefitStartDate = :teamBenefitStartDate"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamUserindex", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamUserindex = :teamUserindex"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamInputdate", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamInputdate = :teamInputdate"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamEmail", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamEmail = :teamEmail"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamDate", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamDate = :teamDate"),
    @NamedQuery(name = "EazylifeTeamTb.findByTeamExitDate", query = "SELECT e FROM EazylifeTeamTb e WHERE e.teamExitDate = :teamExitDate")})
public class EazylifeTeamTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "team_index")
    private Integer teamIndex;
    @Size(max = 15)
    @Column(name = "team_id")
    private String teamId;
    @Size(max = 11)
    @Column(name = "team_title")
    private String teamTitle;
    @Size(max = 11)
    @Column(name = "team_no")
    private String teamNo;
    @Size(max = 45)
    @Column(name = "team_name")
    private String teamName;
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
    @Column(name = "team_branch")
    private String teamBranch;
    @Size(max = 15)
    @Column(name = "team_status")
    private String teamStatus;
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
    @Size(max = 45)
    @Column(name = "team_email")
    private String teamEmail;
    @Column(name = "team_date")
    private String teamDate;
    @Column(name = "team_exit_date")
    private String teamExitDate;

    public EazylifeTeamTb() {
    }
    
    public EazylifeTeamTb(EazylifeTeamTbModel elteam) {
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

    public EazylifeTeamTb(Integer teamIndex) {
        this.teamIndex = teamIndex;
    }

    public Integer getTeamIndex() {
        return teamIndex;
    }

    public void setTeamIndex(Integer teamIndex) {
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
    public int hashCode() {
        int hash = 0;
        hash += (teamIndex != null ? teamIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazylifeTeamTb)) {
            return false;
        }
        EazylifeTeamTb other = (EazylifeTeamTb) object;
        if ((this.teamIndex == null && other.teamIndex != null) || (this.teamIndex != null && !this.teamIndex.equals(other.teamIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source3.entity.EazylifeTeamTb[ teamIndex=" + teamIndex + " ]";
    }
    
}
