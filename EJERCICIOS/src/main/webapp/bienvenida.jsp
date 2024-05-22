<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	    <title>Bienvenid@</title>
	    
	</head>
	
	<body>
	    <h1>Bienvenido <%=request.getAttribute("usuario") %></h1>
	    <p style="color: coral; font-size: 24px">Has iniciado sesión correctamente.</p>
	    <p style="color: olive; font-size: 19px">Tu correo es <b><%=request.getAttribute("correo") %></b></p>
	    
	</body>
	
</html>