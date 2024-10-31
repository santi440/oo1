package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Vendedor (String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.productos= new ArrayList<Producto>();
	}
	
	public void addProducto(Producto p) {
		this.productos.add(p);
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	
}
