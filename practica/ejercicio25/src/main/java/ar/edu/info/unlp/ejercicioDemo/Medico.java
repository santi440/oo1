package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medico {
	private String nombre;
	private LocalDate ingreso;
	private double honorarios;
	
	public String getNombre() {
		return nombre;
	}
	public LocalDate getIngreso() {
		return ingreso;
	}
	
	public int antiguedad() {
		return (int) ChronoUnit.YEARS.between(ingreso, LocalDate.now());
	}
	public double getHonorarios() {
		return honorarios;
	}

	
}
