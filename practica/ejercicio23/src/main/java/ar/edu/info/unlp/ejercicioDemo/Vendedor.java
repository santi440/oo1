package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{
	private List<Producto> productos;
	
	public Vendedor (String nombre, String direccion) {
		super(nombre,direccion);
		this.productos= new ArrayList<Producto>();
	}
	
	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	
	
}
