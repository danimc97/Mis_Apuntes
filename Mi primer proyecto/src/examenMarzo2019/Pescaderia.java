package examenMarzo2019;

public class Pescaderia extends Articulo {

	public Pescaderia(String codigoBarras, String nombre, int cantidad, int precio, boolean fresco) {
		super(codigoBarras, nombre, cantidad, precio);
		this.fresco=fresco;
	}

	private boolean fresco=true;
	
	private int precio=getPrecio();

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
