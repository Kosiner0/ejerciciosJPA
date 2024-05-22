package com.pruebas;

public class PruebasPrincipal {

	public static void main(String[] args) {
		
		String nombreCorrecto = "    Nombre   de      prueba    ";
		String nombreMalo = " ";
		String nombreMalo2 = null;
		
		if(validarString(nombreCorrecto)) {
			System.out.println(nombreCorrecto.trim());
		}
		System.out.println(nombreCorrecto + " : " + validarString(nombreCorrecto));
		System.out.println(nombreMalo + " : " + validarString(nombreMalo));
		System.out.println(nombreMalo2 + " : " + validarString(nombreMalo2));
		
		
		/*
		String numeroValido = "42";
	    String numeroMalo = " ";
	    String numeroMalo2 = "000000000000000000";
	    
	    try {
	    	
		    int numVal = Integer.parseInt(numeroValido);
		    int numMal = Integer.parseInt(numeroMalo);
		    int numMal2 = Integer.parseInt(numeroMalo2);
		    
		    System.out.println("numeroValido: " + validarEntero(numVal));
		    System.out.println("numeroMalo: " + validarEntero(numMal));
		    System.out.println("numeroMalo2: " + validarEntero(numMal2));
		    
	    }catch (NumberFormatException e) {
	    	
	    	System.out.println("ERROR: El numero no puede estar en blanco.");
	    }
	    */
	}
	
	
	public static boolean validarString(String  cadenaComprobar) {
		return (cadenaComprobar.isNull() || cadenaComprobar.trim().isBlank());

	}
	
	public static boolean validarEntero(int enteroComprobar) {
		String enteroACadena = Integer.toString(enteroComprobar);
		
		//Como compruebo aqui si el enteroComprobar es todo ceros
		if(enteroACadena.matches("^0+$") || enteroACadena.trim().isBlank()) {
			return false;
		}
		return true;
	}

}
