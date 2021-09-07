/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.UserRightModel;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "users_right")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersRight.findAll", query = "SELECT u FROM UsersRight u"),
    @NamedQuery(name = "UsersRight.findByUrId", query = "SELECT u FROM UsersRight u WHERE u.urId = :urId"),
    @NamedQuery(name = "UsersRight.findByUrDesc", query = "SELECT u FROM UsersRight u WHERE u.urDesc = :urDesc")})
public class UsersRight implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UR_ID")
    private Integer urId;
    @Basic(optional = false)
    @Column(name = "UR_DESC")
    private String urDesc;
  
    public UsersRight() {
    }

    public UsersRight(Integer urId) {
        this.urId = urId;
    }

    public UsersRight(Integer urId, String urDesc) {
        this.urId = urId;
        this.urDesc = urDesc;
    }
    
    public UsersRight(UserRightModel uright) {
        this.urId = uright.getUrId();
        this.urDesc = uright.getUrDesc();
    }

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public String getUrDesc() {
        return urDesc;
    }

    public void setUrDesc(String urDesc) {
        this.urDesc = urDesc;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (urId != null ? urId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersRight)) {
            return false;
        }
        UsersRight other = (UsersRight) object;
        if ((this.urId == null && other.urId != null) || (this.urId != null && !this.urId.equals(other.urId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.UsersRight[ urId=" + urId + " ]";
    }
    
}
