package ar.edu.info.unlp.ejercicioDemo;
import java.time.*;
import java.time.temporal.ChronoUnit; // ?????

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}



	public double valorActual() {
		LocalDate hoy = LocalDate.now();
		int dias = hoy.until(fechaDeConstitucion).getDays();
		return this.montoDepositado + this.montoDepositado * dias * this.porcentajeDeInteresDiario/100;
	}
}
