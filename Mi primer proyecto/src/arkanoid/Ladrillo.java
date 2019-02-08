package arkanoid;

import java.awt.Rectangle;

public class Ladrillo extends ObjetosEnPantalla {
	
	protected String nombre[]=new String [] {"ladrillo-amarillo.jpg","ladrillo-azul.jpg","ladrillo-rojo.jpg","ladrillo-verde.jpg"};
	
	public Ladrillo(Stage stage, int colorLadrillos) {
		super(stage);
		String name[]=new String[] {nombre[colorLadrillos]};
		setSpriteName(name);
		this.setWidth(54);
		this.setHeight(18);
	}
	
	public void collision(ObjetosEnPantalla a) {
        if (a instanceof Pelota) {
        	remove();
        	stage.getSoundCache().playSound("8-bit-explosion.wav");
        }
     }
}

