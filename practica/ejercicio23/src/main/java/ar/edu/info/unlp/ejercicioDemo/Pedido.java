package ar.edu.info.unlp.ejercicioDemo;

public class Pedido {
	private Producto p;
	private int cant;
	private Envio enviar;
	private Pago tipoPago;
	
	public Pedido(Producto producto, int cant,Envio e, Pago p) {
		this.p = producto;
		this.cant = cant;
		this.enviar= e;
		this.tipoPago= p;
	}

	public String getNombre() {
		return p.getNombre();
	}

	public String getCategoria() {
		return p.getCategoria();
	}

	public double getPrecio() {
		return p.getPrecio();
	}

	public int getStock() {
		return p.getStock();
	}
	
	public int getCant() {
		return cant;
	}
	
	public double getCostoTotal(String dir) {
		return this.cant*this.getPrecio()*tipoPago.costoAgregado() + enviar.costoDeEnvio(dir, "???"); 
	}
	
	public boolean equals(Pedido p) {
		if (p.getNombre() == getNombre() && p.getCategoria() == p.getCategoria() &&
			p.getCostoTotal("???") == getCostoTotal("???")) {
			return true;
		}
		else return false;	
			
	}
	
}
