package ar.edu.info.unlp.ejercicio5;

public class Cuerpo3D {
	private double altura;
	private cara caraBasal;
	
	/*
	public Cuerpo3D (double altura , cara figura) {
		this.altura = altura;
		this.caraBasal = figura;
	}
	
	public Cuerpo3D() {
		
	}
	*/
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(cara caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen () {
		return this.caraBasal.getArea() * this.altura; 
	}
	
	public double getSuperficieExterior() {
		return 2*this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
	}
	
}
