package ar.edu.info.unlp.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double descubierto;

	public CuentaCorriente(double descubierto) {
		super();
		this.descubierto = descubierto;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public boolean puedeExtraer(double monto) {
		return this.getSaldo() + this.descubierto >= monto;
	}
	
}
