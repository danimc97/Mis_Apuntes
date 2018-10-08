package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio7 {

	public static void main(String[] args) {
		
		int num=1;
		int p=0;
		int n=0;
		
		for (int i=0;num!=0;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			if (num<0) {
				n++;
			}
			if (num>0) {
				p++;
			}
		}
		System.out.println("Numeros negativos: "+n);
		System.out.println("Numeros positivos: "+p);
	}
}
