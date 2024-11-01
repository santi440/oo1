package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ar.edu.info.unlp.ejercicio21.BagImpl;

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
	
	public int getCantMail() {
		return emails.size();
	}
	
	//Los 4 estan bien,el 3ero abria que cambiar el test.
	
	public Map<String , Long> getCategorias() {
		// Inicializa un mapa con todas las categorías y sus conteos iniciales a 0
        Map<String, Long> categorias = new HashMap<>();
        categorias.put("Pequeño", (long) 0);
        categorias.put("Mediano", (long) 0);
        categorias.put("Grande", (long) 0);

        // Contar emails en cada categoría
        Map<String, Long> conteos = emails.stream()
            .collect(Collectors.groupingBy(email -> email.getCategoria(), Collectors.counting()));

        // Actualiza el mapa inicial con los conteos
        categorias.putAll(conteos);

        return categorias;
	} 
	/*
	public Map<String , Long> getCategorias() {
		// Inicializa un mapa con todas las categorías y sus conteos iniciales a 0
        Map<String, Long> categorias = new HashMap<>();
        //Seria una funcion...
        long p = this.emails.stream().filter(e -> e.getCategoria() == "Pequeño").count();
        long m = this.emails.stream().filter(e -> e.getCategoria() == "Mediano").count();
        long g = this.emails.stream().filter(e -> e.getCategoria() == "Grande").count();

        // Cargo los valores, si no hay ninguno = 0
        categorias.put("Pequeño", p);
        categorias.put("Mediano", m);
        categorias.put("Grande", g);

        return categorias;
	}*/
	/*
	public Map<String , Long> getCategorias() { // no lo carga si no esta en ese elemento
		return this.emails.stream().collect(Collectors.groupingBy(e -> e.getCategoria(), Collectors.counting()));
	}*/
	
	/*
	public Map<String , Long> getCategorias(){
		BagImpl<String> bolsa = new BagImpl<String>();
		this.emails.stream().forEach(e -> bolsa.add(e.getCategoria()));
		HashMap<String , Long> devolver = new HashMap<String , Long>();
		
		devolver.put("Pequeño",(long) bolsa.occurrencesOf("Pequeño"));
		devolver.put("Mediano",(long) bolsa.occurrencesOf("Mediano"));
		devolver.put("Grande", (long)bolsa.occurrencesOf("Grande"));
		return devolver;
	}*/
}
