<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.almacen.modelo.Producto" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>Listado de Productos por Categoría</title>
	    <link rel="stylesheet" type="text/css" href="hojaestilos.css">
	</head>
	<body>
	    <h2>Listado de Productos por Categoría</h2>
	    
	    <table border="1">
	        <thead>
	            <tr>
	                <th>Nombre</th>
	                <th>Categoría</th>
	                <th>Precio</th>
	                <th>Stock</th>
	                
	            </tr>
	            
	        </thead>
	        
	        <tbody>
	            <% 
	            List<Producto> productos = (List<Producto>) request.getAttribute("productos");
	            for (Producto producto : productos) { %>
	                <tr>
	                    <td><%= producto.getNombre() %> </td>
	                    <td><%= producto.getCategoria() %></td>
	                    <td><%= producto.getPrecio() %> €</td>
	                    <td><%= producto.getStock() %> uds.</td>
	                    
	                </tr>
	                
	            <% } %>
	            
	        </tbody>
	        
	    </table>
	    
	    <form action="menu.html">
	    	<div style="margin-top: 20px;"> 
        		<input type="submit" value="Volver al Menú">
    		</div>
	    </form>
	    
	</body>
	
</html>