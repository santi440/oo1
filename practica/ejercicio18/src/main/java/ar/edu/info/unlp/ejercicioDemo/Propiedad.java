package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precio;
	private List<DateLapseInterface> reservas;
	private Politica cancelacion;
	
	public Propiedad(String direccion, String nombre, double precio,Politica cancelacion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.reservas = new ArrayList<DateLapseInterface>();
		this.cancelacion = cancelacion;
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
	
	public double removeReserva(DateLapseInterface reserva) {
		if (!reserva.includesDate(LocalDate.now())) {
			this.reservas.remove(reserva);
			return cancelacion.reembolso((int)ChronoUnit.DAYS.between(LocalDate.now(), reserva.getFrom()))
					*this.precioReserva(reserva);
		}		
		return -1;
	}
	
	public double ingresoPropietario (DateLapseInterface fecha) {
		return this.reservas.stream().filter(r -> fecha.overlaps(r)).mapToDouble(r -> this.precioReserva(r)).sum()* 0.75;
	}

	public String getCancelacion() {
		return this.cancelacion.toString();
	}

	public void setCancelacion(Politica cancelacion) {
		this.cancelacion = cancelacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
