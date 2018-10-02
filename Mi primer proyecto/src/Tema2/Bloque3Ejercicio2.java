package Tema2;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio2 {

	public static void main(String[] args) {
		
		String menu ="---------------MENU----------------\n1.Raices\n2.Potencias\n3.Modulo de la division\n------------------------------------";
		int num=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (num) {
		
		case 1:
			int num1= Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			System.out.println("La raíz es: "+Math.sqrt(num1));
			break;
		

		}

	}
}
