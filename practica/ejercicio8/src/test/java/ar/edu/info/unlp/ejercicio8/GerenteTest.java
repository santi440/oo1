package ar.edu.info.unlp.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenteTest {

	Gerente alan;
	
	@BeforeEach
	void setUp() throws Exception {
		alan = new Gerente("Alan Turing");
		
	}
	
	/* (1) aportes de clase Gerente
	   (2) montoBasico clase Gerente
	   -----------------------------
	   aportesDeAlan = 2850
	 */
    @Test
    public void testAportes() {
        assertEquals(2850, alan.aportes());
        
    }
    /*
     * 
	(1) sueldoBasico de clase EmpleadoJerarquico
	(2) sueldoBasico de clase Empleado
	(3) montoBasico de clase Gerente
	(4) aportes de clase Gerente
	(5) montoBasico Gerente
	(6) bonoPorCategoria de clase EmpleadoJerarquico
	-----------------------------------
	sueldoBasicoDeAlan = 67850

     */
    @Test
    public void testSueldoBasico() {
    	assertEquals(67850, alan.sueldoBasico());
    }

}
