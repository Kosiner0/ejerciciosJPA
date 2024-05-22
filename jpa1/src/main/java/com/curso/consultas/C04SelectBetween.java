package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class C04SelectBetween {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.precio BETWEEN :precio1 AND :precio2", Libro.class);
		consulta.setParameter("precio1", 20);
		consulta.setParameter("precio2", 99);
		
		List<Libro> libros = consulta.getResultList();
		
		for(Libro lib: libros) {
			System.out.println(lib);
		}

	}

}
