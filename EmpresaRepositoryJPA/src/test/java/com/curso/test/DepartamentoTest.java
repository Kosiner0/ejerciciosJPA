package com.curso.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.curso.modelo.Departamento;

@TestMethodOrder(OrderAnnotation.class)
class DepartamentoTest extends JpaUnitTest{

	@Test
	@Order(1)
	void entityManagerFactoryTest() {
		assertNotNull(emf);
	}
	
	@Test
	@Order(2)
	void entityManagerTest() {
		assertNotNull(em);
	}
	
	@Test
	@Order(3)
	void seleccionarDepartamentoInicialTest() {
		Departamento departamento = em.find(Departamento.class, 1);
		assertEquals("Departamento1", departamento.getNombre());
		
	}
	
	@Test
	@Order(4)
	void borrarDepartamentoInicialTest() {
		Departamento departamento = em.find(Departamento.class, 3);
		
		em.getTransaction().begin();
		em.remove(departamento);
		em.getTransaction().commit();
		Departamento sindDepartamento = em.find(Departamento.class, 3);
		
		assertNull(sindDepartamento);
		
	}
	
	@Test
	@Order(5)
	void insertarDepartamentoTest() {
		em.getTransaction().begin();
		Departamento newDepartamento = new Departamento("Departamento Nuevo Test", "Madrid");
		em.persist(newDepartamento);
		em.getTransaction().commit();
		
		Departamento departamentoInsertado = em.find(Departamento.class, 4);
		assertEquals("Departamento Nuevo Test", departamentoInsertado.getNombre());
	}

}
