package ahorcado;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Principal {

	static char barra='_';
	Jugador jugador=new Jugador();
	static String introduceUsuario;
	static String palabras[]= new String[] {"Thor", "Hulk", "Lokii"};
	static String palabra= palabras[(int) Math.round(Math.random()*(palabras.length-1))];
	static int contadorDeFallos=0;
	static boolean existeLetra=false;
	static int verificacionPalabraEntera=0;
	static boolean palabraEntera=false;
	static char coincidencia[]= new char [palabra.length()];
	
	public static void main(String[] args) {
		
		System.out.println("La palabra es: "+palabra);
		for (int i=0;i<coincidencia.length;i++) {
			coincidencia[i]='_';
			System.out.print(coincidencia[i]+" ");
		}

		System.out.println();
		
		comprobarAciertoFallo();
		
		
		if (verificacionPalabraEntera==0 || palabraEntera==true) {
			System.out.println("¡Enhorabuena! Has acertado la palabra");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void comprobarAciertoFallo() {
		
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
