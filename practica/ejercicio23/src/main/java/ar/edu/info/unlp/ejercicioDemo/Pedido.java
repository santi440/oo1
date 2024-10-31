package ar.edu.info.unlp.ejercicioDemo;

public class Pedido extends Producto{
	private int cant;
	private Envio enviar;
	private Pago tipoPago;
	
	public Pedido(Producto producto, int cant,Envio e, Pago p) {
		super(producto);
		this.cant = cant;
		this.enviar= e;
		this.tipoPago= p;
	}

	public int getCant() {
		return cant;
	}
	
	public double getCostoTotal(String dir) {
		return this.cant*this.getPrecio()*tipoPago.costoAgregado() + enviar.costoDeEnvio(dir, "???"); 
	}
	
	
}
