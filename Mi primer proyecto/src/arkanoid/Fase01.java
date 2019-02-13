package arkanoid;

import java.awt.Color;

/**
 * Clase que implementa la primera fase del juego
 * @author R
 *
 */
public class Fase01 extends Fase {
	// Propiedades est�ticas de la fase
	public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;

	
	/**
	 * Inicializaci�n de la fase, es la implementaci�n de un m�todo abstracto en el supertipo
	 */
	@Override
	public void inicializaFase(Stage stage) {
		
		for (int j=0;j<4;j++) {
	    	  for (int i=0;i<10;i++) {
	    		  Ladrillo ladrillo=new Ladrillo(stage,j);
	    		  ladrillo.setX(5+i*63);
	    		  ladrillo.setY(j*23);
	    		  if (j!=0) {
	    			  contadorLadrillo++;
	    		  }
	    		  actores.add(ladrillo);
	    	  }
	      }
		
	}

}
