package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario02
 */
public class ServletFormulario02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yoga = request.getParameter("yoga");
		String pilates = request.getParameter("pilates");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Eco datos formulario02</title>");
		out.println("</head>");
		out.println("<body>");
		
			if(yoga != null) {
				out.println("Has elegido la opción de " + yoga);
			}
			
			out.println("<br>");
			
			if(pilates != null) {
				out.println("Has elegido la opción de " + pilates);
			}
			
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
