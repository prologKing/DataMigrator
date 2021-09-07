/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.destination1.entity.ComboTable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Developer
 */
public class SourceModel {
private int id;
private String field1;
private String field2;
private String field3;
private String field4;
private String field5;
private String field6;
private String field7;
private String field8;
private String field9;
private String field10;
private String field11;
private String field12;
private String field13;
private String field14;
private String field15;
private String field16;
private String field17;
private String field18;
private String field19;
private String field20;
private String field21;
private String field22;
private String field23;
private String field24;
private String field25;
private String field26;
private String field27;
private String field28;
private String field29;
private String field30;
private String field31;

    public SourceModel() {
    }



 public SourceModel(ResultSet data) throws SQLException{
        this.id = data.getInt(1);
        this.field1 = data.getString(2);
        this.field2 = data.getString(3);
        this.field3 = data.getString(4);
        this.field4 = data.getString(5);
        this.field5 = data.getString(6);
        this.field6 = data.getString(7);
        this.field7 = data.getString(8);
        this.field8 = data.getString(9);
        this.field9 = data.getString(10);
        this.field10 = data.getString(11);
        this.field11 = data.getString(12);
        this.field12 = data.getString(13);
        this.field13 = data.getString(14);
        this.field14 = data.getString(15);
        this.field15 = data.getString(16);
        this.field16 = data.getString(17);
        this.field17 = data.getString(18);
        this.field18 = data.getString(19);
        this.field19 = data.getString(20);  
    }
  public SourceModel(ComboTable data){
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

    public SourceModel(ResultSet data, String area) throws SQLException{

        this.id = data.getInt(1);
        this.field1 = data.getString(2);
        this.field2 = data.getString(3);
        this.field3 = data.getString(4);
        this.field4 = data.getString(5);
        this.field5 = data.getString(6);
        this.field6 = data.getString(7);
        this.field7 = data.getString(8);
        this.field8 = data.getString(9);
        this.field9 = data.getString(10);
        this.field10 = data.getString(11);
        this.field11 = data.getString(12);
        this.field12 = data.getString(13);
        this.field13 = data.getString(14);
        this.field14 = data.getString(15);
        this.field15 = data.getString(16);
        this.field16 = data.getString(17);
        this.field17 = data.getString(18);
        this.field18 = data.getString(19);
        this.field19 = data.getString(20);
        this.field20 = data.getString(21);
        this.field21 = data.getString(22);
        this.field22 = data.getString(23);
        this.field23 = data.getString(24);
        this.field24 = data.getString(25);
        this.field25 = data.getString(26);
        this.field26 = data.getString(27);
        this.field27 = data.getString(28);
        this.field28 = data.getString(29);
        this.field29 = data.getString(30);
        this.field30 = data.getString(31);
        this.field31 = data.getString(32);
        
    }
 
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getField20() {
        return field20;
    }

    public void setField20(String field20) {
        this.field20 = field20;
    }

    public String getField21() {
        return field21;
    }

    public void setField21(String field21) {
        this.field21 = field21;
    }

    public String getField22() {
        return field22;
    }

    public void setField22(String field22) {
        this.field22 = field22;
    }

    public String getField23() {
        return field23;
    }

    public void setField23(String field23) {
        this.field23 = field23;
    }

    public String getField24() {
        return field24;
    }

    public void setField24(String field24) {
        this.field24 = field24;
    }

    public String getField25() {
        return field25;
    }

    public void setField25(String field25) {
        this.field25 = field25;
    }

    public String getField26() {
        return field26;
    }

    public void setField26(String field26) {
        this.field26 = field26;
    }

    public String getField27() {
        return field27;
    }

    public void setField27(String field27) {
        this.field27 = field27;
    }

    public String getField28() {
        return field28;
    }

    public void setField28(String field28) {
        this.field28 = field28;
    }

    public String getField29() {
        return field29;
    }

    public void setField29(String field29) {
        this.field29 = field29;
    }

    public String getField30() {
        return field30;
    }

    public void setField30(String field30) {
        this.field30 = field30;
    }

    public String getField31() {
        return field31;
    }

    public void setField31(String field31) {
        this.field31 = field31;
    }
    
    

    @Override
    public String toString() {
        return "SourceModel{" + "id=" + id + ", field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4 + ", field5=" + field5 + ", field6=" + field6 + ", field7=" + field7 + ", field8=" + field8 + ", field9=" + field9 + ", field10=" + field10 + ", field11=" + field11 + ", field12=" + field12 + ", field13=" + field13 + ", field14=" + field14 + ", field15=" + field15 + ", field16=" + field16 + ", field17=" + field17 + ", field18=" + field18 + ", field19=" + field19 + '}';
    }

}
