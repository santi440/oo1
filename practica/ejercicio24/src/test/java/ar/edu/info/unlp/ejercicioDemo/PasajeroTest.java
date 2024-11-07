package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasajeroTest {
	Pasajero p;
	Conductor c;
	Vehiculo v;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Pasajero(200);
		v = new Vehiculo("auto rojo", 2,2000,500);
		c = new Conductor(200,v);
	}

	@Test
	void testAplicarCosto() {
		p.aplicarCosto(100);
		assertEquals(100, p.getSaldo());
		p.addViaje(new Viaje("origen", "destino",100,v,LocalDate.now().plusDays(3),c));
		p.aplicarCosto(300); //100 - (300 - 500) = 300
		assertEquals(300, p.getSaldo());
		p.aplicarCosto(2000);
		assertEquals(-1200, p.getSaldo());
	}
	
	@Test
	void testAddViaje() {
		Viaje viaje= new Viaje("Que ti", "importa", 100, v,LocalDate.now().plusDays(4),c);
		assertEquals(true, p.addViaje(viaje));
		assertEquals(false, p.addViaje(viaje));
		Pasajero p2 = new Pasajero(200);
		assertEquals(false, p2.addViaje(viaje));
	}
	
	@Test
	void testCargarSaldo() {
		Viaje viaje= new Viaje("Que ti", "importa", 100, v,LocalDate.now().minusDays(2),c);
		p.cargarSaldo(100);
		assertEquals(290, p.getSaldo());
		p.addViaje(viaje);
		p.cargarSaldo(100);
		assertEquals(390, p.getSaldo());
	}
}
