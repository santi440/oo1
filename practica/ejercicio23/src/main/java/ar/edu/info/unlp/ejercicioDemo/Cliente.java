package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;
import java.util.stream.Collectors;

public class Cliente {
	private String nombre;
	private String direccion;
	private List<Pedido> solicitado;
	
	public Cliente (String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.solicitado= new ArrayList<Pedido>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void crearPepido (Pago unPago,Envio unEnvio,Producto unProducto, int cant) {
		if (unProducto.getStock()>= cant) {
			unProducto.dismin(cant);
			this.solicitado.add(new Pedido(unProducto,cant,unEnvio,unPago));
		}
	}
	
	public Map<String , Long> getCategorias() { 
		return this.solicitado.stream().collect(Collectors.groupingBy(e -> e.getCategoria(), Collectors.counting()));
	}
	
	public double costoPedido(Pedido p) {
		if (solicitado.contains(p)) {
			return p.getCostoTotal(this.direccion);
		}
		return 0;
	}
}
