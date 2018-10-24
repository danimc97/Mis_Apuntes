package PruebaExamen;

import javax.swing.JOptionPane;

public class PalabrasIngles {

	public static void main(String[] args) {
		
		int palabra= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero (1.casa, 2.mesa, 3.perro, 4.gato: "));
		
		switch (palabra) {
		
		case 1 :System.out.println("Home");
			break;
		case 2 :System.out.println("Table");
			break;
		case 3 :System.out.println("Dog");
			break;
		case 4:System.out.println("Cat");
			break;

		}

	}

}
