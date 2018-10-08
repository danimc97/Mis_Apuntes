package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio2While {

	public static void main(String[] args) {
		
		int suma=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
		int media=0;
		int i=0;
		
		while (num!=0) {
			i++;
			suma += num;
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
			media=suma/i;
		}
		
		System.out.println("La suma es: "+suma);
		System.out.println("La media es "+media);
	}

}