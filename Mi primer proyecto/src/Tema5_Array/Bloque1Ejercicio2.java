package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque1Ejercicio2 {

	public static void main(String[] args) {
		int array[]= new int[150];
		int num=0;
		int i=0;
		int nf=0;
		
		for (i=0;i<150;i++) {
			num*=0;
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.println("array["+i+"]= "+array[i]);
		}
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor a buscar: "));
		
		for (i=0;i<150;i++) {
			
			if(num==array[i]) {
				
				System.out.println("El numero "+num+" se encuentra en la posicion "+i);
				
			}
			else {
				
				nf++;
				
			}
			
			if (nf==150) {
				
				System.out.println("El valor no se encuentra en la lista de numeros");
				
			}
			
			
			
		}
		
	}

}