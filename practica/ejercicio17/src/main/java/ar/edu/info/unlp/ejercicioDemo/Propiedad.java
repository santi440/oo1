package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precio;
	private List<DateLapseInterface> reservas;
	
	public Propiedad(String direccion, String nombre, double precio) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.reservas = new ArrayList<DateLapseInterface>();
	}
	
	public boolean isDisponible (LocalDate fechaInicial, LocalDate fechaFin) {
		return this.reservas.stream().anyMatch(reserva -> reserva.overlaps(new DateLapse(fechaInicial,fechaFin)));
	}
	
	public boolean addReserva(LocalDate fechaInicial, LocalDate fechaFin) {
		if (this.isDisponible(fechaInicial, fechaFin)) {
			this.reservas.add(new DateLapse(fechaInicial, fechaFin));
			return true;
		}
		return false;
	}
	
	public double precioReserva (DateLapseInterface reserva) {
		if (this.reservas.contains(reserva)) {
			return reserva.sizeInDays()* precio;
		}
		return 0;
	}
	
	public boolean removeReserva(DateLapseInterface reserva) {
		if (!reserva.includesDate(LocalDate.now())) {
			return this.reservas.remove(reserva);
		}		
		return false;
	}
	
	public double ingresoPropietario (DateLapseInterface fecha) {
		return this.reservas.stream().filter(r -> fecha.overlaps(r)).mapToDouble(r -> this.precioReserva(r)).sum()* 0.75;
	}
}
