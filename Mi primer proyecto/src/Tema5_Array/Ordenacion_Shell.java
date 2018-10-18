package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Shell {

	public static void main(String[] args) {
		
		int array[]= new int[10];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		int div=0;
		boolean cambios;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		div=array.length/2;
		
		for(i=0;i<array.length;i++) {
		
			
			
			
		}
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}