/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */
package arkanoid;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class ObjetosEnPantalla {
	
	protected int x,y;
	protected int width, height;
	protected String[] spriteName;
	protected Stage stage;
	protected SpriteCache spriteCache;
	protected boolean markedForRemoval;
	protected int frameSpeed;
	protected int currentFrame;
	protected int t;

	public void setFrameSpeed (int frameSpeed) {
		this.frameSpeed=frameSpeed;
	}
	
	public void remove() {
		markedForRemoval= true;
	}
	
	public boolean isMarkedForRemoval() {
		
		return markedForRemoval;
	}
	
	
	 public void setMarkedForRemoval(boolean markedForRemoval) {
		this.markedForRemoval = markedForRemoval;
	}

	public Rectangle getBounds() {
         return new Rectangle(x,y,width,height);
       }
       
	 
       public void collision(ObjetosEnPantalla a){
         
       }
	
	public ObjetosEnPantalla(Stage stage) {
		this.stage = stage;
		spriteCache = stage.getSpriteCache();
		currentFrame=0;
		frameSpeed=1;
		t=0;
	}
	
	public void paint(Graphics2D g){
		g.drawImage( spriteCache.getSprite(spriteName[currentFrame]), x,y, stage );
	}
	
	public int getX()  { return x; }
	public void setX(int i) {	x = i; }

	public int getY() {	return y; }
	public void setY(int i) { y = i; }
	
	public String[] getSpriteName() {	return spriteName; }
	public void setSpriteName(String[] exp) { 
		spriteName = exp;
		BufferedImage image = spriteCache.getSprite(spriteName[currentFrame]);
		height = image.getHeight();
		width = image.getWidth();
	}			
	
	public int getHeight() { return height; }
	public int getWidth() {	return width;	}
	public void setHeight(int i) {height = i;	}
	public void setWidth(int i) {	width = i;	}

	public void act() {
		t++;
		if(t%frameSpeed==0) {
			t=0;
			currentFrame=(currentFrame+1)% spriteName.length;
		}
	}
}
