package com.alumnos.metodos;

import java.util.List;

import com.alumnos.modelo.Alumnos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Metodos {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("instituto");
	private static EntityManager em = emf.createEntityManager();
	
	public static void seleccionarAlumnosPorNombre(String nombre) {
		TypedQuery<Alumnos> consulta = em.createNamedQuery("seleccionarAlumnosPorNombre", Alumnos.class);
		consulta.setParameter("nombre", nombre);
		
		List<Alumnos> alumnos = consulta.getResultList();
		
		System.out.println("\nMostrar alumnos por nombre '" + nombre + "': ");
		for(Alumnos alum: alumnos) {
			System.out.println(alum);
		}
	}
	
	public static void seleccionarAlumnosPorApellido(String apellido) {
		TypedQuery<Alumnos> consulta = em.createNamedQuery("seleccionarAlumnosPorApellido", Alumnos.class);
		consulta.setParameter("apellido", apellido);
		
		List<Alumnos> alumnos = consulta.getResultList();
		
		System.out.println("\nMostrar alumnos por apellido '" + apellido + "': ");
		for(Alumnos alum: alumnos) {
			System.out.println(alum);
		}
	}
	
	public static void seleccionarAlumnosPorCodigo(int codigo) {
		TypedQuery<Alumnos> consulta = em.createNamedQuery("seleccionarAlumnosPorCodigo", Alumnos.class);
		consulta.setParameter("id", codigo);
		
		List<Alumnos> alumnos = consulta.getResultList();
		
		System.out.println("\nMostrar alumnos por codigo '" + codigo + "': ");
		for(Alumnos alum: alumnos) {
			System.out.println(alum);
		}
	}
	
	public static void seleccionarAlumnosPorCurso(String curso) {
		TypedQuery<Alumnos> consulta = em.createNamedQuery("seleccionarAlumnosPorCurso", Alumnos.class);
		consulta.setParameter("cursos", curso);
		
		List<Alumnos> alumnos = consulta.getResultList();
		
		System.out.println("\nMostrar alumnos por curso '" + curso + "': ");
		for(Alumnos alum: alumnos) {
			System.out.println(alum);
		}
	}
	
	public static void seleccionarTodosLosAlumnos() {
		TypedQuery<Alumnos> consulta = em.createNamedQuery("seleccionarTodosLosAlumnos", Alumnos.class);
		
		List<Alumnos> alumnos = consulta.getResultList();
		
		System.out.println("\nMostrar todos los alumnos: ");
		for(Alumnos alum: alumnos) {
			System.out.println(alum);
		}
	}

}
