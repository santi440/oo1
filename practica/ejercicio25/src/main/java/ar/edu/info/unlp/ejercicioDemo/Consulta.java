package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Consulta extends ServicioMedicoVete {
	private Mascota mascota;
	
	public Consulta(Medico medico, Mascota mascota, LocalDate atencion) {
		super(mascota,atencion,medico);
	}
	
	public double costo(){
		return costoHelper(300);   
	}
	
	
}
