package digitosEventos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ejemploEventos.OrdenadorEvent1;
import ejemploEventos.OrdenadorListener2;

public class Principal {

	static List<DigitoListener> digitoListeners = new ArrayList<DigitoListener>();
	
	static int cantidadDigitos=0;
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Daniel");
		
		pidePalabras();

	}
	
	public static void pidePalabras() {
		
		String frase;
		
		do {
			
			cantidadDigitos=0;
			
			frase = JOptionPane.showInputDialog("Dame frase");
			
			int tamanoPalabra=frase.length();
			
			char arrayPalabra[]= new char [tamanoPalabra];
			
			for (int i=0;i<tamanoPalabra;i++) {
				arrayPalabra[i]=frase.charAt(i);
			}
			
			for (int i=0;i<arrayPalabra.length;i++) {
				if (Character.isDigit(arrayPalabra[i])) {
					cantidadDigitos++;
				}
			}
			
			if (cantidadDigitos==3) {
				DigitoEvent evento = new DigitoEvent(frase);
//				for (DigitoListener listener : digitoListeners) {
//					listener.digitosDetectados3(evento);					
//				}
				fireDigitoEvent(evento);
			}
			
		}while(!frase.trim().equals(""));
		
	}
	
	public static void addDigitoListener (DigitoListener listener) {
		digitoListeners.add(listener);
	}
	
	public static void removeDigitoListener(DigitoListener listener) {
		digitoListeners.remove(listener);
	}
	
	public static void fireDigitoEvent (DigitoEvent evento) {
//		for (int i = 0; i < digitoListeners.size(); i++) {
//			DigitoListener listener = digitoListeners.get(i);
//			listener.digitosDetectados3(evento);
//		}
		
		
		for (DigitoListener listener : digitoListeners) {
			listener.digitosDetectados3(evento);					
		}
	}

}
