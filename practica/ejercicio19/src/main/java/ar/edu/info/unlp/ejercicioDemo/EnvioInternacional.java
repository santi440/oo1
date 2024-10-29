package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{
	public final double BASE = 5000;
	private final double LIVIANO = 10;
	private final double PESADO = 12;

	public EnvioInternacional(LocalDate fecha, String origen, String destino, double peso) {
		super(fecha, origen, destino, peso);
	}

	@Override
	public double monto() {
		/*utilice $5000 para cualquier destino y $10 por gramo de
		peso para envios de hasta 1 kg y $12 para envíos de más de 1 kg.*/
		return (this.getPeso()/1000 < 1) ? BASE + LIVIANO * this.getPeso() : BASE + PESADO * this.getPeso();
	}
	
	

}
