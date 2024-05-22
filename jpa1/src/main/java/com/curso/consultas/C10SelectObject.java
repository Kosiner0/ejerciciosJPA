package com.curso.consultas;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class C10SelectObject {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Object[]> consulta = em.createQuery("SELECT COUNT(l.precio), l.precio FROM Libro l GROUP BY l.precio", Object[].class);
		
		List<Object[]> objects = consulta.getResultList();
		
		for(Object[] subObj: objects) {
			System.out.println("De precio " + subObj[1] + " hay " + subObj[0] + " elementos. \uD83E\uDD21 \uD83D\uDC12");
		}

	}

}
