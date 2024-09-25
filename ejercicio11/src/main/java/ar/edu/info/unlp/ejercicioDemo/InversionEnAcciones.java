package ar.edu.info.unlp.ejercicioDemo;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;

	
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}



	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
