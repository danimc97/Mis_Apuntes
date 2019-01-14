package juego3raya;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends Canvas {

	// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
	// de la ventana
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;
	
	private Celda celdas[] = new Celda[9];

	
	
	/**
	 * 
	 */
	public Ventana () {
		JFrame ventana = new JFrame("3 en raya");
		ventana.setBounds(0,0,WIDTH+8,HEIGHT+35);
		
		JPanel panel = (JPanel)ventana.getContentPane();

		panel.add(this);
		this.setBounds(0,0,WIDTH,HEIGHT);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Celda celda : celdas) {
					if (celda.isEnCoordenadas(e.getX(), e.getY())) {
						celda.mouseClicked();
					}
				}
				
				for (int i = 0; i < celdas.length; i++) {
					Celda celda = celdas[i];
					
				}
			}
		});
		
		
		initCeldas();
	}
	
	
	
	/**
	 * 
	 */
	private void initCeldas() {
		celdas[0] = new Celda (0, 0, this);
		celdas[1] = new Celda (200, 0, this);
		celdas[2] = new Celda (400, 0, this);
		celdas[3] = new Celda (0, 200, this);
		celdas[4] = new Celda (200, 200, this);
		celdas[5] = new Celda (400, 200, this);
		celdas[6] = new Celda (0, 400, this);
		celdas[7] = new Celda (200, 400, this);
		celdas[8] = new Celda (400, 400, this);
	}
	
	
	
	/**
	 * Sobrescribimos el m�todo "paint" que tienen todos los componentes gr�ficos en AWT-SWING
	 */
	@Override
	public void paint(Graphics g) {
		
		g.drawImage(getImagen("3raya.png"), 0, 0, this);
		
		for (Celda celda : celdas) {
			celda.paint(g);
		}
		
	}
	
	public BufferedImage getImagen(String nombre) {
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


}
