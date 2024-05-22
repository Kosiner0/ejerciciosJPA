<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ejemplo 01 JSP</title>
	</head>
	<body>
		
		<h1>Primer ejemplo con JSP</h1>
		
		
		<%//Est es un script con java
			String saludo = "Hola desde el mundo JSP";
			out.println(saludo);%>
		
		<br>Esto esta despues del scriplet.
		<br>
		<%String texto="Otra vez hola." ;%>
		<%=texto %>
		
		
		<% for(int i=1; i<7; i++) {%>
			<h<%=i%>>Bienvenido a mi sitio</h<%=i%>>
		<%}%>
			
			
		<!-- TABLA DE MULTIPLICAR -->
		<br>
		<h1>TABLA DE MULTIPLICAR</h1>
		<%String multiplicacion="" ;%>
		<%String tabla="" ;%>
		
		<% for(int i=1; i<=10; i++) {%>
			<h4><%=tabla = "Tabla del " + i %></h4>
		
			<% for(int j=1; j<=10; j++) {%>
				<%=multiplicacion = i + " x " + j + " =" %>
				<%=multiplicacion = "" + i*j %>
				<br>
				
			<%}%>
			
		<%}%>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	</body>
</html>