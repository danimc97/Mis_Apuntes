package Matriculaciones;

public class bachillerato extends Matricula {

	private String modalidad;

	public bachillerato() {
		super();
	}

	public bachillerato(String fecha, String codigo, String modalidad) {
		super(fecha, codigo);
		this.modalidad=modalidad;
	}

	
	
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "bachillerato [getModalidad()=" + getModalidad() + ", getFecha()=" + getFecha() + ", getCodigo()="
				+ getCodigo() + "]";
	}
	
}
