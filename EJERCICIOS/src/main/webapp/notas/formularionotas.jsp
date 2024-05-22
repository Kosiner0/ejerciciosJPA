<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario de notas</title>
		
	</head>
	
	<body>
		<h1>INTRODUCE LAS NOTAS</h1>
		
		<form action="calcularmedia.jsp" method="post">
			Primera Nota: <input type="number" name="num1"><br>
			Segunda Nota: <input type="number" name="num2"><br>
			Tercera Nota: <input type="number" name="num3"><br>
			<input type="submit" value="Enviar Notas">
			
		</form>
		
	</body>
	
</html>