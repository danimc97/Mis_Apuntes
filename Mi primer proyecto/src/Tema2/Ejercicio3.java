package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String x= JOptionPane.showInputDialog("Introduce el primer numero: ");
		float num1=Float.parseFloat(x);
		
		String y= JOptionPane.showInputDialog("Introduce el segundo numero: ");
		float num2=Float.parseFloat(y);
		
		String z= JOptionPane.showInputDialog("Introduce el tercer numero: ");
		float num3=Float.parseFloat(z);
		
		String a= JOptionPane.showInputDialog("Introduce el cuarto numero: ");
		float num4=Float.parseFloat(a);
		
		String b= JOptionPane.showInputDialog("Introduce el quinto numero: ");
		float num5=Float.parseFloat(b);
		
		
		if (num1>=num2 && num1>=num3 && num1>=num4 && num1>=num5) {
			
			System.out.println("El "+num1+" es el mayor");
			
		}
		else {
		
			if (num2>=num1 && num2>=num3 && num2>=num4 && num2>=num5) {
			
			System.out.println("El "+num2+" es el mayor");
			
			}
			else {
		
				if (num3>=num1 && num1>=num2 && num3>=num4 && num3>=num5) {
			
				System.out.println("El "+num3+" es el mayor");
			
				}
				else {
		
					if (num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5) {
			
					System.out.println("El "+num4+" es el mayor");
			
					}
					else {
		
						if (num5>=num1 && num5>=num2 && num5>=num3 && num5>=num4) {
			
						System.out.println("El "+num5+" es el mayor");
			
						}
		

	}

}}}}}
