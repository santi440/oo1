package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
	private  String nombre;
	private String direccion;
	private ArrayList<Consumo> consumo;
	
	public Usuario (String nombre, String domicilio) {
		this.nombre= nombre;
		this.consumo=new ArrayList<Consumo>();
	}
	
	public void nuevoConsumo(double activo, double reactivo) {
		this.consumo.addLast(new Consumo(activo,reactivo));
	}
	
	public Factura emitirFactura(double tarifa) {
		Consumo ultimo = this.consumo.getLast();
		return new Factura(this,LocalDate.now(),
				ultimo.calcularPrecio(tarifa), ultimo.isBono());
	}
}
