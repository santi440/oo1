package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate fechaDeInicio;
	
	public Contrato (LocalDate fecha) {
		this.fechaDeInicio = fecha;
	}
	
	public abstract boolean isVigente();
	public abstract double basico(boolean conyuge, boolean hijos);
	public abstract int getTiempo();
	
	public LocalDate getFechaInicio() {
		return fechaDeInicio;
	}
}
