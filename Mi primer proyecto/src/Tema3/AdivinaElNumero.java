package Tema3;

import javax.swing.JOptionPane;

public class AdivinaElNumero {

	public static void main(String[] args) {
		
		int num;
		int secreto=(int) Math.round(Math.random()*100);
		
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (Entre 0-100): "));
			
			if (num<secreto) {
				
				JOptionPane.showMessageDialog(null, "El numero es mayor que "+num);
				
			}
			else {
			
				if (num>secreto) {
					
					JOptionPane.showMessageDialog(null, "El numero es menor que "+num);
					
				}
			}
			
			
		} while (num!=secreto);
		
		JOptionPane.showMessageDialog(null, "¡Muy bien! El numero es el "+num);
		

	}

}
