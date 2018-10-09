package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio6 {

	public static void main(String[] args) {
		
		int num=1;
		int mul=0;
		for (;num!=0;) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			if(num!=0) {
				for (int o=0;o<=10;o++) {
					mul=num*o;
					System.out.println(num+"x"+o+"="+mul);
					if (o==10) {
						System.out.println("-----------------------------");
					}
			}
					
		}	
	}
	}
}
