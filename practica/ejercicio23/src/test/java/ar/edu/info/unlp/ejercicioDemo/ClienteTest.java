package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	Cliente c;
	Producto p;
	Pedido tuPedido;
	@BeforeEach
	void setUp() throws Exception {
		c= new Cliente("Juan", "Av 1 N°1 ");
		p= new Producto("Heladera", "electrodomestico",1000,2);
		tuPedido = new Pedido(p,1, new EnvioSucursal(),new PagoAlContado());
	}

	@Test
	void testCrearPedido() {
		c.crearPepido(new PagoAlContado(), new EnvioSucursal(), p, 1);
		assertEquals(1, c.size());
		c.crearPepido(new PagoAlContado(), new EnvioSucursal(), p, 100); //no lo agrega
		assertEquals(1, c.size());
	}
	
	@Test
	void testCostoPedido() {
		c.crearPepido(new PagoAlContado(), new EnvioSucursal(), p, 1);
		assertEquals(4000, c.costoPedido(tuPedido));
	}
	
	@Test
	void testGetCategorias() {
		c.crearPepido(new PagoAlContado(), new EnvioSucursal(), p, 1);
		Map<String, Long> categorias =c.getCategorias();
		assertEquals(1, categorias.get("electrodomestico"));
		assertEquals(null, categorias.get("NuncaExisti"));
	}
}
