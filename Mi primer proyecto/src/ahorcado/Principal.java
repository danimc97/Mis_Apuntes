package ahorcado;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int j=0;
		Jugador jugador=new Jugador();
		String introduceUsuario;
		String palabras[]= new String[] {"Thor", "Hulk", "Lokii"};
		String palabra= palabras[(int) Math.round(Math.random()*(palabras.length-1))];
		int contadorDeFallos=0;
		
		System.out.println("La palabra es: "+palabra);
		System.out.println();
		
		char coincidencia[]= new char [palabra.length()];
		
		for (int i=0;i<coincidencia.length;i++) {
			coincidencia[i]='_';
			System.out.print(coincidencia[i]+" ");
		}
		
		
		introduceUsuario=JOptionPane.showInputDialog("Introduce una letra o la palabra: ");
		
		if (introduceUsuario.length()==1) {
			
			
		}
		else {
				
			if (introduceUsuario.equals(palabra)){
				System.out.println("¡Enhorabuena! Has acertado la palabra");
			}
			else {
				JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
			}
				
				
		}
	}
}
