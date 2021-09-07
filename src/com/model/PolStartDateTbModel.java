/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolStartDateTb;

/**
 *
 * @author Developer
 */
public class PolStartDateTbModel {
    int id;
    String policyNum;
    String startDate;

    public PolStartDateTbModel() {
    }

    public PolStartDateTbModel(PolStartDateTb poldat) {
        this.id = poldat.getId();
        this.policyNum = poldat.getPolicyNum();
        this.startDate = poldat.getStartDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "PolStartDateTbModel{" + "id=" + id + ", policyNum=" + policyNum + ", startDate=" + startDate + '}';
    }
    
    
    
}
