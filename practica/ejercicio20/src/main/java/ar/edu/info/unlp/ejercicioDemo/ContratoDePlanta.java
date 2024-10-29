package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoDePlanta extends Contrato {
	private double sueldo;
	private double montoXConyuge;
	private double montoXhijos;
	
	public ContratoDePlanta(LocalDate fecha, double sueldo, double montoXConyuge, double montoXhijos) {
		super(fecha);
		this.sueldo = sueldo;
		this.montoXConyuge = montoXConyuge;
		this.montoXhijos = montoXhijos;
	}
	@Override
	public boolean isVigente() {
		return true;
	}
	@Override
	public double basico(boolean conyuge, boolean hijos ) {
		double aux = sueldo;
		if (conyuge) aux+= montoXConyuge;
		if (hijos) aux+= montoXhijos;
		return aux;
	}
	@Override
	public int getTiempo() {
		return (int)ChronoUnit.YEARS.between(this.getFechaInicio(), LocalDate.now());
	}
}
