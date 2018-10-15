package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio3 {

	public static void main(String[] args) {
		int array[]= new int[150];
		int num=0;
		int pares=0;
		int impares=0;
		int resto=0;
		
		for (int i=0;i<150;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			
			resto=array[i]%2;
			
			if (resto==0) {
				
				pares+=array[i];
				
			}
			else {
				
				impares+=array[i];
				
			}
			
		}
		
		System.out.println("La suma de los pares es: "+pares);
		System.out.println("La suma de los pares es: "+impares);
		
	}

}