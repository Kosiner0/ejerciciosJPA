<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario para crear persona</title>
		
	</head>
	
	<body>
		<h1 style="color: blue">DATOS PARA AÑADIR PERSONA</h1>
		
		<form action="persona.jsp" method="post">
	        Introduce el nombre: <input type="text" name="nombre"><br>
	        Introduce la ocupación: <input type="text" name="ocupacion"><br>
	        Introduce la edad: <input type="text" name="edad"><br>
	        <input type="submit" value="Enviar Datos">
	        
    	</form>
		
	</body>
	
</html>