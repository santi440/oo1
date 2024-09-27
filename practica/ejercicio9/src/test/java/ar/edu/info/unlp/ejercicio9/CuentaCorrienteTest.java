package ar.edu.info.unlp.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CuentaCorrienteTest {
	
	CuentaCorriente juan , pepe;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new CuentaCorriente(100);
		juan.setSaldo(100);
		pepe = new CuentaCorriente(10);
		//pepe.setSaldo(0);
	}
	
    @Test
    public void testExtraer() {
        assertEquals(true, juan.extraer(200));
        assertEquals(false, juan.extraer(500));
        assertEquals(false, pepe.extraer(200));
    }
    
}
