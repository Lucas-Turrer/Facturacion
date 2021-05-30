package ar.edu.unlam.pb2.facturas;

public abstract class ArticulosDeLujo  extends Producto {
	Double impuesto=1.21;
	Double impuestoExtra=1.15;
	Double precio;
	String nombre;
	Double precioConImpuesto;

	public ArticulosDeLujo(String nombre, Double precio) {
		super(nombre,precio);
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public Double impuesto() {
		Double precioConImpuesto = impuesto * precio * impuestoExtra;
		return precioConImpuesto;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public Double getImpuestoExtra() {
		return impuestoExtra;
	}

	public void setImpuestoExtra(Double impuestoExtra) {
		this.impuestoExtra = impuestoExtra;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecioConImpuesto() {
		return precioConImpuesto;
	}

	public void setPrecioConImpuesto(Double precioConImpuesto) {
		this.precioConImpuesto = precioConImpuesto;
	}

	

}
