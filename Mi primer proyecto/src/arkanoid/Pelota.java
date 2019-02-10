/**
 * Curso B�sico de desarrollo de Juegos en Java - Space Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

package arkanoid;

import java.awt.Rectangle;
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
	protected long millis = System.currentTimeMillis();
	protected long millisactuales;
	protected long segundos;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteName(nombre);
	}
	
	public void collision(ObjetosEnPantalla a) {
        if (a instanceof Ladrillo) {
        	chocaLadrillo((Ladrillo)a);
        }
        if (a instanceof Nave) {
        	chocaNave((Nave)a);
        }
     }
	
	
	public void chocaLadrillo(Ladrillo a) {
		Rectangle rectanguloAbajo= new Rectangle(a.x, a.y+a.height-1, a.width, 1);
    	Rectangle rectanguloArriba= new Rectangle(a.x, a.y+1, a.width, 1);
    	Rectangle rectanguloDerecha= new Rectangle(a.x+a.width-1, a.y, 1, a.height);
    	Rectangle rectanguloIzquierda= new Rectangle(a.x, a.y, 1, a.height);
    	boolean arriba=false;
    	boolean abajo=false;
    	boolean derecha=false;
    	boolean izquierda=false;
    	
    	if (this.getBounds().intersects(rectanguloIzquierda)) {
    		this.trayectoria.reflejarHorizontalmenteRespectoAPunto(this.coordenadas);
    		izquierda=true;
    		System.out.println("Izquierda");
    	}
    	else {
	    	if (this.getBounds().intersects(rectanguloDerecha)) {
	    		this.trayectoria.reflejarHorizontalmenteRespectoAPunto(this.coordenadas);
	    		derecha=true;
	    		System.out.println("Derecha");
	    	}
	    	else {
		    	if (this.getBounds().intersects(rectanguloArriba)) {
		    		this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
		    		arriba=true;
		    		System.out.println("Arriba");
		    	}
		    	else {
			    	if (this.getBounds().intersects(rectanguloAbajo)) {
			    		this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
			    		abajo=true;
			    		System.out.println("Abajo");
			    	}
		    	}
	    	}
    	}
    	
    	if (arriba==true && derecha==true) {
    		this.coordenadas.x*=-1;
    		this.coordenadas.y*=-1;
    	}
    	else {
    		if (arriba==true && izquierda==true) {
        		this.coordenadas.x*=-1;
        		this.coordenadas.y*=-1;
        	}
    		else {
    			if (abajo==true && derecha==true) {
    	    		this.coordenadas.x*=-1;
    	    		this.coordenadas.y*=-1;
    	    	}
    			else {
    				if (abajo==true && izquierda==true) {
    		    		this.coordenadas.x*=-1;
    		    		this.coordenadas.y*=-1;
    		    	}
    			}
    		}
    	}
    	
	}
	
	public void chocaNave(Nave a) {
		
		Rectangle rectanguloAbajo= new Rectangle(a.x, a.y+a.height-1, a.width, 1);
    	Rectangle rectanguloArriba= new Rectangle(a.x, a.y+1, a.width, 1);
    	Rectangle rectanguloDerecha= new Rectangle(a.x+a.width-1, a.y, 1, a.height);
    	Rectangle rectanguloIzquierda= new Rectangle(a.x, a.y, 1, a.height);
    	boolean arriba=false;
    	boolean abajo=false;
    	boolean derecha=false;
    	boolean izquierda=false;
    	
    	if (this.getBounds().intersects(rectanguloIzquierda)) {
    		this.trayectoria.reflejarHorizontalmenteRespectoAPunto(this.coordenadas);
    		izquierda=true;
    		System.out.println("Izquierda");
    	}
    	else {
	    	if (this.getBounds().intersects(rectanguloDerecha)) {
	    		this.trayectoria.reflejarHorizontalmenteRespectoAPunto(this.coordenadas);
	    		derecha=true;
	    		System.out.println("Derecha");
	    	}
	    	else {
		    	if (this.getBounds().intersects(rectanguloArriba)) {
		    		this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
		    		arriba=true;
		    		System.out.println("Arriba");
		    	}
		    	else {
			    	if (this.getBounds().intersects(rectanguloAbajo)) {
			    		this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
			    		abajo=true;
			    		System.out.println("Abajo");
			    	}
		    	}
	    	}
    	}
    	
    	if (arriba==true && derecha==true) {
    		this.coordenadas.x*=-1;
    		this.coordenadas.y*=-1;
    	}
    	else {
    		if (arriba==true && izquierda==true) {
        		this.coordenadas.x*=-1;
        		this.coordenadas.y*=-1;
        	}
    		else {
    			if (abajo==true && derecha==true) {
    	    		this.coordenadas.x*=-1;
    	    		this.coordenadas.y*=-1;
    	    	}
    			else {
    				if (abajo==true && izquierda==true) {
    		    		this.coordenadas.x*=-1;
    		    		this.coordenadas.y*=-1;
    		    	}
    			}
    		}
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
		millisactuales=System.currentTimeMillis();
		
		segundos=millisactuales-millis;
		
		
		if(this.presionaEspacio || this.presionaBoton || segundos >5000) {
			if (this.trayectoria == null) {
				this.coordenadas = new PuntoAltaPrecision(x, y);
				this.trayectoria = new TrayectoriaRecta(-2.5f, coordenadas, true);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelsPorFrame);
			if (pixelsPorFrame < 1) {
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
