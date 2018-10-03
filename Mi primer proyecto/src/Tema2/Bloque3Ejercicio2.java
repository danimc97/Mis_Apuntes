package Tema2;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio2 {

	public static void main(String[] args) {
		
		String menu ="---------------MENU-----------------\n1.Raices\n2.Potencias\n3.Modulo de la division\n4.Suma\n5.Resta\n6.Multiplicacion\n7.Division\n---------------------------------------";
		int num=Integer.parseInt(JOptionPane.showInputDialog(menu));
		int num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: "));
		int num3= Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		String mensaje="";
		
		switch (num) {
		
		case 1:
			mensaje="El resultado es: "+Math.sqrt(num2);
			break;
		case 2:
			mensaje="El resultado es: "+Math.pow(num2, num3);
			break;
		case 3:
			mensaje="El resultado es: "+(num2%num3);
			break;
		case 4:
			mensaje="El resultado es: "+(num2+num3);
			break;
		case 5:
			mensaje="El resultado es: "+(num2-num3);
			break;
		case 6:
			mensaje="El resultado es: "+(num2*num3);
			break;
		case 7:
			mensaje="El resultado es: "+(num2/num3);
			break;

		}
		
		System.out.println(mensaje);

	}
}
