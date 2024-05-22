package com.almacen.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.almacen.modelo.Producto;

/**
 * Servlet implementation class Eliminar
 */
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		List<Producto> productos = (ArrayList<Producto>) session.getAttribute("productos");
		
		if(productos == null || productos.isEmpty()) {
        	request.setAttribute("mensaje", "No hay productos en el almacén.");
        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
        	
        }else {
			List<Producto> productosAux = productos;
			boolean encontrado = false;
			
			String nombreEliminar = request.getParameter("nombre");
	        String categoria = request.getParameter("categoria");
	        
	        for(Producto p: productosAux) {
	        	if ( p.getNombre().equals(nombreEliminar) && p.getCategoria().equals(categoria)) {
	        		productosAux.remove(p);
	        		encontrado = true;
	        		break;
	            } 
	        }
	        
	        
	        if(encontrado) {
	        	productos = productosAux;
	        	session.setAttribute("productos", productos);
	        	
	        	request.setAttribute("mensaje", "<i>" + nombreEliminar + "</i> ha sido eliminado correctamente.");
	        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	        }else {
	        	request.setAttribute("mensaje", "<i>" + nombreEliminar + "</i> no se ha encontrado.");
	        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	        }
        }
        
	}

}
