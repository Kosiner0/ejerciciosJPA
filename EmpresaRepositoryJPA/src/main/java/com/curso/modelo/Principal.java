package com.curso.modelo;

import com.curso.repository.jpa.Empresa2RepositoryJpa;

public class Principal {

	public static void main(String[] args){
		Empresa2RepositoryJpa repositorio = new Empresa2RepositoryJpa();
		
		repositorio.nuevoDeptoConTresEmpleados();
		
		repositorio.empleadoADeptoExistente(2);
		
		System.out.println("\nMENOS TIEMPO DE DOS: \n" + repositorio.menosTiempoDeDos()); 
		
		System.out.println("\nLISTA DEPARTAMENTOS: \n" + repositorio.mostrarDepartamentos()); 
		
		System.out.println("\nEMPLEADOS DE DEPARTAMENTO |Departamento1|: \n" + repositorio.mostrarEmpleadosDepartamento("Departamento1"));
		
		System.out.println("\nDEPARTAMENTOS MENOS DE |3| EMPLEADOS: \n" + repositorio.mostrarDepartamentosMenosXEmpleados(3));
		
		System.out.println("\nCOBRAN MENOS PROMEDIO: \n" + repositorio.empleadosCobranMenosPromedio());
		
	}

}
