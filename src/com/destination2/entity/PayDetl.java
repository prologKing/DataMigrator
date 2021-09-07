/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination2.entity;

import com.model.PayDetlModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "pay_detl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PayDetl.findAll", query = "SELECT p FROM PayDetl p WHERE p.pymtPayptId = 0 AND p.pymtMode IN ('CAGD', 'Employer Deduction')"),
    @NamedQuery(name = "PayDetl.findByPymtSysId", query = "SELECT p FROM PayDetl p WHERE p.pymtSysId = :pymtSysId"),
    @NamedQuery(name = "PayDetl.findByPymtExtNum", query = "SELECT p FROM PayDetl p WHERE p.pymtExtNum = :pymtExtNum"),
    @NamedQuery(name = "PayDetl.findByPymtPolhSysid", query = "SELECT p FROM PayDetl p WHERE p.pymtPolhSysid = :pymtPolhSysid"),
    @NamedQuery(name = "PayDetl.findByPymtBnkId", query = "SELECT p FROM PayDetl p WHERE p.pymtBnkId = :pymtBnkId"),
    @NamedQuery(name = "PayDetl.findByPymtBrnchId", query = "SELECT p FROM PayDetl p WHERE p.pymtBrnchId = :pymtBrnchId"),
    @NamedQuery(name = "PayDetl.findByPymtPayptId", query = "SELECT p FROM PayDetl p WHERE p.pymtPayptId = :pymtPayptId"),
    @NamedQuery(name = "PayDetl.findByPymtFreq", query = "SELECT p FROM PayDetl p WHERE p.pymtFreq = :pymtFreq"),
    @NamedQuery(name = "PayDetl.findByPymtMode", query = "SELECT p FROM PayDetl p WHERE p.pymtMode = :pymtMode"),
    @NamedQuery(name = "PayDetl.findByPymtBnk", query = "SELECT p FROM PayDetl p WHERE p.pymtBnk = :pymtBnk"),
    @NamedQuery(name = "PayDetl.findByPymtBrnch", query = "SELECT p FROM PayDetl p WHERE p.pymtBrnch = :pymtBrnch"),
    @NamedQuery(name = "PayDetl.findByPymtBbkScode", query = "SELECT p FROM PayDetl p WHERE p.pymtBbkScode = :pymtBbkScode"),
    @NamedQuery(name = "PayDetl.findByPymtAccName", query = "SELECT p FROM PayDetl p WHERE p.pymtAccName = :pymtAccName"),
    @NamedQuery(name = "PayDetl.findByPymtAcc", query = "SELECT p FROM PayDetl p WHERE p.pymtAcc = :pymtAcc"),
    @NamedQuery(name = "PayDetl.findByPymtPayPoint", query = "SELECT p FROM PayDetl p WHERE p.pymtPayPoint = :pymtPayPoint"),
    @NamedQuery(name = "PayDetl.findByPymtStaffNo", query = "SELECT p FROM PayDetl p WHERE p.pymtStaffNo = :pymtStaffNo"),
    @NamedQuery(name = "PayDetl.findByPymtMomoNo", query = "SELECT p FROM PayDetl p WHERE p.pymtMomoNo = :pymtMomoNo"),
    @NamedQuery(name = "PayDetl.findByPymtCreUserBy", query = "SELECT p FROM PayDetl p WHERE p.pymtCreUserBy = :pymtCreUserBy"),
    @NamedQuery(name = "PayDetl.findByPymtCreDt", query = "SELECT p FROM PayDetl p WHERE p.pymtCreDt = :pymtCreDt"),
    @NamedQuery(name = "PayDetl.findByPymtFreqId", query = "SELECT p FROM PayDetl p WHERE p.pymtFreqId = :pymtFreqId"),
    @NamedQuery(name = "PayDetl.findByPymtMandateMomo", query = "SELECT p FROM PayDetl p WHERE p.pymtMandateMomo = :pymtMandateMomo"),
    @NamedQuery(name = "PayDetl.findByPymtMandateBkCode", query = "SELECT p FROM PayDetl p WHERE p.pymtMandateBkCode = :pymtMandateBkCode"),
    @NamedQuery(name = "PayDetl.findByPymtDrawerBkCode", query = "SELECT p FROM PayDetl p WHERE p.pymtDrawerBkCode = :pymtDrawerBkCode"),
    @NamedQuery(name = "PayDetl.findByPymtDedtStdt", query = "SELECT p FROM PayDetl p WHERE p.pymtDedtStdt = :pymtDedtStdt"),
    @NamedQuery(name = "PayDetl.findByPymtPic", query = "SELECT p FROM PayDetl p WHERE p.pymtPic = :pymtPic"),
    @NamedQuery(name = "PayDetl.findByPymtMandateCheck", query = "SELECT p FROM PayDetl p WHERE p.pymtMandateCheck = :pymtMandateCheck"),
    @NamedQuery(name = "PayDetl.findByPymtMandateSts", query = "SELECT p FROM PayDetl p WHERE p.pymtMandateSts = :pymtMandateSts")})
public class PayDetl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PYMT_SYS_ID")
    private Integer pymtSysId;
    @Column(name = "PYMT_EXT_NUM")
    private Integer pymtExtNum;
    @Column(name = "PYMT_POLH_SYSID")
    private Integer pymtPolhSysid;
    @Column(name = "PYMT_BNK_ID")
    private Integer pymtBnkId;
    @Column(name = "PYMT_BRNCH_ID")
    private Integer pymtBrnchId;
    @Column(name = "PYMT_PAYPT_ID")
    private Integer pymtPayptId;
    @Size(max = 100)
    @Column(name = "PYMT_FREQ")
    private String pymtFreq;
    @Size(max = 100)
    @Column(name = "PYMT_MODE")
    private String pymtMode;
    @Size(max = 250)
    @Column(name = "PYMT_BNK")
    private String pymtBnk;
    @Size(max = 250)
    @Column(name = "PYMT_BRNCH")
    private String pymtBrnch;
    @Size(max = 25)
    @Column(name = "PYMT_BBK_SCODE")
    private String pymtBbkScode;
    @Size(max = 150)
    @Column(name = "PYMT_ACC_NAME")
    private String pymtAccName;
    @Size(max = 150)
    @Column(name = "PYMT_ACC")
    private String pymtAcc;
    @Size(max = 150)
    @Column(name = "PYMT_PAY_POINT")
    private String pymtPayPoint;
    @Size(max = 50)
    @Column(name = "PYMT_STAFF_NO")
    private String pymtStaffNo;
    @Size(max = 15)
    @Column(name = "PYMT_MOMO_NO")
    private String pymtMomoNo;
    @Size(max = 150)
    @Column(name = "PYMT_CRE_USER_BY")
    private String pymtCreUserBy;
    @Column(name = "PYMT_CRE_DT")
    private String pymtCreDt;
    @Column(name = "PYMT_FREQ_ID")
    private Integer pymtFreqId;
    @Size(max = 15)
    @Column(name = "PYMT_MANDATE_MOMO")
    private String pymtMandateMomo;
    @Size(max = 250)
    @Column(name = "PYMT_MANDATE_BK_CODE")
    private String pymtMandateBkCode;
    @Size(max = 25)
    @Column(name = "PYMT_DRAWER_BK_CODE")
    private String pymtDrawerBkCode;
    @Size(max = 50)
    @Column(name = "PYMT_DEDT_STDT")
    private String pymtDedtStdt;
    @Size(max = 150)
    @Column(name = "PYMT_PIC")
    private String pymtPic;
    @Size(max = 25)
    @Column(name = "PYMT_MANDATE_CHECK")
    private String pymtMandateCheck;
    @Size(max = 150)
    @Column(name = "PYMT_MANDATE_STS")
    private String pymtMandateSts;

    public PayDetl() {
    }

    public PayDetl(Integer pymtSysId, Integer pymtExtNum, Integer pymtPolhSysid, Integer pymtBnkId, Integer pymtBrnchId, Integer pymtPayptId, String pymtFreq, String pymtMode, String pymtBnk, String pymtBrnch, String pymtBbkScode, String pymtAccName, String pymtAcc, String pymtPayPoint, String pymtStaffNo, String pymtMomoNo, String pymtCreUserBy, String pymtCreDt, Integer pymtFreqId, String pymtMandateMomo, String pymtMandateBkCode, String pymtDrawerBkCode, String pymtDedtStdt, String pymtPic, String pymtMandateCheck, String pymtMandateSts) {
        this.pymtSysId = pymtSysId;
        this.pymtExtNum = pymtExtNum;
        this.pymtPolhSysid = pymtPolhSysid;
        this.pymtBnkId = pymtBnkId;
        this.pymtBrnchId = pymtBrnchId;
        this.pymtPayptId = pymtPayptId;
        this.pymtFreq = pymtFreq;
        this.pymtMode = pymtMode;
        this.pymtBnk = pymtBnk;
        this.pymtBrnch = pymtBrnch;
        this.pymtBbkScode = pymtBbkScode;
        this.pymtAccName = pymtAccName;
        this.pymtAcc = pymtAcc;
        this.pymtPayPoint = pymtPayPoint;
        this.pymtStaffNo = pymtStaffNo;
        this.pymtMomoNo = pymtMomoNo;
        this.pymtCreUserBy = pymtCreUserBy;
        this.pymtCreDt = pymtCreDt;
        this.pymtFreqId = pymtFreqId;
        this.pymtMandateMomo = pymtMandateMomo;
        this.pymtMandateBkCode = pymtMandateBkCode;
        this.pymtDrawerBkCode = pymtDrawerBkCode;
        this.pymtDedtStdt = pymtDedtStdt;
        this.pymtPic = pymtPic;
        this.pymtMandateCheck = pymtMandateCheck;
        this.pymtMandateSts = pymtMandateSts;
    }
    
    
    public PayDetl(PayDetlModel pdail) {
        this.pymtSysId = pdail.getPymtSysId();
        this.pymtExtNum = pdail.getPymtExtNum();
        this.pymtPolhSysid = pdail.getPymtPolhSysid();
        this.pymtBnkId = pdail.getPymtBnkId();
        this.pymtBrnchId = pdail.getPymtBrnchId();
        this.pymtPayptId = pdail.getPymtPayptId();
        this.pymtFreq = pdail.getPymtFreq();
        this.pymtMode = pdail.getPymtMode();
        this.pymtBnk = pdail.getPymtBnk();
        this.pymtBrnch = pdail.getPymtBrnch();
        this.pymtBbkScode = pdail.getPymtBbkScode();
        this.pymtAccName = pdail.getPymtAccName();
        this.pymtAcc = pdail.getPymtAcc();
        this.pymtPayPoint = pdail.getPymtPayPoint();
        this.pymtStaffNo = pdail.getPymtStaffNo();
        this.pymtMomoNo = pdail.getPymtMomoNo();
        this.pymtCreUserBy = pdail.getPymtCreUserBy();
        this.pymtCreDt = pdail.getPymtCreDt();
        this.pymtFreqId = pdail.getPymtFreqId();
        this.pymtMandateMomo = pdail.getPymtMandateMomo();
        this.pymtMandateBkCode = pdail.getPymtMandateBkCode();
        this.pymtDrawerBkCode = pdail.getPymtDrawerBkCode();
        this.pymtDedtStdt = pdail.getPymtDedtStdt();
        this.pymtPic = pdail.getPymtPic();
        this.pymtMandateCheck = pdail.getPymtMandateCheck();
        this.pymtMandateSts = pdail.getPymtMandateSts();
    }
    
    

    public PayDetl(Integer pymtSysId) {
        this.pymtSysId = pymtSysId;
    }

    public Integer getPymtSysId() {
        return pymtSysId;
    }

    public void setPymtSysId(Integer pymtSysId) {
        this.pymtSysId = pymtSysId;
    }

    public Integer getPymtExtNum() {
        return pymtExtNum;
    }

    public void setPymtExtNum(Integer pymtExtNum) {
        this.pymtExtNum = pymtExtNum;
    }

    public Integer getPymtPolhSysid() {
        return pymtPolhSysid;
    }

    public void setPymtPolhSysid(Integer pymtPolhSysid) {
        this.pymtPolhSysid = pymtPolhSysid;
    }

    public Integer getPymtBnkId() {
        return pymtBnkId;
    }

    public void setPymtBnkId(Integer pymtBnkId) {
        this.pymtBnkId = pymtBnkId;
    }

    public Integer getPymtBrnchId() {
        return pymtBrnchId;
    }

    public void setPymtBrnchId(Integer pymtBrnchId) {
        this.pymtBrnchId = pymtBrnchId;
    }

    public Integer getPymtPayptId() {
        return pymtPayptId;
    }

    public void setPymtPayptId(Integer pymtPayptId) {
        this.pymtPayptId = pymtPayptId;
    }

    public String getPymtFreq() {
        return pymtFreq;
    }

    public void setPymtFreq(String pymtFreq) {
        this.pymtFreq = pymtFreq;
    }

    public String getPymtMode() {
        return pymtMode;
    }

    public void setPymtMode(String pymtMode) {
        this.pymtMode = pymtMode;
    }

    public String getPymtBnk() {
        return pymtBnk;
    }

    public void setPymtBnk(String pymtBnk) {
        this.pymtBnk = pymtBnk;
    }

    public String getPymtBrnch() {
        return pymtBrnch;
    }

    public void setPymtBrnch(String pymtBrnch) {
        this.pymtBrnch = pymtBrnch;
    }

    public String getPymtBbkScode() {
        return pymtBbkScode;
    }

    public void setPymtBbkScode(String pymtBbkScode) {
        this.pymtBbkScode = pymtBbkScode;
    }

    public String getPymtAccName() {
        return pymtAccName;
    }

    public void setPymtAccName(String pymtAccName) {
        this.pymtAccName = pymtAccName;
    }

    public String getPymtAcc() {
        return pymtAcc;
    }

    public void setPymtAcc(String pymtAcc) {
        this.pymtAcc = pymtAcc;
    }

    public String getPymtPayPoint() {
        return pymtPayPoint;
    }

    public void setPymtPayPoint(String pymtPayPoint) {
        this.pymtPayPoint = pymtPayPoint;
    }

    public String getPymtStaffNo() {
        return pymtStaffNo;
    }

    public void setPymtStaffNo(String pymtStaffNo) {
        this.pymtStaffNo = pymtStaffNo;
    }

    public String getPymtMomoNo() {
        return pymtMomoNo;
    }

    public void setPymtMomoNo(String pymtMomoNo) {
        this.pymtMomoNo = pymtMomoNo;
    }

    public String getPymtCreUserBy() {
        return pymtCreUserBy;
    }

    public void setPymtCreUserBy(String pymtCreUserBy) {
        this.pymtCreUserBy = pymtCreUserBy;
    }

    public String getPymtCreDt() {
        return pymtCreDt;
    }

    public void setPymtCreDt(String pymtCreDt) {
        this.pymtCreDt = pymtCreDt;
    }

    public Integer getPymtFreqId() {
        return pymtFreqId;
    }

    public void setPymtFreqId(Integer pymtFreqId) {
        this.pymtFreqId = pymtFreqId;
    }

    public String getPymtMandateMomo() {
        return pymtMandateMomo;
    }

    public void setPymtMandateMomo(String pymtMandateMomo) {
        this.pymtMandateMomo = pymtMandateMomo;
    }

    public String getPymtMandateBkCode() {
        return pymtMandateBkCode;
    }

    public void setPymtMandateBkCode(String pymtMandateBkCode) {
        this.pymtMandateBkCode = pymtMandateBkCode;
    }

    public String getPymtDrawerBkCode() {
        return pymtDrawerBkCode;
    }

    public void setPymtDrawerBkCode(String pymtDrawerBkCode) {
        this.pymtDrawerBkCode = pymtDrawerBkCode;
    }

    public String getPymtDedtStdt() {
        return pymtDedtStdt;
    }

    public void setPymtDedtStdt(String pymtDedtStdt) {
        this.pymtDedtStdt = pymtDedtStdt;
    }

    public String getPymtPic() {
        return pymtPic;
    }

    public void setPymtPic(String pymtPic) {
        this.pymtPic = pymtPic;
    }

    public String getPymtMandateCheck() {
        return pymtMandateCheck;
    }

    public void setPymtMandateCheck(String pymtMandateCheck) {
        this.pymtMandateCheck = pymtMandateCheck;
    }

    public String getPymtMandateSts() {
        return pymtMandateSts;
    }

    public void setPymtMandateSts(String pymtMandateSts) {
        this.pymtMandateSts = pymtMandateSts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pymtSysId != null ? pymtSysId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayDetl)) {
            return false;
        }
        PayDetl other = (PayDetl) object;
        if ((this.pymtSysId == null && other.pymtSysId != null) || (this.pymtSysId != null && !this.pymtSysId.equals(other.pymtSysId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination2.entity.PayDetl[ pymtSysId=" + pymtSysId + " ]";
    }
    
}
