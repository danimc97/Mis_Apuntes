package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Burbuja {

	public static void main(String[] args) {
		
		int array[]= new int[5];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for (i=array.length-1;i>0;i--) {
			
			for (j=0;j<i;j++) {
				
				if (array[j]>array[j+1]) {	
					
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;	
				}
			}
		}
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}