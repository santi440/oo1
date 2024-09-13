package ar.edu.info.unlp.ejercicio4;
import java.time.LocalDate;
import java.util.*;
public class Ticket extends GestorDeProductos{
	private LocalDate fecha;
	
	//constructor
	public Ticket(List<Producto> productos) {
		super(productos);
		this.fecha = LocalDate.now();
		
	}
	
	//Devuelve el valor de los impuestos a agregar a precioTotal
	public double impuesto () {
		return this.getPrecioTotal()*0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
}
