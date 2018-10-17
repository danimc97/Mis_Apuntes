package Tema5_Array;

import javax.swing.JOptionPane;

public class Ordenacion_Shell {

	public static void main(String[] args) {
		
		int array[]= new int[10];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		
		for (i=0;i<=4;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for (i=5;i<10;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		
		System.out.println();
		
		for (i=0;i<=4;i++) {
			
			for (j=1+i;j<=4;j++) {
				
				if (array[i]>array[j]) {	
					
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;	
				}
			}
			
		}
		System.out.println();
		for (i=0;i<=4;i++) {
			System.out.print(array[i]+" ");
		}
	}
}