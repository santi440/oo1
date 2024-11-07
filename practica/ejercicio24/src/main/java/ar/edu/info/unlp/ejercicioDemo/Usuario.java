package ar.edu.info.unlp.ejercicioDemo;

public abstract class Usuario {
	private double saldo;
	private String nombre;

	public Usuario(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void reduceSaldo(double costo) {
		this.saldo -= costo;
	}
	
	public abstract void aplicarCosto(double costo) ;
	
	public void cargarSaldo(double monto) {
		this.saldo += monto;
	}
}
