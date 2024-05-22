package com.cursojava.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.cursojava.modelo.Pagina;
import com.cursojava.service.BuscadorService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Buscador
 */
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
 	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//recogemos el parámetro
    	String tematica = request.getParameter("tematica");
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	out.println("<!DOCTYPE html>");
    	out.println("<html lang=\"es\">");
    	out.println("<head>");
    	out.println("<meta charset=\"UTF-8\">");
    	out.println("<title>Buscador</title>");
    	out.println("</head>");
    	out.println("<body>");
        
    	BuscadorService service = new BuscadorService();
        
    	List<Pagina> paginas= service.buscador(tematica);
    	if(!paginas.isEmpty()) {
        	out.println("<h2>Temática: " +tematica + "</h2>");    
            
        	for(Pagina pagina:paginas) {
            	out.println("<a href=http://"+ pagina.getDireccion() + ">" +pagina.getDireccion() + "</a><br>");
            	out.println("<h3>"+ pagina.getDescripcion()+ "</h3>");
            	out.println("<hr>");
        	}
    	}else {
        	out.println("<h2>No hay datos de la temática " +tematica + "solicitada </h2>");
    	}
    	out.println("<a href=\"formulario.html\">volver</a>");
        
    	out.println("</body>");
    	out.println("</html>");
    	out.close();
        
	}

}
