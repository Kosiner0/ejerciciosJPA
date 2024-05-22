<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.curso.modelo.Curso" %>
<%@ page import="com.curso.service.CursosService" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Diferentes ecos de lista</title>
		
	</head>
	
	<body>
		<%
		
		List<Curso> cursos = (List<Curso>) session.getAttribute("cursos");
	       if (cursos == null) {
	           cursos = new ArrayList<>();
	           session.setAttribute("cursos", cursos);
	       }
		
		String nombre = request.getParameter("nombre");
	    String nivel = request.getParameter("nivel");
	    String finalizar = request.getParameter("finalizar");
	       if (nombre != null && nivel != null) {
	           cursos.add(new Curso(nombre, Integer.parseInt(nivel)));
	           
	       }
		
	    %>
		
		
		<h2 style="color: #A569BD">Lista de cursos usando párrafos</h2>
		<% for(Curso c: cursos){ %>
			<p><%=c.toString() %></p>
		<% }%>
		
		
		<h2 style="color: #A569BD">Lista de cursos usando tabla de 1 fila</h2>
		<table border="1">
		    <tr>
		        <% for(Curso c: cursos){ %>
		            <td><%=c %></td>
		        <% }%>
		    </tr>
		</table>
		
		
		<h2 style="color: #A569BD">Lista de cursos usando tabla de 1 columna</h2>
		<table border="1">
		    <% for(Curso c: cursos){ %>
		        <tr>
		            <td><%=c %></td>
		        </tr>
		    <% }%>
		</table>
		
		
		<h2 style="color: #A569BD">Lista de cursos usando una lista</h2>
		<ul>
		    <% for(Curso c: cursos){ %>
		        <li><%=c %></li>
		    <% }%>
		</ul>
		
		<% if (!"Finalizar".equals(finalizar)) { %>
				<a href="http://localhost:8080/JSPyClases/formulariocursos.jsp" style="color: #2EBB0C; font-size: 25px; text-decoration: underline;">Agregar más cursos</a> 
       	<%}else{ %>
       		<%session.removeAttribute("cursos");%>
       		<h1 style="color: red">GRACIAS POR USAR LA WEB :)</h1>
       	<%} %>
		
		
	</body>
	
</html>
