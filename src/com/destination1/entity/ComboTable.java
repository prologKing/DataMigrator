/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.destination1.entity;

import com.model.SourceModel;
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
@Table(name = "combo_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComboTable.findAll", query = "SELECT c FROM ComboTable c"),
    @NamedQuery(name = "ComboTable.findById", query = "SELECT c FROM ComboTable c WHERE c.id = :id"),
    @NamedQuery(name = "ComboTable.findByField1", query = "SELECT c FROM ComboTable c WHERE c.field1 = :field1"),
    @NamedQuery(name = "ComboTable.findByField2", query = "SELECT c FROM ComboTable c WHERE c.field2 = :field2"),
    @NamedQuery(name = "ComboTable.findByField3", query = "SELECT c FROM ComboTable c WHERE c.field3 = :field3"),
    @NamedQuery(name = "ComboTable.findByField4", query = "SELECT c FROM ComboTable c WHERE c.field4 = :field4"),
    @NamedQuery(name = "ComboTable.findByField5", query = "SELECT c FROM ComboTable c WHERE c.field5 = :field5"),
    @NamedQuery(name = "ComboTable.findByField6", query = "SELECT c FROM ComboTable c WHERE c.field6 = :field6"),
    @NamedQuery(name = "ComboTable.findByField7", query = "SELECT c FROM ComboTable c WHERE c.field7 = :field7"),
    @NamedQuery(name = "ComboTable.findByField8", query = "SELECT c FROM ComboTable c WHERE c.field8 = :field8"),
    @NamedQuery(name = "ComboTable.findByField9", query = "SELECT c FROM ComboTable c WHERE c.field9 = :field9"),
    @NamedQuery(name = "ComboTable.findByField10", query = "SELECT c FROM ComboTable c WHERE c.field10 = :field10"),
    @NamedQuery(name = "ComboTable.findByField11", query = "SELECT c FROM ComboTable c WHERE c.field11 = :field11"),
    @NamedQuery(name = "ComboTable.findByField12", query = "SELECT c FROM ComboTable c WHERE c.field12 = :field12"),
    @NamedQuery(name = "ComboTable.findByField13", query = "SELECT c FROM ComboTable c WHERE c.field13 = :field13"),
    @NamedQuery(name = "ComboTable.findByField14", query = "SELECT c FROM ComboTable c WHERE c.field14 = :field14"),
    @NamedQuery(name = "ComboTable.findByField15", query = "SELECT c FROM ComboTable c WHERE c.field15 = :field15"),
    @NamedQuery(name = "ComboTable.findByField16", query = "SELECT c FROM ComboTable c WHERE c.field16 = :field16"),
    @NamedQuery(name = "ComboTable.findByField17", query = "SELECT c FROM ComboTable c WHERE c.field17 = :field17"),
    @NamedQuery(name = "ComboTable.findByField18", query = "SELECT c FROM ComboTable c WHERE c.field18 = :field18"),
    @NamedQuery(name = "ComboTable.findByField19", query = "SELECT c FROM ComboTable c WHERE c.field19 = :field19")})
public class ComboTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "field1")
    private String field1;
    @Size(max = 100)
    @Column(name = "field2")
    private String field2;
    @Size(max = 100)
    @Column(name = "field3")
    private String field3;
    @Size(max = 100)
    @Column(name = "field4")
    private String field4;
    @Size(max = 100)
    @Column(name = "field5")
    private String field5;
    @Size(max = 100)
    @Column(name = "field6")
    private String field6;
    @Size(max = 100)
    @Column(name = "field7")
    private String field7;
    @Size(max = 100)
    @Column(name = "field8")
    private String field8;
    @Size(max = 100)
    @Column(name = "field9")
    private String field9;
    @Size(max = 100)
    @Column(name = "field10")
    private String field10;
    @Size(max = 100)
    @Column(name = "field11")
    private String field11;
    @Size(max = 100)
    @Column(name = "field12")
    private String field12;
    @Size(max = 100)
    @Column(name = "field13")
    private String field13;
    @Size(max = 100)
    @Column(name = "field14")
    private String field14;
    @Size(max = 100)
    @Column(name = "field15")
    private String field15;
    @Size(max = 100)
    @Column(name = "field16")
    private String field16;
    @Size(max = 100)
    @Column(name = "field17")
    private String field17;
    @Size(max = 100)
    @Column(name = "field18")
    private String field18;
    @Size(max = 100)
    @Column(name = "field19")
    private String field19;

    public ComboTable() {
    }
    
    public ComboTable(SourceModel data){
        this.id = data.getId();
        this.field1 = data.getField1();
        this.field2 = data.getField2();
        this.field3 = data.getField3();
        this.field4 = data.getField14();
        this.field5 = data.getField5();
        this.field6 = data.getField6();
        this.field7 = data.getField7();
        this.field8 = data.getField8();
        this.field9 = data.getField9();
        this.field10 = data.getField10();
        this.field11 = data.getField11();
        this.field12 = data.getField12();
        this.field13 = data.getField13();
        this.field14 = data.getField14();
        this.field15 = data.getField15();
        this.field16 = data.getField16();
        this.field17 = data.getField17();
        this.field18 = data.getField18();
        this.field19 = data.getField19();
  }

    public ComboTable(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

    public String getField11() {
        return field11;
    }

    public void setField11(String field11) {
        this.field11 = field11;
    }

    public String getField12() {
        return field12;
    }

    public void setField12(String field12) {
        this.field12 = field12;
    }

    public String getField13() {
        return field13;
    }

    public void setField13(String field13) {
        this.field13 = field13;
    }

    public String getField14() {
        return field14;
    }

    public void setField14(String field14) {
        this.field14 = field14;
    }

    public String getField15() {
        return field15;
    }

    public void setField15(String field15) {
        this.field15 = field15;
    }

    public String getField16() {
        return field16;
    }

    public void setField16(String field16) {
        this.field16 = field16;
    }

    public String getField17() {
        return field17;
    }

    public void setField17(String field17) {
        this.field17 = field17;
    }

    public String getField18() {
        return field18;
    }

    public void setField18(String field18) {
        this.field18 = field18;
    }

    public String getField19() {
        return field19;
    }

    public void setField19(String field19) {
        this.field19 = field19;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComboTable)) {
            return false;
        }
        ComboTable other = (ComboTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ComboTable[ id=" + id + " ]";
    }
    
}
