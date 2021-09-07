/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.migration;

import java.math.BigDecimal;

/**
 *
 * @author Developer
 */
public class TotalDueModel {
    private String policyNum;
    private BigDecimal total;
    
     public TotalDueModel(Object[] obj) {
        this.policyNum = (String)obj[0];
        this.total = (BigDecimal)obj[1];
    }
    

    public TotalDueModel() {
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
}
