package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;
public class Email {
	private List<Archivo> adjuntos;
	private String titulo;
	private String cuerpo;
	
	public Email (String titulo, String cuerpo, List<Archivo> adjuntos) {
		this.cuerpo= cuerpo;
		this.titulo= titulo;
		this.adjuntos= new ArrayList<Archivo> (adjuntos); 
	}

	public List<Archivo> getAdjuntos() {
		return new ArrayList<Archivo>(adjuntos);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public int getTamaño() {
		int aux = this.titulo.length() + this.cuerpo.length();
		return (this.adjuntos != null) ? aux + this.adjuntos.stream().mapToInt(a -> a.getTamaño()).sum() : aux;  
	}
	
	public boolean contiene(String texto) {
		//o directamente en la funcion de carpeta con el mismo nombre
		return this.cuerpo.contains(texto) || this.titulo.contains(texto);
	}
}
