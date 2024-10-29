package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	Cliente james, guido;
	Envio e1,e2,e3;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona("Juan", "Perez", "45555555");
		guido = new Corporativo("Juan", "Hernandez", "45655565");
		e1= new EnvioInternacional(LocalDate.now(), "Argentina", "EEUU", 100); //6000
		e2= new EnvioInterurbano(LocalDate.now(), "Lobos", "La Plata", 100, 132); // 2500
		e3= new EnvioLocal(LocalDate.now(), "Salgado 111", "Salgado 611", 20, true); //1500
		
		james.agregarEnvio(e1);
		james.agregarEnvio(e2);
		james.agregarEnvio(e3);
		guido.agregarEnvio(e1);
		guido.agregarEnvio(e2);
		guido.agregarEnvio(e3);
	}
	
    @Test
    public void testMontoAPagar() {
        assertEquals(10000, guido.montoAPagar(LocalDate.now(), LocalDate.now().plusDays(10)));
        assertEquals(9000, james.montoAPagar(LocalDate.now(), LocalDate.now().plusDays(10)));
        
        assertEquals(10000, guido.montoAPagar(LocalDate.now().minusDays(1), LocalDate.now()));
        assertEquals(9000, james.montoAPagar(LocalDate.now().minusDays(1), LocalDate.now()));
        
        assertEquals(10000, guido.montoAPagar(LocalDate.now().minusDays(1), LocalDate.now().plusDays(1)));
        assertEquals(9000, james.montoAPagar(LocalDate.now().minusDays(1), LocalDate.now().plusDays(1)));
        
        assertEquals(0, guido.montoAPagar(LocalDate.now().plusDays(1), LocalDate.now().plusDays(10)));
        assertEquals(0, james.montoAPagar(LocalDate.now().plusDays(1), LocalDate.now().plusDays(10)));
    }
}
