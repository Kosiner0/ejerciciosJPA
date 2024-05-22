package com.videoclub.metodos;

import java.util.List;

import com.videoclub.modelo.Peliculas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class MetodosVideoclub {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
	private static EntityManager em = emf.createEntityManager();

	
	public static void mostrarPeliculas() {
		TypedQuery<Peliculas> consulta = em.createQuery("SELECT p FROM Peliculas p", Peliculas.class);
		
		List<Peliculas> peliculas = consulta.getResultList();
		
		for(Peliculas peli: peliculas) {
			System.out.println(peli);
		}
	}
	
	public static void mostrarPeliculasAutor() {
		TypedQuery<Peliculas> consulta = em.createQuery("SELECT p FROM Peliculas p WHERE p.nombreDirector = 'Steven Spielberg'", Peliculas.class);
		
		List<Peliculas> peliculas = consulta.getResultList();
		
		for(Peliculas peli: peliculas) {
			System.out.println(peli);
		}
	}
	
	public static void mostrarPeliculasPorInicial() {
		TypedQuery<Peliculas> consulta = em.createQuery("SELECT p FROM Peliculas p WHERE p.nombreDirector LIKE 'R%'", Peliculas.class);
		
		List<Peliculas> peliculas = consulta.getResultList();
		
		for(Peliculas peli: peliculas) {
			System.out.println(peli);
		}
	}
	
	public static void mostrarPeliculasPrimerNombre() {
		TypedQuery<Peliculas> consulta = em.createQuery("SELECT p FROM Peliculas p WHERE p.nombreDirector LIKE 'James%' OR p.nombreDirector LIKE 'Robert%'", Peliculas.class);
		
		List<Peliculas> peliculas = consulta.getResultList();
		
		for(Peliculas peli: peliculas) {
			System.out.println(peli);
		}
	}
	
	public static void mostrarDirectoresPeliculas() {
		TypedQuery<String> consulta = em.createQuery("SELECT p.nombreDirector FROM Peliculas p GROUP BY p.nombreDirector", String.class);
		
		List<String> directores = consulta.getResultList();
		
		for(String dire: directores) {
			System.out.println(dire);
		}
	}
	
	public static void mostrarPeliculasEntrePrecios() {
		TypedQuery<Peliculas> consulta = em.createQuery("SELECT p FROM Peliculas p WHERE p.precioAlquiler BETWEEN 20 AND 55", Peliculas.class);
		
		List<Peliculas> peliculas = consulta.getResultList();
		
		for(Peliculas peli: peliculas) {
			System.out.println(peli);
		}
	}
	
	
	
}
