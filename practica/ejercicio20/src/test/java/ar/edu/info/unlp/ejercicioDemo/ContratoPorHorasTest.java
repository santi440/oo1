package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContratoPorHorasTest {
	
	ContratoPorHoras c1,c2;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new ContratoPorHoras(LocalDate.now().minusYears(1), 
				LocalDate.now().plusMonths(1), 3, 5000); //vigente
		c2 = new ContratoPorHoras(LocalDate.now().minusYears(2)
				, LocalDate.now().minusMonths(1), 3, 5000); //vencido 
		
	}

	@Test
	void testIsVigente() {
		assertEquals(true, c1.isVigente());
		assertEquals(false, c2.isVigente());
	}
	
	@Test
	void testBasico() {
		assertEquals(15000, c1.basico(true,true));
		assertEquals(15000, c1.basico(true,false));
		assertEquals(15000, c1.basico(false,true));
		assertEquals(15000, c1.basico(false,false));
		
		assertEquals(15000, c2.basico(true,true));
		assertEquals(15000, c2.basico(true,false));
		assertEquals(15000, c2.basico(false,true));
		assertEquals(15000, c2.basico(false,false));
	}
	
	@Test
	void testGetTiempo() {
		assertEquals(1, c1.getTiempo());
		assertEquals(1, c2.getTiempo());
	}

}
