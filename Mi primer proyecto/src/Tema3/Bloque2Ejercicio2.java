package Tema3;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio2 {
	
public static void main(String[] args) {
		int numero = 1;
		int mayor = 0;
		
		String mensaje = "Introduzca n�mero (0 -> Terminar)";
		
		for (int i = 0; numero != 0; i++) {
			if (i == 0) { 
				mayor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				numero = mayor;
			}
			else { 
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero > mayor && numero != 0) {
					mayor = numero;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);
	}
}
