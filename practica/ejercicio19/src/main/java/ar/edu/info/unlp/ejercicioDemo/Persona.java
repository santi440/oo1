package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Persona extends Cliente{
	private String dni;

	public Persona(String nombre, String direccion, String DNI) {
		super(nombre, direccion);
		this.dni = DNI;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double montoAPagar(LocalDate fi,LocalDate ff) {
		return super.montoAPagar(fi, ff) * 0.9;
	}

}
