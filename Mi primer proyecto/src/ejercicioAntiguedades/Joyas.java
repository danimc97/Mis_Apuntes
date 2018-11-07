package ejercicioAntiguedades;

public class Joyas extends Antigüedades {

	private String MaterialFabricacion;

	public Joyas() {
		super();
	}

	public Joyas(int año, String origen, float precio, String material) {
		super(año, origen, precio);
		this.MaterialFabricacion=material;
	}

	public String getMaterialFabricacion() {
		return MaterialFabricacion;
	}

	public void setMaterialFabricacion(String materialFabricacion) {
		MaterialFabricacion = materialFabricacion;
	}
	
	
	
	
	
	
	
}
