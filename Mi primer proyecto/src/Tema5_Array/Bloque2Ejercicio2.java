package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio2 {

	public static void main(String[] args) {
		int array[]= new int[150];
		int array1[]=new int[150];
		int array2[]=new int[150];
		int i=0;
		int num=0;
		int par=0;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		for (i=0;i<array1.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array1[i]=num;
			System.out.print(array1[i]+" ");
		}
		System.out.println("\n");
		for (i=0;i<array2.length;i++) {
			par=i%2;
			if(par==0) {
				array2[i]=array1[i];
			}
			else {
				array2[i]=array[i];
			}
			System.out.print(array2[i]+" ");
		}
		
	}
}
