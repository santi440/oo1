package ar.edu.info.unlp.ejercicioDemo;

public class Archivo {
	private String nombre;
	
	public Archivo(String unNombre){
		this.nombre=unNombre;
	}
	
	public int getTamaño() {
		return this.nombre.length();
	}
}
