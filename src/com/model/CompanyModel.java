/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.CompanyTb;

/**
 *
 * @author Developer
 */
public class CompanyModel {
    CompanyPkModel companyTbPK;
    String cmpName; 
    String cmpInitial; 
    String cmpAddrs; 
    String cmpTel; 
    String cmpEmail; 
    String cmpWebsite; 
    String cmpCrtDt; 
    String cmpLogo; 
    String cmpEdit; 
    String cmpDelete; 
    String cmpAddrsPath;
    
  public CompanyModel(CompanyTb comp) {
        this.companyTbPK = new CompanyPkModel(comp.getCompanyTbPK());
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

    public CompanyPkModel getCompanyTbPK() {
        return companyTbPK;
    }

    public void setCompanyTbPK(CompanyPkModel companyTbPK) {
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
  
  
}
