package com.cursos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class MostrarCursos
 */
public class MostrarCursos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String nombre = (String) session.getAttribute("nombre"); // Obtener el nombre de la sesión
        Usuario usuario = new Usuario(nombre);

        String curso = request.getParameter("curso");

        // Obtener la lista de cursos del usuario desde la sesión
        List<String> cursos = (List<String>) session.getAttribute("cursos");
        if (cursos == null) {
            cursos = new ArrayList<>();
        }

        cursos.add(curso);

        // Guardar la lista actualizada de cursos en la sesión
        session.setAttribute("cursos", cursos);

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

        out.println("<h1 class=\"titulo\">Hola " + usuario.getNombre() + "</h1>");
        out.println("<h3 class=\"cursosActivos\">Cursos activos</h3>");

        for (String cursoRegistrado : cursos) {
            out.println("<p> -" + cursoRegistrado + "</p>\n");
        }
        out.println("<a href=\"http://localhost:8080/EJERCICIOS/formulariocursos.html\">Enlace para inscribirse a cursos</a>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
