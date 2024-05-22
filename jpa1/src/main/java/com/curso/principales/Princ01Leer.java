package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ01Leer {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro libro = em.find(Libro.class, "1A");
		Libro libro2 = em.find(Libro.class, "2A");
		
		System.out.println(libro.toString());
		System.out.println(libro2.toString());
	}
}
