/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PolhClmProModel;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "polh_clm_pro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhClmPro.findAll", query = "SELECT p FROM PolhClmPro p"),
    @NamedQuery(name = "PolhClmPro.findByPcpSysid", query = "SELECT p FROM PolhClmPro p WHERE p.pcpSysid = :pcpSysid"),
    @NamedQuery(name = "PolhClmPro.findByPcpPolhSysid", query = "SELECT p FROM PolhClmPro p WHERE p.pcpPolhSysid = :pcpPolhSysid"),
    @NamedQuery(name = "PolhClmPro.findByPcpPciSysid", query = "SELECT p FROM PolhClmPro p WHERE p.pcpPciSysid = :pcpPciSysid"),
    @NamedQuery(name = "PolhClmPro.findByPcpAmtBc", query = "SELECT p FROM PolhClmPro p WHERE p.pcpAmtBc = :pcpAmtBc"),
    @NamedQuery(name = "PolhClmPro.findByPcpAmtFc", query = "SELECT p FROM PolhClmPro p WHERE p.pcpAmtFc = :pcpAmtFc"),
    @NamedQuery(name = "PolhClmPro.findByPcpProDt", query = "SELECT p FROM PolhClmPro p WHERE p.pcpProDt = :pcpProDt"),
    @NamedQuery(name = "PolhClmPro.findByPcpProUser", query = "SELECT p FROM PolhClmPro p WHERE p.pcpProUser = :pcpProUser"),
    @NamedQuery(name = "PolhClmPro.findByPcpAcctPost", query = "SELECT p FROM PolhClmPro p WHERE p.pcpAcctPost = :pcpAcctPost")})
public class PolhClmPro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PCP_SYSID")
    private Integer pcpSysid;
    @Column(name = "PCP_POLH_SYSID")
    private Integer pcpPolhSysid;
    @Column(name = "PCP_PCI_SYSID")
    private Integer pcpPciSysid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PCP_AMT_BC")
    private BigDecimal pcpAmtBc;
    @Column(name = "PCP_AMT_FC")
    private BigDecimal pcpAmtFc;
    @Column(name = "PCP_PRO_DT")
    private String pcpProDt;
    @Size(max = 50)
    @Column(name = "PCP_PRO_USER")
    private String pcpProUser;
    @Size(max = 15)
    @Column(name = "PCP_ACCT_POST")
    private String pcpAcctPost;

    public PolhClmPro() {
    }

    public PolhClmPro(Integer pcpSysid, Integer pcpPolhSysid, Integer pcpPciSysid, BigDecimal pcpAmtBc, BigDecimal pcpAmtFc, String pcpProDt, String pcpProUser, String pcpAcctPost) {
        this.pcpSysid = pcpSysid;
        this.pcpPolhSysid = pcpPolhSysid;
        this.pcpPciSysid = pcpPciSysid;
        this.pcpAmtBc = pcpAmtBc;
        this.pcpAmtFc = pcpAmtFc;
        this.pcpProDt = pcpProDt;
        this.pcpProUser = pcpProUser;
        this.pcpAcctPost = pcpAcctPost;
    }
    
    public PolhClmPro(PolhClmProModel polhPro) {
        this.pcpSysid = polhPro.getPcpSysid();
        this.pcpPolhSysid = polhPro.getPcpPolhSysid();
        this.pcpPciSysid = polhPro.getPcpPciSysid();
        this.pcpAmtBc = polhPro.getPcpAmtBc();
        this.pcpAmtFc = polhPro.getPcpAmtFc();
        this.pcpProDt = polhPro.getPcpProDt();
        this.pcpProUser = polhPro.getPcpProUser();
        this.pcpAcctPost = polhPro.getPcpAcctPost();
    }

    public PolhClmPro(Integer pcpSysid) {
        this.pcpSysid = pcpSysid;
    }

    public Integer getPcpSysid() {
        return pcpSysid;
    }

    public void setPcpSysid(Integer pcpSysid) {
        this.pcpSysid = pcpSysid;
    }

    public Integer getPcpPolhSysid() {
        return pcpPolhSysid;
    }

    public void setPcpPolhSysid(Integer pcpPolhSysid) {
        this.pcpPolhSysid = pcpPolhSysid;
    }

    public Integer getPcpPciSysid() {
        return pcpPciSysid;
    }

    public void setPcpPciSysid(Integer pcpPciSysid) {
        this.pcpPciSysid = pcpPciSysid;
    }

    public BigDecimal getPcpAmtBc() {
        return pcpAmtBc;
    }

    public void setPcpAmtBc(BigDecimal pcpAmtBc) {
        this.pcpAmtBc = pcpAmtBc;
    }

    public BigDecimal getPcpAmtFc() {
        return pcpAmtFc;
    }

    public void setPcpAmtFc(BigDecimal pcpAmtFc) {
        this.pcpAmtFc = pcpAmtFc;
    }

    public String getPcpProDt() {
        return pcpProDt;
    }

    public void setPcpProDt(String pcpProDt) {
        this.pcpProDt = pcpProDt;
    }

    public String getPcpProUser() {
        return pcpProUser;
    }

    public void setPcpProUser(String pcpProUser) {
        this.pcpProUser = pcpProUser;
    }

    public String getPcpAcctPost() {
        return pcpAcctPost;
    }

    public void setPcpAcctPost(String pcpAcctPost) {
        this.pcpAcctPost = pcpAcctPost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcpSysid != null ? pcpSysid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhClmPro)) {
            return false;
        }
        PolhClmPro other = (PolhClmPro) object;
        if ((this.pcpSysid == null && other.pcpSysid != null) || (this.pcpSysid != null && !this.pcpSysid.equals(other.pcpSysid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PolhClmPro[ pcpSysid=" + pcpSysid + " ]";
    }
    
}
