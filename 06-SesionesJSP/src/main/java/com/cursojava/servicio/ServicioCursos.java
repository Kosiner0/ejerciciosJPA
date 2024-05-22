package com.cursojava.servicio;

import java.util.ArrayList;
import java.util.List;

import com.cursojava.model.Curso;

public class ServicioCursos {

	private static List<Curso> listaCursos = new ArrayList<Curso>();
	static {
		Curso c1 = new Curso("sueco", 1);
		Curso c2 = new Curso("chino", 1);
		Curso c3 = new Curso("japones", 2);

		listaCursos.add(c1);
		listaCursos.add(c2);
		listaCursos.add(c3);
	}
	
	public List<Curso> buscarTodos(){
		return listaCursos;
	}
	public Curso buscarUno (String nombre) {
		for (Curso c:listaCursos) {
			if (c.getNombre().equals(nombre)) {
				return c;
			}
		}
		return null;
	}
}
