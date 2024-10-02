package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {
	ReporteDeConstruccion reporte;
	Cilindro unCilindro= new Cilindro("Hierro","rojo", 10, 1); 
	Esfera unaEsfera= new Esfera("Hierro","rojo", 12);
	PrismaRectangular unPri = new PrismaRectangular("Hierro","rojo", 13, 12, 2);
	
	@BeforeEach 
	void setUp() {
		reporte = new ReporteDeConstruccion();
		reporte.addPieza(unCilindro);
		reporte.addPieza(unaEsfera);
		reporte.addPieza(unPri);
	}
	@Test
	public void testVolumenDeMaterial() {
		double resultado = unCilindro.getVolumen()+unaEsfera.getVolumen()+unPri.getVolumen(); 
		assertEquals(resultado, reporte.volumenDeMaterial("Hierro"));
		assertEquals(0, reporte.volumenDeMaterial("Oro"));
	}
	
	@Test
	public void testSuperficieDeColor() {
		double resultado = unCilindro.getSuperficie()+unaEsfera.getSuperficie()+unPri.getSuperficie();
		assertEquals(resultado, reporte.superficieDeColor("rojo"));
		assertEquals(0, reporte.superficieDeColor("amarillo"));
	}

}
