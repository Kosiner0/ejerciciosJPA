package com.curso.repository.jpa;

import java.time.LocalDate;

import com.curso.modelo.Departamento;
import com.curso.modelo.Empleado;
import com.curso.repositorio.Empresa2Repository;

public class Empresa2RepositoryJpa implements Empresa2Repository {
	public static Departamento depto1 = new Departamento("DeptoPrueba", "Narnia");
	public static Empleado emp1 = new Empleado("Empleado1", LocalDate.of(2024, 04, 02), 2222.00, depto1);
	public static Empleado emp2 = new Empleado("Empleado2", LocalDate.of(2024, 04, 19), 3333.00, depto1);

	@Override
	public void nuevoDeptoConTresEmpleados() {
		em.getTransaction().begin();
		
		Departamento departamento = new Departamento("DeptoPruebasEmpresa", "Barcelona");
		
		//Crear empleado y añadirle un departamento ya existente de la BBDD
		Empleado empleado1 = new Empleado("Prueba1", LocalDate.now(), 2356.00, departamento);
		Empleado empleado2 = new Empleado("Prueba2", LocalDate.of(2024, 05, 19), 1234.00, departamento);
		Empleado empleado3 = new Empleado("Prueba3", LocalDate.of(2024, 05, 21), 543.00, departamento);

		em.persist(departamento);
		em.persist(empleado1);
		em.persist(empleado2);
		em.persist(empleado3);
		
		em.getTransaction().commit();

	}

	@Override
	public void empleadoADeptoExistente(int idDepto) {
		em.getTransaction().begin();
		
		Departamento departamento = em.find(Departamento.class, idDepto);
		Empleado empleado = new Empleado("Jaime", LocalDate.of(2024, 05, 22), 111.00, departamento);
		
		em.persist(empleado);
		em.getTransaction().commit();

	}

	@Override
	public String menosTiempoDeDos() {
		long dierenciaTiempo = emp1.getFecha().compareTo(emp2.getFecha());

		if(dierenciaTiempo > 0) {
			return emp1.toString();
		    
		} else if(dierenciaTiempo < 0) {
			return emp2.toString();
		    
		} else {
		    System.out.println("Los dos llevan el mismo tiempo en la empresa.");
		}
		return null;
	}

	@Override
	public Iterable<Departamento> mostrarDepartamentos() {
		return em.createQuery("SELECT d FROM Departamento d", Departamento.class)
				.getResultList();
	}

	@Override
	public Iterable<Empleado> mostrarEmpleadosDepartamento(String depto) {
		return em.createQuery("SELECT e FROM Empleado e WHERE e.departamento.nombre = :depto", Empleado.class)
	             .setParameter("depto", depto)
	             .getResultList();
	}
	
	@Override
	public Iterable<Departamento> mostrarDepartamentosMenosXEmpleados(int numEmples) {
		return em.createQuery("SELECT d FROM Departamento d WHERE SIZE(d.empleados) < :numEmples", Departamento.class)
				.setParameter("numEmples", numEmples)
				.getResultList();
	}

	@Override
	public Iterable<Empleado> empleadosCobranMenosPromedio() {
		return em.createQuery("SELECT e FROM Empleado e WHERE e.sueldo < (SELECT AVG(e.sueldo) FROM Empleado e)", Empleado.class)
				.getResultList();
	}

}
