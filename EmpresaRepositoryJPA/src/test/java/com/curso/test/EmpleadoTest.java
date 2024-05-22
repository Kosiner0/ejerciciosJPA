package com.curso.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.curso.modelo.Departamento;
import com.curso.modelo.Empleado;

@TestMethodOrder(OrderAnnotation.class)
class EmpleadoTest  extends JpaUnitTest{
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
	void seleccionarEmpleadoInicialTest() {
		Empleado empleado = em.find(Empleado.class, 1);
		assertEquals("Pepito", empleado.getNombre());
		
	}
	
	@Test
	@Order(4)
	void borrarEmpleadoInicialTest() {
		Empleado empleado = em.find(Empleado.class, 3);
		
		em.getTransaction().begin();
		em.remove(empleado);
		em.getTransaction().commit();
		Empleado sinEmpleado = em.find(Empleado.class, 3);
		
		assertNull(sinEmpleado);
		
	}
	
	@Test
	@Order(5)
	void insertarEmpleadoTest() {
		em.getTransaction().begin();
		Departamento departamento = em.find(Departamento.class, 3);
		Empleado newEmpleado = new Empleado("Empleado nuevo", LocalDate.now(), 123.99, departamento);
		em.persist(newEmpleado);
		em.getTransaction().commit();
		
		Empleado empleadoInsertado = em.find(Empleado.class, 6);
		assertEquals("Empleado nuevo", empleadoInsertado.getNombre());
	}

}
