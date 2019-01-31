/**
 * Curso B�sico de desarrollo de Juegos en Java - Space Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

package arkanoid;
public class Pelota extends ObjetosEnPantalla {
	protected int vx;
	protected int vy;
	protected String nombre[]=new String [] {"pelota-regreso1.png"};
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteName(nombre);
	}
	
	public void collision(ObjetosEnPantalla a) {
        if (a instanceof Ladrillo) {
        	vy=-vy;
        	//vx=-vx;
        }
        if (a instanceof Nave) {
        	vy=-vy;
        }
     }
	
	public void act() {
		x+=vx;
		if (x < 0 || x > Stage.WIDTH-28)
		  vx = -vx;
		
		y+=vy;
		if (y < 0 || y > Stage.HEIGHT-55)
		  vy = -vy;
		
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public int getVy() { return vy; }
	public void setVy(int i) {vy = i;	}

}
