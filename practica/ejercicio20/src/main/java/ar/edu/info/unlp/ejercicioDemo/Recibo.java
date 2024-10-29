package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private String CUIL;
	private int antigüedad;
	private LocalDate fecha;
	private double monto;
	
	public Recibo(String nombre, String apellido, String CUIL, int antigüedad, LocalDate fecha, double monto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.antigüedad = antigüedad;
		this.fecha = fecha;
		this.monto = monto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCUIL() {
		return CUIL;
	}

	public int getAntigüedad() {
		return antigüedad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getMonto() {
		return monto;
	}
	
	
}
