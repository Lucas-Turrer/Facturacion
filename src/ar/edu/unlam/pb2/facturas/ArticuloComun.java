package ar.edu.unlam.pb2.facturas;

public abstract class ArticuloComun extends Producto {
	String nombre;
	Double precio;
	Double impuesto = 1.21;
	Double precioConImpuesto;
	
	public ArticuloComun (String nombre, Double precio) {
		super(nombre,precio);
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public Double impuesto() {
		Double precioConImpuesto = impuesto * precio;
		return precioConImpuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public Double getPrecioConImpuesto() {
		return precioConImpuesto;
	}

	public void setPrecioConImpuesto(Double precioConImpuesto) {
		this.precioConImpuesto = precioConImpuesto;
	}
	
}
