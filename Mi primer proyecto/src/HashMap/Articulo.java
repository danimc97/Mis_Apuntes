package HashMap;

public class Articulo {

	private String codigoBarras;
	private String numeroEstante;
	private String descripcion;



	public Articulo(String codigoBarras, String numeroEstante, String descripcion) {
		super();
		this.codigoBarras = codigoBarras;
		this.numeroEstante = numeroEstante;
		this.descripcion = descripcion;
	}



	public String getCodigoBarras() {
		return codigoBarras;
	}



	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}



	public String getNumeroEstante() {
		return numeroEstante;
	}



	public void setNumeroEstante(String numeroEstante) {
		this.numeroEstante = numeroEstante;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", numeroEstante=" + numeroEstante + ", descripcion="
				+ descripcion + "]";
	}
	
}
