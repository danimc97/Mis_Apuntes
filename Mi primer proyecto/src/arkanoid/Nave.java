package arkanoid;
public class Nave extends ObjetosEnPantalla {
	protected int vx;
	protected int vy;
	
	public Nave(Stage stage) {
		super(stage);
		setSpriteName("Nave1.png");
	}
	
	public void act() {
		x+=vx;
		if (x < 0 || x > Stage.WIDTH-28)
		  vx = -vx;
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}

}