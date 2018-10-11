package Tema3;

import javax.swing.JOptionPane;

public class ParesONones {

	public static void main(String[] args) {
		
		int eleccion;
		int tumanoizquierda;
		int tumanoderecha;
		int manoizquierdacpu;
		int manoderechacpu;
		int sumamisdedos;
		int sumadedoscpu;
		int resultado=0;
		int modulo=0;
		
		eleccion=Integer.parseInt(JOptionPane.showInputDialog("¿Pares (0) o nones (1)?"));
		
		if (eleccion==0) {
			
			tumanoizquierda=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (0-5)"));
			tumanoderecha=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (0-5)"));
			manoizquierdacpu=(int) Math.round(Math.random()*5);
			manoderechacpu=(int) Math.round(Math.random()*5);
			sumamisdedos=tumanoderecha+tumanoizquierda;
			sumadedoscpu=manoizquierdacpu+manoderechacpu;
			resultado=sumadedoscpu+sumamisdedos;
			modulo=resultado%2;
			
			if(modulo==0) {
				JOptionPane.showMessageDialog(null, "¡Has ganado! el numero es el "+resultado);	
			}
			else {
				JOptionPane.showMessageDialog(null, "¡Has perdido! el numero es el "+resultado);	
			}
		}
		else {
			tumanoizquierda=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (0-5)"));
			tumanoderecha=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (0-5)"));
			manoizquierdacpu=(int) Math.round(Math.random()*5);
			manoderechacpu=(int) Math.round(Math.random()*5);
			sumamisdedos=tumanoderecha+tumanoizquierda;
			sumadedoscpu=manoizquierdacpu+manoderechacpu;
			resultado=sumadedoscpu+sumamisdedos;
			modulo=resultado%2;
			
			if(modulo!=0) {
				JOptionPane.showMessageDialog(null, "¡Has ganado! el numero es el "+resultado);		
			}
			else {
				JOptionPane.showMessageDialog(null, "¡Has perdido! el numero es el "+resultado);	
			}
		}

	}

}
