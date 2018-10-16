package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Burbuja {

	public static void main(String[] args) {
		
		int array[]= new int[6];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n");
		
		for (i=0;i<array.length;i++) {
			
			for (j=0;j<array.length-i-1;j++) {
				
				if (array[j]>array[j+1]) {
					
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					
				}
				
				
			}
			
		System.out.print(array[i]+" ");
			
		}
	}

}