package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ04Actualizar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro libro = em.find(Libro.class, "1A");

		em.getTransaction().begin();
		libro.setAutor("El Sebas");
		libro.setPrecio(104);
		em.merge(libro);
		em.getTransaction().commit();

	}

}
