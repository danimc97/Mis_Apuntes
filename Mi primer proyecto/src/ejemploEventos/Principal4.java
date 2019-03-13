package ejemploEventos;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {

	static List<OrdenadorListener2> ordenadorListeners = new ArrayList<OrdenadorListener2>();
	
	public static void main(String[] args) {
		
		Futbolista3 FutAntonio= new Futbolista3("Antonio");
		Futbolista3 FutSandra= new Futbolista3("Sandra");
		Astronauta5 AstMaria= new Astronauta5("Maria");
		Astronauta5 AstFrancisco= new Astronauta5("Francisco");
		
		
		pideFrases();

	}
	
	
	
	private static void pideFrases() {
		
		String frase;
		
		do {
			frase = JOptionPane.showInputDialog("Dame frase");
			
			if (frase.toUpperCase().contains("ORDENADOR")) {
				OrdenadorEvent1 evento= new OrdenadorEvent1(frase);
//				for (OrdenadorListener1 listener : ordenadorListeners) {
//					listener.palabraOrdenadorDetectada(evento);					
//				}
				fireOrdenadorEvent(evento);
			}
			
		}while(!frase.trim().equals(""));
				
	}
	
	public static void addOrdenadorListener (OrdenadorListener2 listener) {
		ordenadorListeners.add(listener);
	}
	
	public static void removeOrdenadorListener(OrdenadorListener2 listener) {
		ordenadorListeners.remove(listener);
	}
	
	public static void fireOrdenadorEvent(OrdenadorEvent1 evento) {
		for (OrdenadorListener2 listener : ordenadorListeners) {
			listener.palabraOrdenadorDetectada(evento);					
		}
	}

}
