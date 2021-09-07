/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.CompanyModel;
import com.model.CompanyPkModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "company_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyTb.findAll", query = "SELECT c FROM CompanyTb c"),
    @NamedQuery(name = "CompanyTb.findByCmpSysid", query = "SELECT c FROM CompanyTb c WHERE c.companyTbPK.cmpSysid = :cmpSysid"),
    @NamedQuery(name = "CompanyTb.findByCmpUserSysid", query = "SELECT c FROM CompanyTb c WHERE c.companyTbPK.cmpUserSysid = :cmpUserSysid"),
    @NamedQuery(name = "CompanyTb.findByCmpName", query = "SELECT c FROM CompanyTb c WHERE c.cmpName = :cmpName"),
    @NamedQuery(name = "CompanyTb.findByCmpInitial", query = "SELECT c FROM CompanyTb c WHERE c.cmpInitial = :cmpInitial"),
    @NamedQuery(name = "CompanyTb.findByCmpAddrs", query = "SELECT c FROM CompanyTb c WHERE c.cmpAddrs = :cmpAddrs"),
    @NamedQuery(name = "CompanyTb.findByCmpTel", query = "SELECT c FROM CompanyTb c WHERE c.cmpTel = :cmpTel"),
    @NamedQuery(name = "CompanyTb.findByCmpEmail", query = "SELECT c FROM CompanyTb c WHERE c.cmpEmail = :cmpEmail"),
    @NamedQuery(name = "CompanyTb.findByCmpWebsite", query = "SELECT c FROM CompanyTb c WHERE c.cmpWebsite = :cmpWebsite"),
    @NamedQuery(name = "CompanyTb.findByCmpCrtDt", query = "SELECT c FROM CompanyTb c WHERE c.cmpCrtDt = :cmpCrtDt"),
    @NamedQuery(name = "CompanyTb.findByCmpLogo", query = "SELECT c FROM CompanyTb c WHERE c.cmpLogo = :cmpLogo"),
    @NamedQuery(name = "CompanyTb.findByCmpEdit", query = "SELECT c FROM CompanyTb c WHERE c.cmpEdit = :cmpEdit"),
    @NamedQuery(name = "CompanyTb.findByCmpDelete", query = "SELECT c FROM CompanyTb c WHERE c.cmpDelete = :cmpDelete"),
    @NamedQuery(name = "CompanyTb.findByCmpAddrsPath", query = "SELECT c FROM CompanyTb c WHERE c.cmpAddrsPath = :cmpAddrsPath")})
public class CompanyTb implements Serializable {
     private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompanyTbPK companyTbPK;
    @Basic(optional = false)
    @Column(name = "CMP_NAME")
    private String cmpName;
    @Basic(optional = false)
    @Column(name = "CMP_INITIAL")
    private String cmpInitial;
    @Column(name = "CMP_ADDRS")
    private String cmpAddrs;
    @Column(name = "CMP_TEL")
    private String cmpTel;
    @Column(name = "CMP_EMAIL")
    private String cmpEmail;
    @Column(name = "CMP_WEBSITE")
    private String cmpWebsite;
    @Column(name = "CMP_CRT_DT")
    private String cmpCrtDt;
    @Column(name = "CMP_LOGO")
    private String cmpLogo;
    @Column(name = "CMP_EDIT")
    private String cmpEdit;
    @Column(name = "CMP_DELETE")
    private String cmpDelete;
    @Basic(optional = false)
    @Column(name = "CMP_ADDRS_PATH")
    private String cmpAddrsPath;
    

    public CompanyTb() {
    }

    public CompanyTb(CompanyTbPK companyTbPK) {
        this.companyTbPK = companyTbPK;
    }

    public CompanyTb(CompanyTbPK companyTbPK, String cmpName, String cmpInitial, String cmpAddrs, String cmpTel, String cmpEmail, String cmpWebsite, String cmpCrtDt, String cmpLogo, String cmpEdit, String cmpDelete, String cmpAddrsPath) {
        this.companyTbPK = companyTbPK;
        this.cmpName = cmpName;
        this.cmpInitial = cmpInitial;
        this.cmpAddrs = cmpAddrs;
        this.cmpTel = cmpTel;
        this.cmpEmail = cmpEmail;
        this.cmpWebsite = cmpWebsite;
        this.cmpCrtDt = cmpCrtDt;
        this.cmpLogo = cmpLogo;
        this.cmpEdit = cmpEdit;
        this.cmpDelete = cmpDelete;
        this.cmpAddrsPath = cmpAddrsPath;
    }
    
    public CompanyTb(CompanyModel comp) {
        this.companyTbPK = new CompanyTbPK(comp.getCompanyTbPK());
        this.cmpName = comp.getCmpName();
        this.cmpInitial = comp.getCmpInitial();
        this.cmpAddrs = comp.getCmpAddrs();
        this.cmpTel = comp.getCmpTel();
        this.cmpWebsite = comp.getCmpWebsite();
        this.cmpCrtDt = comp.getCmpCrtDt();
        this.cmpLogo = comp.getCmpLogo();
        this.cmpEdit = comp.getCmpEdit();
        this.cmpDelete = comp.getCmpDelete();
        this.cmpAddrsPath = comp.getCmpAddrsPath();
    }

    public CompanyTb(CompanyTbPK companyTbPK, String cmpName, String cmpInitial, String cmpAddrsPath) {
        this.companyTbPK = companyTbPK;
        this.cmpName = cmpName;
        this.cmpInitial = cmpInitial;
        this.cmpAddrsPath = cmpAddrsPath;
    }

    public CompanyTb(int cmpSysid, int cmpUserSysid) {
        this.companyTbPK = new CompanyTbPK(cmpSysid, cmpUserSysid);
    }

    public CompanyTbPK getCompanyTbPK() {
        return companyTbPK;
    }

    public void setCompanyTbPK(CompanyTbPK companyTbPK) {
        this.companyTbPK = companyTbPK;
    }

    public String getCmpName() {
        return cmpName;
    }

    public void setCmpName(String cmpName) {
        this.cmpName = cmpName;
    }

    public String getCmpInitial() {
        return cmpInitial;
    }

    public void setCmpInitial(String cmpInitial) {
        this.cmpInitial = cmpInitial;
    }

    public String getCmpAddrs() {
        return cmpAddrs;
    }

    public void setCmpAddrs(String cmpAddrs) {
        this.cmpAddrs = cmpAddrs;
    }

    public String getCmpTel() {
        return cmpTel;
    }

    public void setCmpTel(String cmpTel) {
        this.cmpTel = cmpTel;
    }

    public String getCmpEmail() {
        return cmpEmail;
    }

    public void setCmpEmail(String cmpEmail) {
        this.cmpEmail = cmpEmail;
    }

    public String getCmpWebsite() {
        return cmpWebsite;
    }

    public void setCmpWebsite(String cmpWebsite) {
        this.cmpWebsite = cmpWebsite;
    }

    public String getCmpCrtDt() {
        return cmpCrtDt;
    }

    public void setCmpCrtDt(String cmpCrtDt) {
        this.cmpCrtDt = cmpCrtDt;
    }

    public String getCmpLogo() {
        return cmpLogo;
    }

    public void setCmpLogo(String cmpLogo) {
        this.cmpLogo = cmpLogo;
    }

    public String getCmpEdit() {
        return cmpEdit;
    }

    public void setCmpEdit(String cmpEdit) {
        this.cmpEdit = cmpEdit;
    }

    public String getCmpDelete() {
        return cmpDelete;
    }

    public void setCmpDelete(String cmpDelete) {
        this.cmpDelete = cmpDelete;
    }

    public String getCmpAddrsPath() {
        return cmpAddrsPath;
    }

    public void setCmpAddrsPath(String cmpAddrsPath) {
        this.cmpAddrsPath = cmpAddrsPath;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyTbPK != null ? companyTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyTb)) {
            return false;
        }
        CompanyTb other = (CompanyTb) object;
        if ((this.companyTbPK == null && other.companyTbPK != null) || (this.companyTbPK != null && !this.companyTbPK.equals(other.companyTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.CompanyTb[ companyTbPK=" + companyTbPK + " ]";
    }
    
}
