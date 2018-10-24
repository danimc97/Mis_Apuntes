package PruebaExamen;

import javax.swing.JOptionPane;

public class Adivinar_el_numero {

	public static void main(String[] args) {
		
		int aleatorio=(int) Math.round(Math.random()*(50-(-50)))-50;
		
		int numero=1;
	
		while (numero!=aleatorio) {
			
			numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			
			if (numero<aleatorio) {
				
				JOptionPane.showMessageDialog(null, "El numero es mas grande");
				
			}
			else {
				
				if (numero>aleatorio) {
					
					JOptionPane.showMessageDialog(null, "El numero es mas pequeño");
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "¡Has acertado! El numero es el "+aleatorio);
	}

}
