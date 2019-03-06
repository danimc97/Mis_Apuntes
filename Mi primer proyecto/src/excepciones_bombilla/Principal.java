package excepciones_bombilla;

import javax.swing.JOptionPane;

public class Principal {

	static String introduceUsuario;
	
	public static void main(String[] args) {
		
		try {
			pedirUsuario();
			System.out.println("Usuario: "+introduceUsuario);
		} catch (EspacioEnBlancoException e) {
			System.out.println("No has escrito nada");
		} catch (InsultosException e) {
			System.out.println("El texto contiene insultos");
		} catch (BombillaException e) {
			System.out.println("No aparece la palabra 'bombilla'");
		} catch (MenosDeTresPalabras e) {
			System.out.println("La frase no puede contener menos de dos palabras");
		}
	}
	
	public static void pedirUsuario() throws EspacioEnBlancoException, BombillaException, InsultosException, MenosDeTresPalabras {
		
		introduceUsuario=JOptionPane.showInputDialog("Introduce la frase: ");
		
		if ((introduceUsuario.trim()).isEmpty()) {			
			throw new EspacioEnBlancoException();
		}
		if(introduceUsuario.contains("tonto") || introduceUsuario.contains("tonta") || introduceUsuario.contains("idiota")) {
			throw new InsultosException();
		}
		if(!introduceUsuario.contains("bombilla")) {
			throw new BombillaException();
		}
		String[] palabras = introduceUsuario.split(" ");
        if(palabras.length<3) {
            throw new MenosDeTresPalabras();
        }
	}
}
