package com.curso.repositorio;

import com.curso.modelo.Departamento;
import com.curso.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public interface Empresa2Repository {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresa2"); 
	public static EntityManager em = emf.createEntityManager();
	
	public void nuevoDeptoConTresEmpleados();
	public void empleadoADeptoExistente(int idDepto);
	public String menosTiempoDeDos();
	public Iterable<Departamento> mostrarDepartamentos();
	public Iterable<Empleado> mostrarEmpleadosDepartamento(String depto);
	public Iterable<Departamento> mostrarDepartamentosMenosXEmpleados(int numEmples);
	public Iterable<Empleado> empleadosCobranMenosPromedio();
	
}
