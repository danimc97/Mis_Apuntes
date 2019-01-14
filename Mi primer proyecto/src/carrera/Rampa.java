package carrera;

public class Rampa extends Obstaculo {

	private int impulsa;

	public Rampa() {
		super();
	}
	
	
	
	public Rampa(int impulsa) {
		super();
		this.impulsa = impulsa;
	}



	@Override
	public void inicializa() {
		int numeroImpulso=0;
		numeroImpulso=(int) (Math.round(Math.random()*50)+50);
		this.impulsa=numeroImpulso;
	}



	public int getImpulsa() {
		return impulsa;
	}



	public void setImpulsa(int impulsa) {
		this.impulsa = impulsa;
	}
	
	
	
	
	
	
}
