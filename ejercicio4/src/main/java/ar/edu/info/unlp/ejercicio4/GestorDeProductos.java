package ar.edu.info.unlp.ejercicio4;

import java.util.*;

public abstract class GestorDeProductos {
	protected List<Producto> productos;
	
	public GestorDeProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
	
	//para no violar el encapsulamiento
	public List<Producto> getProductos(){
		return new ArrayList<Producto> (this.productos);
	}
	
}
