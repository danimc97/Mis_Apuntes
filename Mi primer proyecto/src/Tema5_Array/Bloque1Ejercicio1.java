package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio1 {

	public static void main(String[] args) {
		int maximo;
		int minimo;
		int array[]= new int[150];
		int num=0;
		int i=0;
		
		maximo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el maximo"));
		minimo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el minimo"));
		
		for (i=0;i<150;i++) {
			num*=0;
			while (num<=minimo) {
			num=(int) Math.round(Math.random()*maximo);
			}
			array[i]=num;
			System.out.println("array["+i+"]= "+array[i]);
		}
		
		System.out.println("-----------------------------------");
		
		for (i=149;i>=0;i--) {
			
			System.out.println("array["+i+"]= "+array[i]);
			
		}
		
	}

}