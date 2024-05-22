package com.almacen.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.almacen.modelo.Producto;

/**
 * Servlet implementation class GenerarProductos
 */
public class GenerarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String[] nombres = {
		    "Camiseta", "Portátil", "Cuaderno", "Pan", "Coche",
		    "Pantalón", "Smartphone", "Pluma", "Frutas", "Bicicleta",
		    "Zapatos", "Tableta", "Lápiz", "Verduras", "Motocicleta",
		    "Sombrero", "Cámara", "Bolígrafo", "Carne", "Autobús",
		    "Bufanda", "Auriculares", "Marcadores", "Pescado", "Avión",
		    "Chaqueta", "Altavoces", "Papel", "Pasteles", "Moto"
		};
	
	private static final String[] categorias = {
		    "Ropa", "Calzado", "Accesorios", "Deportes", "Electrónica",
		    "Hogar", "Joyería", "Maquillaje", "Libros", "Juguetes",
		    "Alimentos", "Bebidas", "Salud", "Cuidado Personal", "Oficina"
		};
	
	private static final double[] precios = {
		    19.99, 29.99, 39.99, 49.99, 59.99,
		    69.99, 79.99, 89.99, 99.99, 109.99,
		    119.99, 129.99, 139.99, 149.99, 159.99
		};

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Random random = new Random();
		
		List<Producto> productos = (List<Producto>) session.getAttribute("productos");
        if (productos == null) {
        	productos = new ArrayList<>();
        }
        
        for(int i = 1; i <= 3; i++) {
        	String nombre = nombres[random.nextInt(nombres.length)];
            String categoria = categorias[random.nextInt(categorias.length)];
            double precio = precios[random.nextInt(precios.length)];
            int stock = random.nextInt(150);
            
            Producto newProducto = new Producto(nombre, categoria, precio, stock);
            productos.add(newProducto);
        }
		
        session.setAttribute("productos", productos);
        Registrar.ps.setListaProductos(productos);
                
        request.setAttribute("mensaje", "Se han registrado correctamente 3 productos.");
    	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	}

}
