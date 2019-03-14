package examenMarzo2019;

public class Lacteos extends Articulo {

	public Lacteos(String codigoBarras, String nombre, int cantidad, int precio) {
		super(codigoBarras, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	private String sabor="Vainilla";
	
	private int precio=getPrecio();

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
