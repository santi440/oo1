package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioSucursalTest {

	Envio e;

	@BeforeEach
	void setUp() throws Exception {
		e= new EnvioSucursal();
	}

	@Test
	void testCostoEnvio() {
		assertEquals(3000, e.costoDeEnvio(null, null));
		assertEquals(3000, e.costoDeEnvio("Dir2", "dir1"));
	}

}
