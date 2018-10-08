package Tema3;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio6 {

	public static void main(String[] args) {
		
		int num=1;
		int mul=0;
		
		for (int i=0;num!=0;i++) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			
			if(num==0) {
				System.out.println("Error");
			}
			else {
			
				for (int o=0;o<=10;o++) {
					
					mul=num*o;
					System.out.println(num+"x"+o+"="+mul);
					
				}
			
		}
		
	}

	}

}
