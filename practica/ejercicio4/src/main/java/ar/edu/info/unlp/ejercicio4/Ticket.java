package ar.edu.info.unlp.ejercicio4;
import java.time.LocalDate;
import java.util.*;
public class Ticket {
	private LocalDate fecha;
	private	int cantidadDeProductos;
	private double pesoTotal;
	private	double precioTotal;
	private List<Producto> productos;
	
	//constructor
	public Ticket(double precioTotal, double pesoTotal, int cantidadDeProductos, List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.productos= productos;
	}
	
	//Devuelve el valor de los impuestos a agregar a precioTotal
	public double impuesto () {
		return this.precioTotal*0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	

	public double getPesoTotal() {
		return pesoTotal;
	}

	

	public double getPrecioTotal() {
		return precioTotal;
	}

	public List<Producto> getProductos(){
		return this.productos;
	}
	
	
}
