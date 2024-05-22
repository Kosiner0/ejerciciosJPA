package com.persona.modelo;

public class Persona {
	
	private String nombre;
	private String ocupacion;
	private int edad;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String ocupacion, int edad) {
		super();
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ocupacion=" + ocupacion + ", edad=" + edad + "]";
	}

}
