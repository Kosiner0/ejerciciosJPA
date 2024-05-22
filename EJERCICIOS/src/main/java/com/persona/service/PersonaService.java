package com.persona.service;

import java.util.ArrayList;
import java.util.List;

import com.persona.modelo.Persona;

public class PersonaService {
	
	private List<Persona> personas;

	public PersonaService() {
		personas = new ArrayList<>();
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public void aniadirPersona(Persona persona) {
		personas.add(persona);
	}
	
}
