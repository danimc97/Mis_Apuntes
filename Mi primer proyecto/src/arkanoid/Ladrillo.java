package arkanoid;

import java.awt.Rectangle;

public class Ladrillo extends ObjetosEnPantalla {
	
	protected String nombre[]=new String [] {"ladrilloamarillo .jpg","ladrilloazul .jpg","ladrillorojo .jpg","ladrilloverde .jpg","fase.jpg","perderlapartida.jpg","victoria.png"};
	
	int codigoLadrilloAmarillo;
	boolean dosVidas=false;
	
	
	public Ladrillo(Stage stage, int colorLadrillos) {
		super(stage);
		String name[]=new String[] {nombre[colorLadrillos]};
		setSpriteName(name);
		this.codigoLadrilloAmarillo=colorLadrillos;
		if(colorLadrillos==3) {
			dosVidas=true;
		}
	}
	
	public void collision(ObjetosEnPantalla a) {
		if(codigoLadrilloAmarillo!=0) {
	        if (a instanceof Pelota) {
	        	remove();
	        	stage.getSoundCache().playSound("8-bit-explosion.wav");
	        }
		}
		else {
			stage.getSoundCache().playSound("Arkanoid-SFX-05.wav");	
		}
		
     }
}

