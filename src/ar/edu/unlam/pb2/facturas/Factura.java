package ar.edu.unlam.pb2.facturas;

public class Factura {
	Integer i = 0;
	Integer numeroDeProductos = 0;
	Producto [] factura;
	
	public Factura(Producto producto) {
	    factura = new Producto [i];
		factura [numeroDeProductos] = producto;
	}
	
	public void agregarProductosEnLaFactura(Producto productoNuevo) {
		i ++;
		numeroDeProductos ++;
		factura [numeroDeProductos] = productoNuevo;
	}
}
