package ar.edu.info.unlp.ejercicio8;

public class Gerente extends EmpleadoJerarquico {
	public Gerente(String unNombre) {
		super(unNombre);
		// TODO Auto-generated constructor stub
	}

	public double aportes() {
		return this.montoBasico() * 0.05;
	}
	
	public double montoBasico() {
		return 57000;
	}
	
}
