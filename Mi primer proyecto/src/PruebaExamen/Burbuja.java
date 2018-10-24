package PruebaExamen;

import javax.swing.JOptionPane;

public class Burbuja {

	public static void main(String[] args) {
		int array[]= new int[5];
		int num=0;
		int i=0;
		int aux=0;
		int j;
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for (i=0;i<array.length;i++) {
			
			for (j=0;j<array.length-1;j++) {
				
				if(array[j]>array[j+1]) {
				
				aux=array[j+1];
				array[j+1]=array[j];
				array[j]=aux;
				
				}
				
			}
			
		}
		
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}