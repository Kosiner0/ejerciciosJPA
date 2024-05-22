<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Eco select</title>
	</head>
	
	<body>
	
	<%
		int topeBucle = Integer.parseInt(request.getParameter("numero"));
		for(int i=1; i<= topeBucle; i++){%>
			<p><%=i %></p>
			
		<%} %>
	
	</body>
	
</html>