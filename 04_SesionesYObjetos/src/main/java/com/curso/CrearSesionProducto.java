package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class CrearSesionProducto
 */
public class CrearSesionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);
		sesion.setMaxInactiveInterval(120);
		
		Producto producto = new Producto(1,"mesa",350.00);
		Producto producto2 = new Producto(2,"libro",20.30);
		Producto producto3 = new Producto(3,"armario",260.72);
		sesion.setAttribute("producto", producto);
		sesion.setAttribute("producto2", producto2);
		sesion.setAttribute("producto3", producto3);
	}


}