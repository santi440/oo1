package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

	Email mail,mediano,grande;
	@BeforeEach
	void setUp() {
		List<Archivo> adjuntos = new ArrayList<Archivo>();
		adjuntos.add(new Archivo("1.jpg"));
		adjuntos.add(new Archivo("2.jpg"));
		mail = new Email("NoSoyUnMail","Hola Mundo!",adjuntos);
		
		adjuntos.removeAll(adjuntos);
		for (int i = 0; i<301 ; i++ ) {
			adjuntos.add(new Archivo("1"));
		}
		mediano= new Email("","",adjuntos);
		
		adjuntos.removeAll(adjuntos);
		for (int i = 0; i<501 ; i++ ) {
			adjuntos.add(new Archivo("1"));
		}
		grande= new Email("","",adjuntos);
	}

	@Test
	void testGetTamaño() {
		assertEquals(32, mail.getTamaño());
	}
	
	@Test
	void testContiene() {
		assertEquals(false, mail.contiene("OO1"));
		assertEquals(true, mail.contiene("NoSoyUnMail"));
		assertEquals(true, mail.contiene("Mail"));
		assertEquals(true, mail.contiene("NoSoy"));
		assertEquals(true, mail.contiene("undo"));
	}
	
	@Test
	void testGetCategoria() {
		assertEquals("Pequeño", mail.getCategoria());
		assertEquals("Mediano", mediano.getCategoria());
		assertEquals("Grande", grande.getCategoria());
	}

}
