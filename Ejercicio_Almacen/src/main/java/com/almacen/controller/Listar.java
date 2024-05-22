package com.almacen.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.almacen.modelo.Producto;

/**
 * Servlet implementation class Listar
 */
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = (List<Producto>) request.getSession().getAttribute("productos");
        
        if(productos == null || productos.isEmpty()) {
        	request.setAttribute("mensaje", "No hay productos en el almacén.");
        	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
        	
        }else {
        	Collections.sort(productos, new Comparator<Producto>() {
                @Override
                public int compare(Producto p1, Producto p2) {
                    // Comparar por nombre
                    int resultado = p1.getCategoria().compareTo(p2.getCategoria());
                    
                    // Si los nombres son iguales, comparar por categoría
                    if (resultado == 0) {
                        resultado = p1.getNombre().compareTo(p2.getNombre());
                    }
                    
                    return resultado;
                }
            });
            
            request.setAttribute("productos", productos);
            
            // Redirigir a la página JSP para mostrar los productos por categoría
            request.getRequestDispatcher("listar.jsp").forward(request, response);
        }
        
    }
 
}
