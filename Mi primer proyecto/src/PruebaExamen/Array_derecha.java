package PruebaExamen;

import javax.swing.JOptionPane;

public class Array_derecha {

	public static void main(String[] args) {
		int array[]= new int[5];
		int num=0;
		int i=0;
		int aux=0;
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		int ultimo=array[array.length-1];
		
		for (i=array.length-1;i>0;i--) {
			
			array[i]=array[i-1];
			
		}
		
		array[i]=ultimo;
		
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}