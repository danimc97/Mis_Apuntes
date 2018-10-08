package Tema3;

import javax.swing.JOptionPane;

public class Bloque2Ejercicio3 {

	public static void main(String[] args) {
		int mul=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		for (int o=1;mul<100;o++) {
				mul=num*o;
				if (mul<100) {
				System.out.println(num+"x"+o+"="+mul);
				}
			}
		}	
	}

