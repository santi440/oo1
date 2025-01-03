package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicio21.BagImpl;

class BagImplTest {
	
	BagImpl<String> b;

	@BeforeEach
	void setUp() throws Exception {
		b = new BagImpl<String>();
	}

	@Test
	void testAdd() {
		assertEquals(true, b.add("Mati"));
		assertEquals(true, b.add("Mati"));
	}
	
	@Test
	void testOcurrenceOf() {
		assertEquals(0, b.occurrencesOf("Juan"));
		b.add("Mati");
		assertEquals(1, b.occurrencesOf("Mati"));
	}
	
	@Test
	void testRemoveAll() {
		b.add("Juan");
		b.add("Juan");
		b.add("Juan");
		b.removeAll("Juan");
		assertEquals(0, b.occurrencesOf("Juan"));
	}
	@Test
	void testRemoveOcurrence() {
		b.remove("Juan");
		assertEquals(0, b.occurrencesOf("Juan"));
	}
	
	@Test
	void testSize() {
		b.add("Juan");
		assertEquals(1, b.size());
		b.add("Juan");
		b.add("Mati");
		assertEquals(3, b.size());
	}

}
