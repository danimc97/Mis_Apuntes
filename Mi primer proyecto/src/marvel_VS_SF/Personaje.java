package marvel_VS_SF;

public abstract class Personaje extends DetectaPunetazoAdapter {
	
	private int id;
	
	private String nombre;
	
	private int vida;
	
	private int fuerza;

	
	
	public Personaje() {
		super();
	}



	public Personaje(int id, String nombre, int vida, int fuerza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
	}


	public abstract void act();
		
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getVida() {
		return vida;
	}



	public void setVida(int vida) {
		this.vida = vida;
	}



	public int getFuerza() {
		return fuerza;
	}



	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	
	
	

}
