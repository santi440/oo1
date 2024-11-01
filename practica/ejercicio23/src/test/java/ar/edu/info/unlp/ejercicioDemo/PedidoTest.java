package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {
	
	Pedido p, p1,p2;

	@BeforeEach
	void setUp() throws Exception {
		p=new Pedido(new Producto("banana","fruta tropical",50,20),2,new EnvioSucursal(), new PagoAlContado());
		p1=new Pedido(new Producto("banana","fruta tropical",50,20),2,new EnvioRetiraLocal(), new Pago6Cuotas());
		p2=new Pedido(new Producto("banana","fruta tropical",50,20),2,new EnvioExpress(new CalculadoraDeDistancia()), new PagoAlContado());

	}

	@Test
	void testCostoTotal() {
		assertEquals(3100, p.getCostoTotal("Mi Casa TIO"));
		assertEquals(120, p1.getCostoTotal("Mi Casa TIO"));
		assertEquals(150, p2.getCostoTotal("Mi Casa TIO"));
	}

}
