/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.migration;

import com.model.SourceModel;
import com.util.GenericLibrary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Developer
 */
public class MigrationLogic {
    
    Connection con;

    public MigrationLogic() {

        try {

            con = new GenericLibrary().getMysqlConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public List<SourceModel> getMigrationData() {
        List<SourceModel> dlist = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement("select * FROM combo_table;");

            rs = ps.executeQuery();

            while (rs.next()) {
                dlist.add(new SourceModel(rs));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<SourceModel> getCustMigration() {
        List<SourceModel> dlist = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement("select * FROM cust_combo_table;");

            rs = ps.executeQuery();

            while (rs.next()) {
                dlist.add(new SourceModel(rs, "customer"));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<DestinationModel> getMigrationData2() {
        List<DestinationModel> dlist = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement("select * FROM product_agents_tb;");

            rs = ps.executeQuery();

            while (rs.next()) {
                dlist.add(new DestinationModel(rs));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<DestinationModel> getSalesManager() {
        List<DestinationModel> dlist = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement("select * FROM product_agents_tb WHERE PAGT_PAL_LEVEL_ID=2");

            rs = ps.executeQuery();

            while (rs.next()) {
                dlist.add(new DestinationModel(rs));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public String UpdateReportingOfficer(int id, String rid) {
        String result = "Update could not be done...";

        try {
            String SQL = "UPDATE product_agents_tb SET PAGT_REPORT_ID = ? "
                        + "Where PAGT_REPORT_ID = ? ;";

                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, id);
                pst.setString(2, rid);
               

                pst.execute();
                result = "Agent updated successfully...";
                pst.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    
    public SourceModel getSourceByFieldName(String field, String code) {
        SourceModel dmodel = new SourceModel();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement("select * FROM combo_table WHERE "+field+"='" + code + "' ;");

            rs = ps.executeQuery();

            while (rs.next()) {
                dmodel = new SourceModel(rs);

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    
    public String getReportingOfficer(String code) {
        SourceModel dmodel = new SourceModel();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement("select * FROM combo_table WHERE field10='" + code + "' AND field1 LIKE '%SM%';");

            rs = ps.executeQuery();

            while (rs.next()) {
                dmodel = new SourceModel(rs);

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return (dmodel.getField2() == null) ? dmodel.getField2(): dmodel.getField2().toUpperCase();
    }
    
     
    
    public DestinationModel checkIfExisting(String fullname, String mobile) {
        DestinationModel dmodel = new DestinationModel();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String[] names = fullname.split(" ");
            String[] all = names;
            String condition = "";
            for(String name: all){
            condition += "(PAGT_SURNAME Like '%"+ name +"%' OR PAGT_OTHNAME Like '%"+ name +"%') AND ";
            }

            ps = con.prepareStatement("select * FROM product_agents_tb WHERE "+condition+" PAGT_MOBILE = '"+mobile+"';");

            rs = ps.executeQuery();

            while (rs.next()) {
                dmodel = new DestinationModel(rs);

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    
    
    public String saveAgent(SourceModel rmodel, MigrationLogic m) {
        String result = "There was a problem saving...";

        try {
                MigrationLogic mlogic = m;
                String SQL = "INSERT INTO `product_agents_tb` (`PAGT_USER_SYSID`,`PAGT_BRANCH_SYSID`,`PAGT_REPORT_ID`,`PAGT_REPORT_MGR`,"
                        + "`PAGT_PBK_SYSID`,`PAGT_PBKB_SYSID`,`PAGT_CODE`,`PAGT_SURNAME`,`PAGT_OTHNAME`,`PAGT_GENDER`,`PAGT_DOB`,"
                        + "`PAGT_ADDRS`,`PAGT_MOBILE`,`PAGT_MOMO_NO`,`PAGT_STATUS`,`PAGT_ACCT_NO`,`PAGT_REG_DT`,`PAGT_CRT_DT`,`PAGT_EMAIL`,"
                        + "`PAGT_PHOTO`,`PAGT_EXIT_DT`,`PAGT_MARITAL_STS`,`PAGT_BFIT_STDT`,`PAGT_ENT_SOURCE`,`PAGT_USED`,`PAGT_PAH_SYSID`,"
                        + "`PAGT_LEVEL`,`PAGT_HIERARCHY`,`PAGT_PAL_LEVEL_ID`,`PAGT_SUBBRANCH_SYSID`) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, 43);
                pst.setInt(2, Integer.parseInt(rmodel.getField3() == null || "0".equals(rmodel.getField3()) ? "50": rmodel.getField3()));
                pst.setString(3, rmodel.getField10());
                pst.setString(4, mlogic.getReportingOfficer(rmodel.getField10()));
                pst.setInt(5, 44);
                pst.setInt(6, 41);
                pst.setString(7, rmodel.getField1());
                String[] names = rmodel.getField2().split(" ");
                pst.setString(8, names.length >= 2 ? rmodel.getField2().substring(0, rmodel.getField2().indexOf(' ')).toUpperCase(): rmodel.getField2().toUpperCase());
                pst.setString(9, names.length >= 2 ? rmodel.getField2().substring(rmodel.getField2().indexOf(' ') + 1).toUpperCase() : rmodel.getField2().toUpperCase());
                pst.setString(10, rmodel.getField4() == null || "52".equals(rmodel.getField4())  ?"N/A":rmodel.getField4());
                //DOB
                pst.setString(11, rmodel.getField5() == null ? "0000-00-00": rmodel.getField5());
                pst.setString(12, rmodel.getField6());
                pst.setString(13, rmodel.getField7());
                pst.setString(14, rmodel.getField8());
                pst.setString(15, rmodel.getField9());
                pst.setString(16, rmodel.getField13());
                //Date
                pst.setString(17, rmodel.getField17() == null? "0000-00-00": rmodel.getField17());
                //Date
                pst.setString(18, rmodel.getField16()== null? "0000-00-00": rmodel.getField16());
                
                pst.setString(19, rmodel.getField18());
                pst.setString(20, "agent_images/no_image.png");
                pst.setString(21, null);
                pst.setString(22, "Single");
                //Benefit Date
                pst.setString(23, rmodel.getField14() == null? "0000-00-00": rmodel.getField14());
                
                pst.setString(24, (rmodel.getId()>0 && rmodel.getId() < 1228)? "Micro":"Retail");
                pst.setString(25, "Y");
                pst.setInt(26, (rmodel.getField1().contains("SM0"))? 2:1);
                pst.setString(27, (rmodel.getField1().contains("SM0"))? "S.Mgr":"Agent");
                pst.setString(28, (rmodel.getField1().contains("SM0"))? "Team Leader":"Agent");
                pst.setInt(29, (rmodel.getField1().contains("SM0"))? 2:1);
                pst.setInt(30, Integer.parseInt(rmodel.getField3() == null || "0".equals(rmodel.getField3())  ? "50": rmodel.getField3()));
                DestinationModel val = mlogic.checkIfExisting(rmodel.getField2(), rmodel.getField7());
                if(val.getPAGT_CODE() == null){
                pst.executeUpdate();
                result = "Agent saved successfully...";
                pst.close();
                }else if(!val.getPAGT_CODE().contains("SM0") && rmodel.getField1().contains("SM0") && "ACTIVE".equals(rmodel.getField9())){
                 SQL = "UPDATE product_agents_tb SET `PAGT_USER_SYSID` = ?,`PAGT_BRANCH_SYSID`=?,`PAGT_REPORT_ID` =?,`PAGT_REPORT_MGR`=?,"
                        + "`PAGT_PBK_SYSID` = ?,`PAGT_PBKB_SYSID`=?,`PAGT_CODE`=?,`PAGT_SURNAME`=?,`PAGT_OTHNAME`=?,`PAGT_GENDER`=?,`PAGT_DOB`=?,"
                        + "`PAGT_ADDRS`=?,`PAGT_MOBILE`=?,`PAGT_MOMO_NO`=?,`PAGT_STATUS`=?,`PAGT_ACCT_NO`=?,`PAGT_REG_DT`=?,`PAGT_CRT_DT`=?,`PAGT_EMAIL`=?,"
                        + "`PAGT_PHOTO`=?,`PAGT_EXIT_DT`=?,`PAGT_MARITAL_STS`=?,`PAGT_BFIT_STDT`=?,`PAGT_ENT_SOURCE`=?,`PAGT_USED`=?,`PAGT_PAH_SYSID`=?,"
                        + "`PAGT_LEVEL`=?,`PAGT_HIERARCHY`=?,`PAGT_PAL_LEVEL_ID`=?,`PAGT_SUBBRANCH_SYSID`=? "
                        + "Where PAGT_SYSID = ? ;";

                pst = con.prepareStatement(SQL);
                pst.setInt(1, 43);
                pst.setInt(2, Integer.parseInt(rmodel.getField3() == null || "0".equals(rmodel.getField3()) ? "50": rmodel.getField3()));
                pst.setString(3, rmodel.getField10());
                pst.setString(4, mlogic.getReportingOfficer(rmodel.getField10()));
                pst.setInt(5, 44);
                pst.setInt(6, 41);
                pst.setString(7, rmodel.getField1());
                names = rmodel.getField2().split(" ");
                pst.setString(8, names.length >= 2 ? rmodel.getField2().substring(0, rmodel.getField2().indexOf(' ')).toUpperCase(): rmodel.getField2().toUpperCase());
                pst.setString(9, names.length >= 2 ? rmodel.getField2().substring(rmodel.getField2().indexOf(' ') + 1).toUpperCase() : rmodel.getField2().toUpperCase());
                pst.setString(10, rmodel.getField4() == null || "52".equals(rmodel.getField4())  ?"N/A":rmodel.getField4());
                //DOB
                pst.setString(11, rmodel.getField5() == null ? "0000-00-00": rmodel.getField5());
                pst.setString(12, rmodel.getField6());
                pst.setString(13, rmodel.getField7());
                pst.setString(14, rmodel.getField8());
                pst.setString(15, rmodel.getField9());
                pst.setString(16, rmodel.getField13());
                //Date
                pst.setString(17, rmodel.getField17() == null? "0000-00-00": rmodel.getField17());
                //Date
                pst.setString(18, rmodel.getField16()== null? "0000-00-00": rmodel.getField16());
                
                pst.setString(19, rmodel.getField18());
                pst.setString(20, "agent_images/no_image.png");
                pst.setString(21, null);
                pst.setString(22, "Single");
                //Benefit Date
                pst.setString(23, rmodel.getField14() == null? "0000-00-00": rmodel.getField14());
                
                pst.setString(24, (rmodel.getId()>0 && rmodel.getId() < 1228)? "Micro":"Retail");
                pst.setString(25, "Y");
                pst.setInt(26, (rmodel.getField1().contains("SM0"))? 2:1);
                pst.setString(27, (rmodel.getField1().contains("SM0"))? "S.Mgr":"Agent");
                pst.setString(28, (rmodel.getField1().contains("SM0"))? "Team Leader":"Agent");
                pst.setInt(29, (rmodel.getField1().contains("SM0"))? 2:1);
                pst.setInt(30, Integer.parseInt(rmodel.getField3() == null || "0".equals(rmodel.getField3())  ? "50": rmodel.getField3()));
                pst.setInt(31, val.getPAGT_SYSID());
               
                pst.execute();
                result = "District updated successfully...";
                pst.close();
                }
            
        } catch (Exception ex) {
           
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    
    
}
