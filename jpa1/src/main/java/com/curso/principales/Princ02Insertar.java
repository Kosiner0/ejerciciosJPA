package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ02Insertar {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro libro = new Libro("1B", "LibroB de 1", "Pana", 60);
		
		em.getTransaction().begin();
		em.persist(libro);
		em.getTransaction().commit();
	}

}
