<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Tratamiento datos</title>
	</head>
	<body>
		
	<%
		String codigo = request.getParameter("codigo");
		String unidades = request.getParameter("unidades");
	%>
	
		<h2>Has comprado <%=unidades %> unidades del producto con código <%=codigo %>.</h2>
		
	</body>
</html>