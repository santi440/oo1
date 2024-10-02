package ar.edu.info.unlp.ejercicioDemo;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return 1.25 * Math.PI*Math.pow(this.radio,3);
	}

	@Override
	public double getSuperficie() {
		return 4*Math.PI*Math.pow(this.radio, 2);
	}
	
	
}
