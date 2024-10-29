package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHoras extends Contrato{
	private double valor;
	private int horas;
	private LocalDate fechaDeFin;
	
	public ContratoPorHoras(LocalDate inicio, LocalDate fin, int horas, double valor) {
		super(inicio);
		this.valor = valor;
		this.horas= horas;
		this.fechaDeFin = fin;
	}
	
	@Override
	public boolean isVigente() {
		return LocalDate.now().isBefore(fechaDeFin) || LocalDate.now().isEqual(fechaDeFin);
	}
	
	@Override
	public double basico(boolean conyuge, boolean hijos) {
		return valor * horas;
	}
	@Override
	public int getTiempo() {
		return (isVigente())  ? (int)ChronoUnit.YEARS.between(getFechaInicio(), LocalDate.now()) : 
			 (int)ChronoUnit.YEARS.between(getFechaInicio(), fechaDeFin);
	}

	
}
