package com.curso.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.curso.dominio.Noticia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NoticiaTest {

	EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeEach
	void iniciar() {
		emf = Persistence.createEntityManagerFactory("periodico");
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
	public void seleccionarNoticiaTest() {
		Noticia noticia = em.find(Noticia.class, "Primera Noticia");
		assertEquals("Primera Noticia", noticia.getTitulo());
		
	}
	
	@Test
	public void insertarNoticiaTest(){
		em.getTransaction().begin();
		
		Noticia noticia = new Noticia("Nueva Noticia 2", "Autor Nuevo 2", new Date());
		em.persist(noticia);
				
		em.getTransaction().commit();
		
		Noticia noticiaInsertada = em.find(Noticia.class, "Nueva Noticia 2");
		assertEquals("Nueva Noticia 2", noticiaInsertada.getTitulo());
	}
	
	@Test
	public void borrarNoticiaTest(){
		
		Noticia noticia = em.find(Noticia.class, "Primera Noticia");
		
		em.getTransaction().begin();
		
		em.remove(noticia);
		
		em.getTransaction().commit();
		
		Noticia noNoticia = em.find(Noticia.class, "Primera Noticia");
		assertNull(noNoticia);
	}
	
	@Test
	public void actualizarNoticiaTest(){
		
		Noticia noticia = em.find(Noticia.class, "Segunda Noticia");
		
		em.getTransaction().begin();
		
		noticia.setAutor("Autor Actualizado");
		
		em.persist(noticia);
		
		em.getTransaction().commit();
		
		Noticia nuevaNoticia = em.find(Noticia.class, "Segunda Noticia");
		assertEquals("Autor Actualizado", nuevaNoticia.getAutor());
	}
	
}
