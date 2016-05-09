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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Renato
 */
public class UsuariosDAOImp implements UsuariosDAO {

    public Connection conn;
    public Statement st;
    public ResultSet rs;

    private final String insertQuery = "INSERT INTO usuarios (nome, sobrenome, login, senha) VALUES (?,?,?,?);";
    private final String consultQuery = "SELECT * FROM usuarios;";
    private final String deleteQuery = "DELETE FROM usuarios WHERE id=";
    private final String alterQuery = "UPDATE usuarios SET 'nome'=" + " ,'sobrenome'=" + " ,'login'=" + " ,'senha'= ";

    @Override
    public void inserirRegistro(BeanUsuarios userBean) {

        try {
            conn = BDConnection.getConnection();
           
            try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
                stmt.setString(1, userBean.getNomeUsuario());
                stmt.setString(2, userBean.getSobrenomeUsuario());
                stmt.setString(3, userBean.getLogin());
                stmt.setString(4, userBean.getSenha());

                stmt.execute();
            }
            
            conn.close();
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void deletarRegistro(int idUsuario) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       try {
            conn = BDConnection.getConnection();
            
            st = (Statement) BDConnection.getConnection().createStatement();
            st.execute(deleteQuery + idUsuario);
            
        } catch(Exception e) {
            
        } finally {
            conn.close();
        }
        
        /**
         * https://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql/
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from users where userid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
        
    }

    @Override
    public void atualizarRegistro(BeanUsuarios userBean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        /**
         * https://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql/
         try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update users set firstname=?, lastname=?, dob=?, email=?" +
                            "where userid=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setInt(5, user.getUserid());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }

    @Override
    public BeanUsuario consultarRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        /**
         * https://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql/
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from users where userid=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setUserid(rs.getInt("userid"));
                user.setFirstName(rs.getString("firstname"));
                user.setLastName(rs.getString("lastname"));
                user.setDob(rs.getDate("dob"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
        }
        */
    }

    @Override
    public List<BeanUsuarios> listarRegistros() {
        
        @SuppressWarnings("Convert2Diamond")
        List<BeanUsuarios> usuarios = new ArrayList<BeanUsuarios>();
        try {
            conn = BDConnection.getConnection();
           
            st = (Statement) BDConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery(consultQuery);
            while(rs.next()){
                BeanUsuarios usuario = new BeanUsuarios();
                usuario.setIdUsuario(rs.getInt("id"));
                usuario.setNomeUsuario(rs.getString("nome"));
                usuario.setSobrenomeUsuario(rs.getString("sobrenome"));
                usuario.setLogin(rs.getString("login"));
                
                usuarios.add(usuario);
            }
            
        } catch (Exception e) {
           //JOptionPane.showMessageDialog(null, e);
           
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarios;
    }
}

