package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precio;
	private List<DateLapseInterface> reservas; //Compruebo que fecha de inicio sea despues de hoy y la de fin
	//sea mayor al comienzo?
	
	public Propiedad(String direccion, String nombre, double precio) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.reservas = new ArrayList<DateLapseInterface>();
	}
	
	public boolean isDisponible (LocalDate fechaInicial, LocalDate fechaFin) {
		return !this.reservas.stream().anyMatch(reserva -> reserva.overlaps(new DateLapse(fechaInicial,fechaFin)));
	}
	
	public boolean addReserva(LocalDate fechaInicial, LocalDate fechaFin) {
		DateLapse r1= new DateLapse(fechaInicial, fechaFin);
		if (this.isDisponible(fechaInicial, fechaFin) && (!r1.includesDate(LocalDate.now()) && !fechaInicial.isBefore(LocalDate.now()))) {
			this.reservas.add(r1);
			return true;
		}
		return false;
	}
	
	public double precioReserva (DateLapseInterface reserva) {
		DateLapse opcion = (DateLapse) this.reservas.stream().filter(r -> r.equals(reserva)).findFirst().orElse(null);
			if (opcion != null) {
				return reserva.sizeInDays()* precio;
		}
		return 0;
	}
	
	public boolean removeReserva(DateLapseInterface reserva) {
		if (reserva.includesDate(LocalDate.now())) {
			return this.reservas.remove(reserva);
		}		
		return false;
	}
	
	public double ingresoPropietario (DateLapseInterface fecha) {
		return this.reservas.stream().filter(r -> fecha.overlaps(r)).mapToDouble(r -> this.precioReserva(r)).sum()* 0.75;
	}
}
