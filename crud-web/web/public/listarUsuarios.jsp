<%-- 
    Document   : listarUsuarios
    Created on : 08/05/2016, 22:38:34
    Author     : Renato
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sistema.model.beans.BeanUsuarios"%>
<%@page import="com.sistema.model.dao.UsuariosDAO"%>
<%@page import="com.sistema.model.dao.UsuariosDAOImp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend><strong>Lista de Usuários</strong></legend>
            <table align="center" border="1px" width="80%">
                <tr>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                    <th>Login</th>
                    <th>Alterar</th>
                    <th>Deletar</th>
                </tr>
                <%
                    //criar código para recuperar lista de usuário do bd
                    //https://www.youtube.com/watch?v=OnzuVklXEVg
                    UsuariosDAOImp userDAO = new UsuariosDAOImp();
                    List<BeanUsuarios> listaUsuarios = userDAO.listarRegistros();
                    for (BeanUsuarios user: listaUsuarios) {
                %>
                <tr>
                    <th><%= user.getIdUsuario() %></th>
                    <th><%= user.getNomeUsuario() %></th>
                    <th><%= user.getSobrenomeUsuario() %></th>
                    <th><%= user.getLogin() %></th>
                    <th><a href="AlterarUsuario?codigo=<%= user.getIdUsuario()%>">Alterar</a></th>
                    <th><a href="DeletarUsuario?codigo=<%= user.getIdUsuario()%>">Excluir</a></th>
                </tr>
                <%
                    }
                %>
            </table>
        </fieldset>
    </body>
</html>
