/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoCompressor;
//import com.mongodb.MongoCredential;
//import com.mongodb.ServerAddress;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import static javax.persistence.Persistence.createEntityManagerFactory;

/**
 *
 * @author Bolaji.
 *
 */
public class GenericLibrary {

    Connection con = null;

    public Connection getMysqlConnection() {
        Connection con = null;
        String db = "allztrnx";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + "localhost" + ":" + "3306" + "/" + db
                    + "?schema=mysql1_" + db + ".xml&rebuildschema=true&autoReconnect=true"
                    + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

            con = DriverManager.getConnection(url, "root", "BoLaJi007");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

    public EntityManagerFactory getEM(String dbname) {
        Map properties = new HashMap();
        String uname = "root";
        String password = "BoLaJi007";
        String port = "3306";
        String db = dbname;
        String poolserver = "localhost";
        String poolserver_bkup = "127.0.0.1";

        properties.put("javax.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
        properties.put("javax.persistence.jdbc.user", uname);
        properties.put("javax.persistence.jdbc.url", "jdbc:mysql://" + poolserver
                + ":" + port + "," + poolserver_bkup + ":" + port + "/" + db
                + "?schema=mysql1_" + db + ".xml&rebuildschema=true&autoReconnect=true"
                + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        properties.put("javax.persistence.jdbc.password", password);
        return createEntityManagerFactory("DataMigratorPU", properties);
    }

}
