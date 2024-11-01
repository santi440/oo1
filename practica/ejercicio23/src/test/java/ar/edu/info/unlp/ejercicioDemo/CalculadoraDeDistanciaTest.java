package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraDeDistanciaTest {
	
	CalculadoraDeDistancia c;

	@BeforeEach
	void setUp() throws Exception {
		c= new CalculadoraDeDistancia();
	}

	@Test
	void test() {
		assertEquals(100, c.distanciaEntre(null, null));
		assertEquals(100, c.distanciaEntre("Av 5 531", "Av 5 532"));
	}

}
