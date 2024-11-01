package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioRetiraLocalTest {
	
	Envio e;

	@BeforeEach
	void setUp() throws Exception {
		e= new EnvioRetiraLocal();
	}

	@Test
	void testCostoEnvio() {
		assertEquals(0, e.costoDeEnvio(null, null));
		assertEquals(0, e.costoDeEnvio("Dir2", "dir1"));
	}

}
