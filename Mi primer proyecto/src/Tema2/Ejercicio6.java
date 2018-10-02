package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String x= JOptionPane.showInputDialog("Introduce un numero: ");
		int num1=Integer.parseInt(x);
		
		int resto;
		
		resto= num1%2;
		
		if (resto==0) {
			
			System.out.println("El numero introducido es par");
			
		}
		else {
			System.out.println("El numero introducido es impar");
		}

	}

}
