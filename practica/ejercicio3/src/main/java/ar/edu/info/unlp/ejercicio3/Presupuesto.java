package ar.edu.info.unlp.ejercicio3;

import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;

	
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(i -> i.costo()).sum();
		
	}
}
