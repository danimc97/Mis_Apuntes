package arkanoid;

public class PildoraBarraPeque�a extends Pildora {

	
	protected String nombre[]=new String [] {"cabezaDoc.png"};
	
	
	public PildoraBarraPeque�a(Stage stage,int pildora) {
		super(stage);
		String name[]=new String[] {"cabezaDoc.png"};
		setSpriteName(name);
	}
	
	public void collision(ObjetosEnPantalla a) {
	        if (a instanceof Nave) {
	        	remove();
	        	noColision=true;
	        }
		}
		
     }
