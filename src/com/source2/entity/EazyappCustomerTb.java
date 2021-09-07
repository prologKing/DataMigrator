/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source2.entity;

import com.model.CustomerModel;
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
@Table(name = "eazyapp_customer_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EazyappCustomerTb.findAll", query = "SELECT e FROM EazyappCustomerTb e"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerindex", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerindex = :customerindex"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerRefNo", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerRefNo = :customerRefNo"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerRegistrationDate", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerRegistrationDate = :customerRegistrationDate"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerSurname", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerSurname = :customerSurname"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerMiddleName", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerMiddleName = :customerMiddleName"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerFirstname", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerFirstname = :customerFirstname"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerGender", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerGender = :customerGender"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerDateofbirth", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerDateofbirth = :customerDateofbirth"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerMaritalStatus", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerMaritalStatus = :customerMaritalStatus"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerMobile", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerMobile = :customerMobile"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerStatus", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerStatus = :customerStatus"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerEmail", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerEmail = :customerEmail"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerBranch", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerBranch = :customerBranch"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerUserindex", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerUserindex = :customerUserindex"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerInputdate", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerInputdate = :customerInputdate"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerIdCard", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerIdCard = :customerIdCard"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerIdCardNo", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerIdCardNo = :customerIdCardNo"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerTitle", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerTitle = :customerTitle"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerHomeTown", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerHomeTown = :customerHomeTown"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerPlaceOfBirth", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerPlaceOfBirth = :customerPlaceOfBirth"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerNationality", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerNationality = :customerNationality"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerEmployerName", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerEmployerName = :customerEmployerName"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerEmployerEmail", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerEmployerEmail = :customerEmployerEmail"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerEmployerTelNo", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerEmployerTelNo = :customerEmployerTelNo"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerTin", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerTin = :customerTin"),
    @NamedQuery(name = "EazyappCustomerTb.findByCustomerMobileMoney", query = "SELECT e FROM EazyappCustomerTb e WHERE e.customerMobileMoney = :customerMobileMoney")})
public class EazyappCustomerTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customerindex")
    private Integer customerindex;
    @Size(max = 15)
    @Column(name = "customer_ref_no")
    private String customerRefNo;
    @Column(name = "customer_registration_date")
    private String customerRegistrationDate;
    @Size(max = 45)
    @Column(name = "customer_surname")
    private String customerSurname;
    @Size(max = 50)
    @Column(name = "customer_middle_name")
    private String customerMiddleName;
    @Size(max = 45)
    @Column(name = "customer_firstname")
    private String customerFirstname;
    @Size(max = 15)
    @Column(name = "customer_gender")
    private String customerGender;
    @Column(name = "customer_dateofbirth")
    private String customerDateofbirth;
    @Size(max = 15)
    @Column(name = "customer_marital_status")
    private String customerMaritalStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "customer_address")
    private String customerAddress;
    @Size(max = 15)
    @Column(name = "customer_mobile")
    private String customerMobile;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "customer_occupation")
    private String customerOccupation;
    @Size(max = 15)
    @Column(name = "customer_status")
    private String customerStatus;
    @Size(max = 45)
    @Column(name = "customer_email")
    private String customerEmail;
    @Size(max = 15)
    @Column(name = "customer_branch")
    private String customerBranch;
    @Size(max = 15)
    @Column(name = "customer_userindex")
    private String customerUserindex;
    @Column(name = "customer_inputdate")
    private String customerInputdate;
    @Size(max = 15)
    @Column(name = "customer_id_card")
    private String customerIdCard;
    @Size(max = 20)
    @Column(name = "customer_id_card_no")
    private String customerIdCardNo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "customer_id_card_photo")
    private String customerIdCardPhoto;
    @Size(max = 11)
    @Column(name = "customer_title")
    private String customerTitle;
    @Size(max = 50)
    @Column(name = "customer_home_town")
    private String customerHomeTown;
    @Size(max = 50)
    @Column(name = "customer_place_of_birth")
    private String customerPlaceOfBirth;
    @Size(max = 50)
    @Column(name = "customer_nationality")
    private String customerNationality;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "customer_resident_address")
    private String customerResidentAddress;
    @Size(max = 50)
    @Column(name = "customer_employer_name")
    private String customerEmployerName;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "customer_employer_address")
    private String customerEmployerAddress;
    @Size(max = 50)
    @Column(name = "customer_employer_email")
    private String customerEmployerEmail;
    @Size(max = 50)
    @Column(name = "customer_employer_tel_no")
    private String customerEmployerTelNo;
    @Size(max = 45)
    @Column(name = "customer_tin")
    private String customerTin;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "customer_location")
    private String customerLocation;
    @Size(max = 45)
    @Column(name = "customer_mobile_money")
    private String customerMobileMoney;

    public EazyappCustomerTb() {
    }
    
    public EazyappCustomerTb(CustomerModel eazyl) {
        this.customerindex = eazyl.getCustomerindex();
        this.customerRefNo = eazyl.getCustomerRefNo();
        this.customerRegistrationDate = eazyl.getCustomerRegistrationDate();
        this.customerSurname = eazyl.getCustomerSurname();
        this.customerMiddleName = eazyl.getCustomerMiddleName();
        this.customerFirstname = eazyl.getCustomerFirstname();
        this.customerGender = eazyl.getCustomerGender();
        this.customerDateofbirth = eazyl.getCustomerDateofbirth();
        this.customerMaritalStatus = eazyl.getCustomerMaritalStatus();
        this.customerAddress = eazyl.getCustomerAddress();
        this.customerMobile = eazyl.getCustomerMobile();
        this.customerOccupation = eazyl.getCustomerOccupation();
        this.customerStatus = eazyl.getCustomerStatus();
        this.customerEmail = eazyl.getCustomerEmail();
        this.customerBranch = eazyl.getCustomerBranch();
        this.customerUserindex = eazyl.getCustomerUserindex();
        this.customerInputdate = eazyl.getCustomerInputdate();
        this.customerIdCard = eazyl.getCustomerIdCard();
        this.customerIdCardNo = eazyl.getCustomerIdCardNo();
        this.customerIdCardPhoto = eazyl.getCustomerIdCardPhoto();
        this.customerTitle = eazyl.getCustomerTitle();
        this.customerHomeTown = eazyl.getCustomerHomeTown();
        this.customerPlaceOfBirth = eazyl.getCustomerPlaceOfBirth();
        this.customerNationality = eazyl.getCustomerNationality();
        this.customerResidentAddress = eazyl.getCustomerResidentAddress();
        this.customerEmployerName = eazyl.getCustomerEmployerName();
        this.customerEmployerAddress = eazyl.getCustomerEmployerAddress();
        this.customerEmployerEmail = eazyl.getCustomerEmail();
        this.customerEmployerTelNo = eazyl.getCustomerEmployerTelNo();
        this.customerTin = eazyl.getCustomerTin();
        this.customerLocation = eazyl.getCustomerLocation();
        this.customerMobileMoney = eazyl.getCustomerMobileMoney();
    } 

    public EazyappCustomerTb(Integer customerindex) {
        this.customerindex = customerindex;
    }

    public Integer getCustomerindex() {
        return customerindex;
    }

    public void setCustomerindex(Integer customerindex) {
        this.customerindex = customerindex;
    }

    public String getCustomerRefNo() {
        return customerRefNo;
    }

    public void setCustomerRefNo(String customerRefNo) {
        this.customerRefNo = customerRefNo;
    }

    public String getCustomerRegistrationDate() {
        return customerRegistrationDate;
    }

    public void setCustomerRegistrationDate(String customerRegistrationDate) {
        this.customerRegistrationDate = customerRegistrationDate;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerMiddleName() {
        return customerMiddleName;
    }

    public void setCustomerMiddleName(String customerMiddleName) {
        this.customerMiddleName = customerMiddleName;
    }

    public String getCustomerFirstname() {
        return customerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstname = customerFirstname;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerDateofbirth() {
        return customerDateofbirth;
    }

    public void setCustomerDateofbirth(String customerDateofbirth) {
        this.customerDateofbirth = customerDateofbirth;
    }

    public String getCustomerMaritalStatus() {
        return customerMaritalStatus;
    }

    public void setCustomerMaritalStatus(String customerMaritalStatus) {
        this.customerMaritalStatus = customerMaritalStatus;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerOccupation() {
        return customerOccupation;
    }

    public void setCustomerOccupation(String customerOccupation) {
        this.customerOccupation = customerOccupation;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerBranch() {
        return customerBranch;
    }

    public void setCustomerBranch(String customerBranch) {
        this.customerBranch = customerBranch;
    }

    public String getCustomerUserindex() {
        return customerUserindex;
    }

    public void setCustomerUserindex(String customerUserindex) {
        this.customerUserindex = customerUserindex;
    }

    public String getCustomerInputdate() {
        return customerInputdate;
    }

    public void setCustomerInputdate(String customerInputdate) {
        this.customerInputdate = customerInputdate;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerIdCardNo() {
        return customerIdCardNo;
    }

    public void setCustomerIdCardNo(String customerIdCardNo) {
        this.customerIdCardNo = customerIdCardNo;
    }

    public String getCustomerIdCardPhoto() {
        return customerIdCardPhoto;
    }

    public void setCustomerIdCardPhoto(String customerIdCardPhoto) {
        this.customerIdCardPhoto = customerIdCardPhoto;
    }

    public String getCustomerTitle() {
        return customerTitle;
    }

    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    public String getCustomerHomeTown() {
        return customerHomeTown;
    }

    public void setCustomerHomeTown(String customerHomeTown) {
        this.customerHomeTown = customerHomeTown;
    }

    public String getCustomerPlaceOfBirth() {
        return customerPlaceOfBirth;
    }

    public void setCustomerPlaceOfBirth(String customerPlaceOfBirth) {
        this.customerPlaceOfBirth = customerPlaceOfBirth;
    }

    public String getCustomerNationality() {
        return customerNationality;
    }

    public void setCustomerNationality(String customerNationality) {
        this.customerNationality = customerNationality;
    }

    public String getCustomerResidentAddress() {
        return customerResidentAddress;
    }

    public void setCustomerResidentAddress(String customerResidentAddress) {
        this.customerResidentAddress = customerResidentAddress;
    }

    public String getCustomerEmployerName() {
        return customerEmployerName;
    }

    public void setCustomerEmployerName(String customerEmployerName) {
        this.customerEmployerName = customerEmployerName;
    }

    public String getCustomerEmployerAddress() {
        return customerEmployerAddress;
    }

    public void setCustomerEmployerAddress(String customerEmployerAddress) {
        this.customerEmployerAddress = customerEmployerAddress;
    }

    public String getCustomerEmployerEmail() {
        return customerEmployerEmail;
    }

    public void setCustomerEmployerEmail(String customerEmployerEmail) {
        this.customerEmployerEmail = customerEmployerEmail;
    }

    public String getCustomerEmployerTelNo() {
        return customerEmployerTelNo;
    }

    public void setCustomerEmployerTelNo(String customerEmployerTelNo) {
        this.customerEmployerTelNo = customerEmployerTelNo;
    }

    public String getCustomerTin() {
        return customerTin;
    }

    public void setCustomerTin(String customerTin) {
        this.customerTin = customerTin;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    public String getCustomerMobileMoney() {
        return customerMobileMoney;
    }

    public void setCustomerMobileMoney(String customerMobileMoney) {
        this.customerMobileMoney = customerMobileMoney;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerindex != null ? customerindex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EazyappCustomerTb)) {
            return false;
        }
        EazyappCustomerTb other = (EazyappCustomerTb) object;
        if ((this.customerindex == null && other.customerindex != null) || (this.customerindex != null && !this.customerindex.equals(other.customerindex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.source2.entity.EazyappCustomerTb[ customerindex=" + customerindex + " ]";
    }
    
}
