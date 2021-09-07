/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.ProductBankBranchTbModel;
import com.model.ProductBankBranchTbPKModel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "product_bank_branch_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductBankBranchTb.findAll", query = "SELECT p FROM ProductBankBranchTb p"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbSysid", query = "SELECT p FROM ProductBankBranchTb p WHERE p.productBankBranchTbPK.pbkbSysid = :pbkbSysid"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbPbkSysid", query = "SELECT p FROM ProductBankBranchTb p WHERE p.productBankBranchTbPK.pbkbPbkSysid = :pbkbPbkSysid"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbUserSysid", query = "SELECT p FROM ProductBankBranchTb p WHERE p.productBankBranchTbPK.pbkbUserSysid = :pbkbUserSysid"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbName", query = "SELECT p FROM ProductBankBranchTb p WHERE p.pbkbName = :pbkbName"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbLocation", query = "SELECT p FROM ProductBankBranchTb p WHERE p.pbkbLocation = :pbkbLocation"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbCrtDt", query = "SELECT p FROM ProductBankBranchTb p WHERE p.pbkbCrtDt = :pbkbCrtDt"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbDt", query = "SELECT p FROM ProductBankBranchTb p WHERE p.pbkbDt = :pbkbDt"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbSortCode", query = "SELECT p FROM ProductBankBranchTb p WHERE p.pbkbSortCode = :pbkbSortCode"),
    @NamedQuery(name = "ProductBankBranchTb.findByPbkbSts", query = "SELECT p FROM ProductBankBranchTb p WHERE p.pbkbSts = :pbkbSts")})
public class ProductBankBranchTb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductBankBranchTbPK productBankBranchTbPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "PBKB_NAME")
    private String pbkbName;
    @Size(max = 350)
    @Column(name = "PBKB_LOCATION")
    private String pbkbLocation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PBKB_CRT_DT")
    private String pbkbCrtDt;
    @Column(name = "PBKB_DT")
    private String pbkbDt;
    @Size(max = 15)
    @Column(name = "PBKB_SORT_CODE")
    private String pbkbSortCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "PBKB_STS")
    private String pbkbSts;

    public ProductBankBranchTb() {
    }

    public ProductBankBranchTb(ProductBankBranchTbPK productBankBranchTbPK, String pbkbName, String pbkbLocation, String pbkbCrtDt, String pbkbDt, String pbkbSortCode, String pbkbSts) {
        this.productBankBranchTbPK = productBankBranchTbPK;
        this.pbkbName = pbkbName;
        this.pbkbLocation = pbkbLocation;
        this.pbkbCrtDt = pbkbCrtDt;
        this.pbkbDt = pbkbDt;
        this.pbkbSortCode = pbkbSortCode;
        this.pbkbSts = pbkbSts;
    }
    
     public ProductBankBranchTb(ProductBankBranchTbModel pbbpk) {
        this.productBankBranchTbPK = new ProductBankBranchTbPK(pbbpk.getPbbranckPK());
        this.pbkbName = pbbpk.getPbkbName();
        this.pbkbLocation = pbbpk.getPbkbLocation();
        this.pbkbCrtDt = pbbpk.getPbkbCrtDt();
        this.pbkbDt = pbbpk.getPbkbDt();
        this.pbkbSortCode = pbbpk.getPbkbSortCode();
        this.pbkbSts = pbbpk.getPbkbSts();
    }

    public ProductBankBranchTb(ProductBankBranchTbPK productBankBranchTbPK) {
        this.productBankBranchTbPK = productBankBranchTbPK;
    }

    public ProductBankBranchTb(ProductBankBranchTbPK productBankBranchTbPK, String pbkbName, String pbkbCrtDt, String pbkbSts) {
        this.productBankBranchTbPK = productBankBranchTbPK;
        this.pbkbName = pbkbName;
        this.pbkbCrtDt = pbkbCrtDt;
        this.pbkbSts = pbkbSts;
    }

    public ProductBankBranchTb(int pbkbSysid, int pbkbPbkSysid, int pbkbUserSysid) {
        this.productBankBranchTbPK = new ProductBankBranchTbPK(pbkbSysid, pbkbPbkSysid, pbkbUserSysid);
    }

    public ProductBankBranchTbPK getProductBankBranchTbPK() {
        return productBankBranchTbPK;
    }

    public void setProductBankBranchTbPK(ProductBankBranchTbPK productBankBranchTbPK) {
        this.productBankBranchTbPK = productBankBranchTbPK;
    }

    public String getPbkbName() {
        return pbkbName;
    }

    public void setPbkbName(String pbkbName) {
        this.pbkbName = pbkbName;
    }

    public String getPbkbLocation() {
        return pbkbLocation;
    }

    public void setPbkbLocation(String pbkbLocation) {
        this.pbkbLocation = pbkbLocation;
    }

    public String getPbkbCrtDt() {
        return pbkbCrtDt;
    }

    public void setPbkbCrtDt(String pbkbCrtDt) {
        this.pbkbCrtDt = pbkbCrtDt;
    }

    public String getPbkbDt() {
        return pbkbDt;
    }

    public void setPbkbDt(String pbkbDt) {
        this.pbkbDt = pbkbDt;
    }

    public String getPbkbSortCode() {
        return pbkbSortCode;
    }

    public void setPbkbSortCode(String pbkbSortCode) {
        this.pbkbSortCode = pbkbSortCode;
    }

    public String getPbkbSts() {
        return pbkbSts;
    }

    public void setPbkbSts(String pbkbSts) {
        this.pbkbSts = pbkbSts;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productBankBranchTbPK != null ? productBankBranchTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductBankBranchTb)) {
            return false;
        }
        ProductBankBranchTb other = (ProductBankBranchTb) object;
        if ((this.productBankBranchTbPK == null && other.productBankBranchTbPK != null) || (this.productBankBranchTbPK != null && !this.productBankBranchTbPK.equals(other.productBankBranchTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.destination1.entity.ProductBankBranchTb[ productBankBranchTbPK=" + productBankBranchTbPK + " ]";
    }
    
}
