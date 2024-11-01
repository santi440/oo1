package ar.edu.info.unlp.ejercicioDemo;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto(String nombre, String categoría, double precio, int stock) {
		this.nombre = nombre;
		this.categoria = categoría;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Producto(Producto p) {
		this.nombre = p.getNombre();
		this.categoria = p.getCategoria();
		this.precio = p.getPrecio();
		this.stock = p.getStock();
	}

	public boolean dismin (int cant) {
		if (cant <= this.stock) {
			this.stock -= cant;
			return true;
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	

}
