package carrera;

public class ManchaAceite extends Obstaculo {

	private int retrasa;

	public ManchaAceite() {
		super();
	}
	
	

	public ManchaAceite(int retrasa) {
		super();
		this.retrasa = retrasa;
	}



	@Override
	public void inicializa() {
		int numeroRetraso=0;
		numeroRetraso=(int) (Math.round(Math.random()*-40)-10);
		this.retrasa=numeroRetraso;
	}



	public int getRetrasa() {
		return retrasa;
	}



	public void setRetrasa(int retrasa) {
		this.retrasa = retrasa;
	}
	
	
	
	
}
