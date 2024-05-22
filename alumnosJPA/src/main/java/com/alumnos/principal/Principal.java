package com.alumnos.principal;

import com.alumnos.metodos.Metodos;

public class Principal {

	public static void main(String[] args) {
		
		Metodos.seleccionarAlumnosPorNombre("Pedro");
		
		Metodos.seleccionarAlumnosPorApellido("Gomez");
		
		Metodos.seleccionarAlumnosPorCodigo(25);
		
		Metodos.seleccionarAlumnosPorCurso("Java");
		
		Metodos.seleccionarTodosLosAlumnos();

	}

}
