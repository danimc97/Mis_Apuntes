package marvel_VS_SF;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ejemploEventos.OrdenadorEvent1;
import ejemploEventos.OrdenadorListener2;


public class Principal {
	
	static List<DetectaPunetazoListener> punetazoListeners = new ArrayList<DetectaPunetazoListener>();
	
	public static void main(String[] args) {
		
		
		System.out.println("Primer personaje:\n"
				+ "Nombre: "+Personaje1.getInstancia().getNombre()+"\n"
						+ "Vida: "+Personaje1.getInstancia().getVida()+"\n"
								+ "Fuerza: "+Personaje1.getInstancia().getFuerza());
		
		System.out.println();
		
		System.out.println("Segundo personaje:\n"
				+ "Nombre: "+Personaje2.getInstancia().getNombre()+"\n"
						+ "Vida: "+Personaje2.getInstancia().getVida()+"\n"
								+ "Fuerza: "+Personaje2.getInstancia().getFuerza());
		
		JOptionPane.showMessageDialog(null, "3... 2.. 1... Fight!");
		
		Pelea();
		
		System.out.println("¡Combate finalizado!");
	}
	
	public static void Pelea() {
		
		do {
			
			if(Personaje1.getInstancia().getVida()>0) {
				System.out.println("Turno de "+Personaje1.getInstancia().getNombre());
				Personaje1.getInstancia().act();
				Personaje1.getInstancia().lista_ataque_personaje1.clear();
				System.out.println("La vida de "+Personaje1.getInstancia().getNombre()+" es de "+Personaje1.getInstancia().getVida());
				System.out.println("La vida de "+Personaje2.getInstancia().getNombre()+" es de "+Personaje2.getInstancia().getVida());
				System.out.println();
			}
			JOptionPane.showMessageDialog(null, "Siguiente turno");
			
			if(Personaje2.getInstancia().getVida()>0) {
				System.out.println("Turno de "+Personaje2.getInstancia().getNombre());
				Personaje2.getInstancia().act();
				Personaje2.getInstancia().lista_ataque_personaje2.clear();
				System.out.println("La vida de "+Personaje1.getInstancia().getNombre()+" es de "+Personaje1.getInstancia().getVida());
				System.out.println("La vida de "+Personaje2.getInstancia().getNombre()+" es de "+Personaje2.getInstancia().getVida());
				System.out.println();
			}
			JOptionPane.showMessageDialog(null, "Siguiente turno");
			
		}while (Personaje1.getInstancia().getVida()>0 && Personaje2.getInstancia().getVida()>0);
		
	}
	
	public static void addDetectaPunetazoListener (DetectaPunetazoListener listener) {
		punetazoListeners.add(listener);
	}
	
	public static void removeDetectaPunetazoListener(DetectaPunetazoListener listener) {
		punetazoListeners.remove(listener);
	}
	
	public static void fireDetectaPunetazoPJ1Event(DetectaPunetazoEvent evento) {
		for (DetectaPunetazoListener listener : punetazoListeners) {
			listener.DetectaPunetazoPJ1(evento);		
		}
	}
	
	public static void fireDetectaPunetazoPJ2Event(DetectaPunetazoEvent evento) {
		for (DetectaPunetazoListener listener : punetazoListeners) {
			listener.DetectaPunetazoPJ2(evento);		
		}
	}
}
