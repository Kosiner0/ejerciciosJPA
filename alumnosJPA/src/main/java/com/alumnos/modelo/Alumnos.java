package com.alumnos.modelo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")

@NamedQueries({
	@NamedQuery(name="seleccionarAlumnosPorNombre", query="SELECT a FROM Alumnos a WHERE a.nombre = :nombre"),
	@NamedQuery(name="seleccionarAlumnosPorApellido", query="SELECT a FROM Alumnos a WHERE a.apellido = :apellido"),
	@NamedQuery(name="seleccionarAlumnosPorCodigo", query="SELECT a FROM Alumnos a WHERE a.id = :id"),
	@NamedQuery(name="seleccionarAlumnosPorCurso", query="SELECT a FROM Alumnos a WHERE a.cursos = :cursos"),
	@NamedQuery(name="seleccionarTodosLosAlumnos", query="SELECT a FROM Alumnos a ")
})

public class Alumnos {
	
	@Id
	private int id;
	private String nombre;
	private String apellido;
	private String cursos;
	
	
	public Alumnos() {
		
	}

	public Alumnos(int id, String nombre, String apellido, String cursos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cursos = cursos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCurso() {
		return cursos;
	}

	public void setCurso(String cursos) {
		this.cursos = cursos;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumnos other = (Alumnos) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumnos [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", curso=" + cursos + "]";
	}
	
}
