package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private LocalDate fechaEmision;
	private boolean bonificacion;
	private double monto;
	
	public Factura(Usuario usuario, LocalDate fechaEmision, double valorOriginal, boolean bono) {
		this.usuario = usuario;
		this.fechaEmision = fechaEmision;
		this.bonificacion = bono;
		this.monto = valorOriginal;
		if (bono) {
			this.monto = valorOriginal - valorOriginal*0.1;
		}
	}

	@Override
	public String toString() {
		return "Factura \n usuario" + usuario + ", fechaEmision" + fechaEmision + ", bonificacion" + bonificacion
				+ ", monto" + monto;
	}

	public boolean isBonificacion() {
		return bonificacion;
	}

	public double getMonto() {
		return monto;
	}
	
	
}
