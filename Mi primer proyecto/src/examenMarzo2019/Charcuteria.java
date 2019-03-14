package examenMarzo2019;

public class Charcuteria extends Articulo {

	public Charcuteria(String codigoBarras, String nombre, int cantidad, int precio) {
		super(codigoBarras, nombre, cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	private int precio=getPrecio();

	private static Charcuteria instancia = null;


	private boolean carneCortada=true;
	
	
	
	@Override
	public String getDescripcion() {
		return null;
	}



	@Override
	public String toString() {
		return super.toString();
	}
	

	
	

}
