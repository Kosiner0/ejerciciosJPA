<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registro</title>
		
	</head>
	
	<body>
		<h1 style="color: #CC5500">Registro de Nuevo Usuario</h1>
		
	    <form action="RegistroServlet" method="post">
	        Nombre de Usuario: <input type="text" name="usuario"><br>
	        Contraseña: <input type="password" name="pwd"><br>
	        Correo Electrónico: <input type="email" name="correo"><br>
	        <input type="submit" value="Registrarse">
	        
	    </form>
		
	</body>
	
</html>