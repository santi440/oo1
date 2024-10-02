package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

	Email mail;
	@BeforeEach
	void setUp() {
		List<Archivo> adjuntos = new ArrayList<Archivo>();
		adjuntos.add(new Archivo("1.jpg"));
		adjuntos.add(new Archivo("2.jpg"));
		mail = new Email("NoSoyUnMail","Hola Mundo!",adjuntos);
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

}
