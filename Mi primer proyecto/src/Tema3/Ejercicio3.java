package Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int tope=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces: "));
		int p=0;
		int n=0;
		int num;
		for (int i=1;i<=tope;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			if (num>0) {
				p++;
			}
			else {
				n++;
			}
		}
		System.out.println("Numeros positivos: "+p);
		System.out.println("Numeros negativos: "+n);
	}
}