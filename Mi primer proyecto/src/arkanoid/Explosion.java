package arkanoid;


public class Explosion extends ObjetosEnPantalla {

	
	String exp[]=new String[] {
		"explosion1.png",
		"explosion2.png",
		"explosion3.png",
		"explosion4.png",
		"explosion5.png",
		"explosion6.png",
		"explosion7.png",
		"explosion8.png",
		"explosion9.png",
		"explosion10.png",
		"explosion11.png",
		"explosion12.png",
		"explosion13.png",
		"explosion14.png",
		"explosion15.png",
		"explosion16.png",
		"explosion17.png",
		"explosion18.png",
		"explosion19.png",
		"explosion20.png",
		"explosion21.png",
		"explosion22.png",
		"explosion23.png",
		"explosion24.png",
		"explosion25.png",
		"explosion26.png",
		"explosion27.png",
		"explosion28.png",
		"explosion29.png",
		"explosion30.png",
		"explosion31.png",
		"explosion32.png",
	};
	
	
	
	public Explosion(Stage stage) {
		super(stage);
		setSpriteName(exp);
		setFrameSpeed(3);
	}
	
	public void act () {
		super.act();
		if(currentFrame==(exp.length-1)) {
			remove();
		}
	}
}
