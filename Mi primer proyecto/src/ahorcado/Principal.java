package ahorcado;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		char barra='_';
		Jugador jugador=new Jugador();
		String introduceUsuario;
		String palabras[]= new String[] {"Thor", "Hulk", "Lokii"};
		String palabra= palabras[(int) Math.round(Math.random()*(palabras.length-1))];
		int contadorDeFallos=0;
		boolean existeLetra=false;
		int verificacionPalabraEntera=0;
		boolean palabraEntera=false;
		
		System.out.println("La palabra es: "+palabra);
		
		char coincidencia[]= new char [palabra.length()];
		
		for (int i=0;i<coincidencia.length;i++) {
			coincidencia[i]='_';
		}
		for (int i=0;i<coincidencia.length;i++) {
			System.out.print(coincidencia[i]+" ");
		}
		System.out.println();
		
		
		do {
			verificacionPalabraEntera=0;
			
			
			introduceUsuario=JOptionPane.showInputDialog("Introduce una letra o la palabra: ");
			
			if (introduceUsuario.length()==1) {
				
				char charUsuario= introduceUsuario.charAt(0);
				for (int i=0;i<palabra.length();i++) {
					if(charUsuario==palabra.charAt(i)) {
						coincidencia[i]=charUsuario;
						existeLetra=true;
					}
				}
				if(existeLetra==false) {	
					JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
					contadorDeFallos++;
				}
			}
			else {
				if (introduceUsuario.equals(palabra)){
					System.out.println("¡Enhorabuena! Has acertado la palabra");
					palabraEntera=true;
				}
				else {
					JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
					contadorDeFallos++;
				}
			}
			for (int i=0;i<palabra.length();i++) {
				if (barra==coincidencia[i]) {
					verificacionPalabraEntera++;
				}
			}
			for (int i=0;i<coincidencia.length;i++) {
				System.out.print(coincidencia[i]+" ");
			}
			System.out.println();
		}while(!((contadorDeFallos==6) || (verificacionPalabraEntera==0 || palabraEntera==true)));
		
		
	}
}
