package PruebaExamen;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio4 {

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
		
		int primero=array[0];
		
		for (i=0;i<4;i++) {
			
			array[i]=array[i+1];
			
			
		}
		
		array[i]=primero;
		
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}