package Tema2;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio3 {

	public static void main(String[] args) {
		
		String menu ="---------------MENU----------------\n1.Raices\n2.Potencias\n3.Modulo de la division\n4.Suma\n5.Resta\n6.Multiplicacion\n7.Division\n---------------------------------------";
		int num=Integer.parseInt(JOptionPane.showInputDialog(menu));
		float num2= Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer numero: "));
		float num3= Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		float num4= Float.parseFloat(JOptionPane.showInputDialog("Introduce el tercer numero: "));
		String mensaje="";
		
		switch (num) {
		
		case 1://Hipotenusa
			num2=(float) Math.sqrt((Math.pow(num3, 2))+(Math.pow(num4, 2)));
			mensaje="El resultado es"+num2;
			break;
		case 2:// Superficie Circunferencia
			num2=(float) (Math.PI*(Math.pow(num3, 2)));
			mensaje="El resultado es: "+Math.pow(num2, num3);
			break;
		case 3:// Perimetro Circunferencia
			mensaje="El resultado es: "+(num2%num3);
			break;
		case 4:
			mensaje="El sresultado es: "+(num2+num3);
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
