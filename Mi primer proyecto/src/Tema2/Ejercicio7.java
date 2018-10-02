package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String x= JOptionPane.showInputDialog("Introduce un numero: ");
		int num1=Integer.parseInt(x);
		
		
		int and7=num1&1;
		
		if (and7==1) {
			
			System.out.println("El numero es impar");
			
		}
		else {
			
			System.out.println("El numero es par");
			
		}

	}

}
