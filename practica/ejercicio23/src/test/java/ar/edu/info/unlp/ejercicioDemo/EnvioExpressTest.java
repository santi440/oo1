package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioExpressTest {
	
	Envio e;

	@BeforeEach
	void setUp() throws Exception {
		e = new EnvioExpress(new CalculadoraDeDistancia());
	}

	@Test
	void testCostoDeEnvio() {
		assertEquals(50,e.costoDeEnvio("dir1", "d2"));
	}

}
