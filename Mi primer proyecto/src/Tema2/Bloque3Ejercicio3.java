package Tema2;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio3 {

	public static void main(String[] args) {
		
		String menu ="---------------MENU----------------\n"
				+ "1.Calculo de la hipotenusa de un triangulo\n"
				+ "2.Calculo de la superficie de una circunferencia\n"
				+ "3.Calculo del perimetro de una circunferencia\n"
				+ "4.Calculo del area de un rectangulo\n"
				+ "5.Calculo del area de un triangulo\n"
				+ "6.Salir de la aplicacion\n"
				+ "---------------------------------------";
		int num=Integer.parseInt(JOptionPane.showInputDialog(menu));
		String mensaje="";
		
		switch (num) {
		
		case 1://Hipotenusa
			float num3= Float.parseFloat(JOptionPane.showInputDialog("Introduce un cateto: "));
			float num4= Float.parseFloat(JOptionPane.showInputDialog("Introduce otro cateto: "));
			mensaje="El resultado es"+(Math.sqrt((Math.pow(num3, 2))+(Math.pow(num4, 2))));
			break;
		case 2:// Superficie Circunferencia
			float num5= Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));
			mensaje="El resultado es: "+(Math.PI*(Math.pow(num5, 2)));
			break;
		case 3:// Perimetro Circunferencia
			float num6= Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));
			mensaje="El resultado es: "+(2*Math.PI*num6);
			break;
		case 4://Area del rectangulo
			float num7= Float.parseFloat(JOptionPane.showInputDialog("Introduce la base: "));
			float num8= Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura: "));
			mensaje="El resultado es: "+(num7*num8);
			break;
		case 5://Area de un triangulo
			float num9= Float.parseFloat(JOptionPane.showInputDialog("Introduce la base: "));
			float num10= Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura: "));
			mensaje="El resultado es: "+((num9*num10)/2);
			break;
		case 6://Salir de la aplicacion
			System.exit(0);
			break;

		}
		
		System.out.println(mensaje);

	}
}
