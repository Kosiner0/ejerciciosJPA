<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplos de bucle</title>
</head>
<body>
<h2>Ejemplo 1</h2>
<c:forEach var="numero" begin="1" end="10" step="1">
  <c:out value="${numero}"></c:out>
</c:forEach>
<br>
<c:forEach var="numero" begin="1" end="20" step="2">
  <c:out value="${numero}"></c:out>
</c:forEach>

<h2>Ejemplo 2</h2>
<% String[] lista = new String[]{"lunes", "martes", "miércoles","jueves"};
pageContext.setAttribute("lista", lista);
%>
<c:forEach var="cadena" items="${lista}">
	<c:out value="${cadena}"></c:out>
</c:forEach>
</body>
</html>