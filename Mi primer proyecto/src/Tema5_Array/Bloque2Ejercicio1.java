package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio1 {

	public static void main(String[] args) {
		int array[]= new int[150];
		int num=0;
		int resto=0;
		int i=0;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*200)-100;
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n");
		
		for (i=0;i<array.length;i++) {
			resto=array[i]%2;
			if(resto==0) {
				array[i]*=-1;
			}
			else {
				array[i]*=-1;
			}
			System.out.print(array[i]+" ");
		}
	}
}