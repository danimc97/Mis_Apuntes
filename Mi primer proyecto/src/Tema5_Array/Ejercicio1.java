package Tema5_Array;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int maximo;
		int minimo;
		int array[]= new int[100];
		int num=0;
		
		maximo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el maximo"));
		minimo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el minimo"));
		
		for (int i=0;i<100;i++) {
			num*=0;
			while (num<=minimo) {
			num=(int) Math.round(Math.random()*maximo);
			}
			array[i]=num;
			System.out.println("array["+i+"]= "+array[i]);
			
		}
	}

}
