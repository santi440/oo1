package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class CarpetaTest {
	
	Carpeta box;
	Email primero = new Email("Prueba", "a", new ArrayList<Archivo>()) ;
	Email segundo = new Email("Pruebac", "b", new ArrayList<Archivo>());
	@BeforeEach
	void setUp() {
		box = new Carpeta("Car");
		box.recibir(primero);
		box.recibir(segundo);
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

}
