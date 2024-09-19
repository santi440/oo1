package ar.edu.info.unlp.ejercicio8;

public class EmpleadoJerarquico extends Empleado {
	
	public EmpleadoJerarquico(String unNombre) {
		super(unNombre);
		// TODO Auto-generated constructor stub
	}

	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
}
