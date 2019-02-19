package arkanoid;

public class PildoraCambiarFase extends Pildora {

	
	protected String nombre[]=new String [] {"matriculaDelorean.png"};
	
	public PildoraCambiarFase(Stage stage,int pildora) {
		super(stage);
		String name[]=new String[] {"matriculaDelorean.png"};
		setSpriteName(name);
	}
	
	public void collision(ObjetosEnPantalla a) {
	        if (a instanceof Nave) {
	        	remove();
	        	Arkanoid.matricula=true;
	        }
		}
		
     }