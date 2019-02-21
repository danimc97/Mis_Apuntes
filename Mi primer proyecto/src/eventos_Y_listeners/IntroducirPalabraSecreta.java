package eventos_Y_listeners;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;




public class IntroducirPalabraSecreta {
	
	//4. Creamos la lista
	static List<IntroducirPalabraSecretaListener> IntroducirPalabraListener = 
			new ArrayList<IntroducirPalabraSecretaListener>();
	
	
	//5. Creamos el add
	public static void addIntroducirPalabraListener (IntroducirPalabraSecretaListener listener) {
		IntroducirPalabraListener.add(listener);
	}
	
	//6. Creamos el remove
	public static void removeIntroducirPalabraListener (IntroducirPalabraSecretaListener listener) {
		IntroducirPalabraListener.remove(listener);
	}
	
	//7. Creamos el primer bucle
	public static void fireIntroducirPalabraListener (IntroducirPalabraSecretaEvent e) {
		for (IntroducirPalabraSecretaListener listener : IntroducirPalabraListener) {
			listener.palabraSecretaIntroducida(e);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		//1. Creamos el  programa
		while (true) {
			String usuarioIntroducePalabra= JOptionPane.showInputDialog("Introduce una palabra");
			System.out.println("La palabra introducida es "+usuarioIntroducePalabra);
		}
	}

}
