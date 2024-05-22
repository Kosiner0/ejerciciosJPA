package com.cookies;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
 
/**
* Servlet implementation class LeerCookie
*/
public class LeerCookies extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie[] listaCookies = request.getCookies();
        
        if (listaCookies != null) {
            for(Cookie c : listaCookies) {
                out.println("Nombre de la cookie: " + c.getName() + ", Valor de la cookie: " + c.getValue());
            }
        } else {
            out.println("No hay cookies almacenadas.");
        }
        
        out.close();
    }
}