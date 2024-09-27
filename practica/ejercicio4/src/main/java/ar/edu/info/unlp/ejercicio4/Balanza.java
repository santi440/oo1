package ar.edu.info.unlp.ejercicio4;

import java.util.*;

public class Balanza{
	private List<Producto> productos ;
	
	//constructor de la clase que inicializa todo en 0
	public Balanza () {
		this.productos= new ArrayList<Producto>();
	}
	
	//Reinicia la balanza,dejando todos los valores en 0 
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto  producto) {
		this.productos.add(producto);
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
	
	//no pasa el testEmitirTicket porque los productos que esten dentro del arraylist siguen siendo mutables
	public Ticket emitirTicket() {
		System.out.print("Se Emitio el ticket! ");
		Ticket aux =new Ticket(this.getPrecioTotal(), this.getPesoTotal(), this.getCantidadDeProductos(), this.getProductos());
		this.ponerEnCero();
		return aux;
	}
	
}
