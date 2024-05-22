<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.persona.modelo.Persona" %>
<%@ page import="com.persona.service.PersonaService" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Mostrar datos persona</title>
		
	</head>
	
	<body>
	<% 
		String nombre = request.getParameter("nombre");
	    String ocupacion = request.getParameter("ocupacion");
	    String edad = request.getParameter("edad");
	    
    	Persona persona = new Persona(nombre, ocupacion, Integer.parseInt(edad));
	           
	%>
	<h2 style="color: #A569BD"><%=persona.getNombre() %></h2>
		<ul>
	        <li><%=persona.toString() %></li>
		</ul>
		
	</body>
	
</html>