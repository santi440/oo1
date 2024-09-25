package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	
	public Inversor(String nombre, List<Inversion> inversiones) {
		this.nombre = nombre;
		this.inversiones = inversiones;
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public double valorActual () {
		return this.inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
	}
}
