package ar.edu.info.unlp.ejercicio5;

public class Circulo implements cara{
	private double radio;
	
	/*
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	public Circulo() {
		
	}
	*/
	public double getDiametro() {
		return this.radio * 2;	
	}
	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	public double getArea() {
		return this.radio * this.radio * Math.PI;
	}
}
