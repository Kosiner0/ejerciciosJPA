package com.relaciones.principales;

import com.relaciones.dominio.Categoria;
import com.relaciones.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		//Sale de esa linea el nombre : <persistence-unit name="biblioteca2" transaction-type="RESOURCE_LOCAL">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); 
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Crear libro y añadirle una categoria ya existente de la BBDD
		Libro libro1 = new Libro("B02", "Titulo 2", "Jaimito", 65);
		
		Categoria categoria = em.find(Categoria.class, "Fantasía");
		libro1.setCategoria(categoria);
		
		em.persist(libro1);
		
		em.getTransaction().commit();
		
	}

}
