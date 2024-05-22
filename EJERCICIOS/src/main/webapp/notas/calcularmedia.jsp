<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Calcular media de notas</title>
		
	</head>
	
	<body>
		<h1 style="color: coral">RESULTADO DE LA MEDIA DE LAS NOTAS</h1>
		<%
		int notaMedia;
		
		int nota1 = Integer.parseInt(request.getParameter("num1"));
		int nota2 = Integer.parseInt(request.getParameter("num2"));
		int nota3 = Integer.parseInt(request.getParameter("num3"));
		
		int valorMinimo = 0;
		int valorMaximo = 10;

		if (nota1 >= valorMinimo && nota1 <= valorMaximo &&
		    nota2 >= valorMinimo && nota2 <= valorMaximo &&
		    nota3 >= valorMinimo && nota3 <= valorMaximo) {
		    notaMedia = (nota1 + nota2 + nota3)/3;
		    if(notaMedia >= 5){
		    	%> <p style="color: blue; font-size: 25px">Has aprobado con un <%=notaMedia %> de nota media.</p> <%
		    }else{
		    	%><p style="color: firebrick; font-size: 30px">Has suspendido con un <%=notaMedia %> de nota media.</p> <%
		    }
		    
		} else {
			%><p style="color: firebrick; font-size: 23px">Las notas tiene que estar comprendidas entre 0 y 10.</p> <%
		}
		%>
		
	</body>
	
</html>