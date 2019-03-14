package examenMarzo2019;

import java.util.HashMap;

import javax.swing.JOptionPane;

import excepciones_bombilla.EspacioEnBlancoException;


public class Caja {

	int precio=0;
	
	private static Caja instancia = null;
	
	public HashMap<Integer,Articulo> caja = new HashMap<Integer,Articulo>();
	
	public synchronized static Caja getInstancia() {
        if (instancia == null) {
            instancia = new Caja();
        }
        return instancia;
    }
	
	public void mostrarHashmap() {
		System.out.println("-----------------Articulos en caja----------------");
		Object claves[] = caja.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(caja.get(claves[i]));
		}
		
	}
	
	
	public void dineroAPagar() {
		
		
		
		Object claves[] = caja.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			precio+=caja.get(claves[i]).getPrecio();
			if(caja.get(claves[i]).getCantidad()>1) {
				for (int j=1;j<caja.get(claves[i]).getCantidad();j++) {
					precio+=caja.get(claves[i]).getPrecio();
				}
			}
		}
		
		System.out.println("El precio a pagar es de "+precio+" euros");
		
	}
	
	public void pedirDinero () throws CashInsuficienteException {
		
		int dinero=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres pagar?"));
		
		if(dinero>=precio) {
			JOptionPane.showMessageDialog(null, "Su vuelta es de "+(dinero-precio)+" euros");
		}
		else {
			throw new CashInsuficienteException();
		}
		
		
	}
	
}
