package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Shell {

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
		
		System.out.println();
		
		for (i=1;i<array.length;i++) {
			
			aux=array[i];
			
			for (j=i-1;j>=0&&array[j]>aux;j--) {
				
				array[j+1]=array[j];
				array[j]=aux;
				
			}
			
		}
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}