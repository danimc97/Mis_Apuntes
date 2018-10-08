package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio5 {

	public static void main(String[] args) {
		int num=1;
		int menor=0;
		int mayor=0;
		for (int i=0;num!=0;i++) {
			
			if (i==0) {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				menor=num;
				mayor=num;
			}
			else {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				if (num<menor&&num!=0) {		
					menor=num;
				}
				if (num>mayor&&num!=0) {		
					mayor=num;
				}
			}
		}
		System.out.println("El menor es "+menor);
		System.out.println("El mayor es "+mayor);
	}
}
