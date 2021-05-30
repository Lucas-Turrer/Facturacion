package ar.edu.unlam.pb2.facturas;

public abstract class Producto {
	String nombre;
	Double precio;

	public Producto(String nombre, Double precio) {
		this.precio = precio;
		this.nombre = nombre;
	}

	public abstract Double impuesto();
	
	public String tipo() {
		return "Soy Comestible";
	}
}
