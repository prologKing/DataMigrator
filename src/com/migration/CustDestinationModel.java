/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.migration;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Developer
 */
public class CustDestinationModel {
    private int CUS_SYSID;
    private int CUS_USER_SYSID;
    private int CUS_BRANCH_SYSID;
    private String CUS_CODE;
    private String CUS_REG_DT;
    private String CUS_CRT_USER;
    private String CUS_SYS_DT;
    private String CUS_TITLE;
    private String CUS_SURNAME;
    private String CUS_MIDNAME;
    private String CUS_FIRSTNAME;
    private String CUS_GENDER;
    private String CUS_DOB;
    private String CUS_MARITAL_STS;
    private String CUS_ADDRS;
    private String CUS_MOBILE;
    private String CUS_MOMO_NO;
    private String CUS_OCCUPATION;
    private String CUS_BRANCH_CODE;
    private String CUS_ID_TYP;
    private String CUS_ID_NO;
    private String CUS_PHOTO;
    private String CUS_HOMETOWN;
    private String CUS_BIRHT_PLC;
    private String CUS_NATIONALITY;
    private String CUS_RES_ADDRS;
    private String CUS_TIN;
    private String CUS_LOC;
    private String CUS_STS;
    private String CUS_TYPE;
    private String CUS_EMAIL;

    public CustDestinationModel() {
    }
    
    public CustDestinationModel(ResultSet data) throws SQLException{
        this.CUS_SYSID = data.getInt(1);
        this.CUS_USER_SYSID = data.getInt(2);
        this.CUS_BRANCH_SYSID = data.getInt(3);
        this.CUS_CODE = data.getString(4);
        this.CUS_REG_DT = data.getString(5);
        this.CUS_CRT_USER = data.getString(6);
        this.CUS_SYS_DT = data.getString(7);
        this.CUS_TITLE = data.getString(8);
        this.CUS_SURNAME = data.getString(9);
        this.CUS_MIDNAME = data.getString(10);
        this.CUS_FIRSTNAME = data.getString(11);
        this.CUS_GENDER = data.getString(12);
        this.CUS_DOB = data.getString(13);
        this.CUS_MARITAL_STS = data.getString(14);
        this.CUS_ADDRS = data.getString(15);
        this.CUS_MOBILE = data.getString(16);
        this.CUS_MOMO_NO = data.getString(17);
        this.CUS_OCCUPATION = data.getString(18);
        this.CUS_BRANCH_CODE = data.getString(19);
        this.CUS_ID_TYP = data.getString(20);
        this.CUS_ID_NO = data.getString(21);
        this.CUS_PHOTO = data.getString(22);
        this.CUS_HOMETOWN = data.getString(23);
        this.CUS_BIRHT_PLC = data.getString(24);
        this.CUS_NATIONALITY = data.getString(25);
        this.CUS_RES_ADDRS = data.getString(26);
        this.CUS_TIN = data.getString(27);
        this.CUS_LOC = data.getString(28);
        this.CUS_STS = data.getString(29);
        this.CUS_TYPE = data.getString(30);
        this.CUS_EMAIL = data.getString(31);
    }

    public int getCUS_SYSID() {
        return CUS_SYSID;
    }

    public void setCUS_SYSID(int CUS_SYSID) {
        this.CUS_SYSID = CUS_SYSID;
    }

    public int getCUS_USER_SYSID() {
        return CUS_USER_SYSID;
    }

    public void setCUS_USER_SYSID(int CUS_USER_SYSID) {
        this.CUS_USER_SYSID = CUS_USER_SYSID;
    }

    public int getCUS_BRANCH_SYSID() {
        return CUS_BRANCH_SYSID;
    }

    public void setCUS_BRANCH_SYSID(int CUS_BRANCH_SYSID) {
        this.CUS_BRANCH_SYSID = CUS_BRANCH_SYSID;
    }

    public String getCUS_CODE() {
        return CUS_CODE;
    }

    public void setCUS_CODE(String CUS_CODE) {
        this.CUS_CODE = CUS_CODE;
    }

    public String getCUS_REG_DT() {
        return CUS_REG_DT;
    }

    public void setCUS_REG_DT(String CUS_REG_DT) {
        this.CUS_REG_DT = CUS_REG_DT;
    }

    public String getCUS_CRT_USER() {
        return CUS_CRT_USER;
    }

    public void setCUS_CRT_USER(String CUS_CRT_USER) {
        this.CUS_CRT_USER = CUS_CRT_USER;
    }

    public String getCUS_SYS_DT() {
        return CUS_SYS_DT;
    }

    public void setCUS_SYS_DT(String CUS_SYS_DT) {
        this.CUS_SYS_DT = CUS_SYS_DT;
    }

    public String getCUS_TITLE() {
        return CUS_TITLE;
    }

    public void setCUS_TITLE(String CUS_TITLE) {
        this.CUS_TITLE = CUS_TITLE;
    }

    public String getCUS_SURNAME() {
        return CUS_SURNAME;
    }

    public void setCUS_SURNAME(String CUS_SURNAME) {
        this.CUS_SURNAME = CUS_SURNAME;
    }

    public String getCUS_MIDNAME() {
        return CUS_MIDNAME;
    }

    public void setCUS_MIDNAME(String CUS_MIDNAME) {
        this.CUS_MIDNAME = CUS_MIDNAME;
    }

    public String getCUS_FIRSTNAME() {
        return CUS_FIRSTNAME;
    }

    public void setCUS_FIRSTNAME(String CUS_FIRSTNAME) {
        this.CUS_FIRSTNAME = CUS_FIRSTNAME;
    }

    public String getCUS_GENDER() {
        return CUS_GENDER;
    }

    public void setCUS_GENDER(String CUS_GENDER) {
        this.CUS_GENDER = CUS_GENDER;
    }

    public String getCUS_DOB() {
        return CUS_DOB;
    }

    public void setCUS_DOB(String CUS_DOB) {
        this.CUS_DOB = CUS_DOB;
    }

    public String getCUS_MARITAL_STS() {
        return CUS_MARITAL_STS;
    }

    public void setCUS_MARITAL_STS(String CUS_MARITAL_STS) {
        this.CUS_MARITAL_STS = CUS_MARITAL_STS;
    }

    public String getCUS_ADDRS() {
        return CUS_ADDRS;
    }

    public void setCUS_ADDRS(String CUS_ADDRS) {
        this.CUS_ADDRS = CUS_ADDRS;
    }

    public String getCUS_MOBILE() {
        return CUS_MOBILE;
    }

    public void setCUS_MOBILE(String CUS_MOBILE) {
        this.CUS_MOBILE = CUS_MOBILE;
    }

    public String getCUS_MOMO_NO() {
        return CUS_MOMO_NO;
    }

    public void setCUS_MOMO_NO(String CUS_MOMO_NO) {
        this.CUS_MOMO_NO = CUS_MOMO_NO;
    }

    public String getCUS_OCCUPATION() {
        return CUS_OCCUPATION;
    }

    public void setCUS_OCCUPATION(String CUS_OCCUPATION) {
        this.CUS_OCCUPATION = CUS_OCCUPATION;
    }

    public String getCUS_BRANCH_CODE() {
        return CUS_BRANCH_CODE;
    }

    public void setCUS_BRANCH_CODE(String CUS_BRANCH_CODE) {
        this.CUS_BRANCH_CODE = CUS_BRANCH_CODE;
    }

    public String getCUS_ID_TYP() {
        return CUS_ID_TYP;
    }

    public void setCUS_ID_TYP(String CUS_ID_TYP) {
        this.CUS_ID_TYP = CUS_ID_TYP;
    }

    public String getCUS_ID_NO() {
        return CUS_ID_NO;
    }

    public void setCUS_ID_NO(String CUS_ID_NO) {
        this.CUS_ID_NO = CUS_ID_NO;
    }

    public String getCUS_PHOTO() {
        return CUS_PHOTO;
    }

    public void setCUS_PHOTO(String CUS_PHOTO) {
        this.CUS_PHOTO = CUS_PHOTO;
    }

    public String getCUS_HOMETOWN() {
        return CUS_HOMETOWN;
    }

    public void setCUS_HOMETOWN(String CUS_HOMETOWN) {
        this.CUS_HOMETOWN = CUS_HOMETOWN;
    }

    public String getCUS_BIRHT_PLC() {
        return CUS_BIRHT_PLC;
    }

    public void setCUS_BIRHT_PLC(String CUS_BIRHT_PLC) {
        this.CUS_BIRHT_PLC = CUS_BIRHT_PLC;
    }

    public String getCUS_NATIONALITY() {
        return CUS_NATIONALITY;
    }

    public void setCUS_NATIONALITY(String CUS_NATIONALITY) {
        this.CUS_NATIONALITY = CUS_NATIONALITY;
    }

    public String getCUS_RES_ADDRS() {
        return CUS_RES_ADDRS;
    }

    public void setCUS_RES_ADDRS(String CUS_RES_ADDRS) {
        this.CUS_RES_ADDRS = CUS_RES_ADDRS;
    }

    public String getCUS_TIN() {
        return CUS_TIN;
    }

    public void setCUS_TIN(String CUS_TIN) {
        this.CUS_TIN = CUS_TIN;
    }

    public String getCUS_LOC() {
        return CUS_LOC;
    }

    public void setCUS_LOC(String CUS_LOC) {
        this.CUS_LOC = CUS_LOC;
    }

    public String getCUS_STS() {
        return CUS_STS;
    }

    public void setCUS_STS(String CUS_STS) {
        this.CUS_STS = CUS_STS;
    }

    public String getCUS_TYPE() {
        return CUS_TYPE;
    }

    public void setCUS_TYPE(String CUS_TYPE) {
        this.CUS_TYPE = CUS_TYPE;
    }

    public String getCUS_EMAIL() {
        return CUS_EMAIL;
    }

    public void setCUS_EMAIL(String CUS_EMAIL) {
        this.CUS_EMAIL = CUS_EMAIL;
    }

    @Override
    public String toString() {
        return "CustDestinationModel{" + "CUS_SYSID=" + CUS_SYSID + ", CUS_USER_SYSID=" + CUS_USER_SYSID + ", CUS_BRANCH_SYSID=" + CUS_BRANCH_SYSID + ", CUS_CODE=" + CUS_CODE + ", CUS_REG_DT=" + CUS_REG_DT + ", CUS_CRT_USER=" + CUS_CRT_USER + ", CUS_SYS_DT=" + CUS_SYS_DT + ", CUS_TITLE=" + CUS_TITLE + ", CUS_SURNAME=" + CUS_SURNAME + ", CUS_MIDNAME=" + CUS_MIDNAME + ", CUS_FIRSTNAME=" + CUS_FIRSTNAME + ", CUS_GENDER=" + CUS_GENDER + ", CUS_DOB=" + CUS_DOB + ", CUS_MARITAL_STS=" + CUS_MARITAL_STS + ", CUS_ADDRS=" + CUS_ADDRS + ", CUS_MOBILE=" + CUS_MOBILE + ", CUS_MOMO_NO=" + CUS_MOMO_NO + ", CUS_OCCUPATION=" + CUS_OCCUPATION + ", CUS_BRANCH_CODE=" + CUS_BRANCH_CODE + ", CUS_ID_TYP=" + CUS_ID_TYP + ", CUS_ID_NO=" + CUS_ID_NO + ", CUS_PHOTO=" + CUS_PHOTO + ", CUS_HOMETOWN=" + CUS_HOMETOWN + ", CUS_BIRHT_PLC=" + CUS_BIRHT_PLC + ", CUS_NATIONALITY=" + CUS_NATIONALITY + ", CUS_RES_ADDRS=" + CUS_RES_ADDRS + ", CUS_TIN=" + CUS_TIN + ", CUS_LOC=" + CUS_LOC + ", CUS_STS=" + CUS_STS + ", CUS_TYPE=" + CUS_TYPE + ", CUS_EMAIL=" + CUS_EMAIL + '}';
    }
    
}
