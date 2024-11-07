package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ViajeTest {
	Pasajero p,p2,p3;
	Conductor c;
	Vehiculo a;
	Viaje v,v2,v3;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Pasajero(200);
		p2 = new Pasajero(200);
		p3 = new Pasajero(200);
		a = new Vehiculo("auto rojo", 2,2000,500);
		c = new Conductor(200,a);
		v = new Viaje("origen", "destino",100,a,LocalDate.now().plusDays(3),c);
		v2 = new Viaje("origen", "destino",100,a,LocalDate.now().plusDays(2),c);
		v3 = new Viaje("origen", "destino",100,a,LocalDate.now(),c);
	}

	@Test
	void testAddPasajero() {
		assertEquals(true,v.addPasajero(p));
		assertEquals(false,v.addPasajero(p)); //contains
		p2.aplicarCosto(2000);
		assertEquals(false,v.addPasajero(p2)); //saldo < 0;
		assertEquals(false,v.addPasajero(p3)); // conductor + p + p2 > capacidad
		assertEquals(true, v2.addPasajero(p)); //faltando justo 2 dias
		assertEquals(false, v3.addPasajero(p)); //faltando menos de 2 dias
	}
	
	@Test
	void testIsMonth() {
		assertEquals(false, v.isMonth()); //futuro
		Viaje vNO= new Viaje("origen", "destino",100,a,LocalDate.now().plusDays(1),c);
		assertEquals(false, vNO.isMonth());
		Viaje vNO2= new Viaje("origen", "destino",100,a,LocalDate.now().minusDays(32),c);
		assertEquals(false, vNO2.isMonth());
	}
	@Test
	void testProcesarViaje() {
		v.addPasajero(p);
		v.procesarViaje(); //100 /2 = 50
		assertEquals(150, p.getSaldo()); //200 -50
		assertEquals(150.5, c.getSaldo()); //200 - 50 + (valor Auto)500 * 0.01
	}
}
