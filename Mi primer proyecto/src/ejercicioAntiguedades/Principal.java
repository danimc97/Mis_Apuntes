package ejercicioAntiguedades;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		String menu="Creación de datos de antogüedades"
				+ "\n1.Joyas"
				+ "\n2.Muebles";
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		
		
		
		Joyas joya=new Joyas(1989, "Lucena", 100, "Plata");
		System.out.println(joya.toString());
		
		Mueble mueble=new Mueble();
		System.out.println("Epoca del mueble "+mueble.getEpoca());

	}

}
