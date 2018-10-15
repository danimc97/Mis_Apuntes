package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio4 {

	public static void main(String[] args) {
		int array[]= new int[150];
		int num=0;
		int pares=0;
		int resto=0;
		
		for (int i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			resto=i%2;
			if(resto==0) {
				pares+=array[i];
			}
		}
		
		System.out.println("La suma de los indices pares es: "+pares);
		
	}

}
