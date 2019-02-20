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
import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ahorcado.Ventana;









public class Arkanoid extends Canvas implements Stage {
	
	private BufferStrategy strategy;
	private long usedTime;
	
	private SpriteCache spriteCache=new SpriteCache();
	private List<ObjetosEnPantalla>objeto = new ArrayList<ObjetosEnPantalla>();
	private Nave nave=new Nave(this);
	private List <Explosion> explosion=new ArrayList<Explosion>();
	private SoundCache soundCache= new SoundCache();
	Pelota pelota = new Pelota(this);
	Rectangle limitePantalla= new Rectangle(0, 450, 640, 5);
	private boolean bolaBorrada=false;
	Fase fase = new Fase01();
	private boolean nuevaFase=false;	
	static public int contadorVidas=3;
	JPanel panel;
	JFrame ventana;
	private boolean arreglarAnimacion=false ;
	Pildora pildora = new Pildora(this);
	public static boolean matricula=false;
	Fase faseActiva[] = new Fase[] {new Fase01(),new Fase02(),new Fase03()};
	private int contadorFase=0;
	private int FinalFase=0;
	private int limitePildoras=0;
	
	public Arkanoid() {
		
		ventana = new JFrame("Arkanoid-Back to the Future");
		panel = (JPanel)ventana.getContentPane();
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
				pelota.keyPressed(e);
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				nave.MouseMoved(e);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pelota.mouseClicked(e);
			}
		});
		
	}
	
	
	public void initWorld() {
	   
	      
		pelota= new Pelota(this);
		objeto.clear();
		  nave.setX(120);
		  nave.setY(120);
	      objeto.add(pelota);
	      objeto.add(nave);
	      nave.setX(Stage.WIDTH/2);
	      nave.setY(Stage.HEIGHT - 2*nave.getHeight());
	      
	      
		  
	      
	      soundCache.loopSound("Regreso Al Futuro.wav");
	      fase.inicializaFase(this);
	      objeto.addAll(fase.actores);
	      
	      if (pelota.getVx()==0 && pelota.getVy()==0 || nuevaFase==true) {
	    	  pelota.setX(nave.getX()+40);
			  pelota.setY(nave.getY()-pelota.getHeight());
	      }
	      
	       // Preparaci�n de la primera fase
	        this.fase = faseActiva[contadorFase];
	        this.fase.inicializaFase(this);
	        this.objeto.clear();
	        this.objeto.addAll(this.fase.getActores());
	        this.objeto.add(this.nave);
	        this.objeto.add(this.pelota);
	}
	
	
	public void updateWorld() {
		
		//nave.setX(pelota.getX()-50);
		
		if(pelota.novojogo) {
			String name[]=new String[] {nave.nombre[0]};
        	nave.setSpriteName(name);
        	pelota.novojogo=false;
		}
		
		if ((pelota.getVx()==0 && pelota.getVy()==0)) {
	    	  pelota.setX(nave.getX()+40);
			  pelota.setY(nave.getY()-pelota.getHeight());
		}
		
		int i=0;
		
		for (ObjetosEnPantalla objetos : objeto) {
			objetos.act();
		}
		
		while ( i < objeto.size()) {
			ObjetosEnPantalla m = (ObjetosEnPantalla)objeto.get(i);
			if(m instanceof Pildora && m.isMarkedForRemoval()) {
				objeto.remove(i);
			}
			else if (m.isMarkedForRemoval()) {
				if(m instanceof Pelota) {
					Explosion e=new Explosion(this);
					e.setX(m.getX()+20);
					e.setY(m.getY());
					explosion.add(e);
					objeto.remove(i);
					this.pelota=new Pelota(this);
					this.pelota.setX(nave.getX()+40);
					this.pelota.setY(nave.getY()-m.getHeight());
					this.pelota.setVx(0);
					this.pelota.setVy(0);
					bolaBorrada=true;
					pelota.arreglarVidas=false;
					//arreglarAnimacion=false;
				}
				else if(m instanceof Ladrillo) {
						if(((Ladrillo)m).dosVidas==true) {
							getSoundCache().playSound("Arkanoid-SFX-05.wav");	
							((Ladrillo)objeto.get(i)).dosVidas=false;
							objeto.get(i).setMarkedForRemoval(false);
						}
					
					else {
						Explosion e=new Explosion(this);
						e.setX(m.getX()+20);
						e.setY(m.getY());
						explosion.add(e);
						objeto.remove(i);
						fase.contadorLadrillo--;
						pildora.probabilidad();
						if(pildora.numeroProbabilidad>8 && limitePildoras<6) {
							pildora.tipoPildora();
							if(pildora.numeroPildora==0) {
								limitePildoras++;
								PildoraBarraLarga pildoraBarra = new PildoraBarraLarga(this, 0);
								pildoraBarra.setX(m.getX()+25);
								pildoraBarra.setY(m.getY());
								objeto.add(pildoraBarra);
							}
							if(pildora.numeroPildora==1) {
								limitePildoras++;
								PildoraBarraPequeña pildoraBarra = new PildoraBarraPequeña(this, 0);
								pildoraBarra.setX(m.getX()+25);
								pildoraBarra.setY(m.getY());
								objeto.add(pildoraBarra);
							}
							if(pildora.numeroPildora==2) {
								limitePildoras++;
								PildoraCambiarFase pildoraBarra = new PildoraCambiarFase(this, 0);
								pildoraBarra.setX(m.getX()+25);
								pildoraBarra.setY(m.getY());
								objeto.add(pildoraBarra);
							}
						}
					}
				}
				else if(m instanceof LadrilloConMovimiento) {
					if(((LadrilloConMovimiento)m).diezVidas<100) {
						((LadrilloConMovimiento)objeto.get(i)).diezVidas++;
						objeto.get(i).setMarkedForRemoval(false);
					}
					else {
						Explosion e=new Explosion(this);
						e.setX(m.getX()+20);
						e.setY(m.getY());
						explosion.add(e);
						objeto.remove(i);
						fase.contadorLadrillo--;
					}
				}
				else {
					Explosion e=new Explosion(this);
					e.setX(m.getX()+20);
					e.setY(m.getY());
					explosion.add(e);
					objeto.remove(i);
					fase.contadorLadrillo--;
				}
			}
			else {
				m.act();
				i++;
				
			}
			
			if(bolaBorrada) {
				objeto.add(this.pelota);
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
		
		g.drawString("Vidas restantes: "+contadorVidas, 500, 400);
		
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
			} catch (InterruptedException e) {
				
			}
			if ((fase.contadorLadrillo<=0) || matricula) {
				FinalFase++;
				nuevaFase=true;
				if(FinalFase<3) {
					JOptionPane.showMessageDialog(null, "¡Doc! Hay que ir de regreso al futuro a por una nueva fase");
					explosion.clear();
					objeto.clear();
					//arreglarAnimacion=false;
					objeto.add(new Animacion (this));
					while(objeto.isEmpty()==false) {
						updateWorld();
						paintWorld();
					}
					nave = new Nave(this);
					contadorFase++;
					matricula=false;
					contadorVidas++;
					limitePildoras=0;
					initWorld();
				}
				else {
					explosion.clear();
					objeto.clear();
					Ladrillo ladrillo= new Ladrillo(this,6);
					objeto.add(ladrillo);
				}
			}
			else {
				
				if(contadorVidas<=0) {
					Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
					Ladrillo ladrillo= new Ladrillo(this,5);
					objeto.clear();
					objeto.add(ladrillo);
					updateWorld();
					paintWorld();
					JOptionPane.showMessageDialog(null, "Perdiste, McFly");
					System.exit(0);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Arkanoid inv = new Arkanoid();
		inv.game();
	}
}
