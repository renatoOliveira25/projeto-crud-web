/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.model.dao;

import com.sistema.model.beans.BeanUsuarios;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public interface UsuariosDAO {
    
    public abstract void inserirRegistro(BeanUsuarios userBean);
    public abstract void deletarRegistro(int idUsuario);
    public abstract void atualizarRegistro(BeanUsuarios userBean);
    public abstract BeanUsuario consultarRegistro(int idUsuario);
    public abstract List<BeanUsuarios> listarRegistros(); 
    
}
