package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	Empleado juan, pedro, marti, lu, santi; 
	Contrato p1,h1,h2;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Empleado("Juan", "Perez", "20222222229", LocalDate.of(2005, 12, 31), true, true);
		pedro = new Empleado("Pedro", "Sanchez", "20222333229", LocalDate.of(2005, 10, 31), true, false);
		marti = new Empleado("Martina", "Adobato", "23522222229", LocalDate.of(2005, 12, 31), false, true);
		lu = new Empleado("Lucia", "Andaluz", "23442222229", LocalDate.of(2005, 12, 31), false, false);
		santi = new Empleado("Santi", "Perez", "20222222229", LocalDate.of(2005, 12, 31), true, true);
		h1 = new ContratoPorHoras(LocalDate.now().minusYears(1), LocalDate.now().plusMonths(1), 3, 5000);
		h2 = new ContratoPorHoras(LocalDate.now().minusYears(2), LocalDate.now().minusMonths(1), 3, 5000);
		p1 = new ContratoDePlanta(LocalDate.now().minusYears(15), 5000, 1000, 1000);
	}
	
    @Test
    public void testAddContrato() {
        assertEquals(true, juan.addContrato(h1));
        assertEquals(false, juan.addContrato(h1));
        assertEquals(false, juan.addContrato(h2));
        
        assertEquals(true, pedro.addContrato(h2));
        assertEquals(true, pedro.addContrato(p1));
        assertEquals(false, pedro.addContrato(p1));
    }
    
    @Test
    public void testEmitirRecibo() {
        juan.addContrato(h2);
        assertEquals(null, juan.emitirRecibo());
        juan.addContrato(h1);
        Recibo r1 = juan.emitirRecibo();
        assertEquals(2, r1.getAntigüedad());
        assertEquals(15000, r1.getMonto());
        
        lu.addContrato(new ContratoPorHoras(LocalDate.now().minusYears(20), LocalDate.now().plusMonths(1), 3, 5000));
        Recibo r2 = lu.emitirRecibo();
        assertEquals(20, r2.getAntigüedad());
        assertEquals(30000, r2.getMonto());
        
        marti.addContrato(p1); 
        Recibo r3 = marti.emitirRecibo();
        assertEquals(15, r3.getAntigüedad());
        assertEquals(10200, r3.getMonto());
        
        pedro.addContrato(new ContratoDePlanta(LocalDate.now().minusYears(10), 5000, 1000, 1000));
        Recibo r4 = pedro.emitirRecibo();
        assertEquals(10, r4.getAntigüedad());
        assertEquals(9000, r4.getMonto());
        
        santi.addContrato(new ContratoDePlanta(LocalDate.now().minusYears(5), 5000, 1000, 1000));
        Recibo r5 = santi.emitirRecibo();
        assertEquals(5, r5.getAntigüedad());
        assertEquals(9100, r5.getMonto());
    }
}
