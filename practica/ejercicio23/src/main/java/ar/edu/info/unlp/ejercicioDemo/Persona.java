package ar.edu.info.unlp.ejercicioDemo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Persona {

	private String nombre;
	private String direccion;
	
	public Persona (String nombre, String direccion) {
		this.direccion=direccion;
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

}
