package arkanoid;

public class Pildora extends ObjetosEnPantalla {

	protected boolean noColision=false;
	protected boolean cambioFase=false;
	
	public Pildora(Stage stage) {
		super(stage);
	}
	
	int numeroProbabilidad;
	
	int numeroPildora;
	
	
	public void probabilidad() {
		numeroProbabilidad=(int) Math.round(Math.random()*10);
	}
	
	public void tipoPildora() {
		numeroPildora=(int) Math.round(Math.random()*2);
	}
	
	public void act() {
		this.setY(this.getY()+1);
	}
}
