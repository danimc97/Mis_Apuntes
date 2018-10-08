package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio3While {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero: "));
		int mayor=0;
		
		while (num!=0) {
			
			if (num>mayor) {
				mayor=num+0;
			}
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero: "));
			
		}
		System.out.println("El mayor es "+mayor);
		
	}

}
