package Tema2;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio2 {

	public static void main(String[] args) {
		
		String x=JOptionPane.showInputDialog("Introduce un numero");
		int num1=Integer.parseInt(x);
		
		if (num1<0) {
			System.out.println("Error, no puede introducir valores negativos");
		}
		
		else {
		
		
		String y=JOptionPane.showInputDialog("Introduce un numero");
		int num2=Integer.parseInt(y);
		
		if (num2<0) {
			System.out.println("Error, no puede introducir valores negativos");
		}
		
		else {
		
		String z=JOptionPane.showInputDialog("Introduce un numero");
		int num3=Integer.parseInt(z);
		
		if (num3<0) {
			System.out.println("Error, no puede introducir valores negativos");
		}
		
		else {
		
		String a=JOptionPane.showInputDialog("Introduce un numero");
		int num4=Integer.parseInt(a);
		
		if (num4<0) {
			System.out.println("Error, no puede introducir valores negativos");
		}
		
		else {
		
		String b=JOptionPane.showInputDialog("Introduce un numero");
		int num5=Integer.parseInt(b);
		
		if (num5<0) {
			System.out.println("Error, no puede introducir valores negativos");
		}
		
		else {
		
		
		int menor=0;
		int medio=0;
		int mayor=0;
		
		if(num1>0 && num1<=25) {
			menor++;	
		}
		else {
			
			if (num1>25 && num1<=256) {
				medio++;
			}
			else {
				
				if (num1>256) {
					mayor++;
				}
				
			}
			
		}
		
		if(num2>0 && num2<=25) {
			menor++;	
		}
		else {
			
			if (num2>25 && num2<=256) {
				medio++;
			}
			else {
				
				if (num2>256) {
					mayor++;
				}
				
			}
			
		}
		
		if(num3>0 && num3<=25) {
			menor++;	
		}
		else {
			
			if (num3>25 && num3<=256) {
				medio++;
			}
			else {
				
				if (num3>256) {
					mayor++;
				}
				
			}
			
		}
		
		if(num4>0 && num4<=25) {
			menor++;	
		}
		else {
			
			if (num4>25 && num4<=256) {
				medio++;
			}
			else {
				
				if (num4>256) {
					mayor++;
				}
				
			}
			
		}
		
		if(num5>0 && num5<=25) {
			menor++;	
		}
		else {
			
			if (num5>25 && num5<=256) {
				medio++;
			}
			else {
				
				if (num5>256) {
					mayor++;
				}
				
			}
			
		}
		
		System.out.println("Hay "+menor+" numeros menores");
		System.out.println("Hay "+medio+" numeros medios");
		System.out.println("Hay "+mayor+" numeros mayores");
		

	}
		}
		}
		}
		}

}
}
