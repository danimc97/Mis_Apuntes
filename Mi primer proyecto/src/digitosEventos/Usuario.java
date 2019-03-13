package digitosEventos;

public class Usuario implements DigitoListener {

	String nombre;

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		Principal.addDigitoListener(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void digitosDetectados3(DigitoEvent Event) {
		System.out.println("Te notifico de que la palabra contiene 3 digitos");		
	}
	
		
}
