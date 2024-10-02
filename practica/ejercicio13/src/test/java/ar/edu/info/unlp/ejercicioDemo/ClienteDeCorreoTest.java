package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	
	ClienteDeCorreo gmail;
	Carpeta extra;
	Email otro;
	Email mail;
	
	@BeforeEach
	void setUp() {
		gmail = new ClienteDeCorreo();
		extra = new Carpeta("oo1");
		gmail.addFolder(extra);
		otro = new Email("Terminando", "otro", null);
		mail = new Email("aaa", "zzzz", null);
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
}
