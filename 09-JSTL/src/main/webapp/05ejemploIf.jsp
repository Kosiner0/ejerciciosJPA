<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suspenso o aprobado</title>
</head>
<body>
<h2>Utilizo dos etiquetas c:if</h2>
<c:if test="${param.numero>=5 }">
     <c:out value="Aprobado"></c:out>
</c:if>

<c:if test="${param.numero<5 }">
     <c:out value="Suspenso"></c:out>
</c:if>
<br>
<h2>Utilizo etiqueta c:choose con c:otherwise</h2>
<c:choose>
	<c:when test="${param.numero>=5}">
	     <c:out value="Has aprobado"></c:out>
	</c:when>
	<c:otherwise>
	     <c:out value="Has suspendido"></c:out>
	</c:otherwise>	
</c:choose>
</body>
</html>