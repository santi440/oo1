package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public abstract class ServicioMedicoVete extends ServicioMedico{
	
	private Medico doctor;
	
	public ServicioMedicoVete(Mascota pet, LocalDate dia, Medico doctor) {
		super(pet, dia);
		this.doctor = doctor;
	}

	protected double costoHelper(double materiales) {
		return materiales + doctor.getHonorarios() + 
				((this.getDia().toLowerCase().equals("saturday")) ?  200 : 0 );
	}

	protected Medico getDoctor() {
		return doctor;
	}
	
	
}
