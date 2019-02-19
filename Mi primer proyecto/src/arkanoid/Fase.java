package arkanoid;

import java.util.ArrayList;
import java.util.List;

/**
 * Todas las fases deber�n extender esta clase abstracta y personalizar la apariencia y el comportamiento
 * @author R
 *
 */
public abstract class Fase {
	
	int contadorLadrillo=0;
	
	// Lista de actores a colocar en cualquier fase
	protected List<ObjetosEnPantalla> actores = new ArrayList<ObjetosEnPantalla>();
	
	// M�todo que debe implementar cada Fase
	public abstract void inicializaFase (Stage stage);

	// Getter de la lista de actores
	public List<ObjetosEnPantalla> getActores() { return actores; }
	
	// Archivo de sonido del principio de la fase
	public String getNombreSonidoInicio () {
		return "";
	}

	public int getContadorLadrillo() {
		return contadorLadrillo;
	}

	public void setContadorLadrillo(int contadorLadrillo) {
		this.contadorLadrillo = contadorLadrillo;
	}
	
	
}
