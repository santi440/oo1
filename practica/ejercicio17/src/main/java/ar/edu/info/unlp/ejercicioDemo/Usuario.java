package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.*;

public class Usuario {
	private String nombre;
	private String dirección;
	private int DNI;
	private List<Propiedad>propiedades;
	
	

	public Usuario(String nombre, String dirección, int DNI) {
		this.nombre = nombre;
		this.dirección = dirección;
		this.DNI = DNI;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public boolean consultarDisponibilidad(Propiedad target, LocalDate fechaInicial, LocalDate fechaFin) {
		if(this.propiedades.contains(target)) {
			return target.isDisponible(fechaInicial, fechaFin);
		}
		return false;
	}
	
	public boolean reservar(Propiedad target,LocalDate fechaInicial, LocalDate fechaFin) {
		if(this.propiedades.contains(target)) {
			return target.addReserva(fechaInicial, fechaFin);
		}
		return false;
	}
	// El usuario deberia poder cancelar la reserva pero deberia especificar que propiedad y que reserva es la que cancela ? 
		public boolean cancelarReserva(Propiedad origen, DateLapseInterface reserva) {
			int aux =  this.propiedades.indexOf(origen);
			if (aux != -1) {
				this.propiedades.get(aux).removeReserva(reserva);
				return true;
			}
			return false;
		}
}
