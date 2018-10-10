package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio4DoWhile {

	public static void main(String[] args) {
		
		int menor=0;
		int num=1;
		int i=0;
		do {
			if (i==0) {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				menor=num;
			}
			else {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				if (num<menor&&num!=0) {		
					menor=num;
				}
			}
			i++;
		} while (num!=0);
		System.out.println("El menor es "+menor);
		
	}
}