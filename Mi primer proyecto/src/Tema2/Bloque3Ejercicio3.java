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
			float cateto1= Float.parseFloat(JOptionPane.showInputDialog("Introduce un cateto: "));
			float cateto2= Float.parseFloat(JOptionPane.showInputDialog("Introduce otro cateto: "));
			mensaje="El resultado es"+(Math.sqrt((Math.pow(cateto1, 2))+(Math.pow(cateto2, 2))));
			break;
		case 2:// Superficie Circunferencia
			float radio= Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));
			mensaje="El resultado es: "+(Math.PI*(Math.pow(radio, 2)));
			break;
		case 3:// Perimetro Circunferencia
			radio= Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));
			mensaje="El resultado es: "+(2*Math.PI*radio);
			break;
		case 4://Area del rectangulo
			float base= Float.parseFloat(JOptionPane.showInputDialog("Introduce la base: "));
			float altura= Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura: "));
			mensaje="El resultado es: "+(base*altura);
			break;
		case 5://Area de un triangulo
			base= Float.parseFloat(JOptionPane.showInputDialog("Introduce la base: "));
			altura= Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura: "));
			mensaje="El resultado es: "+((base*altura)/2);
			break;
		case 6://Salir de la aplicacion
			System.exit(0);
			break;

		}
		
		System.out.println(mensaje);

	}
}
