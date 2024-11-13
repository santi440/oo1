package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedicoVete {
	private Medico medico;
	private Mascota mascota;
	private String vacuna; 
	private double costo; 
	
	
	public Vacunacion(Mascota pet, Medico medico, String vacuna, double costo, LocalDate dia) {
		super(pet,dia,medico);
		this.vacuna = vacuna;
		this.costo = costo;
	}
	
	public double costo(){
		return costoHelper(500);
	}
}
