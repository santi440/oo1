package ar.edu.info.unlp.ejercicioDemo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.*;

public class Viaje {
	private String origen;
	private String destino;
	private double costo;
	private Vehiculo auto;
	private LocalDate fecha;
	private List<Usuario> integrante;
	
	public Viaje(String origen, String destino, double costo, Vehiculo auto, LocalDate fecha,Conductor e){
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.auto = auto;
		this.fecha = fecha;
		this.integrante = new ArrayList<Usuario>();
		this.integrante.add((Usuario)e);
	}
	
	public boolean isMonth() {
		return (fecha.isBefore(LocalDate.now()) || fecha.isEqual(LocalDate.now())) &&
				(fecha.isAfter(LocalDate.now().minusDays(30)) || fecha.isEqual(LocalDate.now().minusDays(30)));
	
	}
	
	public boolean addPasajero(Pasajero e) {
		// Crea un reloj con fecha pasada para probar si hizo un viaje
		LocalDate fechaFutura = LocalDate.now().minusDays(15);
        Clock clockFuturo = Clock.fixed(fechaFutura.atStartOfDay(ZoneOffset.UTC).toInstant(), ZoneId.systemDefault());
		LocalDate fechaSimulada = LocalDate.now(clockFuturo);
		if(!(this.integrante.contains(e)) && (this.integrante.size()< auto.getCapacidad()) &&
				fechaSimulada.isBefore(fecha.minusDays(2)) || fechaSimulada.isEqual(fecha.minusDays(2))&&
				e.getSaldo() > 0) {
		return this.integrante.add(e);
	}
		return false; 
		
		// metodo original
		  /*if(!(this.integrante.contains(e)) && (this.integrante.size()< auto.getCapacidad()) &&
				LocalDate.now().isBefore(fecha.minusDays(2)) || LocalDate.now().isEqual(fecha.minusDays(2))&&
				e.getSaldo() > 0) {
			return this.integrante.add(e);
		}
		return false; */
	}
	
	public void procesarViaje() {
		this.integrante.stream().forEach(i ->i.aplicarCosto(costo/this.integrante.size()));
	}
}
