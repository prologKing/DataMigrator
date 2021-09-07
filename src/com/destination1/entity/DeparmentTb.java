/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.DepartmentModel;
import com.model.DepartmentPKModel;
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
@Table(name = "deparment_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeparmentTb.findAll", query = "SELECT d FROM DeparmentTb d"),
    @NamedQuery(name = "DeparmentTb.findByDptSysid", query = "SELECT d FROM DeparmentTb d WHERE d.deparmentTbPK.dptSysid = :dptSysid"),
    @NamedQuery(name = "DeparmentTb.findByDptUserSysid", query = "SELECT d FROM DeparmentTb d WHERE d.deparmentTbPK.dptUserSysid = :dptUserSysid"),
    @NamedQuery(name = "DeparmentTb.findByDptName", query = "SELECT d FROM DeparmentTb d WHERE d.dptName = :dptName"),
    @NamedQuery(name = "DeparmentTb.findByDptCrtDt", query = "SELECT d FROM DeparmentTb d WHERE d.dptCrtDt = :dptCrtDt"),
    @NamedQuery(name = "DeparmentTb.findByDptEdit", query = "SELECT d FROM DeparmentTb d WHERE d.dptEdit = :dptEdit"),
    @NamedQuery(name = "DeparmentTb.findByDptDelete", query = "SELECT d FROM DeparmentTb d WHERE d.dptDelete = :dptDelete")})
public class DeparmentTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DeparmentTbPK deparmentTbPK;
    @Basic(optional = false)
    @Column(name = "DPT_NAME")
    private String dptName;
    @Basic(optional = false)
    @Column(name = "DPT_CRT_DT")
    private String dptCrtDt;
    @Column(name = "DPT_EDIT")
    private String dptEdit;
    @Column(name = "DPT_DELETE")
    private String dptDelete;
    

    public DeparmentTb() {
    }
    
    public DeparmentTb(DepartmentModel dep) {
        this.deparmentTbPK = new DeparmentTbPK(dep.getDeparmentTbPK());
        this.dptName = dep.getDptName();
        this.dptCrtDt = dep.getDptCrtDt();
        this.dptEdit = dep.getDptEdit();
        this.dptDelete = dep.getDptDelete();
    }

    public DeparmentTb(DeparmentTbPK deparmentTbPK) {
        this.deparmentTbPK = deparmentTbPK;
    }

    public DeparmentTb(DeparmentTbPK deparmentTbPK, String dptName, String dptCrtDt) {
        this.deparmentTbPK = deparmentTbPK;
        this.dptName = dptName;
        this.dptCrtDt = dptCrtDt;
    }

    public DeparmentTb(DeparmentTbPK deparmentTbPK, String dptCrtDt, String dptEdit, String dptDelete) {
        this.deparmentTbPK = deparmentTbPK;
        this.dptCrtDt = dptCrtDt;
        this.dptEdit = dptEdit;
        this.dptDelete = dptDelete;
    }

    public DeparmentTb(int dptSysid, int dptUserSysid) {
        this.deparmentTbPK = new DeparmentTbPK(dptSysid, dptUserSysid);
    }

    public DeparmentTbPK getDeparmentTbPK() {
        return deparmentTbPK;
    }

    public void setDeparmentTbPK(DeparmentTbPK deparmentTbPK) {
        this.deparmentTbPK = deparmentTbPK;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public String getDptCrtDt() {
        return dptCrtDt;
    }

    public void setDptCrtDt(String dptCrtDt) {
        this.dptCrtDt = dptCrtDt;
    }

    public String getDptEdit() {
        return dptEdit;
    }

    public void setDptEdit(String dptEdit) {
        this.dptEdit = dptEdit;
    }

    public String getDptDelete() {
        return dptDelete;
    }

    public void setDptDelete(String dptDelete) {
        this.dptDelete = dptDelete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deparmentTbPK != null ? deparmentTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeparmentTb)) {
            return false;
        }
        DeparmentTb other = (DeparmentTb) object;
        if ((this.deparmentTbPK == null && other.deparmentTbPK != null) || (this.deparmentTbPK != null && !this.deparmentTbPK.equals(other.deparmentTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.DeparmentTb[ deparmentTbPK=" + deparmentTbPK + " ]";
    }
    
}
