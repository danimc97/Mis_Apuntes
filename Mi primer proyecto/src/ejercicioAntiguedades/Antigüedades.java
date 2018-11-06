package ejercicioAntiguedades;

public class Antigüedades {

	private int año;
	private String origen;
	private float precio;
	
	
	public Antigüedades() {
		super();
	}


	public Antigüedades(int año, String origen, float precio) {
		super();
		this.año = año;
		this.origen = origen;
		this.precio = precio;
	}


	public int getAño() { return año;}
	public void setAño(int año) { this.año = año;}
	public String getOrigen() { return origen;}
	public void setOrigen(String origen) { this.origen = origen;}
	public float getPrecio() { return precio;}
	public void setPrecio(float precio) { this.precio = precio;}


	@Override
	public String toString() {
		return "Antigüedades [Año=" + getAño() + ", Origen=" + getOrigen() + ", Precio=" + getPrecio()
				+ "]";
	}
	
	
	
	
	
}



