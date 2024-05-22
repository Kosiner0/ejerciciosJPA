<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario de cursos</title>
		
	</head>
	
	<body>
		
		<form action="curso.jsp" method="post">
	        Introduce nombre del curso: <input type="text" name="nombre"><br>
	        Introduce nivel del curso: <input type="text" name="nivel"><br>
	        <input type="submit" value="Añadir curso">
	        <input type="submit" name="finalizar" value="Finalizar">
	        
    	</form>
		
	</body>
	
</html>