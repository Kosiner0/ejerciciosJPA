package com.relaciones.principales;

import java.util.List;

import com.relaciones.dominio.Categoria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Ejemplo03 {

	public static void main(String[] args) {

		//Sale de esa linea el nombre : <persistence-unit name="biblioteca2" transaction-type="RESOURCE_LOCAL">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); 
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Categoria> consulta = em.createQuery("SELECT c FROM Categoria c", Categoria.class);
		
		List<Categoria> categorias = consulta.getResultList();
		
		for(Categoria cat: categorias) {
			System.out.println(cat);
		}

	}

}
