package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Usuario pepe;
	Propiedad p1,p2;
	
	@BeforeEach
	void setUp() {
		 pepe = new Usuario("pepe", "calle numero", 112123);
		 p1= new Propiedad("direccion", "nombre", 1);
		 p2= new Propiedad("direccioaaaan", "nombraaaae", 2);
		 pepe.interesarseEnPropiedad(p1);
		 pepe.reservar(p1,  LocalDate.of(2024,10,27), LocalDate.of(2024, 10, 30));
	}
	@Test
	void testConsultarDisponibilidad() {
		assertEquals(true,pepe.consultarDisponibilidad(p1, LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5)));
		assertEquals(false,pepe.consultarDisponibilidad(p2,LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5)));
		assertEquals(false,pepe.consultarDisponibilidad(p1,  LocalDate.of(2024,10,27), LocalDate.of(2024, 10, 30)));
	}
	
	@Test
	void testReservar() {
		assertEquals(true,pepe.reservar(p1, LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5)));
		assertEquals(false,pepe.reservar(p1, LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5)));
		assertEquals(false,pepe.reservar(p1, LocalDate.of(2024,10,28), LocalDate.of(2024, 11, 5)));
	}
	
	@Test
	void testCancelarReservar() {
		assertEquals(true,pepe.cancelarReserva(p1, new DateLapse(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5))));
		assertEquals(false,pepe.cancelarReserva(p1, new DateLapse(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5))));
		assertEquals(false,pepe.cancelarReserva(p2, new DateLapse(LocalDate.of(2024,11,1), LocalDate.of(2024, 11, 5))));	
		}
}
