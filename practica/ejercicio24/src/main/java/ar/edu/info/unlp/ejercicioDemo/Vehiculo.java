package ar.edu.info.unlp.ejercicioDemo;

public class Vehiculo {
	private Conductor dueño;
	private String descripcion;
	private int capacidad;
	private int fabricacion;
	private double valor;
	
	public Vehiculo(String descripcion, int capacidad, int fabricacion, double valor) {
		this.dueño = null; //????????????????????????????????????????????????????????????
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.fabricacion = fabricacion;
		this.valor = valor;
	}
	
	public void asignarConductor(Conductor e) {
		this.dueño = e;
	}
	
	public Conductor getDueño() {
		return dueño;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public int getFabricacion() {
		return fabricacion;
	}
	public double getValor() {
		return valor;
	}
	
	
}
