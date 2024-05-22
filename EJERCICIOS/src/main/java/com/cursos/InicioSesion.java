package com.cursos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InicioSesion
 */
public class InicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String nombre = request.getParameter("nombre");
		session.setAttribute("nombre", nombre);
				
		Usuario usuario = new Usuario(nombre);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"hojaestilos.css\">");
		out.println("<title>Bienvenida</title>");
		out.println("</head>");
		out.println("<body>");
		
			out.println("<h1 class=\"titulo\">Hola " + usuario.getNombre() + "</h1><br>");
			
				out.println("<a href=\"http://localhost:8080/EJERCICIOS/formulariocursos.html\">Enlace para inscribirse a cursos</a>");
			
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
