package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio1DoWhile {

	public static void main(String[] args) {
		
		int suma=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
		
		do {
			
			suma += num;
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
			
		} while (num!=0);
		
		System.out.println("La suma es: "+suma);

	}

}