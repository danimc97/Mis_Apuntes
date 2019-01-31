package arkanoid;


public class Explosion extends ObjetosEnPantalla {

	
	String exp[]=new String[] {
		"sprite-explosion1.png",
		"sprite-explosion2.png",
		"sprite-explosion3.png",
		"sprite-explosion4.png",
		"sprite-explosion5.png",
		"sprite-explosion6.png",
		"sprite-explosion7.png",
		"sprite-explosion8.png",
		"sprite-explosion9.png",
	};
	
	
	
	public Explosion(Stage stage) {
		super(stage);
		setSpriteName(exp);
		setFrameSpeed(2);
	}
	
	public void act () {
		super.act();
		if(currentFrame==(exp.length-1)) {
			remove();
		}
	}
}
