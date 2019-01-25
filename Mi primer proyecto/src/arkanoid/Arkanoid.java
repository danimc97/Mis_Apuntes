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
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Arkanoid extends Canvas implements Stage {
	
	private BufferStrategy strategy;
	private long usedTime;
	
	private SpriteCache spriteCache;
	private ArrayList objeto; 
	
	public Arkanoid() {
		spriteCache = new SpriteCache();

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
	}
	
	public void initWorld() {
	    objeto = new ArrayList();
	   
	      Pelota m = new Pelota(this);
	      Nave nave= new Nave(this);
	      	m.setX(60);
		    m.setY(40);
		    m.setVy(3);
		    m.setVx(3);
		    nave.setX(120);
		    nave.setY(120);
	      objeto.add(m);
	      objeto.add(nave);
	}
	
	public void updateWorld() {
		for (int i = 0; i < objeto.size(); i++) {
			ObjetosEnPantalla m = (ObjetosEnPantalla)objeto.get(i);
			m.act();
			ObjetosEnPantalla nave = (ObjetosEnPantalla)objeto.get(i);
			nave.act();
		}
	}
	
	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.white);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(getImagen("fondo-arkanoid.jpg1.png"), 0, 0, this);
		for (int i = 0; i < objeto.size(); i++) {
			ObjetosEnPantalla m = (ObjetosEnPantalla)objeto.get(i);
			m.paint(g);
		}
		
		g.setColor(Color.white);
		if (usedTime > 0)
		  g.drawString(String.valueOf(1000/usedTime)+" fps",0,Stage.HEIGHT-50);
  	else
	  	g.drawString("--- fps",0,Stage.HEIGHT-50);
		strategy.show();
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
	
	public SpriteCache getSpriteCache() {
		return spriteCache;
	}
	
	public void game() {
		usedTime=1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
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
