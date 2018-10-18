package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Quickshort {

	public static void main(String[] args) {
		
		int array[]= new int[6];
		int num=0;
		int i=0;
		int j=5;
		int aux;
		int pivote;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		i=0;
		
		pivote=array[0];
		
		while (i<j) {
			
			while (array[i]<=pivote && i<j) {
				i++;
			}
				while (array[j]>pivote) {
					j--;
				}
					if(i<j) {
						aux=array[i];
						array[i]=array[j];
						array[j]=aux;
					}
		}
		array[i]=array[j];
		array[j]=pivote;
		
		
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}