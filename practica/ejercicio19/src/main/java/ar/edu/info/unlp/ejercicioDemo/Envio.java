package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double peso;
	
	public Envio(LocalDate fecha, String origen, String destino, double peso) {
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public double getPeso() {
		return peso;
	}
	
	public abstract double monto();
	
}
