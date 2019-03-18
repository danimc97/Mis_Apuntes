package examenMarzo2019;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import marvel_VS_SF.Personaje1;


public class Cliente {

	private static Cliente instancia = null;
	
	public List<Articulo> carro = new ArrayList<Articulo>();

	public Cliente() {
		super();
		carro.add(new Charcuteria("0", "Carne de cerdo", 2, 6));
		carro.add(new Fruteria("1", "Manzana", 1, 6));
		carro.add(new Lacteos("2", "Yogur", 1, 6));
		carro.add(new Perfumeria("3", "Perfume", 3, 6));
		carro.add(new Pescaderia("4", "Sardina", 1, 6, false));
	}
	
	
	@SuppressWarnings("unchecked")
	public void meterArticulosEnCaja() {
		
		String respuesta;
		
		for(int i=0;i<carro.size();i++) {
			Caja.getInstancia().caja.put(i, carro.get(i));
		}
		
		Object claves[] = Caja.getInstancia().caja.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			respuesta=JOptionPane.showInputDialog("¿Desea eliminar "+Caja.getInstancia().caja.get(i).getNombre()+"?");
			if(respuesta.equals("si")) {
				Caja.getInstancia().caja.remove(i);
				EliminarProductoEvent evento = new EliminarProductoEvent();
				Supermercado.fireElminarProducto(evento);
			}
		}
		
	}
	
	public synchronized static Cliente getInstancia() {
        if (instancia == null) {
            instancia = new Cliente();
        }
        return instancia;
    }
	
	
}
