package ejemploEventos;

public class Astronauta5 implements OrdenadorListener2{

	String nombre;

	public Astronauta5(String nombre) {
		super();
		this.nombre = nombre;
		Principal4.addOrdenadorListener(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void palabraOrdenadorDetectada(OrdenadorEvent1 Event) {
		System.out.println("Astronauta "+nombre+" recibe el evento");
	}
	
	
	
}
