package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas= new ArrayList<Pieza>();
	}
	
	public void addPieza(Pieza unaPieza) {
		this.piezas.add(unaPieza);
	}
	
	public double volumenDeMaterial (String material) {
		return this.piezas.stream().filter(p-> p.getMaterial().equals(material)).mapToDouble(p -> p.getVolumen()).sum();
	}
	public double superficieDeColor (String color) {
		return this.piezas.stream().filter(p-> p.getColor().equals(color)).mapToDouble(p -> p.getSuperficie()).sum();
	}
}
