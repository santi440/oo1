package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
		this.emails=new ArrayList<Email>();
	}
	// particiones equivalentes, test sobre un elemento de un dominio, todos ellos son testeados.
	// valores de borde, vamos a probar el punto en que se rompe. 
	public String getNombre() {
		return this.nombre;
	}
	
	public void recibir(Email email) {
		this.emails.add(email);
	}
	
	public void mover(Email email, Carpeta destino) {
		//entiendo que tengo permisos para pasar a la carpeta que me pasan como parametro 
		destino.recibir(email);
		this.emails.remove(email);
	}
	
	public Email contiene (String texto) {
		return this.emails.stream().filter(email -> email.contiene(texto)).findFirst().orElse(null);
	}
	
	public int getTamaño() {
		//no considero el nombre de la carpeta porque no lo especifica
		return emails.stream().mapToInt(email -> email.getTamaño()).sum();
	}
}
