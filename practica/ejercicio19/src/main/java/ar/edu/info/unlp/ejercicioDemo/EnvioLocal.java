package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class EnvioLocal extends Envio{
	private boolean entregaRapida;
	private final double valor = 1000;
	private final double agregado = 500;
	
	public EnvioLocal(LocalDate fecha, String origen, String destino, double peso, boolean entrega) {
		super(fecha, origen, destino, peso);
		this.entregaRapida = entrega;
	}

	public boolean isEntregaRapida() {
		return entregaRapida;
	}

	@Override
	public double monto() {
		return (isEntregaRapida()) ? valor + agregado : valor;
	}	
	

}
