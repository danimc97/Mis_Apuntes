package excepciones;

public class Persona {
	protected Pierna piernaDerecha;
	protected Pierna piernaIzquierda;
	
	public Persona() {
		this.piernaDerecha = new Pierna(Pierna.DERECHA);
		this.piernaIzquierda = new Pierna(Pierna.IZQUIERDA);
	}
	
	public Persona(Pierna piernaDerecha, Pierna piernaIzquierda) {
		super();
		this.piernaDerecha = piernaDerecha;
		this.piernaIzquierda = piernaIzquierda;
	}

	public Pierna getPiernaDerecha() {
		return piernaDerecha;
	}

	public void setPiernaDerecha(Pierna piernaDerecha) {
		this.piernaDerecha = piernaDerecha;
	}

	public Pierna getPiernaIzquierda() {
		return piernaIzquierda;
	}

	public void setPiernaIzquierda(Pierna piernaIzquierda) {
		this.piernaIzquierda = piernaIzquierda;
	}
}
