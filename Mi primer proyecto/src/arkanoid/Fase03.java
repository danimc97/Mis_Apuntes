package arkanoid;

import java.awt.Color;

import javax.swing.JOptionPane;

/**
 * Clase que implementa la primera fase del juego
 * @author R
 *
 */
public class Fase03 extends Fase {
	// Propiedades est�ticas de la fase
	public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;

	
	/**
	 * Inicializaci�n de la fase, es la implementaci�n de un m�todo abstracto en el supertipo
	 */
	@Override
	public void inicializaFase(Stage stage) {
		LadrilloConMovimiento ladrillo = new LadrilloConMovimiento(stage,6);
		actores.add(ladrillo);
		contadorLadrillo++;
		JOptionPane.showMessageDialog(null, "¡Marty, me las pagarás!");
	}
}