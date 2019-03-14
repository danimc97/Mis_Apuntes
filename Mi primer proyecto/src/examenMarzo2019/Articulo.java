package examenMarzo2019;

public abstract class Articulo {

	private String codigoBarras;
	
	private String nombre;
	
	private int cantidad;
	
	private int precio;
	
	public abstract String getDescripcion();

	public Articulo(String codigoBarras, String nombre, int cantidad, int precio) {
		super();
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
