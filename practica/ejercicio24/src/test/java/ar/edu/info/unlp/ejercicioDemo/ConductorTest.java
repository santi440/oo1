package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConductorTest {
	Conductor c,c2;
	Vehiculo v;
	
	@BeforeEach
	void setUp() throws Exception {
		v = new Vehiculo("auto rojo", 2,2000,1000);
		c = new Conductor(200,v);
		c2 = new Conductor(200,new Vehiculo("autoVerde",3,2024,200));
	}
	
	@Test
	void testAplicarCosto() {
		c.aplicarCosto(100);
		assertEquals(101, c.getSaldo());
		c.aplicarCosto(2000); //101 -( 2000 -1)
		assertEquals(-1898, c.getSaldo());
	}
	
	@Test
	void testCargarSaldo() {
		c.cargarSaldo(100);
		assertEquals(290, c.getSaldo());
		c2.cargarSaldo(100);
		assertEquals(299, c2.getSaldo());
	}
}
