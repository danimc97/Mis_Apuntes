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
import java.awt.event.MouseListener;
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
	private List <Explosion> explosion=new ArrayList<Explosion>();
	private SoundCache soundCache= new SoundCache();
	Pelota m = new Pelota(this);
	Rectangle limitePantalla= new Rectangle(0, 450, 640, 5);
	private boolean bolaBorrada=false;
	
	public Arkanoid() {
		
		JFrame ventana = new JFrame("Arkanoid-Back to the Future");
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
				m.keyPressed(e);
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				nave.MouseMoved(e);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				m.mouseClicked(e);
			}
		});
		
	}
	
	
	public void initWorld() {
	   
	      
//	      Nave nave= new Nave(this);
		  nave.setX(120);
		  nave.setY(120);
	      objeto.add(m);
	      objeto.add(nave);
	      nave.setX(Stage.WIDTH/2);
	      nave.setY(Stage.HEIGHT - 2*nave.getHeight());
	      
	      
		  
	      
	      soundCache.loopSound("Regreso Al Futuro.wav");
	      
	      for (int j=0;j<4;j++) {
	    	  for (int i=0;i<10;i++) {
	    		  Ladrillo ladrillo=new Ladrillo(this,j);
	    		  ladrillo.setX(5+i*63);
	    		  ladrillo.setY(j*23);
	    		  objeto.add(ladrillo);
	    	  }
	      }
	      
	      if (m.getVx()==0 && m.getVy()==0) {
	    	  m.setX(nave.getX()+40);
			  m.setY(nave.getY()-m.getHeight());
	      }
	}
	
	public void updateWorld() {
		
		
		
		if ((m.getVx()==0 && m.getVy()==0)) {
	    	  m.setX(nave.getX()+40);
			  m.setY(nave.getY()-m.getHeight());
		}
		
		int i=0;
		
		for (ObjetosEnPantalla objetos : objeto) {
			objetos.act();
		}
		
		while ( i < objeto.size()) {
			ObjetosEnPantalla m = (ObjetosEnPantalla)objeto.get(i);
			if (m.isMarkedForRemoval()) {
				if(m instanceof Pelota) {
					Explosion e=new Explosion(this);
					e.setX(m.getX()+20);
					e.setY(m.getY());
					explosion.add(e);
					objeto.remove(i);
					this.m=new Pelota(this);
					this.m.setX(nave.getX()+40);
					this.m.setY(nave.getY()-m.getHeight());
					this.m.setVx(0);
					this.m.setVy(0);
					bolaBorrada=true;
				}
				else {
					Explosion e=new Explosion(this);
					e.setX(m.getX()+20);
					e.setY(m.getY());
					explosion.add(e);
					objeto.remove(i);
				}
			}
			else {
				m.act();
				i++;
			}
			
			if(bolaBorrada) {
				objeto.add(this.m);
				bolaBorrada=false;
			}
		}
		
		for (i=0;i<explosion.size();) {
			ObjetosEnPantalla m =(ObjetosEnPantalla) explosion.get(i);
			if(m.isMarkedForRemoval()) {
				explosion.remove(i);
			}
			else {
				i++;
			}
		}
		for(i=0;i<explosion.size();i++) {
			ObjetosEnPantalla m=(ObjetosEnPantalla)explosion.get(i);
			m.act();
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
		
		for (ObjetosEnPantalla explosion : explosion) {
			explosion.paint(g);
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
	
	public SoundCache getSoundCache() {
		return soundCache;
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
