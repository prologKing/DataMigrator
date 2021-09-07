/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.DeparmentTb;

/**
 *
 * @author Developer
 */
public class DepartmentModel {
 DepartmentPKModel deparmentTbPK; 
 String dptName;
 String dptCrtDt; 
 String dptEdit; 
 String dptDelete;   
 
 public DepartmentModel(DeparmentTb dep) {
        this.deparmentTbPK = new DepartmentPKModel(dep.getDeparmentTbPK());
        this.dptName = dep.getDptName();
        this.dptCrtDt = dep.getDptCrtDt();
        this.dptEdit = dep.getDptEdit();
        this.dptDelete = dep.getDptDelete();
    }

    public DepartmentPKModel getDeparmentTbPK() {
        return deparmentTbPK;
    }

    public void setDeparmentTbPK(DepartmentPKModel deparmentTbPK) {
        this.deparmentTbPK = deparmentTbPK;
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

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }
 
 
}
