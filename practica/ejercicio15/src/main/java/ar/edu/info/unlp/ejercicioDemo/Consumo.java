package ar.edu.info.unlp.ejercicioDemo;

public class Consumo {
	private double consumoActivo;
	private double consumoReactivo;
	
	public Consumo( double consumoActivo, double consumoReactivo) {
		this.consumoActivo = consumoActivo;
		this.consumoReactivo = consumoReactivo;
	}
	
	public double calcularPrecio(double tarifa) {
		return this.consumoActivo * tarifa;
	}
	
	public boolean isBono() {
		return this.consumoActivo/
			(Math.sqrt(Math.pow(this.consumoActivo, 2)) + Math.pow(this.consumoReactivo, 2)) > 0.8;
		
	}
	
	public double getConsumoActivo() {
		return consumoActivo;
	}

	public double getConsumoReactivo() {
		return consumoReactivo;
	}

	public void setConsumoActivo(double consumoActivo) {
		this.consumoActivo = consumoActivo;
	}

	public void setConsumoReactivo(double consumoReactivo) {
		this.consumoReactivo = consumoReactivo;
	}
	
	
	
	
	
}
