/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Developer
 */
public class BankInfo {
    String column1;
    String column2;
    String column3;
    String column4;
    String column5;
    String column6;

    public BankInfo() {
    }
    
     public BankInfo(Object[] obj) {
        this.column1 = String.valueOf(obj[0]);
        this.column2 = String.valueOf(obj[1]);
        this.column3 = String.valueOf(obj[2]);
        this.column4 = String.valueOf(obj[3]);
        this.column5 = String.valueOf(obj[4]);
        this.column6 = String.valueOf(obj[5]);
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5;
    }

    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6;
    }

    @Override
    public String toString() {
        return "BankInfo{" + "column1=" + column1 + ", column2=" + column2 + ", column3=" + column3 + ", column4=" + column4 + ", column5=" + column5 + ", column6=" + column6 + '}';
    }


    
    
}
