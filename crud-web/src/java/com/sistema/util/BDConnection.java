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
    public static Connection conn = null;
    public static String status = null;
    
    public  BDConnection() {
        
    }
    
    public static java.sql.Connection getConnection() throws InstantiationException, IllegalAccessException {
        
        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        url = "jdbc:mysql://localhost:3306/" ;
        
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
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void closeConnection() throws SQLException {
        conn.close();
        conn = null;
    }
    
    public static String statusConnection() {
        return status;
    }
    
    
}