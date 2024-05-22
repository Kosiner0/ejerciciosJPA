package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import com.curso.modelo.Curso;

public class CursosService {

	private List<Curso> cursos;

	
	public CursosService() {
		cursos = new ArrayList<>();
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void aniadirCurso(Curso curso) {
		cursos.add(curso);
	}
	
}
