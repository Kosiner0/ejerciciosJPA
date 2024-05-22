package com.videoclub.principal;

import java.util.List;

import com.videoclub.metodos.MetodosVideoclub;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Principal {

	public static void main(String[] args) {
		
		/*
		System.out.println("1. Mostrar todas las películas: "); MetodosVideoclub.mostrarPeliculas();
		
		System.out.println("\n2. Mostrar todas las películas de Steven Spielberg: "); MetodosVideoclub.mostrarPeliculasAutor();
		
		System.out.println("\n3. Mostrar las películas en las que el nombre del director empieza por R: "); MetodosVideoclub.mostrarPeliculasPorInicial();
		
		System.out.println("\n4. Mostrar las películas cuyo director es James o Robert: "); MetodosVideoclub.mostrarPeliculasPrimerNombre();
		
		System.out.println("\n5. Mostrar sólo los directores de las películas: "); MetodosVideoclub.mostrarDirectoresPeliculas();
		
		System.out.println("\n6. Mostrar las películas cuyo precio es mayor que 20 y menor que 55: "); MetodosVideoclub.mostrarPeliculasEntrePrecios();
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Object[]> consulta = em.createQuery("SELECT COUNT(p.precioAlquiler), p.precioAlquiler FROM Peliculas p GROUP BY p.precioAlquiler", Object[].class);
		
		List<Object[]> objects = consulta.getResultList();
		
		for(Object[] subObj: objects) {
			System.out.println("Hay " + subObj[0] + " peliculas que valen " + subObj[1] + " €.\uD83D\uDCAA");
		}
	}

}
