package com.curso.generar;

import jakarta.persistence.Persistence;

public class Generar {
	
	public static void main(String[] args) {
		Persistence.generateSchema("periodico", null);
		
	}
}
