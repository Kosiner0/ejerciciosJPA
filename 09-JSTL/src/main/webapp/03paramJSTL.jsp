<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eco datos formulario</title>
</head>
<body>
<!-- El objeto param me permite acceder a los parámetros que provienen de un formulario -->
<c:out value="${param.nombre}"></c:out>
</body>
</html>