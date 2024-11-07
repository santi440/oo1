package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class Pasajero extends Usuario{
	private List<Viaje> viajes;

	public Pasajero(double saldo) {
		super(saldo);
		this.viajes= new ArrayList<Viaje>();
	}
	
	private boolean isViajero() {
		return this.viajes.stream().anyMatch(v -> v.isMonth());
	}
	
	@Override
	public void cargarSaldo(double monto) {
		if(this.isViajero()) {
			super.cargarSaldo(monto);
		}else {
			 super.cargarSaldo(monto * 0.9);
		}
	}
	
	public boolean addViaje(Viaje v) {
		if(v.addPasajero(this)) {
			return this.viajes.add(v);
		}
		return false;
	}
	
	@Override
	public void aplicarCosto(double costo) {
		this.reduceSaldo((costo - ((this.viajes.size() > 0 ) ? 500 : 0)));
	}

	
	

}
