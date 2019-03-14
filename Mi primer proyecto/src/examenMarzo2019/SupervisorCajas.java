package examenMarzo2019;

import java.util.Date;

public class SupervisorCajas implements EliminarProductoListener{

	String nombre;

	public SupervisorCajas(String nombre) {
		super();
		this.nombre = nombre;
		Supermercado.addEliminarProductoListener(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void eliminarProducto(EliminarProductoEvent Event) {
		Date fechaActual = new Date();
		System.out.println("El supervisor dice: Se ha elminado un producto de la caja con fecha "+fechaActual.toString());
	}
	
			
}
