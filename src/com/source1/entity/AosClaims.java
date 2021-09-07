/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source1.entity;

import com.model.AosClaimsModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "aos_claims")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AosClaims.findAll", query = "SELECT a FROM AosClaims a"),
    @NamedQuery(name = "AosClaims.findById", query = "SELECT a FROM AosClaims a WHERE a.id = :id"),
    @NamedQuery(name = "AosClaims.findByPolNum", query = "SELECT a FROM AosClaims a WHERE a.polNum = :polNum"),
    @NamedQuery(name = "AosClaims.findByTrnxType", query = "SELECT a FROM AosClaims a WHERE a.trnxType = :trnxType"),
    @NamedQuery(name = "AosClaims.findByPaidAmount", query = "SELECT a FROM AosClaims a WHERE a.paidAmount = :paidAmount"),
    @NamedQuery(name = "AosClaims.findByLogDate", query = "SELECT a FROM AosClaims a WHERE a.logDate = :logDate"),
    @NamedQuery(name = "AosClaims.findByProcessDate", query = "SELECT a FROM AosClaims a WHERE a.processDate = :processDate"),
    @NamedQuery(name = "AosClaims.findByBranch", query = "SELECT a FROM AosClaims a WHERE a.branch = :branch"),
    @NamedQuery(name = "AosClaims.findByHandlingOfficer", query = "SELECT a FROM AosClaims a WHERE a.handlingOfficer = :handlingOfficer"),
    @NamedQuery(name = "AosClaims.findByTelephone", query = "SELECT a FROM AosClaims a WHERE a.telephone = :telephone")})
public class AosClaims implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pol_num")
    private String polNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "trnx_type")
    private String trnxType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "paid_amount")
    private double paidAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_date")
    private String logDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pymt_mode")
    private String pymtMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "process_date")
    private String processDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "branch")
    private int branch;
    @Size(max = 45)
    @Column(name = "handling_officer")
    private String handlingOfficer;
    @Size(max = 60)
    @Column(name = "telephone")
    private String telephone;
    @Size(max = 100)
    @Column(name = "acc_no")
    private String accNo;

    public AosClaims() {
    }

    public AosClaims(Integer id) {
        this.id = id;
    }
    
    public AosClaims(AosClaimsModel aosClaims) {
        this.id = aosClaims.getId();
        this.polNum = aosClaims.getPolNum();
        this.trnxType = aosClaims.getTrnxType();
        this.paidAmount = aosClaims.getPaidAmount();
        this.pymtMode = aosClaims.getPymtMode();
        this.logDate = aosClaims.getLogDate();
        this.processDate = aosClaims.getProcessDate();
        this.branch = aosClaims.getBranch();
        this.handlingOfficer = aosClaims.getHandlingOfficer();
        this.telephone = aosClaims.getTelephone();
        this.accNo = aosClaims.getAccNo();
    }

    public AosClaims(Integer id, String polNum, String trnxType, double paidAmount, String logDate, String processDate, int branch, String handlingOfficer, String telephone) {
        this.id = id;
        this.polNum = polNum;
        this.trnxType = trnxType;
        this.paidAmount = paidAmount;
        this.logDate = logDate;
        this.processDate = processDate;
        this.branch = branch;
        this.handlingOfficer = handlingOfficer;
        this.telephone = telephone;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolNum() {
        return polNum;
    }

    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }

    public String getTrnxType() {
        return trnxType;
    }

    public void setTrnxType(String trnxType) {
        this.trnxType = trnxType;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public String getPymtMode() {
        return pymtMode;
    }

    public void setPymtMode(String pymtMode) {
        this.pymtMode = pymtMode;
    }
    
    

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public String getHandlingOfficer() {
        return handlingOfficer;
    }

    public void setHandlingOfficer(String handlingOfficer) {
        this.handlingOfficer = handlingOfficer;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AosClaims)) {
            return false;
        }
        AosClaims other = (AosClaims) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source1.entity.AosClaims[ id=" + id + " ]";
    }
    
}
