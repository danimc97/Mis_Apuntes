package Tema3;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio1 {

	public static void main(String[] args) {
		
		int tope=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces: "));
		int num;
		int suma=0;
		int media;
		for (int i=1; i<=tope;i++) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			suma+=num;

		}
		
		media=suma/tope;
		
		System.out.println("La media es "+media);

	}

}
