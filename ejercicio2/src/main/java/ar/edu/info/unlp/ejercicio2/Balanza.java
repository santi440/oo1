package ar.edu.info.unlp.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private	double pesoTotal;
	
	//constructor de la clase que inicializa todo en 0
	public Balanza () {
		this.cantidadDeProductos= 0;
		this.pesoTotal = 0.0;
		this.precioTotal = 0.0;
	}
	
	//Reinicia la balanza,dejando todos los valores en 0 
	public void ponerEnCero() {
		this.cantidadDeProductos= 0;
		this.pesoTotal = 0.0;
		this.precioTotal = 0.0;
	}
	
	public void agregarProducto(Producto  producto) {
		this.cantidadDeProductos ++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		System.out.print("Se Emitio el ticket! ");
		Ticket aux = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
		this.ponerEnCero();
		return aux;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
	
	
}
