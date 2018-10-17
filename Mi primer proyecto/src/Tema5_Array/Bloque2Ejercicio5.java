package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio5 {

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
		int ultimo=array[4];
		
		for (i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		array[i]=ultimo;
		
		for (i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
		
	}

}