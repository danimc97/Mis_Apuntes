package arkanoid;
/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;







public class Arkanoid extends Canvas implements Stage {
	
	private BufferStrategy strategy;
	private long usedTime;
	
	private SpriteCache spriteCache=new SpriteCache();
	private List<ObjetosEnPantalla>objeto = new ArrayList<ObjetosEnPantalla>();
	private Nave nave=new Nave(this);
	
	public Arkanoid() {

		JFrame ventana = new JFrame("Invaders");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				nave.keyReleased(e);
			}
			
			public void keyPressed(KeyEvent e) {
				nave.keyPressed(e);
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				nave.MouseMoved(e);
			}
		});
		
	}
	
	public void initWorld() {
	   
	      Pelota m = new Pelota(this);
//	      Nave nave= new Nave(this);
	      	m.setX(300);
		    m.setY(400);
		    m.setVy(3);
		    m.setVx(3);
		    nave.setX(120);
		    nave.setY(120);
	      objeto.add(m);
	      objeto.add(nave);
	      nave.setX(Stage.WIDTH/2);
	      nave.setY(Stage.HEIGHT - 2*nave.getHeight());
	      
	   
	      for (int i = 0; i < 10; i++){
	        Ladrillo ladrillo = new Ladrillo(this);
	        ladrillo.setSpriteName("ladrillo-amarillo.jpg");
	        ladrillo.setX(20+i*61);
	  	    ladrillo.setY(20);
	        objeto.add(ladrillo);
	      }
	      
	      for (int i = 0; i < 10; i++){
	        Ladrillo ladrillo = new Ladrillo(this);
	        ladrillo.setSpriteName("ladrillo-azul.jpg");
	        ladrillo.setX(20+i*61);
	  	    ladrillo.setY(42);
	        objeto.add(ladrillo);
		  }
	      
	      for (int i = 0; i < 10; i++){
	        Ladrillo ladrillo = new Ladrillo(this);
	        ladrillo.setSpriteName("ladrillo-rojo.jpg");
	        ladrillo.setX(20+i*61);
	  	    ladrillo.setY(64);
	        objeto.add(ladrillo);
		  }
	      
	      for (int i = 0; i < 10; i++){
	        Ladrillo ladrillo = new Ladrillo(this);
	        ladrillo.setSpriteName("ladrillo-verde.jpg");
	        ladrillo.setX(20+i*61);
	  	    ladrillo.setY(86);
	        objeto.add(ladrillo);
		  }
	      
	}
	
	public void updateWorld() {
		
		int i=0;
		
		for (ObjetosEnPantalla objetos : objeto) {
			objetos.act();
		}
		
		while ( i < objeto.size()) {
			ObjetosEnPantalla m = (ObjetosEnPantalla)objeto.get(i);
			if (m.isMarkedForRemoval()) {
				objeto.remove(i);
			} else {
				m.act();
				i++;
			}
		}
		
	}
	
	public void checkCollisions() {
		Rectangle playerBounds = nave.getBounds();
		for (int i = 0; i < objeto.size(); i++) {
			ObjetosEnPantalla a1 = (ObjetosEnPantalla)objeto.get(i);
			Rectangle r1 = new Rectangle(a1.getX(), a1.getY(), a1.getWidth(), a1.getHeight());
			//System.out.println("x: " + a1.getX() + " y: " + a1.getY() + " w: " + a1.getWidth() + " h: " + a1.getHeight() + " a1: " + a1);
			
		  for (int j = i+1; j < objeto.size(); j++) {
		  	ObjetosEnPantalla a2 = (ObjetosEnPantalla)objeto.get(j);
		  	Rectangle r2 =  new Rectangle(a2.getX(), a2.getY(), a2.getWidth(), a2.getHeight());
		  	if (r1.intersects(r2)) {
		  		a1.collision(a2);
		  		a2.collision(a1);
		  	}
		  }
		}
	}
	
	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.white);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(getImagen("fondo-bttf1.jpg"), 0, 0, this);
		for (ObjetosEnPantalla objetos : objeto) {
			objetos.paint(g);
		}
		
		g.setColor(Color.white);
		if (usedTime > 0)
		  g.drawString(String.valueOf(1000/usedTime)+" fps",0,Stage.HEIGHT-50);
  	else
	  	g.drawString("--- fps",0,Stage.HEIGHT-50);
		strategy.show();
	}
	
	public SpriteCache getSpriteCache() {
		return spriteCache;
	}

	
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource(nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	/*public SpriteCache getSpriteCache() {
		return spriteCache;
	}*/
	
	public void game() {
		usedTime=1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			checkCollisions();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Arkanoid inv = new Arkanoid();
		inv.game();
	}
}
