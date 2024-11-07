package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Conductor extends Usuario{
	private Vehiculo auto;

	public Conductor(double saldo, Vehiculo auto) {
		super(saldo);
		this.auto = auto;
		auto.asignarConductor(this);
	}


	@Override
	public void aplicarCosto(double costo) {
		this.reduceSaldo((costo - auto.getValor() *0.001));
	}
	
	@Override
	public void cargarSaldo(double monto) {
		if ((LocalDate.now().getYear() - auto.getFabricacion()) < 5) {
			super.cargarSaldo(monto*0.99);
		} else {
			super.cargarSaldo(monto *0.9);
		}
	}
	
	
	
}
