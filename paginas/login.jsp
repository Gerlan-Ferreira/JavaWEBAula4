<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<div id="login" align="center" style="margin-left: 300px; margin-right: 300px; background: #CCC;" >
			<form action="LoginController" method="post">
				<fieldset>
					<legend>Primeiro Projeto: </legend>
					<label>Login: </label><input name="login" type="text" /><br>
					<label>Senha: </label><input name="senha" type="password" /><br><br>
					<input type="submit" value="Enviar" />
					<input type="submit" value="Cancelar" />
				</fieldset>
			</form>
		</div>
		
		<%
		
			 String msg = (String)request.getAttribute("msg");
		
		%>
		
		<%=msg %>
		
	</body>
</html>