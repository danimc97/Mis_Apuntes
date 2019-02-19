package arkanoid;

public class PildoraBarraLarga extends Pildora {

	
	protected String nombre[]=new String [] {"fluzo.png"};
	
	
	public PildoraBarraLarga(Stage stage,int pildora) {
		super(stage);
		String name[]=new String[] {"fluzo.png"};
		setSpriteName(name);
	}
	
	public void collision(ObjetosEnPantalla a) {
	        if (a instanceof Nave) {
	        	remove();
	        	noColision=true;
	        }
		}
		
     }
