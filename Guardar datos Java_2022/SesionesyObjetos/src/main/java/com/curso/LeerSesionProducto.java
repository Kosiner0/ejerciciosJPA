package com.curso;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		
		if (producto != null) {
			response.setContentType("text/html");
		    response.getWriter().println("<html><body>");
		    response.getWriter().println("<h1>¡Test de sesiones!</h1>");
		    response.getWriter().println("<p>" + "id: "+ producto.getId() + " producto: " + producto.getConcepto() + " precio: " + producto.getPrecio() + "</p>");
		    response.getWriter().println("</body></html>");
		}else {
			response.setContentType("text/html");
		    response.getWriter().println("<html><body>");
		    response.getWriter().println("<h1>¡Test de sesiones!</h1>");
		    response.getWriter().println("<p>"+ "Sesion finalizada " + "</p>");
		    response.getWriter().println("</body></html>");
		}
	}


}
