package tema6_Recursos;

import javax.swing.JOptionPane;

public class EjercicioEcuacion2Grado {

	public static void main(String[] args) {
		
		int a= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de a:"));
		int b= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de b:"));
		int c= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de c:"));
		
	    double positiva = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
	
	    double negativa = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
	    
	    System.out.println("La ecuacion de segundo grado positiva es: "+positiva);
	    System.out.println("La ecuacion de segundo grado positiva es: "+negativa);

	}
}
