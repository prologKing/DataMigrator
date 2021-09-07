/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.CustomerTbModel;
import com.model.CustomerTbPKModel;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "customer_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerTb.findAll", query = "SELECT c FROM CustomerTb c"),
    @NamedQuery(name = "CustomerTb.findByCusSysid", query = "SELECT c FROM CustomerTb c WHERE c.customerTbPK.cusSysid = :cusSysid"),
    @NamedQuery(name = "CustomerTb.findByCusUserSysid", query = "SELECT c FROM CustomerTb c WHERE c.customerTbPK.cusUserSysid = :cusUserSysid"),
    @NamedQuery(name = "CustomerTb.findByCusBranchSysid", query = "SELECT c FROM CustomerTb c WHERE c.customerTbPK.cusBranchSysid = :cusBranchSysid"),
    @NamedQuery(name = "CustomerTb.findByCusCode", query = "SELECT c FROM CustomerTb c WHERE c.cusCode = :cusCode"),
    @NamedQuery(name = "CustomerTb.findByCusRegDt", query = "SELECT c FROM CustomerTb c WHERE c.cusRegDt = :cusRegDt"),
    @NamedQuery(name = "CustomerTb.findByCusCrtUser", query = "SELECT c FROM CustomerTb c WHERE c.cusCrtUser = :cusCrtUser"),
    @NamedQuery(name = "CustomerTb.findByCusSysDt", query = "SELECT c FROM CustomerTb c WHERE c.cusSysDt = :cusSysDt"),
    @NamedQuery(name = "CustomerTb.findByCusTitle", query = "SELECT c FROM CustomerTb c WHERE c.cusTitle = :cusTitle"),
    @NamedQuery(name = "CustomerTb.findByCusSurname", query = "SELECT c FROM CustomerTb c WHERE c.cusSurname = :cusSurname"),
    @NamedQuery(name = "CustomerTb.findByCusMidname", query = "SELECT c FROM CustomerTb c WHERE c.cusMidname = :cusMidname"),
    @NamedQuery(name = "CustomerTb.findByCusFirstname", query = "SELECT c FROM CustomerTb c WHERE c.cusFirstname = :cusFirstname"),
    @NamedQuery(name = "CustomerTb.findByCusGender", query = "SELECT c FROM CustomerTb c WHERE c.cusGender = :cusGender"),
    @NamedQuery(name = "CustomerTb.findByCusDob", query = "SELECT c FROM CustomerTb c WHERE c.cusDob = :cusDob"),
    @NamedQuery(name = "CustomerTb.findByCusMaritalSts", query = "SELECT c FROM CustomerTb c WHERE c.cusMaritalSts = :cusMaritalSts"),
    @NamedQuery(name = "CustomerTb.findByCusAddrs", query = "SELECT c FROM CustomerTb c WHERE c.cusAddrs = :cusAddrs"),
    @NamedQuery(name = "CustomerTb.findByCusMobile", query = "SELECT c FROM CustomerTb c WHERE c.cusMobile = :cusMobile"),
    @NamedQuery(name = "CustomerTb.findByCusMomoNo", query = "SELECT c FROM CustomerTb c WHERE c.cusMomoNo = :cusMomoNo"),
    @NamedQuery(name = "CustomerTb.findByCusOccupation", query = "SELECT c FROM CustomerTb c WHERE c.cusOccupation = :cusOccupation"),
    @NamedQuery(name = "CustomerTb.findByCusBranchCode", query = "SELECT c FROM CustomerTb c WHERE c.cusBranchCode = :cusBranchCode"),
    @NamedQuery(name = "CustomerTb.findByCusIdTyp", query = "SELECT c FROM CustomerTb c WHERE c.cusIdTyp = :cusIdTyp"),
    @NamedQuery(name = "CustomerTb.findByCusIdNo", query = "SELECT c FROM CustomerTb c WHERE c.cusIdNo = :cusIdNo"),
    @NamedQuery(name = "CustomerTb.findByCusPhoto", query = "SELECT c FROM CustomerTb c WHERE c.cusPhoto = :cusPhoto"),
    @NamedQuery(name = "CustomerTb.findByCusHometown", query = "SELECT c FROM CustomerTb c WHERE c.cusHometown = :cusHometown"),
    @NamedQuery(name = "CustomerTb.findByCusBirhtPlc", query = "SELECT c FROM CustomerTb c WHERE c.cusBirhtPlc = :cusBirhtPlc"),
    @NamedQuery(name = "CustomerTb.findByCusNationality", query = "SELECT c FROM CustomerTb c WHERE c.cusNationality = :cusNationality"),
    @NamedQuery(name = "CustomerTb.findByCusResAddrs", query = "SELECT c FROM CustomerTb c WHERE c.cusResAddrs = :cusResAddrs"),
    @NamedQuery(name = "CustomerTb.findByCusTin", query = "SELECT c FROM CustomerTb c WHERE c.cusTin = :cusTin"),
    @NamedQuery(name = "CustomerTb.findByCusLoc", query = "SELECT c FROM CustomerTb c WHERE c.cusLoc = :cusLoc"),
    @NamedQuery(name = "CustomerTb.findByCusSts", query = "SELECT c FROM CustomerTb c WHERE c.cusSts = :cusSts"),
    @NamedQuery(name = "CustomerTb.findByCusType", query = "SELECT c FROM CustomerTb c WHERE c.cusType = :cusType"),
    @NamedQuery(name = "CustomerTb.findByCusEmail", query = "SELECT c FROM CustomerTb c WHERE c.cusEmail = :cusEmail")})
public class CustomerTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustomerTbPK customerTbPK;
    @Size(max = 50)
    @Column(name = "CUS_CODE")
    private String cusCode;
    @Column(name = "CUS_REG_DT")
    private String cusRegDt;
    @Size(max = 150)
    @Column(name = "CUS_CRT_USER")
    private String cusCrtUser;
    @Column(name = "CUS_SYS_DT")
    private String cusSysDt;
    @Size(max = 15)
    @Column(name = "CUS_TITLE")
    private String cusTitle;
    @Size(max = 150)
    @Column(name = "CUS_SURNAME")
    private String cusSurname;
    @Size(max = 150)
    @Column(name = "CUS_MIDNAME")
    private String cusMidname;
    @Size(max = 150)
    @Column(name = "CUS_FIRSTNAME")
    private String cusFirstname;
    @Size(max = 50)
    @Column(name = "CUS_GENDER")
    private String cusGender;
    @Column(name = "CUS_DOB")
    private String cusDob;
    @Size(max = 50)
    @Column(name = "CUS_MARITAL_STS")
    private String cusMaritalSts;
    @Size(max = 250)
    @Column(name = "CUS_ADDRS")
    private String cusAddrs;
    @Size(max = 15)
    @Column(name = "CUS_MOBILE")
    private String cusMobile;
    @Size(max = 15)
    @Column(name = "CUS_MOMO_NO")
    private String cusMomoNo;
    @Size(max = 150)
    @Column(name = "CUS_OCCUPATION")
    private String cusOccupation;
    @Size(max = 50)
    @Column(name = "CUS_BRANCH_CODE")
    private String cusBranchCode;
    @Size(max = 50)
    @Column(name = "CUS_ID_TYP")
    private String cusIdTyp;
    @Size(max = 25)
    @Column(name = "CUS_ID_NO")
    private String cusIdNo;
    @Size(max = 150)
    @Column(name = "CUS_PHOTO")
    private String cusPhoto;
    @Size(max = 150)
    @Column(name = "CUS_HOMETOWN")
    private String cusHometown;
    @Size(max = 150)
    @Column(name = "CUS_BIRHT_PLC")
    private String cusBirhtPlc;
    @Size(max = 150)
    @Column(name = "CUS_NATIONALITY")
    private String cusNationality;
    @Size(max = 250)
    @Column(name = "CUS_RES_ADDRS")
    private String cusResAddrs;
    @Size(max = 25)
    @Column(name = "CUS_TIN")
    private String cusTin;
    @Size(max = 250)
    @Column(name = "CUS_LOC")
    private String cusLoc;
    @Size(max = 5)
    @Column(name = "CUS_STS")
    private String cusSts;
    @Size(max = 15)
    @Column(name = "CUS_TYPE")
    private String cusType;
    @Size(max = 50)
    @Column(name = "CUS_EMAIL")
    private String cusEmail;

    public CustomerTb() {
    }
    
    public CustomerTb(CustomerTbModel ctb) {
        this.customerTbPK = new CustomerTbPK(ctb.getCustomerTbPK());
        this.cusCode = ctb.getCusCode();
        this.cusRegDt = ctb.getCusRegDt();
        this.cusCrtUser = ctb.getCusCrtUser();
        this.cusSysDt = ctb.getCusSysDt();
        this.cusTitle = ctb.getCusTitle();
        this.cusSurname = ctb.getCusSurname();
        this.cusMidname = ctb.getCusMidname();
        this.cusFirstname = ctb.getCusFirstname();
        this.cusGender = ctb.getCusGender();
        this.cusDob = ctb.getCusDob();
        this.cusMaritalSts = ctb.getCusMaritalSts();
        this.cusAddrs = ctb.getCusAddrs();
        this.cusMobile = ctb.getCusMobile();
        this.cusMomoNo = ctb.getCusMomoNo();
        this.cusOccupation = ctb.getCusOccupation();
        this.cusBranchCode = ctb.getCusBranchCode();
        this.cusIdTyp = ctb.getCusIdTyp();
        this.cusIdNo = ctb.getCusIdNo();
        this.cusPhoto = ctb.getCusPhoto();
        this.cusHometown = ctb.getCusHometown();
        this.cusBirhtPlc = ctb.getCusBirhtPlc();
        this.cusNationality = ctb.getCusNationality();
        this.cusResAddrs = ctb.getCusResAddrs();
        this.cusTin = ctb.getCusTin();
        this.cusLoc = ctb.getCusLoc();
        this.cusSts = ctb.getCusSts();
        this.cusType = ctb.getCusType();
        this.cusEmail = ctb.getCusEmail();
    }

    public CustomerTb(CustomerTbPK customerTbPK) {
        this.customerTbPK = customerTbPK;
    }

    public CustomerTb(int cusSysid, int cusUserSysid, int cusBranchSysid) {
        this.customerTbPK = new CustomerTbPK(cusSysid, cusUserSysid, cusBranchSysid);
    }

    public CustomerTbPK getCustomerTbPK() {
        return customerTbPK;
    }

    public void setCustomerTbPK(CustomerTbPK customerTbPK) {
        this.customerTbPK = customerTbPK;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public String getCusRegDt() {
        return cusRegDt;
    }

    public void setCusRegDt(String cusRegDt) {
        this.cusRegDt = cusRegDt;
    }

    public String getCusCrtUser() {
        return cusCrtUser;
    }

    public void setCusCrtUser(String cusCrtUser) {
        this.cusCrtUser = cusCrtUser;
    }

    public String getCusSysDt() {
        return cusSysDt;
    }

    public void setCusSysDt(String cusSysDt) {
        this.cusSysDt = cusSysDt;
    }

    public String getCusTitle() {
        return cusTitle;
    }

    public void setCusTitle(String cusTitle) {
        this.cusTitle = cusTitle;
    }

    public String getCusSurname() {
        return cusSurname;
    }

    public void setCusSurname(String cusSurname) {
        this.cusSurname = cusSurname;
    }

    public String getCusMidname() {
        return cusMidname;
    }

    public void setCusMidname(String cusMidname) {
        this.cusMidname = cusMidname;
    }

    public String getCusFirstname() {
        return cusFirstname;
    }

    public void setCusFirstname(String cusFirstname) {
        this.cusFirstname = cusFirstname;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getCusDob() {
        return cusDob;
    }

    public void setCusDob(String cusDob) {
        this.cusDob = cusDob;
    }

    public String getCusMaritalSts() {
        return cusMaritalSts;
    }

    public void setCusMaritalSts(String cusMaritalSts) {
        this.cusMaritalSts = cusMaritalSts;
    }

    public String getCusAddrs() {
        return cusAddrs;
    }

    public void setCusAddrs(String cusAddrs) {
        this.cusAddrs = cusAddrs;
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }

    public String getCusMomoNo() {
        return cusMomoNo;
    }

    public void setCusMomoNo(String cusMomoNo) {
        this.cusMomoNo = cusMomoNo;
    }

    public String getCusOccupation() {
        return cusOccupation;
    }

    public void setCusOccupation(String cusOccupation) {
        this.cusOccupation = cusOccupation;
    }

    public String getCusBranchCode() {
        return cusBranchCode;
    }

    public void setCusBranchCode(String cusBranchCode) {
        this.cusBranchCode = cusBranchCode;
    }

    public String getCusIdTyp() {
        return cusIdTyp;
    }

    public void setCusIdTyp(String cusIdTyp) {
        this.cusIdTyp = cusIdTyp;
    }

    public String getCusIdNo() {
        return cusIdNo;
    }

    public void setCusIdNo(String cusIdNo) {
        this.cusIdNo = cusIdNo;
    }

    public String getCusPhoto() {
        return cusPhoto;
    }

    public void setCusPhoto(String cusPhoto) {
        this.cusPhoto = cusPhoto;
    }

    public String getCusHometown() {
        return cusHometown;
    }

    public void setCusHometown(String cusHometown) {
        this.cusHometown = cusHometown;
    }

    public String getCusBirhtPlc() {
        return cusBirhtPlc;
    }

    public void setCusBirhtPlc(String cusBirhtPlc) {
        this.cusBirhtPlc = cusBirhtPlc;
    }

    public String getCusNationality() {
        return cusNationality;
    }

    public void setCusNationality(String cusNationality) {
        this.cusNationality = cusNationality;
    }

    public String getCusResAddrs() {
        return cusResAddrs;
    }

    public void setCusResAddrs(String cusResAddrs) {
        this.cusResAddrs = cusResAddrs;
    }

    public String getCusTin() {
        return cusTin;
    }

    public void setCusTin(String cusTin) {
        this.cusTin = cusTin;
    }

    public String getCusLoc() {
        return cusLoc;
    }

    public void setCusLoc(String cusLoc) {
        this.cusLoc = cusLoc;
    }

    public String getCusSts() {
        return cusSts;
    }

    public void setCusSts(String cusSts) {
        this.cusSts = cusSts;
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerTbPK != null ? customerTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerTb)) {
            return false;
        }
        CustomerTb other = (CustomerTb) object;
        if ((this.customerTbPK == null && other.customerTbPK != null) || (this.customerTbPK != null && !this.customerTbPK.equals(other.customerTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.CustomerTb[ customerTbPK=" + customerTbPK + " ]";
    }
    
}
