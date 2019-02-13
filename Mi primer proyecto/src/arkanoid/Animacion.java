package arkanoid;


public class Animacion extends ObjetosEnPantalla {

	
	String exp[]=new String[] {
		"Delorean/delorean00.png",
		"Delorean/delorean01.png",
		"Delorean/delorean02.png",
		"Delorean/delorean03.png",
		"Delorean/delorean04.png",
		"Delorean/delorean05.png",
		"Delorean/delorean06.png",
		"Delorean/delorean07.png",
		"Delorean/delorean08.png",
		"Delorean/delorean09.png",
		"Delorean/delorean10.png",
		"Delorean/delorean11.png",
		"Delorean/delorean12.png",
		"Delorean/delorean13.png",
		"Delorean/delorean14.png",
		"Delorean/delorean15.png",
		"Delorean/delorean16.png",
		"Delorean/delorean17.png",
		"Delorean/delorean18.png",
		"Delorean/delorean19.png",
		"Delorean/delorean20.png",
		"Delorean/delorean21.png",
		"Delorean/delorean22.png",
		"Delorean/delorean23.png",
		"Delorean/delorean24.png",
		"Delorean/delorean25.png",
		"Delorean/delorean26.png",
		"Delorean/delorean27.png",
		"Delorean/delorean28.png",
		"Delorean/delorean29.png",
		"Delorean/delorean30.png",
		"Delorean/delorean31.png",
		"Delorean/delorean32.png",
		"Delorean/delorean33.png",
		"Delorean/delorean34.png",
		"Delorean/delorean35.png",
		"Delorean/delorean36.png",
		"Delorean/delorean37.png",
		"Delorean/delorean38.png",
		"Delorean/delorean39.png",


	};
	
	
	
	public Animacion(Stage stage) {
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
