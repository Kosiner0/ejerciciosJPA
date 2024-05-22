package com.relaciones.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.relaciones.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibroTest2 {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	@BeforeAll
	static void iniciar() {
		emf = Persistence.createEntityManagerFactory("bibliotec3");
		em = emf.createEntityManager();
	}
	
	
	@Test
	public void entityManagerFactoryTest() {
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerTest() {
		assertNotNull(em);
	}
	
	
	@Test
	public void seleccionarLibroTest() {
		Libro libro = em.find(Libro.class, "1AB");
		assertEquals("pepito", libro.getAutor());
		
	}
	
	
	@Test
	public void insertarLibroTest(){
		em.getTransaction().begin();
		
		Libro libro = new Libro("ZZZ", "que sueño", "dormilon", 49);
		em.persist(libro);
				
		em.getTransaction().commit();
		
		Libro libroInsertado = em.find(Libro.class, "ZZZ");
		assertEquals("ZZZ", libroInsertado.getIsbn());
	}
	
	
	@Test
	public void borrarLibroTest(){
		
		Libro libro = em.find(Libro.class, "1AB");
		
		em.getTransaction().begin();
		
		em.remove(libro);
		
		em.getTransaction().commit();
		
		Libro noLibro = em.find(Libro.class, "1AB");
		assertNull(noLibro);
	}
	

}
