package com.relaciones.principales;

import java.util.ArrayList;
import java.util.List;

import com.relaciones.dominio.Categoria;
import com.relaciones.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Ejemplo02 {

	public static void main(String[] args) {
		
		//Sale de esa linea el nombre : <persistence-unit name="biblioteca2" transaction-type="RESOURCE_LOCAL">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); 
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Crear libro y añadirle una categoria nueva
		Categoria categoria = new Categoria("Light Novel", "Novelas con cosas curiosillas");
		
		Libro libro1 = new Libro("B02", "Titulo 2", "Jaimito", 65);
		Libro libro2 = new Libro("B03", "Titulo 3", "Paquillo", 99);
		libro1.setCategoria(categoria);
		libro2.setCategoria(categoria);
		
		List<Libro> libros = new ArrayList<Libro>();
		libros.add(libro1);
		libros.add(libro2);
		
		categoria.setLibros(libros);
		
		em.persist(categoria);
		em.persist(libro1);
		em.persist(libro2);
		
		em.getTransaction().commit();
	}

}
