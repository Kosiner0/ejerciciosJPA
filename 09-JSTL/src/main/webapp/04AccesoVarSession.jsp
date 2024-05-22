<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver el valor almacenado en la session</title>
</head>
<body>
La variable es sesión es: 
<c:out value="${sessionScope.nombre}"></c:out>
<br>
También podría poner "${sessionScope.nombre}"
</body>
</html>