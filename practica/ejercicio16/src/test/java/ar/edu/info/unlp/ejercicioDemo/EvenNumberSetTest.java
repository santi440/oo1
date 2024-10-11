package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class EvenNumberSetTest {
	
	EvenNumberSet n;
	EvenNumberSetb NaN;
	
	@BeforeEach
	void setUp() throws Exception {
		n= new EvenNumberSet();
		NaN = new EvenNumberSetb();
	}
	
    @Test
    public void testAdd() {
    	n.add(2);
        assertEquals(1, n.size());
        n.add(4);
        assertEquals(2,n.size());
        n.add(5);
        assertEquals(2,n.size());
        n.add(4);
        assertEquals(2,n.size());
    }
    
    @Test
    public void testAddB() {
    	NaN.add(2);
        assertEquals(1, NaN.size());
        NaN.add(4);
        assertEquals(2,NaN.size());
        NaN.add(5);
        assertEquals(2,NaN.size());
        NaN.add(4);
        assertEquals(2,NaN.size());
    }
}
