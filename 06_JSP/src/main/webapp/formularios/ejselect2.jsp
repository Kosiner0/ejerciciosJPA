<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ejemplo select con JSP</title>
		
	</head>
	
	<body>
		
		<form action="bucleRequest.jsp" method="post">
			<select name="numero">
				<% for(int i=1; i<= 10; i++) {%>
					<option value=<%=i%>><%=i%></option>
					
				<%}%>
				
			</select>
			<input type="submit" value="Enviar">
			
		</form>
		
	</body>
	
</html>