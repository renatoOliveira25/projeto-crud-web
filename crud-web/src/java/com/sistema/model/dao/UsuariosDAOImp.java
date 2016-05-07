/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.model.dao;

import com.sistema.model.beans.BeanUsuarios;
import com.sistema.util.BDConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renato
 */
public class UsuariosDAOImp implements UsuariosDAO {

    public Connection conn = null;
    public Statement st=null;
    public ResultSet rs=null;
    
    @Override
    public boolean inserirRegistro(BeanUsuarios userBean) {
        String sql = "INSERT INTO usuarios (nome, sobrenome, login, senha) VALUES (?,?,?,?)";
        
       try{
           conn = BDConnection.getConnection();
           
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, userBean.getNomeUsuario());
                stmt.setString(2, userBean.getSobrenomeUsuario());
                stmt.setString(3, userBean.getLogin());
                stmt.setString(2, userBean.getSenha());
                
                stmt.execute();
            }
           
           conn.close();
           
           return true;
       } catch(Exception e) {
           return false;
       }
    }

    @Override
    public boolean deletarRegistro(BeanUsuarios userBean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizarRegistro(BeanUsuarios userBean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet consultarRegistro(BeanUsuarios userBean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet listarRegistros(BeanUsuarios userBean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
