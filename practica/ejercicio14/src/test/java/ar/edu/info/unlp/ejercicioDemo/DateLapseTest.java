package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {

	DateLapseInterface prueba;
	@BeforeEach
	void setUp() {
		//prueba = new DateLapse(LocalDate.of(2024, 9, 30), LocalDate.of(2024,10,7));
		prueba = new DateLapseAlternative(LocalDate.of(2024, 9, 30), 7);
	}

	@Test
	void test() {
		assertEquals(7, prueba.sizeInDays());
		assertEquals(true, prueba.includesDate(LocalDate.now()));
	}

}
