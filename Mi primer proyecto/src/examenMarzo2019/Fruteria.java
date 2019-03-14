package examenMarzo2019;

public class Fruteria extends Articulo {

	public Fruteria(String codigoBarras, String nombre, int cantidad, int precio) {
		super(codigoBarras, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	private boolean maduro=true;
	
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
