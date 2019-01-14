package juego3raya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.naming.InitialContext;

public class Principal {
	
	private static Jugador jugadores[] = new Jugador[2];
	private static int indiceJugadorActivo = 0;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ventana ventana = new Ventana();
		
		initJugadores();
		
	}

	
	/**
	 * 
	 */
	private static void initJugadores () {
		jugadores[0] = new Jugador ("Jugador1", 1) {
			@Override
			public void paint(Graphics g, int offsetX, int offsetY) {
				Graphics2D g2d = (Graphics2D) g;
				g2d.setStroke(GuiUtil.WIDE_STROKE);
				g2d.setColor(Color.red);
				g2d.drawLine(offsetX + Celda.PADDING*5, offsetY + Celda.PADDING*5, offsetX + Celda.LADO - Celda.PADDING*5, (int) (offsetY + Celda.LADO - 10 * Celda.PADDING*0.5));
				g2d.drawLine(offsetX + Celda.LADO - Celda.PADDING*5, offsetY + Celda.PADDING*5, offsetX + Celda.PADDING*5, (int) (offsetY + Celda.LADO - 10 * Celda.PADDING*0.5));
			}
		};
		
		jugadores[1] = new Jugador ("Jugador2", 2) {
			@Override
			public void paint(Graphics g, int offsetX, int offsetY) {
				g.setColor(Color.black);
				g.drawOval((int) (offsetX + Celda.PADDING*5), offsetY + Celda.PADDING*5, Celda.LADO - 9 * Celda.PADDING, Celda.LADO - 9 * Celda.PADDING);
				}
			
			public BufferedImage getImagenPodium(String nombre) {
				URL url=null;
				try {
					url = getClass().getResource("/juego3raya/" + nombre);
					return ImageIO.read(url);
				} catch (Exception e) {
					System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
					System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
					System.exit(0);
					return null;
				}
			}
			
		};
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static Jugador getJugadorTurnoActivo () {
		return jugadores[indiceJugadorActivo];
	}
	
	/**
	 * 
	 */
	public static void avanzaTurno () {
		if (indiceJugadorActivo == 0) {
			indiceJugadorActivo = 1;
		}
		else {
			indiceJugadorActivo = 0;
		}
	}
}
