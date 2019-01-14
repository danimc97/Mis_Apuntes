package carrera;

public class Pista {

	Obstaculo obstaculos[]= new Obstaculo [4];
	Obstaculo obstaculoPreparar[]= new Obstaculo[2];
	private final int LONGITUD=200;
	Obstaculo pista[]= new Obstaculo [LONGITUD];

	public Pista() {
		super();
		creacionPista();
	}
	

	public Pista(Obstaculo[] obstaculos, Obstaculo[] obstaculoPreparar, Obstaculo[] pista) {
		super();
		this.obstaculos = obstaculos;
		this.obstaculoPreparar = obstaculoPreparar;
		this.pista = pista;
	}



	/*public void creacionTrampasPista() {
		obstaculoPreparar[0]= new Rampa();
		obstaculoPreparar[1]= new ManchaAceite();
		for (int i=0;i<obstaculos.length;i++) {
			int numeroAleatorio=0;
			numeroAleatorio=(int) (Math.round(Math.random()*1));
			obstaculos[i]=obstaculoPreparar[numeroAleatorio];
		}
	}*/
	
	public void creacionPista() {
		
		obstaculoPreparar[0]= new ManchaAceite();
		obstaculoPreparar[1]= new Rampa();

		int numeroAleatorio=0;
		int numeroAleatorioEnPista=0;
		
		/*for (int i=0; i<pista.length;i++) {
			pista[i]=null;
			System.out.print(pista[i]+" ");
		}*/
		
		for (int i=0; i<4;i++) {
			numeroAleatorio=(int) Math.round(Math.random()*1);
			numeroAleatorioEnPista=(int) Math.round(Math.random()*(LONGITUD-1));
			
				
			if (pista[numeroAleatorioEnPista]==null) {
				pista[numeroAleatorioEnPista]=obstaculoPreparar[numeroAleatorio];
			}
			else {
				do {
					numeroAleatorioEnPista=(int) Math.round(Math.random()*24);
					if(pista[numeroAleatorioEnPista]==null) {
						pista[numeroAleatorioEnPista]=obstaculoPreparar[numeroAleatorio];
					}
				}while(pista[numeroAleatorioEnPista]!=null);
				
			}
			
			System.out.println();
			
		}
		for (int j=0; j<pista.length;j++) {
			System.out.print(pista[j]+" ");
		}
	}


	public Obstaculo[] getObstaculos() {
		return obstaculos;
	}


	public void setObstaculos(Obstaculo[] obstaculos) {
		this.obstaculos = obstaculos;
	}


	public Obstaculo[] getObstaculoPreparar() {
		return obstaculoPreparar;
	}


	public void setObstaculoPreparar(Obstaculo[] obstaculoPreparar) {
		this.obstaculoPreparar = obstaculoPreparar;
	}


	public Obstaculo[] getPista() {
		return pista;
	}


	public void setPista(Obstaculo[] pista) {
		this.pista = pista;
	}


	public int getLONGITUD() {
		return LONGITUD;
	}
	
	
}
