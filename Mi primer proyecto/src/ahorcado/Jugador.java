package ahorcado;

public class Jugador {

	private int fallos=6;

	public Jugador() {
		super();
	}

	public Jugador(int fallos) {
		super();
		this.fallos = fallos;
	}

	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}
	
}
