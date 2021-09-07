/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolhDetl;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Developer
 */
public class PolhDetlModel {
    PolhDetlPKModel polhDetlPK;
    int polhPlnSysid;
    String polhPrtCode;
    String polhPlnCode;
    String polhBussSrc;
    String polhOff;
    String polhNum;
    String polhRef;
    String polhOldNum1;
    String polhOldNum2;
    String polhOldNum3;
    String polhIssuDt;
    String polhEntryDt;
    String polhAcceptDt;
    String polhStDt;
    String polhEndDt;
    String polhSysDt;
    String polhDudtDt;
    String polhTxnSts;
    String polhCurr;
    String polhUw;
    String polhCusCode;
    Integer polhTnr;
    Integer polhUwyr;
    BigDecimal polhSiBc;
    BigDecimal polhDiscBc;
    BigDecimal polhLoadBc;
    BigDecimal polhFeesBc;
    BigDecimal polhAddPremBc;
    BigDecimal polhInvestPremBc;
    BigDecimal adder;
    String polhAprvYn;
    String polhAprvDt;
    String polhAprvBy;
    String polhCreUserBy;
    String polhCreDt;
    String polhUpdUserBy;
    String polhUpdDt;
    BigDecimal polhGrossModPremBc;
    BigDecimal polhNetModPremBc;
    String polhAgnt1;
    String polhOvriAgnt2;
    String polhOvriAgnt3;
    String polhOvriAgnt4;
    String polhOvriAgnt5;
    String polhEscPlan;
    BigDecimal polhEscSa;
    BigDecimal polhEscPrem;
    BigDecimal polhSuspAmt;
    BigDecimal polhTotalPrem;
    String polhLpsDt;
    String polhAnnvDt;
    String polhSignature;
    String polhSts;
    String polhAlisNo;
    String polhPerferedMode;
    String polhNarration;
    String polhCaption;
    String polhResponse;
    String polhNextDue; 
    String polhLastPaydt;
    String polhLastRecno;
    DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MMMyy");

    public PolhDetlModel() {
        this.polhDetlPK = new PolhDetlPKModel();
    }
    
    public PolhDetlModel(AosPolicyDetailsModel aosmodel) {
        this.polhDetlPK = new PolhDetlPKModel(0, 0, 0, 0);
        this.polhPlnSysid = 0;
        this.polhPrtCode = "";
        this.polhPlnCode = "";
        this.polhBussSrc = null;
        this.polhOff = "";
        this.polhNum = aosmodel.getProductMainPolicyNo();
        this.polhRef = aosmodel.getProductrRefNo();
        this.polhOldNum1 = null;
        this.polhOldNum2 = null;
        this.polhOldNum3 = null;
        this.polhIssuDt = aosmodel.getProductMainPolicyAcceptedDate();
        this.polhEntryDt = aosmodel.getProductMainInputdate() != null ? aosmodel.getProductMainInputdate().substring(0, 19): aosmodel.getProductMainInputdate();
        this.polhAcceptDt = aosmodel.getProductMainPolicyAcceptedDate();
        this.polhStDt = aosmodel.getProductMainStDt();
        this.polhEndDt = aosmodel.getProductMainStDt() != null ? LocalDate.parse(aosmodel.getProductMainStDt()).plusYears(Integer.parseInt(aosmodel.getProductMainPolicyTerm())).minusDays(1).toString(): aosmodel.getProductMainStDt();
        this.polhSysDt = this.polhEntryDt;
        this.polhDudtDt = this.polhSysDt != null ? LocalDate.parse(this.polhSysDt, inputFormat).format(outputFormat).toUpperCase(): this.polhSysDt;
        this.polhTxnSts = "APPR";
        this.polhCurr = "GHS";
        this.polhUw = "";
        this.polhCusCode = "";
        this.polhTnr = Integer.parseInt(aosmodel.getProductMainPolicyTerm());
        this.polhUwyr = LocalDateTime.parse(this.polhEntryDt, inputFormat).getYear();
        this.polhSiBc = new BigDecimal(BigInteger.ZERO);
        this.polhDiscBc = new BigDecimal(BigInteger.ZERO);
        this.polhLoadBc = new BigDecimal(BigInteger.ZERO);
        this.polhFeesBc = new BigDecimal(BigInteger.ZERO);
        this.polhAddPremBc = new BigDecimal(BigInteger.ZERO);
        this.polhInvestPremBc = new BigDecimal(aosmodel.getProductMainSusu() == null || "".equals(aosmodel.getProductMainSusu()) ? "0.00" : aosmodel.getProductMainSusu());
        this.adder = new BigDecimal(Double.parseDouble(aosmodel.getProductMainSusu() == null || "".equals(aosmodel.getProductMainSusu()) ? "0.00" : aosmodel.getProductMainSusu()) * (aosmodel.getProductMainPaymentFreq().contains("D") ? 30: aosmodel.getProductMainPaymentFreq().contains("W") ? 4: 1));
        this.polhAprvYn = "Y";
        this.polhAprvDt = null;
        this.polhAprvBy = null;
        this.polhCreUserBy = "";
        this.polhCreDt = aosmodel.getProductMainInputdate();
        this.polhUpdUserBy = null;
        this.polhUpdDt = null;
        this.polhGrossModPremBc = this.adder.add(new BigDecimal(aosmodel.getProductMainPremium() == null || "".equals(aosmodel.getProductMainPremium()) ? "0.00": aosmodel.getProductMainPremium()));
        this.polhNetModPremBc = this.adder.add(new BigDecimal(aosmodel.getProductMainPremium() == null || "".equals(aosmodel.getProductMainPremium()) ? "0.00": aosmodel.getProductMainPremium()));
        this.polhAgnt1 = "";
        this.polhOvriAgnt2 = "";
        this.polhOvriAgnt3 = null;
        this.polhOvriAgnt4 = null;
        this.polhOvriAgnt5 = null;
        this.polhEscPlan = null;
        this.polhEscSa = new BigDecimal(BigInteger.ZERO);
        this.polhEscPrem = new BigDecimal(BigInteger.ZERO);
        this.polhSuspAmt = new BigDecimal(BigInteger.ZERO);
        this.polhTotalPrem = new BigDecimal(BigInteger.ZERO);
        this.polhLpsDt = null;
        this.polhAnnvDt = "".equals(this.polhStDt) || this.polhStDt == null ? null : (1900 + new Date().getYear()) + this.polhStDt.substring(4);
        this.polhSignature = null;
        this.polhSts = "Accepted".equals(aosmodel.getProductMainPolicyStatus()) && this.polhStDt != null ? "I":"Canceled".equals(aosmodel.getProductMainPolicyStatus()) ? "C":"N";
        this.polhAlisNo = null;
        this.polhPerferedMode = "1";
        this.polhNarration = null;
        this.polhCaption = aosmodel.getProductMainTelco();
        this.polhResponse = null;
        this.polhNextDue = null;
        this.polhLastPaydt = null;
        this.polhLastRecno = null;
    }
    
    public PolhDetlModel(EazyappPolicyDetailsModel aosmodel) {
        this.polhDetlPK = new PolhDetlPKModel(0, 0, 0, 0);
        this.polhPlnSysid = 0;
        this.polhPrtCode = "";
        this.polhPlnCode = "";
        this.polhBussSrc = null;
        this.polhOff = "";
        this.polhNum = aosmodel.getProductMainPolicyNo();
        this.polhRef = aosmodel.getProductrRefNo();
        this.polhOldNum1 = null;
        this.polhOldNum2 = null;
        this.polhOldNum3 = null;
        aosmodel.setProductMainPolicyTerm("10");
        this.polhIssuDt = aosmodel.getProductMainPolicyAcceptedDate();
        this.polhEntryDt = aosmodel.getProductMainInputdate() != null ? aosmodel.getProductMainInputdate().substring(0, 19): aosmodel.getProductMainInputdate();
        this.polhAcceptDt = aosmodel.getProductMainPolicyAcceptedDate();
        this.polhStDt = aosmodel.getProductMainStDt();
        this.polhEndDt = aosmodel.getProductMainStDt() != null ? LocalDate.parse(aosmodel.getProductMainStDt()).plusYears(Integer.parseInt(aosmodel.getProductMainPolicyTerm())).minusDays(1).toString(): aosmodel.getProductMainStDt();
        this.polhSysDt = this.polhEntryDt;
        this.polhDudtDt = this.polhSysDt != null ? LocalDate.parse(this.polhSysDt, inputFormat).format(outputFormat).toUpperCase(): this.polhSysDt;
        this.polhTxnSts = "APPR";
        this.polhCurr = "GHS";
        this.polhUw = "";
        this.polhCusCode = "";
        this.polhTnr = Integer.parseInt(aosmodel.getProductMainPolicyTerm());
        this.polhUwyr = LocalDateTime.parse(this.polhEntryDt, inputFormat).getYear();
        this.polhSiBc = new BigDecimal(BigInteger.ZERO);
        this.polhDiscBc = new BigDecimal(BigInteger.ZERO);
        this.polhLoadBc = new BigDecimal(BigInteger.ZERO);
        this.polhFeesBc = new BigDecimal(BigInteger.ZERO);
        this.polhAddPremBc = new BigDecimal(BigInteger.ZERO);
        this.polhInvestPremBc = new BigDecimal(BigInteger.ZERO);
        this.polhAprvYn = "Y";
        this.polhAprvDt = null;
        this.polhAprvBy = null;
        this.polhCreUserBy = "";
        this.polhCreDt = aosmodel.getProductMainInputdate();
        this.polhUpdUserBy = null;
        this.polhUpdDt = null;
        this.polhGrossModPremBc = new BigDecimal(aosmodel.getProductMainPremium() == null || "".equals(aosmodel.getProductMainPremium()) ? "0.00":aosmodel.getProductMainPremium());
        this.polhNetModPremBc = new BigDecimal(aosmodel.getProductMainPremium() == null || "".equals(aosmodel.getProductMainPremium()) ? "0.00":aosmodel.getProductMainPremium());
        this.polhAgnt1 = "";
        this.polhOvriAgnt2 = "";
        this.polhOvriAgnt3 = null;
        this.polhOvriAgnt4 = null;
        this.polhOvriAgnt5 = null;
        this.polhEscPlan = null;
        this.polhEscSa = new BigDecimal(BigInteger.ZERO);
        this.polhEscPrem = new BigDecimal(BigInteger.ZERO);
        this.polhSuspAmt = new BigDecimal(BigInteger.ZERO);
        this.polhTotalPrem = new BigDecimal(BigInteger.ZERO);
        this.polhLpsDt = null;
        this.polhAnnvDt = "".equals(this.polhStDt) || this.polhStDt == null ? null : (1900 + new Date().getYear()) + this.polhStDt.substring(4);
        this.polhSignature = null;
        this.polhSts = "Accepted".equals(aosmodel.getProductMainPolicyStatus()) && this.polhStDt != null ? "I":"Canceled".equals(aosmodel.getProductMainPolicyStatus()) ? "C":"N";
        this.polhAlisNo = null;
        this.polhPerferedMode = "1";
        this.polhNarration = null;
        this.polhCaption = aosmodel.getProductMainTelco();
        this.polhResponse = null;
        this.polhNextDue = null;
        this.polhLastPaydt = null;
        this.polhLastRecno = null;
    }
    
    public PolhDetlModel(EazylifePolicyDetailsModel aosmodel) {
        this.polhDetlPK = new PolhDetlPKModel(0, 0, 0, 0);
        this.polhPlnSysid = 0;
        this.polhPrtCode = "";
        this.polhPlnCode = "";
        this.polhBussSrc = null;
        this.polhOff = "";
        this.polhNum = aosmodel.getProductMainPolicyNo();
        this.polhRef = aosmodel.getProductrRefNo();
        this.polhOldNum1 = null;
        this.polhOldNum2 = null;
        this.polhOldNum3 = null;
        aosmodel.setProductMainPolicyTerm("10");
        this.polhIssuDt = aosmodel.getProductMainPolicyAcceptedDate();
        this.polhEntryDt = aosmodel.getProductMainInputdate() != null ? aosmodel.getProductMainInputdate().substring(0, 19): aosmodel.getProductMainInputdate();
        this.polhAcceptDt = aosmodel.getProductMainPolicyAcceptedDate();
        this.polhStDt = null;
        this.polhEndDt = null;
        this.polhSysDt = this.polhEntryDt;
        this.polhDudtDt = this.polhSysDt != null ? LocalDate.parse(this.polhSysDt, inputFormat).format(outputFormat).toUpperCase(): this.polhSysDt;
        this.polhTxnSts = "APPR";
        this.polhCurr = "GHS";
        this.polhUw = "";
        this.polhCusCode = "";
        this.polhTnr = Integer.parseInt(aosmodel.getProductMainPolicyTerm());
        this.polhUwyr = this.polhEntryDt == null ? null : LocalDateTime.parse(this.polhEntryDt, inputFormat).getYear();
        this.polhSiBc = new BigDecimal(BigInteger.ZERO);
        this.polhDiscBc = new BigDecimal(BigInteger.ZERO);
        this.polhLoadBc = new BigDecimal(BigInteger.ZERO);
        this.polhFeesBc = new BigDecimal(BigInteger.ZERO);
        this.polhAddPremBc = new BigDecimal(BigInteger.ZERO);
        this.polhInvestPremBc = new BigDecimal(BigInteger.ZERO);
        this.polhAprvYn = "Y";
        this.polhAprvDt = null;
        this.polhAprvBy = null;
        this.polhCreUserBy = "";
        this.polhCreDt = aosmodel.getProductMainInputdate();
        this.polhUpdUserBy = null;
        this.polhUpdDt = null;
        this.polhGrossModPremBc = new BigDecimal(aosmodel.getProductMainPremium() == null || "".equals(aosmodel.getProductMainPremium()) ? "0.00":aosmodel.getProductMainPremium());
        this.polhNetModPremBc = new BigDecimal(aosmodel.getProductMainPremium() == null || "".equals(aosmodel.getProductMainPremium()) ? "0.00":aosmodel.getProductMainPremium());
        this.polhAgnt1 = "";
        this.polhOvriAgnt2 = "";
        this.polhOvriAgnt3 = null;
        this.polhOvriAgnt4 = null;
        this.polhOvriAgnt5 = null;
        this.polhEscPlan = null;
        this.polhEscSa = new BigDecimal(BigInteger.ZERO);
        this.polhEscPrem = new BigDecimal(BigInteger.ZERO);
        this.polhSuspAmt = new BigDecimal(BigInteger.ZERO);
        this.polhTotalPrem = new BigDecimal(BigInteger.ZERO);
        this.polhLpsDt = null;
        this.polhAnnvDt = "".equals(this.polhStDt) || this.polhStDt == null ? null : (1900 + new Date().getYear()) + this.polhStDt.substring(4);
        this.polhSignature = null;
        this.polhSts = "Accepted".equals(aosmodel.getProductMainPolicyStatus()) && this.polhStDt != null ? "I":"Canceled".equals(aosmodel.getProductMainPolicyStatus()) ? "C":"N";
        this.polhAlisNo = null;
        this.polhPerferedMode = "1";
        this.polhNarration = null;
        this.polhCaption = aosmodel.getProductMainTelco();
        this.polhResponse = null;
        this.polhNextDue = null;
        this.polhLastPaydt = null;
        this.polhLastRecno = null;
    }
    
    public PolhDetlModel(PolhDetl pdetail) {
        this.polhDetlPK = new PolhDetlPKModel(pdetail.getPolhDetlPK());
        this.polhPlnSysid = pdetail.getPolhPlnSysid();
        this.polhPrtCode = pdetail.getPolhPrtCode();
        this.polhPlnCode = pdetail.getPolhPlnCode();
        this.polhBussSrc = pdetail.getPolhBussSrc();
        this.polhOff = pdetail.getPolhOff();
        this.polhNum = pdetail.getPolhNum();
        this.polhRef = pdetail.getPolhRef();
        this.polhOldNum1 = pdetail.getPolhOldNum1();
        this.polhOldNum2 = pdetail.getPolhOldNum2();
        this.polhOldNum3 = pdetail.getPolhOldNum3();
        this.polhIssuDt = pdetail.getPolhIssuDt();
        this.polhEntryDt = pdetail.getPolhEntryDt();
        this.polhAcceptDt = pdetail.getPolhAcceptDt();
        this.polhStDt = pdetail.getPolhStDt();
        this.polhEndDt = pdetail.getPolhEndDt();
        this.polhSysDt = pdetail.getPolhSysDt();
        this.polhDudtDt = pdetail.getPolhDudtDt();
        this.polhTxnSts = pdetail.getPolhTxnSts();
        this.polhCurr = pdetail.getPolhCurr();
        this.polhUw = pdetail.getPolhUw();
        this.polhCusCode = pdetail.getPolhCusCode();
        this.polhTnr = pdetail.getPolhTnr();
        this.polhUwyr = pdetail.getPolhUwyr();
        this.polhSiBc = pdetail.getPolhSiBc();
        this.polhDiscBc = pdetail.getPolhDiscBc();
        this.polhLoadBc = pdetail.getPolhLoadBc();
        this.polhFeesBc = pdetail.getPolhFeesBc();
        this.polhAddPremBc = pdetail.getPolhAddPremBc();
        this.polhInvestPremBc = pdetail.getPolhInvestPremBc();
        this.polhAprvYn = pdetail.getPolhAprvYn();
        this.polhAprvDt = pdetail.getPolhAprvDt();
        this.polhAprvBy = pdetail.getPolhAprvBy();
        this.polhCreUserBy = pdetail.getPolhCreUserBy();
        this.polhCreDt = pdetail.getPolhCreDt();
        this.polhUpdUserBy = pdetail.getPolhUpdUserBy();
        this.polhUpdDt = pdetail.getPolhUpdDt();
        this.polhGrossModPremBc = pdetail.getPolhGrossModPremBc();
        this.polhNetModPremBc = pdetail.getPolhNetModPremBc();
        this.polhAgnt1 = pdetail.getPolhAgnt1();
        this.polhOvriAgnt2 = pdetail.getPolhOvriAgnt2();
        this.polhOvriAgnt3 = pdetail.getPolhOvriAgnt3();
        this.polhOvriAgnt4 = pdetail.getPolhOvriAgnt4();
        this.polhOvriAgnt5 = pdetail.getPolhOvriAgnt5();
        this.polhEscPlan = pdetail.getPolhEscPlan();
        this.polhEscSa = pdetail.getPolhEscSa();
        this.polhEscPrem = pdetail.getPolhEscPrem();
        this.polhSuspAmt = pdetail.getPolhSuspAmt();
        this.polhTotalPrem = pdetail.getPolhTotalPrem();
        this.polhLpsDt = pdetail.getPolhLpsDt();
        this.polhAnnvDt = pdetail.getPolhAnnvDt();
        this.polhSignature = pdetail.getPolhSignature();
        this.polhSts = pdetail.getPolhSts();
        this.polhAlisNo = pdetail.getPolhAlisNo();
        this.polhPerferedMode = pdetail.getPolhPerferedMode();
        this.polhNarration = pdetail.getPolhNarration();
        this.polhCaption = pdetail.getPolhCaption();
        this.polhResponse = pdetail.getPolhResponse();
        this.polhNextDue = pdetail.getPolhNextDue();
        this.polhLastPaydt = pdetail.getPolhLastPaydt();
        this.polhLastRecno = pdetail.getPolhLastRecno();
    }

    public PolhDetlPKModel getPolhDetlPK() {
        return polhDetlPK;
    }

    public void setPolhDetlPK(PolhDetlPKModel polhDetlPK) {
        this.polhDetlPK = polhDetlPK;
    }

    public int getPolhPlnSysid() {
        return polhPlnSysid;
    }

    public void setPolhPlnSysid(int polhPlnSysid) {
        this.polhPlnSysid = polhPlnSysid;
    }

    public String getPolhPrtCode() {
        return polhPrtCode;
    }

    public void setPolhPrtCode(String polhPrtCode) {
        this.polhPrtCode = polhPrtCode;
    }

    public String getPolhPlnCode() {
        return polhPlnCode;
    }

    public void setPolhPlnCode(String polhPlnCode) {
        this.polhPlnCode = polhPlnCode;
    }

    public String getPolhBussSrc() {
        return polhBussSrc;
    }

    public void setPolhBussSrc(String polhBussSrc) {
        this.polhBussSrc = polhBussSrc;
    }

    public String getPolhOff() {
        return polhOff;
    }

    public void setPolhOff(String polhOff) {
        this.polhOff = polhOff;
    }

    public String getPolhNum() {
        return polhNum;
    }

    public void setPolhNum(String polhNum) {
        this.polhNum = polhNum;
    }

    public String getPolhRef() {
        return polhRef;
    }

    public void setPolhRef(String polhRef) {
        this.polhRef = polhRef;
    }

    public String getPolhOldNum1() {
        return polhOldNum1;
    }

    public void setPolhOldNum1(String polhOldNum1) {
        this.polhOldNum1 = polhOldNum1;
    }

    public String getPolhOldNum2() {
        return polhOldNum2;
    }

    public void setPolhOldNum2(String polhOldNum2) {
        this.polhOldNum2 = polhOldNum2;
    }

    public String getPolhOldNum3() {
        return polhOldNum3;
    }

    public void setPolhOldNum3(String polhOldNum3) {
        this.polhOldNum3 = polhOldNum3;
    }

    public String getPolhIssuDt() {
        return polhIssuDt;
    }

    public void setPolhIssuDt(String polhIssuDt) {
        this.polhIssuDt = polhIssuDt;
    }

    public String getPolhEntryDt() {
        return polhEntryDt;
    }

    public void setPolhEntryDt(String polhEntryDt) {
        this.polhEntryDt = polhEntryDt;
    }

    public String getPolhAcceptDt() {
        return polhAcceptDt;
    }

    public void setPolhAcceptDt(String polhAcceptDt) {
        this.polhAcceptDt = polhAcceptDt;
    }

    public String getPolhStDt() {
        return polhStDt;
    }

    public void setPolhStDt(String polhStDt) {
        this.polhStDt = polhStDt;
    }

    public String getPolhEndDt() {
        return polhEndDt;
    }

    public void setPolhEndDt(String polhEndDt) {
        this.polhEndDt = polhEndDt;
    }

    public String getPolhSysDt() {
        return polhSysDt;
    }

    public void setPolhSysDt(String polhSysDt) {
        this.polhSysDt = polhSysDt;
    }

    public String getPolhDudtDt() {
        return polhDudtDt;
    }

    public void setPolhDudtDt(String polhDudtDt) {
        this.polhDudtDt = polhDudtDt;
    }

    public String getPolhTxnSts() {
        return polhTxnSts;
    }

    public void setPolhTxnSts(String polhTxnSts) {
        this.polhTxnSts = polhTxnSts;
    }

    public String getPolhCurr() {
        return polhCurr;
    }

    public void setPolhCurr(String polhCurr) {
        this.polhCurr = polhCurr;
    }

    public String getPolhUw() {
        return polhUw;
    }

    public void setPolhUw(String polhUw) {
        this.polhUw = polhUw;
    }

    public String getPolhCusCode() {
        return polhCusCode;
    }

    public void setPolhCusCode(String polhCusCode) {
        this.polhCusCode = polhCusCode;
    }

    public Integer getPolhTnr() {
        return polhTnr;
    }

    public void setPolhTnr(Integer polhTnr) {
        this.polhTnr = polhTnr;
    }

    public Integer getPolhUwyr() {
        return polhUwyr;
    }

    public void setPolhUwyr(Integer polhUwyr) {
        this.polhUwyr = polhUwyr;
    }

    public BigDecimal getPolhSiBc() {
        return polhSiBc;
    }

    public void setPolhSiBc(BigDecimal polhSiBc) {
        this.polhSiBc = polhSiBc;
    }

    public BigDecimal getPolhDiscBc() {
        return polhDiscBc;
    }

    public void setPolhDiscBc(BigDecimal polhDiscBc) {
        this.polhDiscBc = polhDiscBc;
    }

    public BigDecimal getPolhLoadBc() {
        return polhLoadBc;
    }

    public void setPolhLoadBc(BigDecimal polhLoadBc) {
        this.polhLoadBc = polhLoadBc;
    }

    public BigDecimal getPolhFeesBc() {
        return polhFeesBc;
    }

    public void setPolhFeesBc(BigDecimal polhFeesBc) {
        this.polhFeesBc = polhFeesBc;
    }

    public BigDecimal getPolhAddPremBc() {
        return polhAddPremBc;
    }

    public void setPolhAddPremBc(BigDecimal polhAddPremBc) {
        this.polhAddPremBc = polhAddPremBc;
    }

    public BigDecimal getPolhInvestPremBc() {
        return polhInvestPremBc;
    }

    public void setPolhInvestPremBc(BigDecimal polhInvestPremBc) {
        this.polhInvestPremBc = polhInvestPremBc;
    }

    public String getPolhAprvYn() {
        return polhAprvYn;
    }

    public void setPolhAprvYn(String polhAprvYn) {
        this.polhAprvYn = polhAprvYn;
    }

    public String getPolhAprvDt() {
        return polhAprvDt;
    }

    public void setPolhAprvDt(String polhAprvDt) {
        this.polhAprvDt = polhAprvDt;
    }

    public String getPolhAprvBy() {
        return polhAprvBy;
    }

    public void setPolhAprvBy(String polhAprvBy) {
        this.polhAprvBy = polhAprvBy;
    }

    public String getPolhCreUserBy() {
        return polhCreUserBy;
    }

    public void setPolhCreUserBy(String polhCreUserBy) {
        this.polhCreUserBy = polhCreUserBy;
    }

    public String getPolhCreDt() {
        return polhCreDt;
    }

    public void setPolhCreDt(String polhCreDt) {
        this.polhCreDt = polhCreDt;
    }

    public String getPolhUpdUserBy() {
        return polhUpdUserBy;
    }

    public void setPolhUpdUserBy(String polhUpdUserBy) {
        this.polhUpdUserBy = polhUpdUserBy;
    }

    public String getPolhUpdDt() {
        return polhUpdDt;
    }

    public void setPolhUpdDt(String polhUpdDt) {
        this.polhUpdDt = polhUpdDt;
    }

    public BigDecimal getPolhGrossModPremBc() {
        return polhGrossModPremBc;
    }

    public void setPolhGrossModPremBc(BigDecimal polhGrossModPremBc) {
        this.polhGrossModPremBc = polhGrossModPremBc;
    }

    public BigDecimal getPolhNetModPremBc() {
        return polhNetModPremBc;
    }

    public void setPolhNetModPremBc(BigDecimal polhNetModPremBc) {
        this.polhNetModPremBc = polhNetModPremBc;
    }

    public String getPolhAgnt1() {
        return polhAgnt1;
    }

    public void setPolhAgnt1(String polhAgnt1) {
        this.polhAgnt1 = polhAgnt1;
    }

    public String getPolhOvriAgnt2() {
        return polhOvriAgnt2;
    }

    public void setPolhOvriAgnt2(String polhOvriAgnt2) {
        this.polhOvriAgnt2 = polhOvriAgnt2;
    }

    public String getPolhOvriAgnt3() {
        return polhOvriAgnt3;
    }

    public void setPolhOvriAgnt3(String polhOvriAgnt3) {
        this.polhOvriAgnt3 = polhOvriAgnt3;
    }

    public String getPolhOvriAgnt4() {
        return polhOvriAgnt4;
    }

    public void setPolhOvriAgnt4(String polhOvriAgnt4) {
        this.polhOvriAgnt4 = polhOvriAgnt4;
    }

    public String getPolhOvriAgnt5() {
        return polhOvriAgnt5;
    }

    public void setPolhOvriAgnt5(String polhOvriAgnt5) {
        this.polhOvriAgnt5 = polhOvriAgnt5;
    }

    public String getPolhEscPlan() {
        return polhEscPlan;
    }

    public void setPolhEscPlan(String polhEscPlan) {
        this.polhEscPlan = polhEscPlan;
    }

    public BigDecimal getPolhEscSa() {
        return polhEscSa;
    }

    public void setPolhEscSa(BigDecimal polhEscSa) {
        this.polhEscSa = polhEscSa;
    }

    public BigDecimal getPolhEscPrem() {
        return polhEscPrem;
    }

    public void setPolhEscPrem(BigDecimal polhEscPrem) {
        this.polhEscPrem = polhEscPrem;
    }

    public BigDecimal getPolhSuspAmt() {
        return polhSuspAmt;
    }

    public void setPolhSuspAmt(BigDecimal polhSuspAmt) {
        this.polhSuspAmt = polhSuspAmt;
    }

    public BigDecimal getPolhTotalPrem() {
        return polhTotalPrem;
    }

    public void setPolhTotalPrem(BigDecimal polhTotalPrem) {
        this.polhTotalPrem = polhTotalPrem;
    }

    public String getPolhLpsDt() {
        return polhLpsDt;
    }

    public void setPolhLpsDt(String polhLpsDt) {
        this.polhLpsDt = polhLpsDt;
    }

    public String getPolhAnnvDt() {
        return polhAnnvDt;
    }

    public void setPolhAnnvDt(String polhAnnvDt) {
        this.polhAnnvDt = polhAnnvDt;
    }

    public String getPolhSignature() {
        return polhSignature;
    }

    public void setPolhSignature(String polhSignature) {
        this.polhSignature = polhSignature;
    }

    public String getPolhSts() {
        return polhSts;
    }

    public void setPolhSts(String polhSts) {
        this.polhSts = polhSts;
    }

    public String getPolhAlisNo() {
        return polhAlisNo;
    }

    public void setPolhAlisNo(String polhAlisNo) {
        this.polhAlisNo = polhAlisNo;
    }

    public String getPolhPerferedMode() {
        return polhPerferedMode;
    }

    public void setPolhPerferedMode(String polhPerferedMode) {
        this.polhPerferedMode = polhPerferedMode;
    }

    public String getPolhNarration() {
        return polhNarration;
    }

    public void setPolhNarration(String polhNarration) {
        this.polhNarration = polhNarration;
    }

    public String getPolhCaption() {
        return polhCaption;
    }

    public void setPolhCaption(String polhCaption) {
        this.polhCaption = polhCaption;
    }

    public String getPolhResponse() {
        return polhResponse;
    }

    public void setPolhResponse(String polhResponse) {
        this.polhResponse = polhResponse;
    }

    public String getPolhNextDue() {
        return polhNextDue;
    }

    public void setPolhNextDue(String polhNextDue) {
        this.polhNextDue = polhNextDue;
    }

    public String getPolhLastPaydt() {
        return polhLastPaydt;
    }

    public void setPolhLastPaydt(String polhLastPaydt) {
        this.polhLastPaydt = polhLastPaydt;
    }

    public String getPolhLastRecno() {
        return polhLastRecno;
    }

    public void setPolhLastRecno(String polhLastRecno) {
        this.polhLastRecno = polhLastRecno;
    }

    @Override
    public String toString() {
        return "PolhDetlModel{" + "polhDetlPK=" + polhDetlPK + ", polhPlnSysid=" + polhPlnSysid + ", polhPrtCode=" + polhPrtCode + ", polhPlnCode=" + polhPlnCode + ", polhBussSrc=" + polhBussSrc + ", polhOff=" + polhOff + ", polhNum=" + polhNum + ", polhRef=" + polhRef + ", polhOldNum1=" + polhOldNum1 + ", polhOldNum2=" + polhOldNum2 + ", polhOldNum3=" + polhOldNum3 + ", polhIssuDt=" + polhIssuDt + ", polhEntryDt=" + polhEntryDt + ", polhAcceptDt=" + polhAcceptDt + ", polhStDt=" + polhStDt + ", polhEndDt=" + polhEndDt + ", polhSysDt=" + polhSysDt + ", polhDudtDt=" + polhDudtDt + ", polhTxnSts=" + polhTxnSts + ", polhCurr=" + polhCurr + ", polhUw=" + polhUw + ", polhCusCode=" + polhCusCode + ", polhTnr=" + polhTnr + ", polhUwyr=" + polhUwyr + ", polhSiBc=" + polhSiBc + ", polhDiscBc=" + polhDiscBc + ", polhLoadBc=" + polhLoadBc + ", polhFeesBc=" + polhFeesBc + ", polhAddPremBc=" + polhAddPremBc + ", polhInvestPremBc=" + polhInvestPremBc + ", polhAprvYn=" + polhAprvYn + ", polhAprvDt=" + polhAprvDt + ", polhAprvBy=" + polhAprvBy + ", polhCreUserBy=" + polhCreUserBy + ", polhCreDt=" + polhCreDt + ", polhUpdUserBy=" + polhUpdUserBy + ", polhUpdDt=" + polhUpdDt + ", polhGrossModPremBc=" + polhGrossModPremBc + ", polhNetModPremBc=" + polhNetModPremBc + ", polhAgnt1=" + polhAgnt1 + ", polhOvriAgnt2=" + polhOvriAgnt2 + ", polhOvriAgnt3=" + polhOvriAgnt3 + ", polhOvriAgnt4=" + polhOvriAgnt4 + ", polhOvriAgnt5=" + polhOvriAgnt5 + ", polhEscPlan=" + polhEscPlan + ", polhEscSa=" + polhEscSa + ", polhEscPrem=" + polhEscPrem + ", polhSuspAmt=" + polhSuspAmt + ", polhTotalPrem=" + polhTotalPrem + ", polhLpsDt=" + polhLpsDt + ", polhAnnvDt=" + polhAnnvDt + ", polhSignature=" + polhSignature + ", polhSts=" + polhSts + ", polhAlisNo=" + polhAlisNo + ", polhPerferedMode=" + polhPerferedMode + ", polhNarration=" + polhNarration + ", polhCaption=" + polhCaption + ", polhResponse=" + polhResponse + ", polhNextDue=" + polhNextDue + ", polhLastPaydt=" + polhLastPaydt + ", polhLastRecno=" + polhLastRecno + '}';
    }
    
    
    
}
