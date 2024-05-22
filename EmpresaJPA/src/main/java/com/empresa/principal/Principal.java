package com.empresa.principal;


import com.empresa.metodos.Metodos;

public class Principal {

	public static void main(String[] args) {

		//Metodos.nuevoDeptoConTresEmpleados();
		/*
		System.out.println("\n empleadoADeptoExistente: ");
		Metodos.empleadoADeptoExistente(1);
		
		System.out.println("\n menosTiempoDeDos: ");
		Empleado emple1 = new Empleado("Empleado1", Date.valueOf(LocalDate.of(2024, 04, 02)), 22222.00);
		Empleado emple2 = new Empleado("Empleado2", Date.valueOf(LocalDate.of(2024, 04, 19)), 33333.00);
		Metodos.menosTiempoDeDos(emple1, emple2);
		
		System.out.println("\n");
		Metodos.mostrarDepartamentos();
		*/
		System.out.println("\n mostrarEmpleadosDepartamento |DeptoPruebasEmpresa|: ");
		Metodos.mostrarEmpleadosDepartamento("DeptoPruebasEmpresa");
		/*
		System.out.println("\n mostrarDepartamentosMenosXEmpleados |6|: ");
		Metodos.mostrarDepartamentosMenosXEmpleados(6);
		
		System.out.println("\n empleadosCobranMenosPromedio: ");
		Metodos.empleadosCobranMenosPromedio();
		*/
		
		
	}

}
