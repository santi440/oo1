package ar.edu.info.unlp.ejercicio5;

public class Cuadrado implements cara{
	private double lado;

	/*
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public Cuadrado() {
		
	}
	*/
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.lado * 4;
	}
	public double getArea() {
		return this.lado * this.lado;
	}
}
