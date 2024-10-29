package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioInterurbanoTest {
	
	EnvioInterurbano e1,e2,e3,e0,e100,e500,eMax;

	@BeforeEach
	void setUp() throws Exception {
		e1= new EnvioInterurbano(LocalDate.now(), "Lobos", "Uribelarrea", 100, 20); // 2000
		e2= new EnvioInterurbano(LocalDate.now(), "Lobos", "La Plata", 100, 132); // 2500
		e3= new EnvioInterurbano(LocalDate.now(), "Lobos", "Esquel", 100, 1771); // 3000
		e0= new EnvioInterurbano(LocalDate.now(), "Lobos", "Lobos", 100, 0); // 2000
		e100= new EnvioInterurbano(LocalDate.now(), "Lobos", "BS As", 100, 100); // 2500
		e500 = new EnvioInterurbano(LocalDate.now(), "Lobos", "Villa Gessel", 100, 500); // 3000
		eMax= new EnvioInterurbano(LocalDate.now(), "Lobos", "Esquel", 100, Double.MAX_VALUE); // 3000
	}

	@Test
	void testMonto() {
		assertEquals(2000, e1.monto());
		assertEquals(2500, e2.monto());
		assertEquals(3000, e3.monto());
		assertEquals(2000, e0.monto());
		assertEquals(2500, e100.monto());
		assertEquals(3000, e500.monto());
		assertEquals(3000, eMax.monto());
	}

}
