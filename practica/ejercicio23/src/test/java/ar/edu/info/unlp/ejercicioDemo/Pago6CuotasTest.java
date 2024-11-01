package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Pago6CuotasTest {
	
	Pago p;

	@BeforeEach
	void setUp() throws Exception {
		p= new Pago6Cuotas();
	}

	@Test
	void testCostoAgregado() {
		assertEquals(1.2, p.costoAgregado());
	}

}
