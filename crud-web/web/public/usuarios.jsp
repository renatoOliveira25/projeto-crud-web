<%-- 
    Document   : usuarios
    Created on : 07/05/2016, 16:26:00
    Author     : Renato
--%>

<%@page import="com.sistema.util.BDConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários</title>
    </head>
    <body>
        <h1>Usuários</h1>
        
        <%
            out.println(BDConnection.statusConnection());
        %>
        
        <%
            BDConnection.getConnection();
            out.println(BDConnection.statusConnection());
        %>
        
        <form action="usuariosServlet" method="post">
            Nome:<br>
            <input type="text" name="nome"><br><br>
            Sobrenome:<br>
            <input type="text" name="sobrenome"><br><br>
            Login:<br>
            <input type="text" name="login"><br><br>
            Senha:<br>
            <input type="text" name="senha"><br><br>
            
            <input type="submit" value="CADASTRAR">
        </form>
    </body>
</html>
