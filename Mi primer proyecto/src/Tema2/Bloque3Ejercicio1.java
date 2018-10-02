package Tema2;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio1 {

	public static void main(String[] args) {
		int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota: "));
		
		String mensaje= "";
		
		switch (nota) {
		
		case 0:
		case 1:
			mensaje="Muy deficiente";
			break;
		case 2:
		case 3:
		case 4:
			mensaje="Insuficiente";
			break;
		case 5:
			mensaje="Suficiente";
			break;
		case 6:
			mensaje="Bien";
			break;
		case 7:
		case 8:
			mensaje="Notable";
			break;
		case 9:
		case 10:
			mensaje="Sobresaliente";
			break;
		
		
		}
		
		
		JOptionPane.showMessageDialog(null, "Nota: "+mensaje);

	}

}
