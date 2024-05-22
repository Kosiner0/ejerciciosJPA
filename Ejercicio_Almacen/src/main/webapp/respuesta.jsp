<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>Mensaje</title>
</head>
<body>
    <c:if test="${not empty mensaje}">
        <div style="color: #2e8b57; font-size: 25px; font-weight: bold; text-align: center; margin-top: 50px;">
            ${mensaje}
        </div>
    </c:if>
    
    <script>
	    // Esperar 3.5 segundos y luego redirigir a menu.html
	    setTimeout(function() {
	        window.location.href = "menu.html";
	    }, 3500); // 1000 milisegundos = 1 segundo
	</script>

</body>
</html>
