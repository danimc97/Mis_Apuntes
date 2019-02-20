package arkanoid;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;



public class LadrilloConMovimiento extends ObjetosEnPantalla {
	
	protected String nombre[]=new String [] {"ladrillo-amarillo.jpg","ladrillo-azul.jpg","ladrillo-rojo.jpg","ladrillo-verde.jpg","fase.jpg","perderlapartida.jpg","villano.jpg"};
	protected int vx;
	protected int vy;
	protected int contador=0;
	protected int contador1=0;
	boolean presionaEspacio = false;
	boolean presionaBoton = false;
	TrayectoriaRecta trayectoria = null;
	PuntoAltaPrecision coordenadas = null;
	private float pixelsPorFrame = 3;
	protected long millis = System.currentTimeMillis();
	protected long millisactuales;
	protected long segundos;
	private List <Explosion> explosion=new ArrayList<Explosion>();
	boolean novojogo=false;
	private List<ObjetosEnPantalla>objeto = new ArrayList<ObjetosEnPantalla>();
	Nave nave =new Nave(stage);
	boolean arreglarVidas=false;
	
	int codigoLadrilloAmarillo;
	boolean dosVidas=false;
	int diezVidas=0;
	
	public LadrilloConMovimiento(Stage stage, int colorLadrillos) {
		super(stage);
		String name[]=new String[] {nombre[colorLadrillos]};
		setSpriteName(name);
		this.codigoLadrilloAmarillo=colorLadrillos;
		if(colorLadrillos==3) {
		dosVidas=true;
		}
		if(colorLadrillos==6) {
			diezVidas=0;
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
	
	public void act() {
		millisactuales=System.currentTimeMillis();
		
		segundos=millisactuales-millis;
		
		if( true) {
			if (this.trayectoria == null) {
				this.coordenadas = new PuntoAltaPrecision(x, y);
				this.trayectoria = new TrayectoriaRecta(-1f, coordenadas, true);
			}
			this.coordenadas = this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelsPorFrame);
			if (pixelsPorFrame < 12) {
				pixelsPorFrame *= 1.00035;
			}
			this.x = Math.round(this.coordenadas.x);
			this.y = Math.round(this.coordenadas.y);
			if (x < 0 || x > Stage.WIDTH-64) {
				this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
			}
			if (y > Stage.HEIGHT-350) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
				}
			}
			if (y<0) {
				this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
			}
		}
	}
