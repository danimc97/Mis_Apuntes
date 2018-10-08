package Tema3;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio4 {

	public static void main(String[] args) {
		int num3=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un limite: "));
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		int division=0;
		int num2=num;
		
		if (num>num3) {
		System.out.println("Error");	
		}
		else {
			for (int i=0;num2>=1;i++) {
				
				division=num%num2;
				
				if (division==0) {
					
					System.out.println(num2);
					
				}
				num2=num2-1;
				
			}

		}
	}

}