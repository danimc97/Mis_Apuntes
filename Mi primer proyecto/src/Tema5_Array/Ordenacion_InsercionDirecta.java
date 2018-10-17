package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_InsercionDirecta {

	public static void main(String[] args) {
		
		int array[]= new int[150];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*1000);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for (i=0;i<array.length-1;i++) {
			
			
			
		}
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}