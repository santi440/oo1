package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {
	
	Propiedad p1;
	DateLapse r1;
	
	@BeforeEach
	void setUp() {
		p1= new Propiedad("direccion", "nombre", 1, new PoliticaFlexible());
		r1 = new DateLapse(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5));
		p1.addReserva(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5));
	}
	
	@Test
	void testAddReserva() {
		assertEquals(false, p1.addReserva(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5)));
		assertEquals(true, p1.addReserva(LocalDate.of(2025,1,1), LocalDate.of(2025,1,5)));
		assertEquals(false, p1.addReserva(LocalDate.of(2025,1,1), LocalDate.of(2025,1,5)));
		assertEquals(false, p1.addReserva(LocalDate.of(2024,1,1), LocalDate.of(2024,1,5)));
	}
	
	@Test
	void testPrecioReserva() {
		assertEquals(4, p1.precioReserva(r1));
		assertEquals(0, p1.precioReserva(new DateLapse(LocalDate.of(2025,1,1), LocalDate.of(2025,1,5))));
	}
	
	@Test
	void testRemoveReserva() {
		p1.addReserva(LocalDate.now(), LocalDate.of(2024, 10, 30));
		assertEquals(true, p1.removeReserva(r1));
		assertEquals(false, p1.removeReserva(r1));
		assertEquals(false, p1.removeReserva(new DateLapse(LocalDate.now(), LocalDate.of(2024, 10, 30))));
	}
	
	@Test
	void testIngresoPropietario() {
		p1.addReserva(LocalDate.of(2024,10,30), LocalDate.of(2024, 10, 30));
		assertEquals(3, p1.ingresoPropietario(new DateLapse(LocalDate.now(), LocalDate.of(2024, 12, 31))));
		p1.addReserva(LocalDate.of(2024,11,28), LocalDate.of(2024, 11, 30));
		assertEquals(4.5, p1.ingresoPropietario(new DateLapse(LocalDate.now(), LocalDate.of(2024, 12, 31))));
		assertEquals(4.5, p1.ingresoPropietario(new DateLapse(LocalDate.now(), LocalDate.of(2024, 11, 29))));
		p1.addReserva(LocalDate.of(2025,11,28), LocalDate.of(2025, 11, 30));
		assertEquals(4.5, p1.ingresoPropietario(new DateLapse(LocalDate.now(), LocalDate.of(2024, 12, 31))));
	}
	
	@Test
	void testIsDisponible() {
		assertEquals(false, p1.isDisponible(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5)));
		assertEquals(true, p1.isDisponible(LocalDate.of(2025,1,1), LocalDate.of(2025,1,5)));
		p1.addReserva(LocalDate.of(2025,1,1), LocalDate.of(2025,1,5));
		assertEquals(false, p1.isDisponible(LocalDate.of(2025,1,1), LocalDate.of(2025,1,5)));
		}
}
