package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LeerSesion
 */
public class LeerSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		String curso = (String) sesion.getAttribute("curso");
		
		response.setContentType("text/html");
	    response.getWriter().println("<html><body>");
	    response.getWriter().println("<h1>¡Leer sesion!</h1>");
	    response.getWriter().println("<p>" + curso + "</p>");
	    response.getWriter().println("</body></html>");
		
	}


}
