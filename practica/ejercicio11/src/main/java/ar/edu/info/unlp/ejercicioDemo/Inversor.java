package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public double valorActual () {
		return this.inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
	}
}
