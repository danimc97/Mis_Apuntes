package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio3DoWhile {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero: "));
		int mayor=0;
		
		do {
			if (num>mayor) {
				mayor=num+0;
			}
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero: "));	
		} while (num!=0);
		System.out.println("El mayor es "+mayor);
	}
}