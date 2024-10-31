package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	
	ClienteDeCorreo gmail, vacio;
	Carpeta extra;
	Email otro;
	Email mail;
	
	@BeforeEach
	void setUp() {
		gmail = new ClienteDeCorreo();
		vacio = new ClienteDeCorreo();
		extra = new Carpeta("oo1");
		gmail.addFolder(extra);
		otro = new Email("Terminando", "otro", new ArrayList<Archivo>());
		mail = new Email("aaa", "zzzz", new ArrayList<Archivo>());
		gmail.recibir(otro);
		extra.recibir(mail);
	}

	@Test
	void testBuscar() {
		assertEquals(otro, gmail.buscar("Termina"));
		assertEquals(mail, gmail.buscar("zzz"));
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(21, gmail.espacioOcupado());
	}
	
	@Test
	void testMailTotal() {
		assertEquals(2, gmail.mailTotal());
		assertEquals(0, vacio.mailTotal());
	}
}
