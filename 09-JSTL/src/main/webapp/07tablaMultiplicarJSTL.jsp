<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla de multiplicar</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10" step="1"> 
  ${i} * ${param.numero} =  <b> ${param.numero *i}</b><br>  
</c:forEach>
</body>
</html>