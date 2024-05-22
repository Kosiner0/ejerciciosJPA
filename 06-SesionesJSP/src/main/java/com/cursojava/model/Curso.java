package com.cursojava.model;

public class Curso {
	private String nombre;
	private int nivel;
	
	public Curso(String nombre, int nivel) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
	}
	public Curso() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
