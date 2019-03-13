package HashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class HashMap_Almacen {

	public static void main(String[] args) {
		
		HashMap<String, Articulo> hm = new HashMap();
		int introduceUsuario;
		String mostrarListado;
		
		do {
		
			introduceUsuario=Integer.parseInt(JOptionPane.showInputDialog("-------------Menu del almacen-------------\n"
					+ "Elige una de las opciones:\n"
					+ "1.Introduce un articulo nuevo.\n"
					+ "2.Elimina un articulo.\n"
					+ "3.Actualice un articulo.\n"
					+ "4.Visualiza un listado completo de los articulos.\n"
					+ "5.Salir"));
			
			switch (introduceUsuario) {
			case 1:
				
				String codigoBarras=JOptionPane.showInputDialog("Introduce el codigo de barras: ");	
				String estante=JOptionPane.showInputDialog("Introduce el estante: ");	
				String descripcion=JOptionPane.showInputDialog("Introduce la descripcion: ");
				
				hm.put(codigoBarras, new Articulo (codigoBarras,estante,descripcion));
				
				break;
			case 2:
				Object claves[] = hm.keySet().toArray();
				mostrarListado = "¿Qué objeto deseas eliminar de la lista?\n";
				for (int i = 0; i < claves.length; i++) {
					mostrarListado+=(hm.get(claves[i])+"\n");
				}
				String elimina=JOptionPane.showInputDialog(mostrarListado);
				hm.remove(elimina);
				mostrarListado="";
				break;
			case 3:
				Object claves1[] = hm.keySet().toArray();
				mostrarListado = "Introduzca el codigo de barras a actualizar\n";
				for (int i = 0; i < claves1.length; i++) {
					mostrarListado+=(hm.get(claves1[i])+"\n");
				}
				String actualiza=JOptionPane.showInputDialog(mostrarListado);
				//hm.remove(actualiza);
				String estante1=JOptionPane.showInputDialog("Introduce el nuevo estante: ");	
				String descripcion1=JOptionPane.showInputDialog("Introduce la nueva descripcion: ");
				hm.put(actualiza, new Articulo (actualiza,estante1,descripcion1));
				break;
			case 4:
				Object claves2[] = hm.keySet().toArray();
				mostrarListado = "Lista de articulos:\n";
				for (int i = 0; i < claves2.length; i++) {
					mostrarListado+=(hm.get(claves2[i])+"\n");
				}
				JOptionPane.showMessageDialog(null,mostrarListado);
				break;
			}

		}while(introduceUsuario!=5);
	}

}
