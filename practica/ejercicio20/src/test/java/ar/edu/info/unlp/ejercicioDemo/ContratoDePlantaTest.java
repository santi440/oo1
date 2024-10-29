package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContratoDePlantaTest {

	ContratoDePlanta c1,c2;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new ContratoDePlanta(LocalDate.now().minusYears(1), 5000, 1000, 1000);
		c2 = new ContratoDePlanta(LocalDate.now(), 5000, 1000, 1000);
	}
	
	@Test
	void testBasico() {
		assertEquals(7000, c1.basico(true,true));
		assertEquals(6000, c1.basico(true,false));
		assertEquals(6000, c1.basico(false,true));
		assertEquals(5000, c1.basico(false,false));
	}
	
	@Test
	void testGetTiempo() {
		assertEquals(1, c1.getTiempo());
		assertEquals(0, c2.getTiempo());
	}

}
