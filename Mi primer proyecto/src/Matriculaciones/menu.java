package Matriculaciones;

import javax.swing.JOptionPane;

public class menu {

	public static void main(String[] args) {
		
		String menu="Introduce una de las opciones: "
				+ "\n1.Persona"
				+ "\n2.Matricula";
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		Persona persona=null;
		
		Matricula matricula=null;
		
		switch (numero) {
		
		case 1:
			String menu2="Introduce una de las opciones: "
					+ "\n1.Persona con DNI"
					+ "\n2.Persona sin DNI";
			numero=Integer.parseInt(JOptionPane.showInputDialog(menu2));
			switch (numero) {
			case 1://Persona documentada
				persona=new personaD();
				((personaD)persona).setDni(JOptionPane.showInputDialog("Introduce el DNI: "));
				break;
			case 2:
				persona=new personaND();
				personaND personasinDni=(personaND)persona;
				personasinDni.setDescripcion(JOptionPane.showInputDialog("Introduce la descripcion de la persona: "));
				break;
			}
			
			persona.setNombre(JOptionPane.showInputDialog("Introduzca el nombre: "));
			persona.setApellidos(JOptionPane.showInputDialog("Introduce los apellidos"));
			persona.setFechaNacimiento(JOptionPane.showInputDialog("Introduzca la fecha de nacimiento: "));
			
			System.out.println(persona.toString());
			
			break;
		}
		

	}

}
