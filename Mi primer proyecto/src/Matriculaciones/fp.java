package Matriculaciones;

public class fp extends matricula {

	private boolean dual;

	public fp() {
		super();
	}

	public fp(String fecha, String codigo, boolean dual) {
		super(fecha, codigo);
		this.dual=dual;
	}

	
	
	
	public boolean isDual() {
		return dual;
	}
	public void setDual(boolean dual) {
		this.dual = dual;
	}

	@Override
	public String toString() {
		return "fp [isDual()=" + isDual() + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}
	
}
