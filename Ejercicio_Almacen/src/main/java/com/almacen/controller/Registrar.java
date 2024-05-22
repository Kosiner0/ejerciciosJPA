package com.almacen.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.almacen.modelo.Producto;
import com.almacen.service.ProductoService;

/**
 * Servlet implementation class Registrar
 */
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ProductoService ps = new ProductoService();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		double precio = 0;
		
		String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        String precioStr = request.getParameter("precio");
        int stock = Integer.parseInt(request.getParameter("stock"));
        
        if (!esNumero(precioStr)) {
        	// Alerta de que precio no es un número válido
        	PrintWriter out = response.getWriter();
        	out.println("<script>alert('El precio debe ser un numero valido'); window.location.href = 'menu.html';</script>");
        	return;
            
        } else {
        	precio = Double.parseDouble(precioStr);
        	
        	Producto newProducto = new Producto(nombre, categoria, precio, stock);
            
    		List<Producto> productos = (List<Producto>) session.getAttribute("productos");
            if (productos == null) {
            	productos = new ArrayList<>();
            }
            
            productos.add(newProducto);
            session.setAttribute("productos", productos);
            ps.setListaProductos(productos);
                    
            request.setAttribute("mensaje", "<i>" + nombre + "</i> se ha registrado correctamente.");
        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
        }
        
	}
	
	private boolean esNumero(String str) {
	    if (str == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

}
