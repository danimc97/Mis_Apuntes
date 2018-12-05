package ahorcado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
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
		
		
		if (Principal.ponerNavidad==false) {
		
		//Imagen de fondo
		g.drawImage(getImagen("ikea.jpg"), 0, 0, this);
		
		String palabra="";
		String fallos="";
		g.setFont(new Font("Console", Font.BOLD, 16));
		g.drawString("Acierta la palabra: ", 450, 180);
		
		for (int i=0;i<Principal.coincidencia.length;i++) {
			palabra+=Principal.coincidencia[i]+" ";
		}
		
		for (int i=0;i<Principal.arrayDeFallos.length;i++) {
			fallos+=Principal.arrayDeFallos[i]+" ";
		}
		
		g.setFont(new Font("Console", Font.BOLD, 20));
		g.drawString(palabra, 450, 210);
		
		g.setFont(new Font("Console", Font.BOLD, 15));
		g.drawString("Fallos: "+fallos, 320, 70);
		
		
		if (Principal.palabraEntera==true) {
			g.drawString("¡Enhorabuena!", 450, 310);
		}
		
		if (Principal.repararAcierto==true) {
			g.drawString("¡Enhorabuena!", 450, 310);
		}
		
		
		if (Principal.contadorDeFallos==1 && Principal.godMode==false) {
			g.setColor(Color.red);
			g.fillOval(270, 120, 80, 80);
		}
		
		
		
		
		
			// Pintando la cabeza
					g.setColor(Color.pink);
					g.fillOval(270, 120, 80, 80);
					
			//Pintando el cuerpo
					g.setColor(Color.green);
					g.fillRect(270, 200, 80, 120);
					
			//Pintando los brazos
					g.setColor(Color.green);
					g.fillRect(355, 200, 20, 100);
					
					g.setColor(Color.green);
					g.fillRect(245, 200, 20, 100);
					
			//Pintando las piernas
					g.setColor(Color.blue);
					g.fillRect(320, 320, 30, 100);
					
					g.setColor(Color.blue);
					g.fillRect(270, 320, 30, 100);
					
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
					g.drawLine(313, 30, 313, 120);
					
					
			if (Principal.contadorDeFallos==1) {
				
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
				
			}
			
			if (Principal.contadorDeFallos==2) {
				
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
						
				g.setColor(Color.red);
				g.fillRect(270, 200, 80, 120);
				
			}
			
			if (Principal.contadorDeFallos==3) {
				
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
						
				g.setColor(Color.red);
				g.fillRect(270, 200, 80, 120);
				
				g.setColor(Color.red);
				g.fillRect(355, 200, 20, 100);
				
			}
			
			if (Principal.contadorDeFallos==4) {
				
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
						
				g.setColor(Color.red);
				g.fillRect(270, 200, 80, 120);
				
				g.setColor(Color.red);
				g.fillRect(355, 200, 20, 100);
				
				g.setColor(Color.red);
				g.fillRect(245, 200, 20, 100);
				
			}
			
			if (Principal.contadorDeFallos==5) {
				
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
						
				g.setColor(Color.red);
				g.fillRect(270, 200, 80, 120);
				
				g.setColor(Color.red);
				g.fillRect(355, 200, 20, 100);
				
				g.setColor(Color.red);
				g.fillRect(245, 200, 20, 100);
				
				g.setColor(Color.red);
				g.fillRect(320, 320, 30, 100);
				
			}
			
			if (Principal.contadorDeFallos==6) {
				
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
						
				g.setColor(Color.red);
				g.fillRect(270, 200, 80, 120);
				
				g.setColor(Color.red);
				g.fillRect(355, 200, 20, 100);
				
				g.setColor(Color.red);
				g.fillRect(245, 200, 20, 100);
				
				g.setColor(Color.red);
				g.fillRect(320, 320, 30, 100);
				
				g.setColor(Color.red);
				g.fillRect(270, 320, 30, 100);
				
			}
		}
		
		if (Principal.ponerNavidad==true) {
			
			//Imagen de fondo
			g.drawImage(getImagen("Eguisheim Navidad.JPG"), 0, 0, this);
			
			
			String palabra="";
			String fallos="";
			g.setColor(Color.red);
			g.setFont(new Font("Console", Font.BOLD, 16));
			g.drawString("Acierta la palabra: ", 450, 180);
			
			for (int i=0;i<Principal.coincidencia.length;i++) {
				palabra+=Principal.coincidencia[i]+" ";
			}
			
			for (int i=0;i<Principal.arrayDeFallos.length;i++) {
				fallos+=Principal.arrayDeFallos[i]+" ";
			}
			
			g.setColor(Color.red);
			g.setFont(new Font("Console", Font.BOLD, 20));
			g.drawString(palabra, 450, 210);
			
			g.setColor(Color.red);
			g.setFont(new Font("Console", Font.BOLD, 15));
			g.drawString("Fallos: "+fallos, 320, 70);
			
			
			if (Principal.palabraEntera==true) {
				g.drawString("¡Enhorabuena!", 450, 310);
			}
			
			if (Principal.repararAcierto==true) {
				g.drawString("¡Enhorabuena!", 450, 310);
			}
			
			
			if (Principal.contadorDeFallos==1 && Principal.godMode==false) {
				g.setColor(Color.red);
				g.fillOval(270, 120, 80, 80);
			}
			
			
			
			
			
				// Pintando la cabeza
						g.setColor(Color.pink);
						g.fillOval(270, 120, 80, 80);
						
				//Pintando el cuerpo
						g.setColor(Color.red);
						g.fillRect(270, 200, 80, 120);
						
				//Pintando los brazos
						g.setColor(Color.red);
						g.fillRect(355, 200, 20, 100);
						
						g.setColor(Color.red);
						g.fillRect(245, 200, 20, 100);
						
				//Pintando las piernas
						g.setColor(Color.red);
						g.fillRect(320, 320, 30, 100);
						
						g.setColor(Color.red);
						g.fillRect(270, 320, 30, 100);
						
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
						g.drawLine(313, 30, 313, 120);
						
				g.drawImage(getImagenGorro("gorrochico.png"), 250, 65, this);
						
						
				if (Principal.contadorDeFallos==1) {
					
					g.setColor(Color.green);
					g.fillOval(270, 120, 80, 80);
					g.drawImage(getImagenGorro("gorrochico.png"), 250, 65, this);
					
				}
				
				if (Principal.contadorDeFallos==2) {
					
					g.setColor(Color.green);
					g.fillOval(270, 120, 80, 80);
							
					g.setColor(Color.green);
					g.fillRect(270, 200, 80, 120);
					
				}
				
				if (Principal.contadorDeFallos==3) {
					
					g.setColor(Color.green);
					g.fillOval(270, 120, 80, 80);
							
					g.setColor(Color.green);
					g.fillRect(270, 200, 80, 120);
					
					g.setColor(Color.green);
					g.fillRect(355, 200, 20, 100);
					
				}
				
				if (Principal.contadorDeFallos==4) {
					
					g.setColor(Color.green);
					g.fillOval(270, 120, 80, 80);
							
					g.setColor(Color.green);
					g.fillRect(270, 200, 80, 120);
					
					g.setColor(Color.green);
					g.fillRect(355, 200, 20, 100);
					
					g.setColor(Color.green);
					g.fillRect(245, 200, 20, 100);
					
				}
				
				if (Principal.contadorDeFallos==5) {
					
					g.setColor(Color.green);
					g.fillOval(270, 120, 80, 80);
							
					g.setColor(Color.green);
					g.fillRect(270, 200, 80, 120);
					
					g.setColor(Color.green);
					g.fillRect(355, 200, 20, 100);
					
					g.setColor(Color.green);
					g.fillRect(245, 200, 20, 100);
					
					g.setColor(Color.green);
					g.fillRect(320, 320, 30, 100);
					
				}
				
				if (Principal.contadorDeFallos==6) {
					
					g.setColor(Color.green);
					g.fillOval(270, 120, 80, 80);
							
					g.setColor(Color.green);
					g.fillRect(270, 200, 80, 120);
					
					g.setColor(Color.green);
					g.fillRect(355, 200, 20, 100);
					
					g.setColor(Color.green);
					g.fillRect(245, 200, 20, 100);
					
					g.setColor(Color.green);
					g.fillRect(320, 320, 30, 100);
					
					g.setColor(Color.green);
					g.fillRect(270, 320, 30, 100);
					
				}
			
		}
	}
	
	
	
	public BufferedImage getImagen(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/ahorcado/" + nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getImagenGorro(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource("/ahorcado/" + nombre);
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
