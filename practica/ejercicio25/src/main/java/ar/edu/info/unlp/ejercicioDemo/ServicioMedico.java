package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class ServicioMedico {
	private Mascota pet;
	private LocalDate dia;

	public ServicioMedico(Mascota pet, LocalDate dia) {
		this.pet = pet;
		this.dia = dia;	
	}

	protected String getDia() { 
 		return (String)dia.getDayOfWeek().toString();
	}

	public abstract double costo();
	
}
