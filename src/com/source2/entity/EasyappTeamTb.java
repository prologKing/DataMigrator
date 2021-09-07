/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source2.entity;

import com.model.EasyappTeamTbModel;
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
@Table(name = "easyapp_team_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EasyappTeamTb.findAll", query = "SELECT e FROM EasyappTeamTb e"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamIndex", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamIndex = :teamIndex"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamId", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamId = :teamId"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamName", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamName = :teamName"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamBranch", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamBranch = :teamBranch"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamGender", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamGender = :teamGender"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamDateOfBirth", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamDateOfBirth = :teamDateOfBirth"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamMobileNo", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamMobileNo = :teamMobileNo"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamMobileMoneyNo", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamMobileMoneyNo = :teamMobileMoneyNo"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamStatus", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamStatus = :teamStatus"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamNo", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamNo = :teamNo"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamBankNameIndex", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamBankNameIndex = :teamBankNameIndex"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamBankBranchIndex", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamBankBranchIndex = :teamBankBranchIndex"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamBankBranchAccount", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamBankBranchAccount = :teamBankBranchAccount"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamBenefitStartDate", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamBenefitStartDate = :teamBenefitStartDate"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamUserindex", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamUserindex = :teamUserindex"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamInputdate", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamInputdate = :teamInputdate"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamDate", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamDate = :teamDate"),
    @NamedQuery(name = "EasyappTeamTb.findByTeamEmail", query = "SELECT e FROM EasyappTeamTb e WHERE e.teamEmail = :teamEmail"),
    @NamedQuery(name = "EasyappTeamTb.findByPhoto", query = "SELECT e FROM EasyappTeamTb e WHERE e.photo = :photo")})
public class EasyappTeamTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "team_index")
    private Integer teamIndex;
    @Size(max = 15)
    @Column(name = "team_id")
    private String teamId;
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
    @Size(max = 11)
    @Column(name = "team_no")
    private String teamNo;
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

    public EasyappTeamTb() {
    }
    
    public EasyappTeamTb(EasyappTeamTbModel easyteam) {
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

    public EasyappTeamTb(Integer teamIndex) {
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
    public int hashCode() {
        int hash = 0;
        hash += (teamIndex != null ? teamIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EasyappTeamTb)) {
            return false;
        }
        EasyappTeamTb other = (EasyappTeamTb) object;
        if ((this.teamIndex == null && other.teamIndex != null) || (this.teamIndex != null && !this.teamIndex.equals(other.teamIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source2.entity.EasyappTeamTb[ teamIndex=" + teamIndex + " ]";
    }
    
}
