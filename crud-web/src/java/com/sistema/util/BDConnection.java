/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Renato
 */
public class BDConnection {

    public static String driver ="com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/projeto-crud-1.0";
    public static String user = "root";
    public static String password = "";
    public static Connection conn;
    //public static String status = "Não foi possível conectar ao banco";
        
    public  BDConnection() {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    
    public static java.sql.Connection getConnection() throws InstantiationException, IllegalAccessException, SQLException {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, password);
            
            //if(conn != null) {
            //    status = "STATUS --> Conectado com sucesso";
            //} else {
            //    status = "STATUS --> Não foi possível conectar ao banco de dados";
            //}
            
        return conn;
        
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    
    public static void closeConnection() throws SQLException {
        conn.close();
    }
    
    public Connection getConn(){
        return conn;
    }
    
    public static String statusConnection() {
        return status;
    }
}
