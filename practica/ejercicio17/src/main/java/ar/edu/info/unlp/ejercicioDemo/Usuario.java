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
	
	public void interesarseEnPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}

	public boolean consultarDisponibilidad(Propiedad target, LocalDate fechaInicial, LocalDate fechaFin) {
		if(this.propiedades.contains(target)) {
			return target.isDisponible(fechaInicial, fechaFin);
		}
		return false;
	}
	
	public boolean reservar(Propiedad target,LocalDate fechaInicial, LocalDate fechaFin) {
		if(this.propiedades.contains(target)) { //este o el de abajo?
			return target.addReserva(fechaInicial, fechaFin);
		}
		return false;
	}
	// El usuario deberia poder cancelar la reserva pero deberia especificar que propiedad y que reserva es la que cancela ? 
		public boolean cancelarReserva(Propiedad origen, DateLapseInterface reserva) {
			Propiedad destino= this.propiedades.stream().filter(p -> p.equals(origen)).findFirst().orElse(null);
			if (destino != null) {
				return destino.removeReserva(reserva);
			}
			return false;
		}
}
