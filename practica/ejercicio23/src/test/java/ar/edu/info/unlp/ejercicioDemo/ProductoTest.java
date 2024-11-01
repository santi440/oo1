package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	Producto p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Producto("Peras", "fruta ecuatoriana fresca muy madura", 100, 5);
	}

	@Test
	void testDismin() {
		assertEquals(true, p.dismin(5));
		assertEquals(0, p.getStock());
		assertEquals(false, p.dismin(5));
		assertEquals(0, p.getStock());
	}

}
