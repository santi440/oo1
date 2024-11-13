package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class ServicioDeGuardia extends ServicioMedico {
	private Mascota pet;
	private int cantDias;
	
	public ServicioDeGuardia(Mascota pet, int cantDias,LocalDate dia) {
		super(pet,dia);
		this.cantDias = cantDias;
	}
	
	public double costo() {
		return 300 * cantDias * ((this.pet.moreFive()) ? 0.9 : 1) ;
	}
	
	
}
