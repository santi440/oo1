package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class FacturaTest {
	
	Usuario james, guido;
	CuadroTarifario precio;
	
	@BeforeEach
	void setUp() throws Exception {
		precio = new CuadroTarifario(100);
		james = new Usuario("James", "Calle 1 221");
		guido = new Usuario("Guido", "Calle 1 222");
		james.nuevoConsumo(100, 1);
		guido.nuevoConsumo(1, 100);
	}
	
    @Test
    public void testEmitirFactura() {
    	Factura f1=james.emitirFactura(precio.getValor());
        assertEquals(9000,f1.getMonto());
        assertEquals(true, f1.isBonificacion());
        Factura f2=guido.emitirFactura(precio.getValor());
        assertEquals(100,f2.getMonto());
        assertEquals(false, f2.isBonificacion());
        
        //cambiando el valor del cuadroTarifario
        precio.setValor(10);
        Factura f3=james.emitirFactura(precio.getValor());
        assertEquals(900,f3.getMonto());
        assertEquals(true, f3.isBonificacion());
        Factura f4=guido.emitirFactura(precio.getValor());
        assertEquals(10,f4.getMonto());
        assertEquals(false, f4.isBonificacion());
        
        //Factura emitida se ve afectada?
        assertEquals(9000,f1.getMonto());
        assertEquals(true, f1.isBonificacion());
    }
}
