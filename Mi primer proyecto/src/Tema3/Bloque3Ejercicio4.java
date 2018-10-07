package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio4 {

	public static void main(String[] args) {
		
		int menor=1;
		int num=0;
		
		for (int i=0;menor!=0;i++) {
			
			if (i==0) {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				menor=num;
			}
			else {
				menor=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
				if (num<menor&&num!=0) {		
					menor=num;
				}
			}
		}
		System.out.println("El menor es "+menor);
		
	}
}