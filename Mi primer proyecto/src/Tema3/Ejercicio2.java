package Tema3;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tope=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces: "));
		int num=0;
		int num2;
		for (int i=1;i<=tope;i++) {
			num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			if (num2>10) {	
				num=num+num2;	
			}	
		}
		System.out.println("El resultado de la suma es: "+num);
	}
}