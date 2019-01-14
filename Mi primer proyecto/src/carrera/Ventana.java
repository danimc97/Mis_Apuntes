package carrera;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
// libremente.
public class Ventana extends Canvas {

	// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
	// de la ventana
	public static final int WIDTH = 820;
	public static final int HEIGHT = 387;

	
	public Ventana () {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("Formula 1");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
		this.setBounds(0,0,WIDTH,HEIGHT);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);
		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);
	}
	
	
	
	/**
	 * Sobrescribimos el m�todo "paint" que tienen todos los componentes gr�ficos en AWT-SWING
	 */
	@Override
	public void paint(Graphics g) {
		
		// Pintando el fondo
		g.setColor(new Color(27, 117, 25));
		g.fillRect(0, 0, 820, 387);
		
		// Pintando la primera pista
		g.setColor(new Color(47,48,51));
		g.fillRect(11, 22, 500, 79);
	
		// Pintando la segunda pista
		g.setColor(new Color(47,48,51));
		g.fillRect(11, 102, 500, 79);
		
		// Pintando la tercera pista
		g.setColor(new Color(47,48,51));
		g.fillRect(11, 182, 500, 79);
		
		// Pintando la cuarta pista
		g.setColor(new Color(47,48,51));
		g.fillRect(11, 262, 500, 79);

		//Imagen de meta
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 22, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 62, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 102, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 142, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 182, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 222, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 262, this);
		g.drawImage(getImagen("linea-de-meta-png.jpg"), 460, 302, this);
		
		//Imagen podium
		g.drawImage(getImagenPodium("podio.png"), 580, 112, this);
		
		
		
	/*	// Establecimiento del color del pincelde
		g.setColor(Color.decode("#74ce25"));

		// Pintando una l�nea
		g.drawLine(0, 0, WIDTH, HEIGHT);
		
		// Pintando un cuadrado vac�o
		g.setColor(Color.red);
		g.drawRect(120, 20, 100, 50);
		
		// Pintando un cuadrado
		g.setColor(Color.yellow);
		g.fillRect(80, 200, 140, 25);
		
		// Pintando un �valo
		g.setColor(Color.green);
		g.drawOval(300, 130, 120, 120);
		
		// Pintando un �valo relleno
		g.setColor(Color.pink);
		g.fillOval(300, 300, 120, 90);
		
		g.drawString("hola", 10, 10);*/
		
	}
	
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/carrera/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getImagenPodium(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/carrera/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}

}
