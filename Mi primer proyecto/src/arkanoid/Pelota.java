/**
 * Curso B�sico de desarrollo de Juegos en Java - Space Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

package arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Pelota extends ObjetosEnPantalla {
	protected int vx;
	protected int vy;
	protected int contador=0;
	protected int contador1=0;
	protected String nombre[]=new String [] {"pelota-regreso1.png"};
	boolean presionaEspacio = false;
	boolean presionaBoton = false;
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenadas = null;
	private float pixelsPorFrame = 3;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteName(nombre);
	}
	
	public void collision(ObjetosEnPantalla a) {
        if (a instanceof Ladrillo) {
        	this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
        	//vx=-vx;
        }
        if (a instanceof Nave) {
        	this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
        }
     }
	
	public void mouseClicked (MouseEvent e) {
		if(presionaBoton==false) {
			switch (e.getButton()) {
			case MouseEvent.BUTTON1:presionaBoton=true;
			this.vx = 3;
		  	this.vy = 3;
			}
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if(presionaEspacio==false) {
		  	switch (e.getKeyCode()) {
		  	case KeyEvent.VK_SPACE:presionaEspacio = true;
		  	this.vx = 3;
		  	this.vy = 3;
		  	}
		}
	}
	
	public void act() {
		if(this.presionaEspacio || this.presionaBoton) {
			if (this.trayectoria == null) {
				this.coordenadas = new PuntoAltaPrecision(x, y);
				this.trayectoria = new TrayectoriaRecta(-2.5f, coordenadas, true);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelsPorFrame);
			if (pixelsPorFrame < 12) {
				pixelsPorFrame *= 1.00035;
			}
			this.x = Math.round(this.coordenadas.x);
			this.y = Math.round(this.coordenadas.y);
			if (x < 0 || x > Stage.WIDTH-28) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
			}
			if (y < 0 || y > Stage.HEIGHT-55) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			}
		}
		else {
			vx=0;
			vy=0;
		}
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public int getVy() { return vy; }
	public void setVy(int i) {vy = i;	}

}
