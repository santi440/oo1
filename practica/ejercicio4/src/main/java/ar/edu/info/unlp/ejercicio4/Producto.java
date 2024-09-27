package ar.edu.info.unlp.ejercicio4;

public class Producto {
	private double peso;
	private	double precioPorKilo;
	private	String descripcion;
	
	//Constructor
	public Producto(double peso, double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	public Producto() {
		this.peso = 0.0;
		this.precioPorKilo = 0.0;
		this.descripcion = "";
	}
	//Devuelve el peso del producto
	public double getPeso() {
		return peso;
	}
	
	//Recibe un peso y este se convierte en el peso del producto
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Devuelve el Precio por kilo del producto
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
	//Recibe un precio x kilo y este se convierte en el precioPorKilo del producto
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	
	public double getPrecio() {
		return this.getPeso()* this.getPrecioPorKilo();
	}
	
	//Devuelve la descripcion del producto
	public String getDescripcion() {
		return descripcion;
	}
	
	//Recibe un texto y este se convierte en la descripcion del producto
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
