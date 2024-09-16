package ar.edu.info.unlp.ejercicio4;

import java.util.*;

public class Balanza extends GestorDeProductos{
	
	//constructor de la clase que inicializa todo en 0
	public Balanza () {
		super(new ArrayList<Producto>());
	}
	
	//Reinicia la balanza,dejando todos los valores en 0 
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto  producto) {
		this.productos.add(producto);
	}
	
	//no pasa el testEmitirTicket porque los productos que esten dentro del arraylist siguen siendo mutables
	public Ticket emitirTicket() {
		System.out.print("Se Emitio el ticket! ");
		Ticket aux =new Ticket(this.productos);
		this.ponerEnCero();
		return aux;
	}
	
}
