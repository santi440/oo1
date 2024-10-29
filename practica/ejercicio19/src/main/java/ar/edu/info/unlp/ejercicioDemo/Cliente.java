package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios; 
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion= direccion;
		this.envios= new ArrayList<Envio>();
	}
	
	public boolean agregarEnvio(Envio nuevo) {
		return this.envios.add(nuevo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	private boolean isEntre(LocalDate probado, LocalDate bajo, LocalDate alto) {
		return ((probado.isAfter(bajo) || probado.isEqual(bajo)) &&
				(probado.isBefore(alto) || probado.isEqual(alto)));
	}
	
	public double montoAPagar(LocalDate fi, LocalDate ff) {
		return this.envios.stream().filter(e -> isEntre(e.getFecha(), fi, ff)).mapToDouble(e -> e.monto()).sum();
	}
}
