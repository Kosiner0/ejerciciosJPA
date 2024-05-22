package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LeerCookie
 */
public class LeerCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String respuesta = "";
	    Cookie[] listaCookies = request.getCookies();
	    
	    if (listaCookies != null) { 
	        for(Cookie c : listaCookies) {
	            respuesta += c.getName() + ":  " + c.getValue() + "<br>";
	        }
	    } else {
	        respuesta = "No hay cookies";
	    }
	    
	    response.setContentType("text/html");
	    response.getWriter().println("<html><body>");
	    response.getWriter().println("<h1>¡Respuesta de las galletitas!</h1>");
	    response.getWriter().println("<p>" + respuesta + "</p>");
	    response.getWriter().println("</body></html>");
	}



}
