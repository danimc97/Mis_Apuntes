package ahorcado;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Principal {

	static char barra='_';
	static String hint="hint";
	static String god="god";
	static String navidad="navidad";
	static Jugador jugador=new Jugador();
	static String introduceUsuario;
	static String palabras[]= new String[] {"Loki", "Thor", "Hulk", "Ironman", "Spiderman"};
	static String arrayNavidad[]=new String[] {"Trineo", "Regalos", "Santaclaus", "Villancicos", "Renos"};
	static String palabra= palabras[(int) Math.round(Math.random()*(palabras.length-1))];
	static String arrayDeFallos[]=new String[6];
	static int contadorDeFallos=0;
	static int contArrayDeFallos=0;
	static boolean existeLetra=false;
	static int verificacionPalabraEntera=0;
	static boolean palabraEntera=false;
	static boolean hintb=false;
	static boolean godMode=false;
	static boolean repararAcierto=false;
	static boolean ponerNavidad=false;
	static char coincidencia[]= new char [palabra.length()];
	
	public static void main(String[] args) {
		
		//System.out.println("La palabra es: "+palabra);
		for (int i=0;i<coincidencia.length;i++) {
			coincidencia[i]='_';					//Mostramos los guiones bajos en el array de coincidencias.
		}
		
		for (int i=0;i<arrayDeFallos.length;i++) {
			arrayDeFallos[i]="";					//Iniciamos el array de los fallos para almacenarlos en un futuro
		}
		
		Ventana ventana=new Ventana();				//Llamamos a la ventana para iniciar el entorno gráfico
		
		System.out.println();
		
		comprobarAciertoFallo();					//Llamamos al método donde comprobamos la palabra
		
		
		if (palabraEntera==true) {
			System.out.println("¡Enhorabuena! Has acertado la palabra");	//Comprobamos si la palabra está entera
			ventana.getVentana().repaint();
		}
		else {
			if(verificacionPalabraEntera==0) {
				repararAcierto=true;
				System.out.println("¡Enhorabuena! Has acertado la palabra");	//Comprobamos si ya no hay más guiones bajos
				ventana.getVentana().repaint();
			}
			else {
				for (int i=0;i<palabra.length();i++) {
					coincidencia[i]=palabra.charAt(i);							//Mostramos la palabra entera cuando el jugador pierda
					System.out.print(coincidencia[i]+" ");
				}
				System.out.println("Lo siento, has perdido. ¡Suerte la próxima vez!");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void comprobarAciertoFallo() {
		
		do {
			verificacionPalabraEntera=0;
			existeLetra=false;
			palabraEntera=false;
			introduceUsuario=JOptionPane.showInputDialog("Introduce una letra o la palabra: ");
			
			if(introduceUsuario.equals(navidad) && ponerNavidad==false) {
				
				for (int i=0;i<palabras.length;i++) {							//Iniciamos el modo navidad
					palabras[i]=arrayNavidad[i];
				}
				
				palabra= palabras[(int) Math.round(Math.random()*(palabras.length-1))];
				
				for (int i=0;i<coincidencia.length;i++) {
					coincidencia[i]='_';
				}
				
				for (int i=0;i<arrayDeFallos.length;i++) {
					arrayDeFallos[i]="";
				}
				
				ponerNavidad=true;
				contadorDeFallos=0;
				Ventana.getVentana().repaint();
			}
			
			if (introduceUsuario.equals(god)) {
				jugador.setFallos(-1);
				godMode=true;														//Iniciamos el modo dios
				JOptionPane.showMessageDialog(null, "Has activado el modo Dios");
			}

			if (introduceUsuario.length()==1) {				//Comprobamos si lo que introduce el usuario es una letra solamente
				unaLetra();									//Llamamos al metodo
				if(existeLetra==false) {
					JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
					Ventana.getVentana().repaint();
				}
			}
			else {
				if (introduceUsuario.equalsIgnoreCase(palabra)){	//Comprobamos si lo que ha introducido el usuario es igual a la palabra
					unaPalabra();									//Llamamos al método
				}
				else {
					cheatHint();									//Llamamos al método por si la palabra introducida es igual a hint
				}
			}
			for (int i=0;i<palabra.length();i++) {
				if (barra==coincidencia[i] && !introduceUsuario.equals(navidad)) {	//Aquí comprobamos los guiones en blanco que quedan en el array de coincidencias
					verificacionPalabraEntera++;
				}
			}
			
			if (existeLetra==false && palabraEntera==false && !introduceUsuario.equals(hint) && !introduceUsuario.equals(god) && !introduceUsuario.equals(navidad)) {
				arrayDeFallos[contArrayDeFallos]=introduceUsuario;
				if (godMode==false) {								//Aquí metemos los fallos en el array y añadimos un fallo al contador
					contadorDeFallos++;
					contArrayDeFallos++;
				}
			}
			System.out.println("Tus fallos: ");
			for (int i=0;i<contArrayDeFallos;i++) {
				System.out.print(arrayDeFallos[i]+" ");				//Imprimimos los fallos que tiene el usuario por pantalla.
				Ventana.getVentana().repaint();
			}
			System.out.println();
			
		}while(!((contadorDeFallos==jugador.getFallos()) || (verificacionPalabraEntera==0 || palabra.equalsIgnoreCase(introduceUsuario))));
		
	}
	
	public static void unaLetra() {						//Si el usuario introduce una letra
		for (int i=0;i<palabra.length();i++) {
			char charUsuario= introduceUsuario.charAt(0);
			if(charUsuario==palabra.charAt(i)) {
				coincidencia[i]=charUsuario;
				Ventana.getVentana().repaint();
				existeLetra=true;
				for (int j=0;j<coincidencia.length;j++) {
					System.out.print(coincidencia[j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void unaPalabra() {		//Si el usuario introduce una palabra
		palabraEntera=true;
		System.out.println();
		for (int i=0;i<palabra.length();i++) {
			coincidencia[i]=palabra.charAt(i);
			Ventana.getVentana().repaint();
		}
	}
	
	public static void cheatHint() {										//Si el usuario introduce "hint"
		if (introduceUsuario.equals(hint) && hintb==false) {
			JOptionPane.showMessageDialog(null, "Has activado una pista");
			int num=(int) Math.round(Math.random()*palabra.length());		//Generamos un numero aleatorio
			char charUsuario=palabra.charAt(num);
			coincidencia[num]=charUsuario;
			for (int j=0;j<coincidencia.length;j++) {
	
				if(coincidencia[num]==palabra.charAt(j)) {
					coincidencia[j]=coincidencia[num];
					Ventana.getVentana().repaint();
				}
				System.out.print(coincidencia[j]+" ");
			}
			System.out.println();
			hintb=true;
		}
		else {
			if (!introduceUsuario.equals(god) && !introduceUsuario.equals(navidad)) {
				JOptionPane.showMessageDialog(null, "No es correcto, inténtalo de nuevo");
				Ventana.getVentana().repaint();
			}
		}
	}
}
