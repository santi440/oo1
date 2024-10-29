package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioInternacionalTest {

	EnvioInternacional e1,e2, e3;

	@BeforeEach
	void setUp() throws Exception {
		e1= new EnvioInternacional(LocalDate.now(), "Argentina", "EEUU", 100); //6000
		e2= new EnvioInternacional(LocalDate.now(), "Argentina", "España", 1000); //17000
		e3= new EnvioInternacional(LocalDate.now(), "Argentina", "China", 0); // 5000
	}

	@Test
	void testMonto() {
		assertEquals(6000, e1.monto());
		assertEquals(17000, e2.monto());
		assertEquals(5000, e3.monto());
	}

}
