package com.curso.consultas;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class C08SelectEscalar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<String> consulta = em.createQuery("SELECT l.autor FROM Libro l", String.class);
		
		List<String> directores = consulta.getResultList();
		
		for(String dire: directores) {
			System.out.println(dire);
		}

	}

}
