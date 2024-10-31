package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class CarpetaTest {
	
	Carpeta box, vacia;
	Email primero = new Email("Prueba", "a", new ArrayList<Archivo>()) ;
	Email segundo = new Email("Pruebac", "b", new ArrayList<Archivo>());
	@BeforeEach
	void setUp() {
		box = new Carpeta("Car");
		box.recibir(primero);
		box.recibir(segundo);
		vacia = new Carpeta("Vacia");
	}

	@Test
	void testContiene() {
		assertEquals(primero, box.contiene("a"));
		assertEquals(primero, box.contiene("Prueba"));
		assertEquals(segundo, box.contiene("c"));
		assertEquals(null, box.contiene(" "));
	}
	
	@Test
	void testGetTamaño() {
		assertEquals(15, box.getTamaño());
	}
	
	@Test
	void testGetCantMail() {
		assertEquals(2, box.getCantMail());
		assertEquals(0,vacia.getCantMail());
	}
	
	@Test
	void testGetCategorias() {
		Map<String, Long> aux = box.getCategorias(); 
		assertTrue(aux.keySet().contains("Pequeño"));
		assertTrue(aux.keySet().contains("Mediano"));
		assertTrue(aux.keySet().contains("Grande"));
		assertEquals(2,aux.get("Pequeño"));
		assertEquals(0,aux.get("Mediano"));
		assertEquals(0,aux.get("Grande"));
	}
	

}
