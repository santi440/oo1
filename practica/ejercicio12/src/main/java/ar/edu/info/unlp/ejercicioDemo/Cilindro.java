package ar.edu.info.unlp.ejercicioDemo;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}

	@Override
	public double getSuperficie() {
		return 2*Math.PI * this.radio * altura + 2*Math.PI*Math.pow(this.radio, 2);
	}
	
	
}
