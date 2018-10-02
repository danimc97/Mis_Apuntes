package Tema2;

import javax.swing.JOptionPane;

public class monedas {

	public static void main(String[] args) {
		
		//100, 50, 25, 5, y 1
		
		String x= JOptionPane.showInputDialog("Introduce el precio del producto: ");
		float costo=Float.parseFloat(x);
		
		String y= JOptionPane.showInputDialog("Introduce el dinero: ");
		float dinero=Float.parseFloat(y);
		
		
		int vuelta= (int) (dinero-costo);
		
		System.out.println("La vuelta es "+vuelta);
		
		
		

	}

}
