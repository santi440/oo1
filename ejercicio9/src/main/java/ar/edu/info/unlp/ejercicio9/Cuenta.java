package ar.edu.info.unlp.ejercicio9;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta () {
		this.saldo= 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double unMonto) {
		this.saldo+= unMonto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transfereirACueta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
}
