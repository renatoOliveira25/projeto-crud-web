<%
	String id = request.getParameter("id");
	
	BeanUsuarios usuario = (buscarUsuarioNoBD(Parametro id));
	
	//posso usar RequestDispatcher para levar a outra página
%>
<html>

<title>Deletar Usuario</title>

<head>

</head>

<body>

	<form action="deletarUsuario" method="post">
	Tem certeza que deseja deletar <%=usuario.nome%>?
		<table>
			<td>Codigo: <%=usuario.id%></td>
			<td>Codigo: <%=usuario.nome%></td>
			<td>Codigo: <%=usuario.sobrenome%></td>
			<td>Codigo: <%=usuario.login%></td>
			<input type="submit">Deletar</input>
		</table>
	</form>
</body>

</html>
