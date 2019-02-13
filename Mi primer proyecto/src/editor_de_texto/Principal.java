package editor_de_texto;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		List<String> LineaDeTexto= new ArrayList<String>();
		List<String> LineasCortadas=new ArrayList<String>();
		int posicionTexto;
		int introduceUsuarioInicial;
		int introduceUsuarioFinal;
		int contadorVeces=0;
		String textoCopiado;
		
		int elegirOpcion;
		
		do {
		
			elegirOpcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opción del menú \n"
					+ "1. Añadir una línea de texto \n"
					+ "2. Insertar una línea en cualquier posición del texto \n"
					+ "3. Editar una línea (reescribir su contenido) \n"
					+ "4. Borrar una línea \n"
					+ "5. Cortar un conjunto de líneas, (marcadas por su posición incial y final \n"
					+ "6. Pegar un conjunto de líneas cortadas en una determinada posición \n"
					+ "7. Imprimir el texto. Cada línea aparecerá numerada.\n"
					+ "8. Salir"));
	
			switch (elegirOpcion) {
			case 1:
				LineaDeTexto.add(JOptionPane.showInputDialog("Introduce texto:"));
				System.out.println(LineaDeTexto+" ");
				break;
			case 2:
				posicionTexto=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la linea donde quieres introducir el texto"));
				LineaDeTexto.add(posicionTexto, JOptionPane.showInputDialog("Introduce texto"));
				System.out.println(LineaDeTexto+" ");
				break;
			case 3:
				posicionTexto=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la linea donde quieres editar el texto"));
				LineaDeTexto.set(posicionTexto, JOptionPane.showInputDialog("Introduce texto"));
				System.out.println(LineaDeTexto+" ");
				break;
			case 4:
				posicionTexto=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la linea donde quieres borrar el texto"));
				LineaDeTexto.remove(posicionTexto);
				System.out.println(LineaDeTexto+" ");
				break;
			case 5:
				introduceUsuarioInicial=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la primera línea del rango para copiar?"));
				introduceUsuarioFinal=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la ultima línea del rango para copiar?"));
				LineasCortadas=LineaDeTexto.subList(introduceUsuarioInicial, introduceUsuarioFinal);
				
				System.out.println();
				System.out.print("Portapeles: "+LineasCortadas);
				
				for(int i=introduceUsuarioInicial;i<introduceUsuarioFinal;i++) {
					LineaDeTexto.remove(i);
				}
				System.out.println();
				System.out.println(LineaDeTexto+" ");
				
				break;
			case 6:
				posicionTexto=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la linea donde quieres pegar el texto"));
				LineaDeTexto.addAll(posicionTexto, LineasCortadas);
				System.out.println(LineaDeTexto+" ");
				break;
			}
			
		}while(elegirOpcion!=8);
	}

}
