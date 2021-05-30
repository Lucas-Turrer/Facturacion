package ar.edu.unlam.pb2.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.facturas.ArticuloComun;
import ar.edu.unlam.pb2.facturas.ArticulosDeLujo;

public class FacturacionTest {
	@Test
	public void QueElImpuestoEsCorrectoDeUnArticuloComun() {
		ArticuloComun chocolate = new ArticuloComun("milka",100.00){};
		Double impuestoEsperado = 121.00;
		assertEquals(impuestoEsperado, chocolate.impuesto());
	}
	
	@Test
	public void QueElImpuestoEsCorrectoDeUnArticuloLujo() {
		ArticulosDeLujo vino = new ArticulosDeLujo ("Dada",100.00) {};
		Double impuestoEsperado = 139.14999999999998;
		assertEquals(impuestoEsperado, vino.impuesto());
	}

}
