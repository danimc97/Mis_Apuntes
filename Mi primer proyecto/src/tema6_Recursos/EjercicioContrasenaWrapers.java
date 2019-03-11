package tema6_Recursos;

import javax.swing.JOptionPane;

public class EjercicioContrasenaWrapers {

	public static void main(String[] args) {
		
		
		
		JOptionPane.showInputDialog("Introduce el nombre de usuario: ");
		
		
		
		boolean minuscula=false;
		boolean mayuscula=false;
		boolean digito=false;
		boolean noNumerico=false;
		boolean todoCorrecto=false;
		
		do {
			String contrasena=JOptionPane.showInputDialog("Introduce la contrasena");
			
			int tamanoPalabra=contrasena.length();
			
			char arrayPalabra[]= new char [tamanoPalabra];
			
			for (int i=0;i<tamanoPalabra;i++) {
				arrayPalabra[i]=contrasena.charAt(i);
			}
		
			for (int i=0;i<arrayPalabra.length;i++) {
				if (Character.isLowerCase(arrayPalabra[i])) {
					minuscula=true;
				}
				else {
					if (Character.isUpperCase(arrayPalabra[i])) {
						mayuscula=true;
					}
					else {
						if (Character.isDigit(arrayPalabra[i])) {
							digito=true;
						}
						else {
							if (!Character.isLetterOrDigit(arrayPalabra[i])) {
								noNumerico=true;
							}
						}
					}
				}
			}
			
			if (!minuscula) {
				JOptionPane.showMessageDialog(null, "La contraseña debe contener una minuscula");
			}
			else {
				if (!mayuscula) {
					JOptionPane.showMessageDialog(null, "La contraseña debe contener una mayuscula");
				}
				else {
					if (!digito) {
						JOptionPane.showMessageDialog(null, "La contraseña debe contener un digito");
					}
					else {
						if (!noNumerico) {
							JOptionPane.showMessageDialog(null, "La contraseña debe contener un caracter no alfanumerico");
						}
					}
				}
			}
			
			if(minuscula && mayuscula && digito && noNumerico) {
				todoCorrecto=true;
			}
			
		}while(!todoCorrecto);
		
		JOptionPane.showMessageDialog(null, "Contraseña correcta");
		
	}

}
