/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.model.beans;

/**
 *
 * @author Renato
 */
public class BeanUsuarios {
    
    private int idUsuario;
    private String nomeUsuario;
    private String sobrenomeUsuario;
    private String login;
    private String senha;
    
    public BeanUsuarios() {
    
    }
    
    public BeanUsuarios(int idUsuario, String nomeUsuario, String sobrenomeUsuario, String login, String senha) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.login = login;
        this.senha = senha;
    }
    
    public BeanUsuarios(String nomeUsuario, String sobrenomeUsuario, String login, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.login = login;
        this.senha = senha;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
