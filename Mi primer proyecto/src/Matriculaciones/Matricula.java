package Matriculaciones;

public class Matricula {

	private String fecha;
	private String codigo;
	
	
	public Matricula() {
		super();
	}


	public Matricula(String fecha, String codigo) {
		super();
		this.fecha = fecha;
		this.codigo = codigo;
	}


	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
