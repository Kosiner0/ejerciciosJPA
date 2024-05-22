<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>




<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cursos</title>
		
	</head>
	
	<body>
		<%
			String curso1 = "chino";
			String curso2 = "japones";
			String curso3 = "esperanto";
			
			List<String> listaCursos = new ArrayList<>();
			listaCursos.add(curso1);
			listaCursos.add(curso2);
			listaCursos.add(curso3);
		%>
		
		<h2>Cursos usando párrafos</h2>
		<% for(String c: listaCursos){ %>
			<p><%=c %></p>
		<% }%>	
		
		<h2>Cursos usando tabla de 1 fila</h2>
		<table border="1">
		    <tr>
		        <% for(String c: listaCursos){ %>
		            <td><%=c %></td>
		        <% }%>
		    </tr>
		</table>
		
		<h2>Cursos usando tabla de 1 columna</h2>
		<table border="1">
		    <% for(String c: listaCursos){ %>
		        <tr>
		            <td><%=c %></td>
		        </tr>
		    <% }%>
		</table>
		
		<h2>Cursos usando una lista</h2>
		<ul>
		    <% for(String c: listaCursos){ %>
		        <li><%=c %></li>
		    <% }%>
		</ul>
		
	</body>
	
</html>