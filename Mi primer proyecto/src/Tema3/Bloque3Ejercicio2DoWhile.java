package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio2DoWhile {

	public static void main(String[] args) {
		
		int suma=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
		int media=0;
		int i=0;
		do {
			i++;
			suma += num;
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
			media=suma/i;
		} while (num!=0);
		System.out.println("La media es "+media);
	}

}
