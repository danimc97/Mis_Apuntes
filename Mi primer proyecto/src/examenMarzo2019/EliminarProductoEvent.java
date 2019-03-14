package examenMarzo2019;

public class EliminarProductoEvent {

	String fraseCompleta;

	public EliminarProductoEvent(String fraseCompleta) {
		super();
		this.fraseCompleta = fraseCompleta;
	}
	
	

	public EliminarProductoEvent() {
		super();
	}



	public String getFraseCompleta() {
		return fraseCompleta;
	}

	public void setFraseCompleta(String fraseCompleta) {
		this.fraseCompleta = fraseCompleta;
	}
	
	
}
