package com.relaciones.principales;

import java.util.List;

import com.relaciones.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Ejemplo04 {

	public static void main(String[] args) {

		//Sale de esa linea el nombre : <persistence-unit name="biblioteca2" transaction-type="RESOURCE_LOCAL">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); 
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.categoria.nombre = 'Light Novel' ", Libro.class);
		
		List<Libro> libros = consulta.getResultList();
		
		for(Libro lib: libros) {
			System.out.println(lib);
		}

	}
	
}
