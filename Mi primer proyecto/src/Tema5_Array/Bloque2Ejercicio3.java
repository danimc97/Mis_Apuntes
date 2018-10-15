package Tema5_Array;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio3 {

	public static void main(String[] args) {
		int array[]= new int[150];
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a multiplicar: "));
		int num2=0;
		int mul=0;
		
		for (int i=0;i<array.length;i++) {
			num2=(int) Math.round(Math.random()*100);
			array[i]=num2;
			mul=array[i]*num;
			System.out.println(array[i]+"x"+num+"="+mul);
		}
		
	}

}