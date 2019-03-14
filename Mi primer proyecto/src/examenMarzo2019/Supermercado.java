package examenMarzo2019;

import java.util.ArrayList;
import java.util.List;


public class Supermercado {

	static List<EliminarProductoListener> productoListeners = new ArrayList<EliminarProductoListener>();
	
	public static void main(String[] args) {
		
		SupervisorCajas supervisor = new SupervisorCajas("Dani");
		
		System.out.println("Nombre del supermercado "+Propiedades.getProperty("NOMBRE"));
		
		System.out.println();
		
		System.out.println("Articulos en el carro:");
		
		for(int i=0;i<Cliente.getInstancia().carro.size();i++) {
			System.out.println(Cliente.getInstancia().carro.get(i).toString());
		}
		
		Cliente.getInstancia().meterArticulosEnCaja();
		Cliente.getInstancia().carro.clear();
		
		Caja.getInstancia().mostrarHashmap();
		
		Caja.getInstancia().dineroAPagar();
		
		try {
			Caja.getInstancia().pedirDinero();
		} catch (CashInsuficienteException e) {
			System.out.println("Dinero insuficiente");
			e.printStackTrace();
		}

	}
	
	public static void addEliminarProductoListener (EliminarProductoListener listener) {
		productoListeners.add(listener);
	}
	
	public static void removeEliminarProductoListener(EliminarProductoListener listener) {
		productoListeners.remove(listener);
	}
	
	public static void fireElminarProducto(EliminarProductoEvent evento) {
		for (EliminarProductoListener listener : productoListeners) {
			listener.eliminarProducto(evento);					
		}
	}

}
