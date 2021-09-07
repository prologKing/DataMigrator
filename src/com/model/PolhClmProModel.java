/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination2.entity.PolhClmPro;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Developer
 */
public class PolhClmProModel {
    int pcpSysid;
    int pcpPolhSysid;
    int pcpPciSysid;
    BigDecimal pcpAmtBc;
    BigDecimal pcpAmtFc;
    String pcpProDt;
    String pcpProUser;
    String pcpAcctPost;
    
    MathContext mc = new MathContext(2);

    public PolhClmProModel() {
    }
    
  public PolhClmProModel(PolhClmPro polhPro) {
        this.pcpSysid = polhPro.getPcpSysid();
        this.pcpPolhSysid = polhPro.getPcpPolhSysid();
        this.pcpPciSysid = polhPro.getPcpPciSysid();
        this.pcpAmtBc = polhPro.getPcpAmtBc();
        this.pcpAmtFc = polhPro.getPcpAmtFc();
        this.pcpProDt = polhPro.getPcpProDt();
        this.pcpProUser = polhPro.getPcpProUser();
        this.pcpAcctPost = polhPro.getPcpAcctPost();
    }
  
  public PolhClmProModel(PolhClmInitModel polhPro, String charge) {
        this.pcpSysid = 0;
        this.pcpPolhSysid = polhPro.getPciPolhSysid();
        this.pcpPciSysid = polhPro.getPciSysid();
        this.pcpAmtBc = polhPro.getPcbAmt().subtract(new BigDecimal(charge), mc);
        this.pcpAmtFc = polhPro.getPcbAmt().subtract(new BigDecimal(charge), mc);
        this.pcpProDt = polhPro.getPciApprDt();
        this.pcpProUser = polhPro.getPciCreateBy();
        this.pcpAcctPost = "N";
    } 

    public int getPcpSysid() {
        return pcpSysid;
    }

    public void setPcpSysid(int pcpSysid) {
        this.pcpSysid = pcpSysid;
    }

    public int getPcpPolhSysid() {
        return pcpPolhSysid;
    }

    public void setPcpPolhSysid(int pcpPolhSysid) {
        this.pcpPolhSysid = pcpPolhSysid;
    }

    public int getPcpPciSysid() {
        return pcpPciSysid;
    }

    public void setPcpPciSysid(int pcpPciSysid) {
        this.pcpPciSysid = pcpPciSysid;
    }

    public BigDecimal getPcpAmtBc() {
        return pcpAmtBc;
    }

    public void setPcpAmtBc(BigDecimal pcpAmtBc) {
        this.pcpAmtBc = pcpAmtBc;
    }

    public BigDecimal getPcpAmtFc() {
        return pcpAmtFc;
    }

    public void setPcpAmtFc(BigDecimal pcpAmtFc) {
        this.pcpAmtFc = pcpAmtFc;
    }

    public String getPcpProDt() {
        return pcpProDt;
    }

    public void setPcpProDt(String pcpProDt) {
        this.pcpProDt = pcpProDt;
    }

    public String getPcpProUser() {
        return pcpProUser;
    }

    public void setPcpProUser(String pcpProUser) {
        this.pcpProUser = pcpProUser;
    }

    public String getPcpAcctPost() {
        return pcpAcctPost;
    }

    public void setPcpAcctPost(String pcpAcctPost) {
        this.pcpAcctPost = pcpAcctPost;
    }

    @Override
    public String toString() {
        return "PolhClmProModel{" + "pcpSysid=" + pcpSysid + ", pcpPolhSysid=" + pcpPolhSysid + ", pcpPciSysid=" + pcpPciSysid + ", pcpAmtBc=" + pcpAmtBc + ", pcpAmtFc=" + pcpAmtFc + ", pcpProDt=" + pcpProDt + ", pcpProUser=" + pcpProUser + ", pcpAcctPost=" + pcpAcctPost + '}';
    }
  
  
}
