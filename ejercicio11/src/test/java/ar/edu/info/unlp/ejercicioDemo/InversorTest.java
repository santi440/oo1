package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {

	Inversor alan;
	
	@BeforeEach
	void setUp() throws Exception {
		alan = new Inversor("Alan Turing");
		alan.agregarInversion(new PlazoFijo(LocalDate.now(), 1000, 1));
		alan.agregarInversion(new InversionEnAcciones("Apple", 3 , 100.0));		
	}
	
    @Test
    public void testValorActual() {
        assertEquals(1300, alan.valorActual());
        assertNotEquals(1400.0, alan.valorActual());
    }

}
