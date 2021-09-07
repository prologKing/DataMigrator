/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ProductAgentsTb;

/**
 *
 * @author Developer
 */
public class ProductAgentsModel {
    ProductAgentsPKModel productAgentsTbPK;
    int pagtReportId; 
    String pagtReportMgr; 
    String pagtCode; 
    String pagtSurname; 
    String pagtOthname; 
    String pagtGender; 
    String pagtDob; 
    String pagtAddrs; 
    String pagtMobile;
    String pagtMomoNo;
    String pagtStatus;
    String pagtAcctNo;
    String pagtRegDt;
    String pagtCrtDt;
    String pagtEmail;
    String pagtPhoto; 
    String pagtExitDt; 
    String pagtMaritalSts; 
    String pagtBfitStdt; 
    String pagtEntSource;
    String pagtUsed; 
    String pagtLevel; 
    String pagtHierarchy; 
    int pagtSubbranchSysid;

    public ProductAgentsModel() {
        this.productAgentsTbPK = new ProductAgentsPKModel();
    }
    
    
    
   public ProductAgentsModel(ProductAgentsTb patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(patb.getProductAgentsTbPK());
        this.pagtReportId = patb.getPagtReportId();
        this.pagtReportMgr = patb.getPagtReportMgr();
        this.pagtCode = patb.getPagtCode();
        this.pagtSurname = patb.getPagtSurname();
        this.pagtOthname = patb.getPagtOthname();
        this.pagtGender = patb.getPagtGender();
        this.pagtDob = patb.getPagtDob();
        this.pagtAddrs = patb.getPagtAddrs();
        this.pagtMobile = patb.getPagtMobile();
        this.pagtMomoNo = patb.getPagtMomoNo();
        this.pagtStatus = patb.getPagtStatus();
        this.pagtAcctNo = patb.getPagtAcctNo();
        this.pagtRegDt = patb.getPagtRegDt();
        this.pagtCrtDt = patb.getPagtCrtDt();
        this.pagtEmail = patb.getPagtEmail();
        this.pagtPhoto = patb.getPagtPhoto();
        this.pagtExitDt = patb.getPagtExitDt();
        this.pagtMaritalSts = patb.getPagtMaritalSts();
        this.pagtBfitStdt = patb.getPagtBfitStdt();
        this.pagtEntSource = patb.getPagtEntSource();
        this.pagtUsed = patb.getPagtUsed();
        this.pagtLevel = patb.getPagtLevel();
        this.pagtHierarchy = patb.getPagtHierarchy();
        this.pagtSubbranchSysid = patb.getPagtSubbranchSysid();
    } 
   //String.valueOf(obj[6])
   public ProductAgentsModel(Object[] obj) {
        this.productAgentsTbPK = new ProductAgentsPKModel((Integer)obj[0], (Integer)obj[1], (Integer)obj[2], (Integer)obj[5], (Integer)obj[6], (Integer)obj[26], (Integer)obj[29]);
        this.pagtCode = (String)obj[7];
        this.pagtReportId = (Integer)obj[3];
        this.pagtReportMgr = (String)obj[4];
    } 
   public ProductAgentsModel(AosTeamTbModel patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(0, 43, patb.getTeamBranch()== null? 0: Integer.parseInt(patb.getTeamBranch()), 24, 2040, 2, 2);
        this.pagtReportId = 1;
        this.pagtReportMgr = patb.getTeamName().toUpperCase();
        this.pagtCode = "0000";
        String[] names = patb.getTeamName().split(" ");
        this.pagtSurname = names.length >= 2 ? patb.getTeamName().substring(0, patb.getTeamName().indexOf(' ')).toUpperCase(): patb.getTeamName().toUpperCase();
        this.pagtOthname = names.length >= 2 ? patb.getTeamName().substring(patb.getTeamName().indexOf(' ') + 1).toUpperCase() : patb.getTeamName().toUpperCase();
        this.pagtGender = patb.getTeamGender() == null ? "N/A": patb.getTeamGender();
        this.pagtDob = patb.getTeamDateOfBirth() == null ? "1900-01-01": patb.getTeamDateOfBirth();
        this.pagtAddrs = patb.getTeamAddress();
        this.pagtMobile = patb.getTeamMobileNo();
        this.pagtMomoNo = patb.getTeamMobileMoneyNo();
        this.pagtStatus = "Active".equals(patb.getTeamStatus()) ? "ACTIVE":"TERMINATED";
        this.pagtAcctNo = patb.getTeamBankBranchAccount();
        this.pagtRegDt = patb.getTeamDate() == null ? "1900-01-01":patb.getTeamDate();
        this.pagtCrtDt = patb.getTeamDate() == null ? "1900-01-01":patb.getTeamDate();
        this.pagtEmail = patb.getTeamEmail();
        this.pagtPhoto = "agent_images/no_image.png";
        this.pagtExitDt = "2021-04-01";
        this.pagtMaritalSts = "Single";
        this.pagtBfitStdt = patb.getTeamBenefitStartDate()== null ? "1900-01-01": patb.getTeamBenefitStartDate();
        this.pagtEntSource = "Micro";
        this.pagtUsed = "N";
        this.pagtLevel = "S.Mgr";
        this.pagtHierarchy = "Team Leader";
        this.pagtSubbranchSysid = patb.getTeamBranch()== null? 94: Integer.parseInt(patb.getTeamBranch());
    } 
   
   public ProductAgentsModel(EasyappTeamTbModel patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(0, 43, patb.getTeamBranch()== null? 0: Integer.parseInt(patb.getTeamBranch()), 24, 2040, 2, 2);
        this.pagtReportId = 1;
        this.pagtReportMgr = patb.getTeamName().toUpperCase();
        this.pagtCode = "0000";
        String[] names = patb.getTeamName().split(" ");
        this.pagtSurname = names.length >= 2 ? patb.getTeamName().substring(0, patb.getTeamName().indexOf(' ')).toUpperCase(): patb.getTeamName().toUpperCase();
        this.pagtOthname = names.length >= 2 ? patb.getTeamName().substring(patb.getTeamName().indexOf(' ') + 1).toUpperCase() : patb.getTeamName().toUpperCase();
        this.pagtGender = patb.getTeamGender() == null ? "N/A": patb.getTeamGender();
        this.pagtDob = patb.getTeamDateOfBirth() == null ? "1900-01-01": patb.getTeamDateOfBirth();
        this.pagtAddrs = patb.getTeamAddress();
        this.pagtMobile = patb.getTeamMobileNo();
        this.pagtMomoNo = patb.getTeamMobileMoneyNo();
        this.pagtStatus = "Active".equals(patb.getTeamStatus()) ? "ACTIVE":"TERMINATED";
        this.pagtAcctNo = patb.getTeamBankBranchAccount();
        this.pagtRegDt = patb.getTeamDate() == null ? "1900-01-01":patb.getTeamDate();
        this.pagtCrtDt = patb.getTeamDate() == null ? "1900-01-01":patb.getTeamDate();
        this.pagtEmail = patb.getTeamEmail();
        this.pagtPhoto = "agent_images/no_image.png";
        this.pagtExitDt = "2021-04-01";
        this.pagtMaritalSts = "Single";
        this.pagtBfitStdt = patb.getTeamBenefitStartDate()== null ? "1900-01-01": patb.getTeamBenefitStartDate();
        this.pagtEntSource = "Retail";
        this.pagtUsed = "N";
        this.pagtLevel = "S.Mgr";
        this.pagtHierarchy = "Team Leader";
        this.pagtSubbranchSysid = patb.getTeamBranch()== null? 94: Integer.parseInt(patb.getTeamBranch());
    }
   
   public ProductAgentsModel(EazylifeTeamTbModel patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(0, 43, patb.getTeamBranch()== null? 0: Integer.parseInt(patb.getTeamBranch()), 24, 2040, 2, 2);
        this.pagtReportId = 1;
        this.pagtReportMgr = patb.getTeamName().toUpperCase();
        this.pagtCode = "0000";
        String[] names = patb.getTeamName().split(" ");
        this.pagtSurname = names.length >= 2 ? patb.getTeamName().substring(0, patb.getTeamName().indexOf(' ')).toUpperCase(): patb.getTeamName().toUpperCase();
        this.pagtOthname = names.length >= 2 ? patb.getTeamName().substring(patb.getTeamName().indexOf(' ') + 1).toUpperCase() : patb.getTeamName().toUpperCase();
        this.pagtGender = patb.getTeamGender() == null ? "N/A": patb.getTeamGender();
        this.pagtDob = patb.getTeamDateOfBirth() == null ? "1900-01-01": patb.getTeamDateOfBirth();
        this.pagtAddrs = patb.getTeamAddress();
        this.pagtMobile = patb.getTeamMobileNo();
        this.pagtMomoNo = patb.getTeamMobileMoneyNo();
        this.pagtStatus = "Active".equals(patb.getTeamStatus()) ? "ACTIVE":"TERMINATED";
        this.pagtAcctNo = patb.getTeamBankBranchAccount();
        this.pagtRegDt = patb.getTeamDate() == null ? "1900-01-01":patb.getTeamDate();
        this.pagtCrtDt = patb.getTeamDate() == null ? "1900-01-01":patb.getTeamDate();
        this.pagtEmail = patb.getTeamEmail();
        this.pagtPhoto = "agent_images/no_image.png";
        this.pagtExitDt = "2021-04-01";
        this.pagtMaritalSts = "Single";
        this.pagtBfitStdt = patb.getTeamBenefitStartDate()== null ? "1900-01-01": patb.getTeamBenefitStartDate();
        this.pagtEntSource = "Retail";
        this.pagtUsed = "N";
        this.pagtLevel = "S.Mgr";
        this.pagtHierarchy = "Team Leader";
        this.pagtSubbranchSysid = patb.getTeamBranch()== null? 94: Integer.parseInt(patb.getTeamBranch());
    } 
   
   public ProductAgentsModel(AosAgentsTbModel patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(0, 43, patb.getAgentsBranch()== null? 0:Integer.parseInt(patb.getAgentsBranch()), 24, 2040, 1, 1);
        this.pagtReportId = 0;
        this.pagtReportMgr = patb.getAgentsName().toUpperCase();
        this.pagtCode = patb.getAgentsId();
        String[] names = patb.getAgentsName().split(" ");
        this.pagtSurname = names.length >= 2 ? patb.getAgentsName().substring(0, patb.getAgentsName().indexOf(' ')).toUpperCase(): patb.getAgentsName().toUpperCase();
        this.pagtOthname = names.length >= 2 ? patb.getAgentsName().substring(patb.getAgentsName().indexOf(' ') + 1).toUpperCase() : patb.getAgentsName().toUpperCase();
        this.pagtGender = patb.getAgentsGender()== null ? "N/A": patb.getAgentsGender();
        this.pagtDob = patb.getAgentsDateOfBirth() == null ? "1900-01-01": patb.getAgentsDateOfBirth();
        this.pagtAddrs = patb.getAgentsAddress();
        this.pagtMobile = patb.getAgentsMobileNo();
        this.pagtMomoNo = patb.getAgentsMobileMoneyNo();
        this.pagtStatus = "Active".equals(patb.getAgentsStatus()) ? "ACTIVE":"TERMINATED";
        this.pagtAcctNo = patb.getAgentsBankBranchAccount();
        this.pagtRegDt = patb.getAgentsRegistrationDate() == null ? "1900-01-01":  patb.getAgentsRegistrationDate();
        this.pagtCrtDt = patb.getAgentsInputdate()  == null ? "1900-01-01": patb.getAgentsInputdate();
        this.pagtEmail = patb.getAgentsEmail();
        this.pagtPhoto = "agent_images/no_image.png";
        this.pagtExitDt = "2021-04-01";
        this.pagtMaritalSts = "Single";
        this.pagtBfitStdt = patb.getAgentsBenefitStartDate() == null ? "1900-01-01": patb.getAgentsBenefitStartDate();
        this.pagtEntSource = "Micro";
        this.pagtUsed = "N";
        this.pagtLevel = "Agent";
        this.pagtHierarchy = "Agent";
        this.pagtSubbranchSysid = patb.getAgentsBranch()== null? 0:Integer.parseInt(patb.getAgentsBranch());
    } 
   
   public ProductAgentsModel(EasyappAgentsTbModel patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(0, 43, patb.getAgentsBranch()== null? 0:Integer.parseInt(patb.getAgentsBranch()), 24, 2040, 1, 1);
        this.pagtReportId = 0;
        this.pagtReportMgr = patb.getAgentsName().toUpperCase();
        this.pagtCode = patb.getAgentsId();
        String[] names = patb.getAgentsName().split(" ");
        this.pagtSurname = names.length >= 2 ? patb.getAgentsName().substring(0, patb.getAgentsName().indexOf(' ')).toUpperCase(): patb.getAgentsName().toUpperCase();
        this.pagtOthname = names.length >= 2 ? patb.getAgentsName().substring(patb.getAgentsName().indexOf(' ') + 1).toUpperCase() : patb.getAgentsName().toUpperCase();
        this.pagtGender = patb.getAgentsGender()== null ? "N/A": patb.getAgentsGender();
        this.pagtDob = patb.getAgentsDateOfBirth() == null ? "1900-01-01": patb.getAgentsDateOfBirth();
        this.pagtAddrs = patb.getAgentsAddress();
        this.pagtMobile = patb.getAgentsMobileNo();
        this.pagtMomoNo = patb.getAgentsMobileMoneyNo();
        this.pagtStatus = "Active".equals(patb.getAgentsStatus()) ? "ACTIVE":"TERMINATED";
        this.pagtAcctNo = patb.getAgentsBankBranchAccount();
        this.pagtRegDt = patb.getAgentsRegistrationDate() == null ? "1900-01-01":  patb.getAgentsRegistrationDate();
        this.pagtCrtDt = patb.getAgentsInputdate()  == null ? "1900-01-01": patb.getAgentsInputdate();
        this.pagtEmail = patb.getAgentsEmail();
        this.pagtPhoto = "agent_images/no_image.png";
        this.pagtExitDt = "2021-04-01";
        this.pagtMaritalSts = "Single";
        this.pagtBfitStdt = patb.getAgentsBenefitStartDate() == null ? "1900-01-01": patb.getAgentsBenefitStartDate();
        this.pagtEntSource = "Retail";
        this.pagtUsed = "N";
        this.pagtLevel = "Agent";
        this.pagtHierarchy = "Agent";
        this.pagtSubbranchSysid = patb.getAgentsBranch()== null? 0:Integer.parseInt(patb.getAgentsBranch());
    } 
   
   public ProductAgentsModel(EazylifeAgentsTbModel patb) {
        this.productAgentsTbPK = new ProductAgentsPKModel(0, 43, patb.getAgentsBranch()== null? 0:Integer.parseInt(patb.getAgentsBranch()), 24, 2040, 1, 1);
        this.pagtReportId = 0;
        this.pagtReportMgr = patb.getAgentsName().toUpperCase();
        this.pagtCode = patb.getAgentsId();
        String[] names = patb.getAgentsName().split(" ");
        this.pagtSurname = names.length >= 2 ? patb.getAgentsName().substring(0, patb.getAgentsName().indexOf(' ')).toUpperCase(): patb.getAgentsName().toUpperCase();
        this.pagtOthname = names.length >= 2 ? patb.getAgentsName().substring(patb.getAgentsName().indexOf(' ') + 1).toUpperCase() : patb.getAgentsName().toUpperCase();
        this.pagtGender = patb.getAgentsGender()== null ? "N/A": patb.getAgentsGender();
        this.pagtDob = patb.getAgentsDateOfBirth() == null ? "1900-01-01": patb.getAgentsDateOfBirth();
        this.pagtAddrs = patb.getAgentsAddress();
        this.pagtMobile = patb.getAgentsMobileNo();
        this.pagtMomoNo = patb.getAgentsMobileMoneyNo();
        this.pagtStatus = "Active".equals(patb.getAgentsStatus()) ? "ACTIVE":"TERMINATED";
        this.pagtAcctNo = patb.getAgentsBankBranchAccount();
        this.pagtRegDt = patb.getAgentsRegistrationDate() == null ? "1900-01-01":  patb.getAgentsRegistrationDate();
        this.pagtCrtDt = patb.getAgentsInputdate()  == null ? "1900-01-01": patb.getAgentsInputdate();
        this.pagtEmail = patb.getAgentsEmail();
        this.pagtPhoto = "agent_images/no_image.png";
        this.pagtExitDt = "2021-04-01";
        this.pagtMaritalSts = "Single";
        this.pagtBfitStdt = patb.getAgentsBenefitStartDate() == null ? "1900-01-01": patb.getAgentsBenefitStartDate();
        this.pagtEntSource = "Retail";
        this.pagtUsed = "N";
        this.pagtLevel = "Agent";
        this.pagtHierarchy = "Agent";
        this.pagtSubbranchSysid = patb.getAgentsBranch()== null? 0:Integer.parseInt(patb.getAgentsBranch());
    } 

    public ProductAgentsPKModel getProductAgentsTbPK() {
        return productAgentsTbPK;
    }

    public void setProductAgentsTbPK(ProductAgentsPKModel productAgentsTbPK) {
        this.productAgentsTbPK = productAgentsTbPK;
    }

    public int getPagtReportId() {
        return pagtReportId;
    }

    public void setPagtReportId(int pagtReportId) {
        this.pagtReportId = pagtReportId;
    }

    public String getPagtReportMgr() {
        return pagtReportMgr;
    }

    public void setPagtReportMgr(String pagtReportMgr) {
        this.pagtReportMgr = pagtReportMgr;
    }

    public String getPagtCode() {
        return pagtCode;
    }

    public void setPagtCode(String pagtCode) {
        this.pagtCode = pagtCode;
    }

    public String getPagtSurname() {
        return pagtSurname;
    }

    public void setPagtSurname(String pagtSurname) {
        this.pagtSurname = pagtSurname;
    }

    public String getPagtOthname() {
        return pagtOthname;
    }

    public void setPagtOthname(String pagtOthname) {
        this.pagtOthname = pagtOthname;
    }

    public String getPagtGender() {
        return pagtGender;
    }

    public void setPagtGender(String pagtGender) {
        this.pagtGender = pagtGender;
    }

    public String getPagtDob() {
        return pagtDob;
    }

    public void setPagtDob(String pagtDob) {
        this.pagtDob = pagtDob;
    }

    public String getPagtAddrs() {
        return pagtAddrs;
    }

    public void setPagtAddrs(String pagtAddrs) {
        this.pagtAddrs = pagtAddrs;
    }

    public String getPagtMobile() {
        return pagtMobile;
    }

    public void setPagtMobile(String pagtMobile) {
        this.pagtMobile = pagtMobile;
    }

    public String getPagtMomoNo() {
        return pagtMomoNo;
    }

    public void setPagtMomoNo(String pagtMomoNo) {
        this.pagtMomoNo = pagtMomoNo;
    }

    public String getPagtStatus() {
        return pagtStatus;
    }

    public void setPagtStatus(String pagtStatus) {
        this.pagtStatus = pagtStatus;
    }

    public String getPagtAcctNo() {
        return pagtAcctNo;
    }

    public void setPagtAcctNo(String pagtAcctNo) {
        this.pagtAcctNo = pagtAcctNo;
    }

    public String getPagtRegDt() {
        return pagtRegDt;
    }

    public void setPagtRegDt(String pagtRegDt) {
        this.pagtRegDt = pagtRegDt;
    }

    public String getPagtCrtDt() {
        return pagtCrtDt;
    }

    public void setPagtCrtDt(String pagtCrtDt) {
        this.pagtCrtDt = pagtCrtDt;
    }

    public String getPagtEmail() {
        return pagtEmail;
    }

    public void setPagtEmail(String pagtEmail) {
        this.pagtEmail = pagtEmail;
    }

    public String getPagtPhoto() {
        return pagtPhoto;
    }

    public void setPagtPhoto(String pagtPhoto) {
        this.pagtPhoto = pagtPhoto;
    }

    public String getPagtExitDt() {
        return pagtExitDt;
    }

    public void setPagtExitDt(String pagtExitDt) {
        this.pagtExitDt = pagtExitDt;
    }

    public String getPagtMaritalSts() {
        return pagtMaritalSts;
    }

    public void setPagtMaritalSts(String pagtMaritalSts) {
        this.pagtMaritalSts = pagtMaritalSts;
    }

    public String getPagtBfitStdt() {
        return pagtBfitStdt;
    }

    public void setPagtBfitStdt(String pagtBfitStdt) {
        this.pagtBfitStdt = pagtBfitStdt;
    }

    public String getPagtEntSource() {
        return pagtEntSource;
    }

    public void setPagtEntSource(String pagtEntSource) {
        this.pagtEntSource = pagtEntSource;
    }

    public String getPagtUsed() {
        return pagtUsed;
    }

    public void setPagtUsed(String pagtUsed) {
        this.pagtUsed = pagtUsed;
    }

    public String getPagtLevel() {
        return pagtLevel;
    }

    public void setPagtLevel(String pagtLevel) {
        this.pagtLevel = pagtLevel;
    }

    public String getPagtHierarchy() {
        return pagtHierarchy;
    }

    public void setPagtHierarchy(String pagtHierarchy) {
        this.pagtHierarchy = pagtHierarchy;
    }

    public int getPagtSubbranchSysid() {
        return pagtSubbranchSysid;
    }

    public void setPagtSubbranchSysid(int pagtSubbranchSysid) {
        this.pagtSubbranchSysid = pagtSubbranchSysid;
    }

    @Override
    public String toString() {
        return "ProductAgentsModel{" + "productAgentsTbPK=" + productAgentsTbPK + ", pagtReportId=" + pagtReportId + ", pagtReportMgr=" + pagtReportMgr + ", pagtCode=" + pagtCode + ", pagtSurname=" + pagtSurname + ", pagtOthname=" + pagtOthname + ", pagtGender=" + pagtGender + ", pagtDob=" + pagtDob + ", pagtAddrs=" + pagtAddrs + ", pagtMobile=" + pagtMobile + ", pagtMomoNo=" + pagtMomoNo + ", pagtStatus=" + pagtStatus + ", pagtAcctNo=" + pagtAcctNo + ", pagtRegDt=" + pagtRegDt + ", pagtCrtDt=" + pagtCrtDt + ", pagtEmail=" + pagtEmail + ", pagtPhoto=" + pagtPhoto + ", pagtExitDt=" + pagtExitDt + ", pagtMaritalSts=" + pagtMaritalSts + ", pagtBfitStdt=" + pagtBfitStdt + ", pagtEntSource=" + pagtEntSource + ", pagtUsed=" + pagtUsed + ", pagtLevel=" + pagtLevel + ", pagtHierarchy=" + pagtHierarchy + ", pagtSubbranchSysid=" + pagtSubbranchSysid + '}';
    }
   
   
}
