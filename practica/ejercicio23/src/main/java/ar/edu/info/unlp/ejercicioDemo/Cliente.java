package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;
import java.util.stream.Collectors;

public class Cliente extends Persona{
	private List<Pedido> solicitado;
	
	public Cliente (String nombre, String direccion) {
		super(nombre,direccion);
		this.solicitado= new ArrayList<Pedido>();
	}
	
	public int size() { 
		//solo lo uso para testear
		return solicitado.size();
	}

	public void crearPepido (Pago unPago,Envio unEnvio,Producto unProducto, int cant) {
		if (unProducto.dismin(cant)) {
			this.solicitado.add(new Pedido(unProducto,cant,unEnvio,unPago));
		}
	}
	
	public Map<String , Long> getCategorias() { 
		return this.solicitado.stream().collect(Collectors.groupingBy(e -> e.getCategoria(), Collectors.counting()));
	}
	
	public double costoPedido(Pedido p) {
		Pedido aux = this.solicitado.stream().filter(a -> a.equals(p)).findFirst().orElse(null);
		if (aux != null) {
			return aux.getCostoTotal(this.getDireccion());
		}
		return 0;
	}
}
