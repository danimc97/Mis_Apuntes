package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio4 {

	public static void main(String[] args) {
		int array[]= new int[5];
		int num=0;
		int i=0;
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		int primero=array[0];
		
		for (i=0;i<array.length-1;i++) {
			array[i]=array[i+1];
			System.out.print(array[i]+" ");
		}
		array[i]=primero;
		System.out.print(array[i]+" ");
		
	}

}