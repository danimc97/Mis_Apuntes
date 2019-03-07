package arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Nave extends ObjetosEnPantalla {
	

	protected static final int PLAYER_SPEED = 4;
	protected static int vx;
	private static boolean left;
	private static boolean right;
	protected String nombre[]=new String [] {"delorean1.png","deloreanLargo.png","deloreanPequeño.png"};
	
	public Nave(Stage stage) {
		super(stage);
		String name[]=new String[] {nombre[0]};
    	setSpriteName(name);
	}
	
	public void collision(ObjetosEnPantalla a) {
        if (a instanceof PildoraBarraLarga) {
        	String name[]=new String[] {nombre[1]};
        	setSpriteName(name);
        }
        if (a instanceof PildoraBarraPequenia) {
        	String name[]=new String[] {nombre[2]};
        	setSpriteName(name);
        }
        if (a instanceof LadrilloConMovimiento) {
        	Arkanoid.contadorVidas--;
        }
	}
	
	public void act() {
		super.act();
		if(this.right || this.left) {
			x+=vx;
			if (x < 0)
			  x=0;
			if (x > Stage.WIDTH-getWidth())
				x=Stage.WIDTH-getWidth()-10;
		}
		x+=vx;
		if (x < 0)
		  x=0;
		if (x > Stage.WIDTH-getWidth())
			x=Stage.WIDTH-getWidth()-10;
		
	}
	
		

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
  
	  protected static void updateSpeed() {
	  	vx=0;
	  	if (left) vx = -PLAYER_SPEED;
	  	if (right) vx = PLAYER_SPEED;
	  }
	  
	  public void keyReleased(KeyEvent e) {
	   	switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : left = false; break; 
			  case KeyEvent.VK_RIGHT : right = false;break;
	   	}
	   	updateSpeed();
	  }
	  
	  public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : left = true; break;
			  case KeyEvent.VK_RIGHT : right = true; break;
	  	}
	  	updateSpeed();
	  }
	  
	  public void MouseMoved(MouseEvent e) {
		  this.x=e.getX()-this.getWidth()/2;
	  }

}