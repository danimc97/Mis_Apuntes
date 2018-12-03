package ahorcado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends Canvas {

	public static final int ANCHO = 640;
	public static final int ALTO = 480;
	
	public static Ventana ventana = null;
	
	public Ventana () {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("El ahorcado");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,ANCHO,ALTO);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
		this.setBounds(0,0,ANCHO,ALTO);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);
		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);
	}
	
	@Override
	public void paint(Graphics g) {
		
		// Pintando la cabeza
				g.setColor(Color.pink);
				g.fillOval(252, 80, 120, 120);
				
		//Pintando el cuerpo
				g.setColor(Color.green);
				g.fillRect(261, 200, 100, 120);
				
		//Pintando los brazos
				g.setColor(Color.green);
				g.fillRect(361, 200, 30, 100);
				
				g.setColor(Color.green);
				g.fillRect(231, 200, 30, 100);
				
		//Pintando las piernas
				g.setColor(Color.blue);
				g.fillRect(330, 320, 30, 100);
				
				g.setColor(Color.blue);
				g.fillRect(263, 320, 30, 100);
				
		//Pintando la base
				g.setColor(Color.gray);
				g.fillRect(11, 380, 150, 30);
				
		//Pintando el tronco
				g.setColor(Color.gray);
				g.fillRect(11, 30, 40, 350);
				
		//Pintando el techo
				g.setColor(Color.gray);
				g.fillRect(13, 30, 300, 40);
				
		//Pintando la cuerda
				g.drawLine(313, 30, 313, 80);
				
		//Imagen de fondo
				g.drawImage(getImagen("tableroOca.png"), 0, 0, this);
	}
	
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/tutorialJava/capitulo4_OO/ejercicios/ejercicioExtra02_La_Oca/recursos/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public static Ventana getVentana() {
		if (ventana == null) {
			ventana = new Ventana();
		}
		return ventana;
	}
	
}
