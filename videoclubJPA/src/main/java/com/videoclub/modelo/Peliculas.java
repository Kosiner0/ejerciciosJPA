package com.videoclub.modelo;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="peliculas")

public class Peliculas {
	
	@Id
	private int codigo;
	private String titulo;
	
	@Column(name = "nombre_director")
	private String nombreDirector;
	
	@Column(name = "precio_alquiler")
	private double precioAlquiler;
	
	
	public Peliculas() {
		
	}

	public Peliculas(int codigo, String titulo, String nombreDirector, double precioAlquiler) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.nombreDirector = nombreDirector;
		this.precioAlquiler = precioAlquiler;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (codigo != other.codigo)
			return false;
		if (nombreDirector == null) {
			if (other.nombreDirector != null)
				return false;
		} else if (!nombreDirector.equals(other.nombreDirector))
			return false;
		if (Double.doubleToLongBits(precioAlquiler) != Double.doubleToLongBits(other.precioAlquiler))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peliculas [codigo=" + codigo + ", titulo=" + titulo + ", nombreDirector=" + nombreDirector
				+ ", precioAlquiler=" + precioAlquiler + "]";
	}
	
	
}
