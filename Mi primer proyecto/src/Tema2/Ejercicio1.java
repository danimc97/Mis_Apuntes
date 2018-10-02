package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		String x= JOptionPane.showInputDialog("Introduce un numero: ");
		float X=Float.parseFloat(x);
		
		String y= JOptionPane.showInputDialog("Introduce otro numero: ");
		float Y=Float.parseFloat(y);
		
		
		if (X==Y) {
			
			System.out.println("Los valores son iguales");
			
		}
		else {
		
		
		if (X>Y) {
			
			System.out.println("El numero "+X+" es mayor");
			
		}
		else {
			
			System.out.println("El numero "+Y+" es mayor");
			
		}
		
		}
			
		}
		

	}


