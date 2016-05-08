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

    public static String driver;
    public static String url;
    public static String user;
    public static String password;
    public static Connection conn;
    public static String status = "Não foi possível conectar ao banco";
        
    public  BDConnection() {
        
    }
    
    public static java.sql.Connection getConnection() throws InstantiationException, IllegalAccessException, SQLException {
        
        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        url = "jdbc:mysql://localhost:3306/projeto-crud-1.0";
        
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, password);
            
            if(conn != null) {
                status = "STATUS --> Conectado com sucesso";
            } else {
                status = "STATUS --> Não foi possível conectar ao banco de dados";
            }
            
        return conn;
        
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    
    public static void closeConnection() throws SQLException {
        conn.close();
    }
    
    public static String statusConnection() {
        return status;
    }
}
