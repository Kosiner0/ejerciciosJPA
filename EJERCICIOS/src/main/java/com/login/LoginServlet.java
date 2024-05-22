package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		List<Usuario> usuarios = (List<Usuario>) session.getAttribute("usuarios");
		boolean encontrado = false;
		
		String usuario = request.getParameter("usuario");
        String pwd = request.getParameter("pwd");
        
        for(Usuario u: usuarios) {
        	if ( u.getUsuario().equals(usuario) && u.getContraseña().equals(pwd)) {
            	request.setAttribute("usuario", usuario); 
            	request.setAttribute("correo", u.getCorreo());
            	request.getRequestDispatcher("bienvenida.jsp").forward(request, response);
                encontrado = true;
            } 
        }
        if(!encontrado) {
        	response.sendRedirect("error.jsp");
        }
        
	}

}
