<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Iniciar sesi�n</title>
		
	</head>
	
	<body>
		<h1 style="color: blue">INICIA SESI�N</h1>
		
		<form action="LoginServlet" method="post">
			Usuario: <input type="text" name="usuario"><br>
			Contrase�a: <input type="password" name="pwd"><br>
			<input type="submit" value="Iniciar sesi�n">
			
		</form>
		
		<form action="registro.jsp" method="post">
			<input type="submit" value="Registrarse">
		</form>
		
	</body>
	
</html>