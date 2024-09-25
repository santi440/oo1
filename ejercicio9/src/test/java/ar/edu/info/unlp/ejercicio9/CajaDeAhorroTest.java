package ar.edu.info.unlp.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CajaDeAhorroTest {
	
	CajaDeAhorro james, guido;
	CuentaCorriente out;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new CajaDeAhorro();
		guido = new CajaDeAhorro();
		out= new CuentaCorriente(100);
		james.setSaldo(1000);
		guido.setSaldo(100);
	}
	
    @Test
    public void testTransferirACuenta() {
        assertEquals(true, james.transfereirACueta(500, guido));
        assertEquals(false, guido.transfereirACueta(600, james));
        assertEquals(true, james.transfereirACueta(1, out));
    }
    
    @Test
    public void testExtraer() {
        assertEquals(true, james.extraer(500));
        assertEquals(false, guido.extraer(600));
    }
    
    @Test
    public void testDepositar() {
    	james.depositar(500);
    	guido.depositar(500);
        assertEquals(1490, james.getSaldo());
        assertEquals(590, guido.getSaldo());
    }
}
