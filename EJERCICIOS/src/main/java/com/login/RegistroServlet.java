package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class RegistroServlet
 */
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("pwd");
        String correo = request.getParameter("correo");
        
        Usuario nuevoUsuario = new Usuario(usuario, contraseña, correo);
        
		List<Usuario> usuarios = (List<Usuario>) session.getAttribute("usuarios");
        if (usuarios == null) {
        	usuarios = new ArrayList<>();
        }
        
        usuarios.add(nuevoUsuario);
        session.setAttribute("usuarios", usuarios);
     
        response.sendRedirect("login.jsp");
	}

}
