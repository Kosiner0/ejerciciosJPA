package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servletEnlace
 */
public class ServletFormularioEjercicio02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("param1");
		String edadToInt = request.getParameter("param2");
		int edad = Integer.parseInt(edadToInt);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("</body>"
				+ " <h2>Estos datos son pasados por un enlace HTML: </h2><br>"
				+ "La edad del usuario es " + edad 
				+ "	y su nombre es "+ nombre
				+ "</html>");
		out.close();

	}

}