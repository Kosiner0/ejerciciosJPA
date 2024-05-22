package com.cursos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private ArrayList<String> cursos;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		cursos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<String> cursos) {
		this.cursos = cursos;
	}
	
}
