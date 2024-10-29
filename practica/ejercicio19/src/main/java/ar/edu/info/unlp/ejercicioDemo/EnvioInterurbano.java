package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{

	private double distancia ;
	private final double CERCA = 20;
	private final double PROXIMOS = 25;
	private final double LEJOS = 30;
	
	public EnvioInterurbano(LocalDate fecha, String origen, String destino, double peso, double distancia) {
		super(fecha, origen, destino, peso);
		this.distancia = distancia;
	}	
	
	public double monto() {
		/*(utilice $20 para menos de 100 km por cada gramo de peso, $25 para
	distancias entre 100 km y 500 km por gramo de peso, y $30 para distancias de más
	de 500 km por gramo de peso).*/
		if (this.distancia < 100) {
			return CERCA * this.getPeso();
		}
		else if (this.distancia >= 100 && this.distancia < 500) {
			return PROXIMOS * this.getPeso();
		}
		else 
			return LEJOS * this.getPeso();
	}
	
}
