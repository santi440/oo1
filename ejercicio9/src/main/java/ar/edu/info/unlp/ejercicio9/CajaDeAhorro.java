package ar.edu.info.unlp.ejercicio9;

public class CajaDeAhorro extends Cuenta{

		public CajaDeAhorro() {
			super();
		}
	
	
		public boolean puedeExtraer(double monto) {
			return this.getSaldo() >= monto;
		}
		
		public void depositar(double unMonto) {
			super.depositar(unMonto - unMonto*0.02);
		}
		
		public boolean extraer(double monto) {
			return super.extraer(monto - monto*0.02);
		}
		
		public boolean transfereirACueta(double monto, Cuenta cuentaDestino) {
			return super.transfereirACueta(monto - monto*0.02, cuentaDestino);
		}
		
	}
