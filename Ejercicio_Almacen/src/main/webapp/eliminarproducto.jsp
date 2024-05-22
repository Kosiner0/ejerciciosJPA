<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.almacen.modelo.Producto" %>
<%@ page import="com.almacen.controller.Registrar" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Eliminar un producto</title>
		<style>
	        input[type="submit"] {
	        	display: inline-block;
	            margin-top: 30px;
	        }
	        
    	</style>
    	<link rel="stylesheet" type="text/css" href="hojaestilos.css">
    	
	</head>
	
	<body>
		<h2>Eliminar Producto</h2>
		
		<!-- Tabla con los productos -->
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
	            //Pilla la lista estatica de la clase Registrar e itera sobre ella para
	            //sacar los productos en una tabla
	            List<Producto> productos = Registrar.ps.getListaProductos();
	            
	            for (Producto producto : productos) { %>
	                <tr onclick="seleccionarFila(this)">
	                    <td><%= producto.getNombre() %></td>
	                    <td><%= producto.getCategoria() %></td>
	                    <td><%= producto.getPrecio() %> €</td>
	                    <td><%= producto.getStock() %> uds.</td>
	                    
	                </tr>
	                
	            <% } %>
	            
	        </tbody>
	        
	    </table>
	    
	    <!-- Al hacer click, te lleva a la funcion para eliminar el producto 
	    de la fila seleccionada -->
	    <button onclick="eliminarProducto()">Eliminar Producto</button>
	    
	    <script>
		    var filaSeleccionada;
		
		    function seleccionarFila(fila) {
		        // verifica si ya hay una fila seleccionada
		        if (filaSeleccionada) {
		        	//Elimina el estilo CSS de la fila seleccionada
		            filaSeleccionada.classList.remove("seleccionada");
		        }
		        //Resalta la fila con un estilo diferente
		        fila.classList.add("seleccionada");
		        //Marca la fila HTML 'fila' como la seleccionada actualmente
		        filaSeleccionada = fila;
		    }
		
		    function eliminarProducto() {
		    	//Si no hay fila seleccionada, alerta
		        if (!filaSeleccionada) {
		            alert("Por favor, selecciona un producto primero.");
		            return;
		        }
		
		        // Obtener los datos de la fila seleccionada
		        var nombre = filaSeleccionada.cells[0].innerText;
		        var categoria = filaSeleccionada.cells[1].innerText;
		        var precio = filaSeleccionada.cells[2].innerText;
		        var stock = filaSeleccionada.cells[3].innerText;
		
		        // Enviar los datos al servlet mediante una URL para eliminar el producto
		        window.location.href = "Eliminar?nombre=" + encodeURIComponent(nombre) + "&categoria=" + encodeURIComponent(categoria) + "&precio=" + encodeURIComponent(precio) + "&stock=" + encodeURIComponent(stock);
		    }
		</script>
	    
	    <!-- Boton de volver al menu -->
	    <form action="menu.html">
	        <input type="submit" value="Volver al Menú">
	        
	    </form>
		
	</body>
	
</html>