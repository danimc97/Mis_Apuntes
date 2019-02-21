package eventos_Y_listeners;

public class IntroducirPalabraSecretaEvent {
	
	//2.Creamos la clase con el evento
	
	private int palabraIntroducida;

	/**
	 * @param numeroIntroducido
	 */
	public IntroducirPalabraSecretaEvent(int palabraIntroducida) {
		super();
		this.palabraIntroducida = palabraIntroducida;
	}

	/**
	 * 
	 * @return
	 */
	public int getPalabraIntroducida() {
		return palabraIntroducida;
	}

	/**
	 * 
	 * @param numeroIntroducido
	 */
	public void setPalabraIntroducida(int palabraIntroducida) {
		this.palabraIntroducida = palabraIntroducida;
	}
	
	
}