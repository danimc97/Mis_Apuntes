package ahorcado;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Principal {

	static char barra='_';
	static String hint="hint";
	static String god="god";
	static Jugador jugador=new Jugador();
	static String introduceUsuario;
	static String palabras[]= new String[] {"Lokii", "Thor", "Hulk", "Ironman", "Spiderman"};
	static String palabra= palabras[(int) Math.round(Math.random()*(palabras.length-1))];
	static int contadorDeFallos=0;
	static boolean existeLetra=false;
	static int verificacionPalabraEntera=0;
	static boolean palabraEntera=false;
	static boolean hintb=false;
	static boolean godMode=false;
	static char coincidencia[]= new char [palabra.length()];
	
	public static void main(String[] args) {
		
		Ventana ventana=new Ventana();
		
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
		else {
			for (int i=0;i<palabra.length();i++) {
				coincidencia[i]=palabra.charAt(i);
				System.out.print(coincidencia[i]+" ");
			}
			System.out.println("Lo siento, has perdido. ¡Suerte la próxima vez!");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void comprobarAciertoFallo() {
		
		do {
			verificacionPalabraEntera=0;
			existeLetra=false;
			introduceUsuario=JOptionPane.showInputDialog("Introduce una letra o la palabra: ");
			
			if (introduceUsuario.equals(god)) {
				jugador.setFallos(-1);
				godMode=true;
				JOptionPane.showMessageDialog(null, "Has activado el modo Dios");
			}

			if (introduceUsuario.length()==1) {
				unaLetra();
				if(existeLetra==false) {	
					JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
					contadorDeFallos++;
				}
			}
			else {
				if (introduceUsuario.equalsIgnoreCase(palabra)){
					unaPalabra();
				}
				else {
					cheatHint();
				}
			}
			for (int i=0;i<palabra.length();i++) {
				if (barra==coincidencia[i]) {
					verificacionPalabraEntera++;
				}
			}
			
		}while(!((contadorDeFallos==jugador.getFallos()) || (verificacionPalabraEntera==0 || palabra.equalsIgnoreCase(introduceUsuario))));
		
	}
	
	public static void unaLetra() {
		for (int i=0;i<palabra.length();i++) {
			char charUsuario= introduceUsuario.charAt(0);
			if(charUsuario==palabra.charAt(i)) {
				coincidencia[i]=charUsuario;
				existeLetra=true;
				for (int j=0;j<coincidencia.length;j++) {
					System.out.print(coincidencia[j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void unaPalabra() {
		palabraEntera=true;
		System.out.println();
		for (int i=0;i<palabra.length();i++) {
			coincidencia[i]=palabra.charAt(i);
			System.out.print(coincidencia[i]+" ");
		}
	}
	
	public static void cheatHint() {
		if (introduceUsuario.equals(hint) && hintb==false) {
			JOptionPane.showMessageDialog(null, "Has activado una pista");
			int num=(int) Math.round(Math.random()*palabra.length());
			char charUsuario=palabra.charAt(num);
			coincidencia[num]=charUsuario;
			for (int j=0;j<coincidencia.length;j++) {
	
				if(coincidencia[num]==palabra.charAt(j)) {
					coincidencia[j]=coincidencia[num];
				}
				System.out.print(coincidencia[j]+" ");
			}
			hintb=true;
		}
		else {
			if (!introduceUsuario.equals(god)) {
				JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
				contadorDeFallos++;
			}
		}
	}
}
