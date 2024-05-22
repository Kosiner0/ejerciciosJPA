package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LeerSesionProducto
 */
public class LeerSesionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		Producto producto = (Producto) sesion.getAttribute("producto");
		Producto producto2 = (Producto) sesion.getAttribute("producto2");
		Producto producto3 = (Producto) sesion.getAttribute("producto3");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("</body><h2>Esto es una sesion de un producto : </h2><br>");
		out.println(producto.getId() + ", "+ producto.getConcepto()+ ", " +producto.getPrecio());
		out.println("<br>");
		out.println(producto2.getId() + ", "+ producto2.getConcepto()+ ", " +producto2.getPrecio());
		out.println("<br>");
		out.println(producto3.getId() + ", "+ producto3.getConcepto()+ ", " +producto3.getPrecio());
		out.println("</html>");
		out.close();
	}

}