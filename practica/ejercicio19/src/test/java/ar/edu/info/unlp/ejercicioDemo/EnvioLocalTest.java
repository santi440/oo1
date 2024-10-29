package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioLocalTest {
	
	EnvioLocal e1,e2;

	@BeforeEach
	void setUp() throws Exception {
		e1= new EnvioLocal(LocalDate.now(), "Salgado 111", "Salgado 611", 20, true); //1500
		e2= new EnvioLocal(LocalDate.now(), "Salgado 111", "Salgado 611", 40, false); //1500
	}

	@Test
	void testMonto() {
		assertEquals(1500, e1.monto());
		assertEquals(1000, e2.monto());
	}

}
