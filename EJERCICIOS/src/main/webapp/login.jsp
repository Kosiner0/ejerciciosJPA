<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Iniciar sesión</title>
		
	</head>
	
	<body>
		<h1 style="color: blue">INICIA SESIÓN</h1>
		
		<form action="LoginServlet" method="post">
			Usuario: <input type="text" name="usuario"><br>
			Contraseña: <input type="password" name="pwd"><br>
			<input type="submit" value="Iniciar sesión">
			
		</form>
		
		<form action="registro.jsp" method="post">
			<input type="submit" value="Registrarse">
		</form>
		
	</body>
	
</html>