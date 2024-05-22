package com.almacen.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.almacen.modelo.Producto;

/**
 * Servlet implementation class Modificar
 */
public class Modificar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		List<Producto> productos = (List<Producto>) session.getAttribute("productos");
		boolean actualizado = false;
		
		if(productos == null || productos.isEmpty()) {
        	request.setAttribute("mensaje", "No hay productos en el almacén.");
        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
        	
        }else {
			String prodModificar = request.getParameter("prodModificar");
	        String atributo = request.getParameter("atributo");
	        String nuevoValor = request.getParameter("nuevoValor");
	        
	        for(Producto p: productos) {
	        	if ( p.getNombre().equals(prodModificar)) {
	        		
	        		switch(atributo) {
		        		case "nombre":
		        			p.setNombre(nuevoValor);
		        			actualizado = true;
		        			break;
		        			
		        		case "categoria":
		        			p.setCategoria(nuevoValor);
		        			actualizado = true;
		        			break;
		        			
		        		case "precio":
		        			p.setPrecio(Double.parseDouble(nuevoValor));
		        			actualizado = true;
		        			break;
		        			
		        		case "stock":
		        			p.setStock(Integer.parseInt(nuevoValor));
		        			actualizado = true;
		        			break;
		        			
		        		default:
		        			break;	
	        		}
	        		
	            } 
	        }
	        
	        if(actualizado) {
	        	request.setAttribute("mensaje", "<i>" + prodModificar + "</i> ha actualizado su <i>" + atributo + "</i> a <i>" + nuevoValor + "</i> correctamente.");
	        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	        }else {
	        	request.setAttribute("mensaje", "<i>" + prodModificar + "</i> no se ha encontrado.");
	        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	        }
        
        }
	}
	
}
