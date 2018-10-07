package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio1 {

	public static void main(String[] args) {
		
		int suma=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
		
		for (int i=0;num!=0;i++) {
			
			suma += num;
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
			
		}
		
		System.out.println("La suma es: "+suma);

	}

}
