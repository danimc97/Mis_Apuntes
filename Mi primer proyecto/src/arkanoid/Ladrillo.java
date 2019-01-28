package arkanoid;

public class Ladrillo extends ObjetosEnPantalla {
	
	
	
	public Ladrillo(Stage stage) {
		super(stage);
		setSpriteName("ladrillo-amarillo.jpg");
		this.setWidth(54);
		this.setHeight(18);
	}
	
	public void collision(ObjetosEnPantalla a) {
        if (a instanceof Pelota) {
        	remove();
        }
     }
}

