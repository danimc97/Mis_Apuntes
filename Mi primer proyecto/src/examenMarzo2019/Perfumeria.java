package examenMarzo2019;

public class Perfumeria extends Articulo {

	public Perfumeria(String codigoBarras, String nombre, int cantidad, int precio) {
		super(codigoBarras, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	private int precio=getPrecio();
	
	private String olor="Vainilla";

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
