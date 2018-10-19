package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Seleccion {

	public static void main(String[] args) {
		
		int array[]= new int[10];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		boolean cambios;
		int menor;
		int pos=0;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		menor=array[0];
		
		for (i=1;i<array.length;i++) {
			
			j=i-1;
			
				while (j<array.length) {
					
					if (array[j]<menor) {
						
						menor=array[j];
						pos=j;
					}
					j++;
				}
			aux=array[i-1];
			array[i-1]=menor;
			array[pos]=aux;
			menor=array[i];
			
		}
		
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}