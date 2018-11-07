package ejercicioAntiguedades;

public class Mueble extends Antigüedades {

	private String Epoca;

	public Mueble() {
		super();
		this.Epoca="Sin especificar";
	}

	public Mueble(int año, String origen, float precio, String epoca) {
		super(año, origen, precio);
		this.Epoca=epoca;
	}

	public String getEpoca() { return Epoca;}

	public void setEpoca(String epoca) { Epoca = epoca;}
	
	
	
	
}
