package Tema2;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio1 {

	public static void main(String[] args) {
		
		String x= JOptionPane.showInputDialog("Introduce un numero: ");
		int num1=Integer.parseInt(x);
		String y= JOptionPane.showInputDialog("Introduce un numero: ");
		int num2=Integer.parseInt(y);
		String z= JOptionPane.showInputDialog("Introduce un numero: ");
		int num3=Integer.parseInt(z);
		String a= JOptionPane.showInputDialog("Introduce un numero: ");
		int num4=Integer.parseInt(a);
		String b= JOptionPane.showInputDialog("Introduce un numero: ");
		int num5=Integer.parseInt(b);
		
		int suma1=0;
		int suma2=0;
		int suma3=0;
		int suma4=0;
		
		
		if (num1<0) {//negativo
			suma1=suma1+num1;
		}
		else  {
			
			if (num1>=0 && num1<=25) {//menor
				suma2=suma2+num1;
			}
			else {
				
				if (num1>=26 && num1<=250) {//medio
					suma3=suma3+num1;
				}
				else {
					
					if (num1>250) {//grande
						suma4=suma4+num1;
					}
					
				}
				
			}
			
		}
		
		
		if (num2<0) {//negativo
			suma1=suma1+num2;
		}
		else  {
			
			if (num2>=0 && num2<=25) {//menor
				suma2=suma2+num2;
			}
			else {
				
				if (num2>=26 && num2<=250) {//medio
					suma3=suma3+num2;
				}
				else {
					
					if (num2>250) {//grande
						suma4=suma4+num2;
					}
					
				}
				
			}
			
		}
		
		if (num3<0) {//negativo
			suma1=suma1+num3;
		}
		else  {
			
			if (num3>=0 && num3<=25) {//menor
				suma2=suma2+num3;
			}
			else {
				
				if (num3>=26 && num3<=250) {//medio
					suma3=suma3+num3;
				}
				else {
					
					if (num3>250) {//grande
						suma4=suma4+num3;
					}
					
				}
				
			}
			
		}
		
		if (num4<0) {//negativo
			suma1=suma1+num4;
		}
		else  {
			
			if (num4>=0 && num4<=25) {//menor
				suma2=suma2+num4;
			}
			else {
				
				if (num4>=26 && num4<=250) {//medio
					suma3=suma3+num4;
				}
				else {
					
					if (num4>250) {//grande
						suma4=suma4+num4;
					}
					
				}
				
			}
			
		}
		
		if (num5<0) {//negativo
			suma1=suma1+num5;
		}
		else  {
			
			if (num5>=0 && num5<=25) {//menor
				suma2=suma2+num5;
			}
			else {
				
				if (num5>=26 && num5<=250) {//medio
					suma3=suma3+num5;
				}
				else {
					
					if (num5>250) {//grande
						suma4=suma4+num5;
					}
					
				}
				
			}
			
		}
		
		System.out.println("El resultado de la categoría de los numeros negativos es "+suma1);
		System.out.println("El resultado de la categoría de los numeros bajos es "+suma2);
		System.out.println("El resultado de la categoría de los numeros medios es "+suma3);
		System.out.println("El resultado de la categoría de los numeros grandes es "+suma4);
		
		

	}

}
