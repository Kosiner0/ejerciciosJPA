package com.empresa.metodos;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.empresa.dominio.Departamento;
import com.empresa.dominio.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Metodos {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa"); 
	private static EntityManager em = emf.createEntityManager();
	
	
	public static void nuevoDeptoConTresEmpleados() {
		em.getTransaction().begin();
		
		Departamento departamento = new Departamento("DeptoPruebasEmpresa");
		
		//Crear empleado y añadirle un departamento ya existente de la BBDD
		Empleado empleado1 = new Empleado("Prueba1", Date.valueOf(LocalDate.now()), 23456.00);
		Empleado empleado2 = new Empleado("Prueba2", Date.valueOf(LocalDate.of(2024, 05, 14)), 12345.00);
		Empleado empleado3 = new Empleado("Prueba3", Date.valueOf(LocalDate.of(2024, 05, 13)), 54321.00);
		
		empleado1.setDepartamento(departamento);
		empleado2.setDepartamento(departamento);
		empleado3.setDepartamento(departamento);
		
		//Lista con los empleados nuevos
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		em.persist(departamento);
		em.persist(empleado1);
		em.persist(empleado2);
		em.persist(empleado3);
		
		em.getTransaction().commit();
	}

	public static void empleadoADeptoExistente(int idDepto) {
		em.getTransaction().begin();
		
		Empleado empleado = new Empleado("Jaime", Date.valueOf(LocalDate.of(2024, 05, 12)), 11111.00);
		
		Departamento departamento = em.find(Departamento.class, idDepto);
		empleado.setDepartamento(departamento);
		
		em.persist(empleado);
		
		em.getTransaction().commit();
	}

	public static void menosTiempoDeDos(Empleado emp1, Empleado emp2) {
		long tiempoEmp1 = emp1.getFechaIncorporacion().getTime();
		long tiempoEmp2 = emp2.getFechaIncorporacion().getTime();

		if(tiempoEmp1 > tiempoEmp2) {
			System.out.println("Empleado con menos tiempo: " + emp2.toString());
		    
		} else if(tiempoEmp1 < tiempoEmp2) {
			System.out.println("Empleado con menos tiempo: " + emp1.toString());
		    
		} else {
		    System.out.println("Los dos llevan el mismo tiempo en la empresa.");
		}

		
	}
	
	public static void mostrarDepartamentos() {

		TypedQuery<Departamento> consulta = em.createQuery("SELECT d FROM Departamento d", Departamento.class);
		
		List<Departamento> departamentos = consulta.getResultList();
		
		for(Departamento depto: departamentos) {
			System.out.println(depto);
		}
	}
	
	public static void mostrarEmpleadosDepartamento(String depto) {
		TypedQuery<Empleado> consulta = em.createQuery("SELECT e FROM Empleado e WHERE e.departamento.nombre = :depto", Empleado.class);
		consulta.setParameter("depto", depto);
		
		List<Empleado> empleados = consulta.getResultList();
		
		for(Empleado emple: empleados) {
			System.out.println(emple);
		}
	}
	
	public static void mostrarDepartamentosMenosXEmpleados(int numEmples) {
		TypedQuery<Departamento> consulta = em.createQuery("SELECT d FROM Departamento d WHERE SIZE(d.empleados) < :numEmples", Departamento.class);
		consulta.setParameter("numEmples", numEmples);
		
		List<Departamento> departamentos = consulta.getResultList();
		
		for(Departamento depto: departamentos) {
			System.out.println(depto);
		}
	}
	
	public static void empleadosCobranMenosPromedio() {
		TypedQuery<Empleado> consulta = em.createQuery("SELECT e FROM Empleado e WHERE e.sueldo < (SELECT AVG(e.sueldo) FROM Empleado e)", Empleado.class);
		
		List<Empleado> empleados = consulta.getResultList();
		
		for(Empleado emple: empleados) {
			System.out.println(emple);
		}
	}
	
}
