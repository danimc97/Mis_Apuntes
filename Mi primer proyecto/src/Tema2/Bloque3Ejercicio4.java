package Tema2;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio4 {

	public static void main(String[] args) {
		
		int precio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio del producto"));
		int dinero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dinero"));
		
		int vuelta=dinero-precio;
		
		int monedas100=vuelta/100;
		int resto100=vuelta%100;
		int monedas50=resto100/50;
		int resto50=resto100%50;
		int monedas25=resto50/25;
		int resto25=resto50%25;
		int monedas5=resto25/5;
		int resto5=resto25%5;
		int monedas1=resto5/1;
		int resto1=resto5%1;
		
		if (monedas100>100) {
			System.out.println("Monedas de 100: "+monedas100+"\n");
		}
		else {
			if (monedas50>50) {
				System.out.println("Monedas de 50: "+monedas50+"\n");
			}
			else {
				if (monedas25>25) {
					System.out.println("Monedas de 25: "+monedas25+"\n");
				}
				else {
					if (monedas5>5) {
						System.out.println("Monedas de 5: "+monedas5+"\n");
					}
					else {
						if (monedas1>1) {
							System.out.println("Monedas de 1: "+monedas1);
						}
					}
				}
			}
		}

	}

}
