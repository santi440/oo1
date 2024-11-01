package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PagoAlContadoTest {

	Pago p;

	@BeforeEach
	void setUp() throws Exception {
		p= new PagoAlContado();
	}

	@Test
	void testCostoAgregado() {
		assertEquals(1, p.costoAgregado());
	}

}
