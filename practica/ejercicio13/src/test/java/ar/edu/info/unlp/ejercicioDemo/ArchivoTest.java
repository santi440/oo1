package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

	Archivo archivoRandom;
	Archivo another;
	@BeforeEach
	void setUp() {
		archivoRandom = new Archivo("No Hace Nada.jpg");
		another = new Archivo("Hola mundo!");
	}

	@Test
	void testGetTamaño() {
		assertEquals(16, archivoRandom.getTamaño());
		assertEquals(11, another.getTamaño());
	}

}
