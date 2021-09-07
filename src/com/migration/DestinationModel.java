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
public class DestinationModel {
  private int PAGT_SYSID;
  private int PAGT_USER_SYSID;
  private int PAGT_BRANCH_SYSID;
  private String PAGT_REPORT_ID;
  private String PAGT_REPORT_MGR;
  private int PAGT_PBK_SYSID;
  private int PAGT_PBKB_SYSID;
  private String PAGT_CODE;
  private String PAGT_SURNAME;
  private String PAGT_OTHNAME;
  private String PAGT_GENDER;
  private String PAGT_DOB;
  private String PAGT_ADDRS;
  private String PAGT_MOBILE;
  private String PAGT_MOMO_NO;
  private String PAGT_STATUS;
  private String PAGT_ACCT_NO;
  private String PAGT_REG_DT;
  private String PAGT_CRT_DT;
  private String PAGT_EMAIL;
  private String PAGT_PHOTO;
  private String PAGT_EXIT_DT;
  private String PAGT_MARITAL_STS;
  private String PAGT_BFIT_STDT;
  private String PAGT_ENT_SOURCE;
  private String PAGT_USED;
  private int PAGT_PAH_SYSID;
  private String PAGT_LEVEL;
  private String PAGT_HIERARCHY;
  private int PAGT_PAL_LEVEL_ID;
  private int PAGT_SUBBRANCH_SYSID;

    public DestinationModel() {
    }
  
  
  public DestinationModel(ResultSet data) throws SQLException{
        this.PAGT_SYSID = data.getInt(1);
        this.PAGT_USER_SYSID = data.getInt(2);
        this.PAGT_BRANCH_SYSID = data.getInt(3);
        this.PAGT_REPORT_ID = data.getString(4);
        this.PAGT_REPORT_MGR = data.getString(5);
        this.PAGT_PBK_SYSID = data.getInt(6);
        this.PAGT_PBKB_SYSID = data.getInt(7);
        this.PAGT_CODE = data.getString(8);
        this.PAGT_SURNAME = data.getString(9);
        this.PAGT_OTHNAME = data.getString(10);
        this.PAGT_GENDER = data.getString(11);
        this.PAGT_DOB = data.getString(12);
        this.PAGT_ADDRS = data.getString(13);
        this.PAGT_MOBILE = data.getString(14);
        this.PAGT_MOMO_NO = data.getString(15);
        this.PAGT_STATUS = data.getString(16);
        this.PAGT_ACCT_NO = data.getString(17);
        this.PAGT_REG_DT = data.getString(18);
        this.PAGT_CRT_DT = data.getString(19);
        this.PAGT_EMAIL = data.getString(20);
        this.PAGT_PHOTO = data.getString(21);
        this.PAGT_EXIT_DT = data.getString(22);
        this.PAGT_MARITAL_STS = data.getString(23);
        this.PAGT_BFIT_STDT = data.getString(24);
        this.PAGT_ENT_SOURCE = data.getString(25);
        this.PAGT_USED = data.getString(26);
        this.PAGT_PAH_SYSID = data.getInt(27);
        this.PAGT_LEVEL = data.getString(28);
        this.PAGT_HIERARCHY = data.getString(29);
        this.PAGT_PAL_LEVEL_ID = data.getInt(30);
        this.PAGT_SUBBRANCH_SYSID = data.getInt(31);
    }

    public DestinationModel(int PAGT_SYSID, int PAGT_USER_SYSID, int PAGT_BRANCH_SYSID, String PAGT_REPORT_ID, String PAGT_REPORT_MGR, int PAGT_PBK_SYSID, int PAGT_PBKB_SYSID, String PAGT_CODE, String PAGT_SURNAME, String PAGT_OTHNAME, String PAGT_GENDER, String PAGT_DOB, String PAGT_ADDRS, String PAGT_MOBILE, String PAGT_MOMO_NO, String PAGT_STATUS, String PAGT_ACCT_NO, String PAGT_REG_DT, String PAGT_CRT_DT, String PAGT_EMAIL, String PAGT_PHOTO, String PAGT_EXIT_DT, String PAGT_MARITAL_STS, String PAGT_BFIT_STDT, String PAGT_ENT_SOURCE, String PAGT_USED, int PAGT_PAH_SYSID, String PAGT_LEVEL, String PAGT_HIERARCHY, int PAGT_PAL_LEVEL_ID, int PAGT_SUBBRANCH_SYSID) {
        this.PAGT_SYSID = PAGT_SYSID;
        this.PAGT_USER_SYSID = PAGT_USER_SYSID;
        this.PAGT_BRANCH_SYSID = PAGT_BRANCH_SYSID;
        this.PAGT_REPORT_ID = PAGT_REPORT_ID;
        this.PAGT_REPORT_MGR = PAGT_REPORT_MGR;
        this.PAGT_PBK_SYSID = PAGT_PBK_SYSID;
        this.PAGT_PBKB_SYSID = PAGT_PBKB_SYSID;
        this.PAGT_CODE = PAGT_CODE;
        this.PAGT_SURNAME = PAGT_SURNAME;
        this.PAGT_OTHNAME = PAGT_OTHNAME;
        this.PAGT_GENDER = PAGT_GENDER;
        this.PAGT_DOB = PAGT_DOB;
        this.PAGT_ADDRS = PAGT_ADDRS;
        this.PAGT_MOBILE = PAGT_MOBILE;
        this.PAGT_MOMO_NO = PAGT_MOMO_NO;
        this.PAGT_STATUS = PAGT_STATUS;
        this.PAGT_ACCT_NO = PAGT_ACCT_NO;
        this.PAGT_REG_DT = PAGT_REG_DT;
        this.PAGT_CRT_DT = PAGT_CRT_DT;
        this.PAGT_EMAIL = PAGT_EMAIL;
        this.PAGT_PHOTO = PAGT_PHOTO;
        this.PAGT_EXIT_DT = PAGT_EXIT_DT;
        this.PAGT_MARITAL_STS = PAGT_MARITAL_STS;
        this.PAGT_BFIT_STDT = PAGT_BFIT_STDT;
        this.PAGT_ENT_SOURCE = PAGT_ENT_SOURCE;
        this.PAGT_USED = PAGT_USED;
        this.PAGT_PAH_SYSID = PAGT_PAH_SYSID;
        this.PAGT_LEVEL = PAGT_LEVEL;
        this.PAGT_HIERARCHY = PAGT_HIERARCHY;
        this.PAGT_PAL_LEVEL_ID = PAGT_PAL_LEVEL_ID;
        this.PAGT_SUBBRANCH_SYSID = PAGT_SUBBRANCH_SYSID;
    }
  
  

    public int getPAGT_SYSID() {
        return PAGT_SYSID;
    }

    public void setPAGT_SYSID(int PAGT_SYSID) {
        this.PAGT_SYSID = PAGT_SYSID;
    }

    public int getPAGT_USER_SYSID() {
        return PAGT_USER_SYSID;
    }

    public void setPAGT_USER_SYSID(int PAGT_USER_SYSID) {
        this.PAGT_USER_SYSID = PAGT_USER_SYSID;
    }

    public int getPAGT_BRANCH_SYSID() {
        return PAGT_BRANCH_SYSID;
    }

    public void setPAGT_BRANCH_SYSID(int PAGT_BRANCH_SYSID) {
        this.PAGT_BRANCH_SYSID = PAGT_BRANCH_SYSID;
    }

    public String getPAGT_REPORT_ID() {
        return PAGT_REPORT_ID;
    }

    public void setPAGT_REPORT_ID(String PAGT_REPORT_ID) {
        this.PAGT_REPORT_ID = PAGT_REPORT_ID;
    }

    public String getPAGT_REPORT_MGR() {
        return PAGT_REPORT_MGR;
    }

    public void setPAGT_REPORT_MGR(String PAGT_REPORT_MGR) {
        this.PAGT_REPORT_MGR = PAGT_REPORT_MGR;
    }

    public int getPAGT_PBK_SYSID() {
        return PAGT_PBK_SYSID;
    }

    public void setPAGT_PBK_SYSID(int PAGT_PBK_SYSID) {
        this.PAGT_PBK_SYSID = PAGT_PBK_SYSID;
    }

    public int getPAGT_PBKB_SYSID() {
        return PAGT_PBKB_SYSID;
    }

    public void setPAGT_PBKB_SYSID(int PAGT_PBKB_SYSID) {
        this.PAGT_PBKB_SYSID = PAGT_PBKB_SYSID;
    }

    public String getPAGT_CODE() {
        return PAGT_CODE;
    }

    public void setPAGT_CODE(String PAGT_CODE) {
        this.PAGT_CODE = PAGT_CODE;
    }

    public String getPAGT_SURNAME() {
        return PAGT_SURNAME;
    }

    public void setPAGT_SURNAME(String PAGT_SURNAME) {
        this.PAGT_SURNAME = PAGT_SURNAME;
    }

    public String getPAGT_OTHNAME() {
        return PAGT_OTHNAME;
    }

    public void setPAGT_OTHNAME(String PAGT_OTHNAME) {
        this.PAGT_OTHNAME = PAGT_OTHNAME;
    }

    public String getPAGT_GENDER() {
        return PAGT_GENDER;
    }

    public void setPAGT_GENDER(String PAGT_GENDER) {
        this.PAGT_GENDER = PAGT_GENDER;
    }

    public String getPAGT_DOB() {
        return PAGT_DOB;
    }

    public void setPAGT_DOB(String PAGT_DOB) {
        this.PAGT_DOB = PAGT_DOB;
    }

    public String getPAGT_ADDRS() {
        return PAGT_ADDRS;
    }

    public void setPAGT_ADDRS(String PAGT_ADDRS) {
        this.PAGT_ADDRS = PAGT_ADDRS;
    }

    public String getPAGT_MOBILE() {
        return PAGT_MOBILE;
    }

    public void setPAGT_MOBILE(String PAGT_MOBILE) {
        this.PAGT_MOBILE = PAGT_MOBILE;
    }

    public String getPAGT_MOMO_NO() {
        return PAGT_MOMO_NO;
    }

    public void setPAGT_MOMO_NO(String PAGT_MOMO_NO) {
        this.PAGT_MOMO_NO = PAGT_MOMO_NO;
    }

    public String getPAGT_STATUS() {
        return PAGT_STATUS;
    }

    public void setPAGT_STATUS(String PAGT_STATUS) {
        this.PAGT_STATUS = PAGT_STATUS;
    }

    public String getPAGT_ACCT_NO() {
        return PAGT_ACCT_NO;
    }

    public void setPAGT_ACCT_NO(String PAGT_ACCT_NO) {
        this.PAGT_ACCT_NO = PAGT_ACCT_NO;
    }

    public String getPAGT_REG_DT() {
        return PAGT_REG_DT;
    }

    public void setPAGT_REG_DT(String PAGT_REG_DT) {
        this.PAGT_REG_DT = PAGT_REG_DT;
    }

    public String getPAGT_CRT_DT() {
        return PAGT_CRT_DT;
    }

    public void setPAGT_CRT_DT(String PAGT_CRT_DT) {
        this.PAGT_CRT_DT = PAGT_CRT_DT;
    }

    public String getPAGT_EMAIL() {
        return PAGT_EMAIL;
    }

    public void setPAGT_EMAIL(String PAGT_EMAIL) {
        this.PAGT_EMAIL = PAGT_EMAIL;
    }

    public String getPAGT_PHOTO() {
        return PAGT_PHOTO;
    }

    public void setPAGT_PHOTO(String PAGT_PHOTO) {
        this.PAGT_PHOTO = PAGT_PHOTO;
    }

    public String getPAGT_EXIT_DT() {
        return PAGT_EXIT_DT;
    }

    public void setPAGT_EXIT_DT(String PAGT_EXIT_DT) {
        this.PAGT_EXIT_DT = PAGT_EXIT_DT;
    }

    public String getPAGT_MARITAL_STS() {
        return PAGT_MARITAL_STS;
    }

    public void setPAGT_MARITAL_STS(String PAGT_MARITAL_STS) {
        this.PAGT_MARITAL_STS = PAGT_MARITAL_STS;
    }

    public String getPAGT_BFIT_STDT() {
        return PAGT_BFIT_STDT;
    }

    public void setPAGT_BFIT_STDT(String PAGT_BFIT_STDT) {
        this.PAGT_BFIT_STDT = PAGT_BFIT_STDT;
    }

    public String getPAGT_ENT_SOURCE() {
        return PAGT_ENT_SOURCE;
    }

    public void setPAGT_ENT_SOURCE(String PAGT_ENT_SOURCE) {
        this.PAGT_ENT_SOURCE = PAGT_ENT_SOURCE;
    }

    public String getPAGT_USED() {
        return PAGT_USED;
    }

    public void setPAGT_USED(String PAGT_USED) {
        this.PAGT_USED = PAGT_USED;
    }

    public int getPAGT_PAH_SYSID() {
        return PAGT_PAH_SYSID;
    }

    public void setPAGT_PAH_SYSID(int PAGT_PAH_SYSID) {
        this.PAGT_PAH_SYSID = PAGT_PAH_SYSID;
    }

    public String getPAGT_LEVEL() {
        return PAGT_LEVEL;
    }

    public void setPAGT_LEVEL(String PAGT_LEVEL) {
        this.PAGT_LEVEL = PAGT_LEVEL;
    }

    public String getPAGT_HIERARCHY() {
        return PAGT_HIERARCHY;
    }

    public void setPAGT_HIERARCHY(String PAGT_HIERARCHY) {
        this.PAGT_HIERARCHY = PAGT_HIERARCHY;
    }

    public int getPAGT_PAL_LEVEL_ID() {
        return PAGT_PAL_LEVEL_ID;
    }

    public void setPAGT_PAL_LEVEL_ID(int PAGT_PAL_LEVEL_ID) {
        this.PAGT_PAL_LEVEL_ID = PAGT_PAL_LEVEL_ID;
    }

    public int getPAGT_SUBBRANCH_SYSID() {
        return PAGT_SUBBRANCH_SYSID;
    }

    public void setPAGT_SUBBRANCH_SYSID(int PAGT_SUBBRANCH_SYSID) {
        this.PAGT_SUBBRANCH_SYSID = PAGT_SUBBRANCH_SYSID;
    }
  
  
    
}
