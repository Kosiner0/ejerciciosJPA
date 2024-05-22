<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cursojava.model.Curso" %>
<%@page import="com.cursojava.servicio.ServicioCursos" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ServicioCursos sc = new ServicioCursos();
		List<Curso> listaCursos = sc.buscarTodos();
	%>
	<form action="sessionImplicita.jsp">
		<select name="nombre">
			<%
				for (Curso c : listaCursos) {
			%>
			<option value="<%=c.getNombre()%>"><%=c.getNombre()%></option>

			<%
				}
			%>
		</select>
		<input type="submit" value="enviar" />


	</form>
</body>
</html>