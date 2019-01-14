package carrera;

import javax.swing.JOptionPane;

public class Carrera {

	private Vehiculo arrayVehiculo []= new Vehiculo [5];
	private Vehiculo podium[]= new Vehiculo[3];
	
	
	Pista pista= new Pista();
	Pista pista1= new Pista();
	Pista pista2= new Pista();
	Pista pista3= new Pista();
	Rampa rampa= new Rampa();
	ManchaAceite manchaAceite= new ManchaAceite();
	boolean vehiculo1=false;
	boolean vehiculo2=false;
	boolean vehiculo3=false;
	boolean vehiculo4=false;
	boolean meta=false;



	public Carrera() {
		super();
		//Vehículos
		arrayVehiculo[0]=new Moto(0, "Moto1", "Rojo", 0, 0, 0);
		arrayVehiculo[1]=new Coche(0, "Coche1", "Azul", 0, 0, 0);
		arrayVehiculo[2]=new Moto(0, "Moto2", "Naranja", 0, 0, 0);
		arrayVehiculo[3]=new Moto(0, "Coche2", "Verde", 0, 0, 0);
		
	}
	
	public void carreraConCoche() {
		
		for (int i=0;i<podium.length;i++) {
			podium[i]=null;
		}
		
		arrayVehiculo[0].avanza();
		arrayVehiculo[1].avanza();JOptionPane.showMessageDialog(null, "Pulsa Intro para avanzar");
		arrayVehiculo[2].avanza();
		arrayVehiculo[3].avanza();
		
		do {
			coche1();
			JOptionPane.showMessageDialog(null, "Pulsa Intro para avanzar");
			coche2();
			JOptionPane.showMessageDialog(null, "Pulsa Intro para avanzar");
			coche3();
			JOptionPane.showMessageDialog(null, "Pulsa Intro para avanzar");
			coche4();
			JOptionPane.showMessageDialog(null, "Pulsa Intro para avanzar");
			
			if (vehiculo1==true && vehiculo2==true && vehiculo3==true && vehiculo4==true) {
				meta=true;
			}
		}while(meta==false);
		
		System.out.println();
		for(int i=0;i<podium.length;i++) {
			
			System.out.println(i+1+". "+podium[i]);
			
		}
	}
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	
	public void coche1() {
		if(arrayVehiculo[0].getRecorridoVehiculo()<pista.pista.length && vehiculo1==false) {
			
			for (int i=(arrayVehiculo[0].getMetros()-arrayVehiculo[0].getNumeroAvanza()+1); i<=arrayVehiculo[0].getMetros() && i<pista.pista.length;i++) {
				
				if (pista.pista[i]==null) {
					
					//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
				}
				else {
					if (pista.pista[i] instanceof Rampa) {
						rampa.inicializa();
						pista.pista[i]=null;
						i+=rampa.getImpulsa();
						arrayVehiculo[0].setRampaBandera(true);
						if (i>pista.pista.length-1) {
							i=pista.pista.length-1;
						}
						//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
					}
					else {
						if (pista.pista[i] instanceof ManchaAceite) {
							manchaAceite.inicializa();
							pista.pista[i]=null;
							arrayVehiculo[0].setMetros(arrayVehiculo[0].getMetros()+manchaAceite.getRetrasa());
							i=i+manchaAceite.getRetrasa();
							if (arrayVehiculo[0].getMetros()<0) {
								arrayVehiculo[0].setMetros(0);
							}
							if (i<0) {
								i=0;
							}
							//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
						}
					}
				}
				arrayVehiculo[0].setRecorridoVehiculo(i);
			}
			if (arrayVehiculo[0].getRecorridoVehiculo()!=pista.pista.length-1 && arrayVehiculo[0].isRampaBandera()==false) {
				arrayVehiculo[0].avanza();
			}
			else {
				arrayVehiculo[0].setMetros(arrayVehiculo[0].getRecorridoVehiculo());
				arrayVehiculo[0].setNumeroAvanza((int) (Math.round(Math.random()*47)+3));
				arrayVehiculo[0].setMetros(arrayVehiculo[0].getMetros()+arrayVehiculo[0].getNumeroAvanza());
				arrayVehiculo[0].setRampaBandera(false);
			}
			
			if (arrayVehiculo[0].getRecorridoVehiculo()>=pista.pista.length-1) {
				vehiculo1=true;
			}
			System.out.println();
			System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+arrayVehiculo[0].getRecorridoVehiculo()+" metros");
			
			if (vehiculo1) {
				boolean entraPodium=false;
				for (int i=0;i<podium.length;i++) {
					if(podium[i]==null && entraPodium==false) {
						podium[i]=arrayVehiculo[0];
						entraPodium=true;
					}
				}
			}
			
		}
	}
	
	public void coche2() {
		if(arrayVehiculo[1].getRecorridoVehiculo()<pista1.pista.length && vehiculo2==false) {
			
			for (int i=(arrayVehiculo[1].getMetros()-arrayVehiculo[1].getNumeroAvanza()+1); i<=arrayVehiculo[1].getMetros() && i<pista1.pista.length;i++) {
				
				if (pista1.pista[i]==null) {
					
					//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
				}
				else {
					if (pista1.pista[i] instanceof Rampa) {
						rampa.inicializa();
						pista1.pista[i]=null;
						i+=rampa.getImpulsa();
						arrayVehiculo[1].setRampaBandera(true);
						if (i>pista1.pista.length-1) {
							i=pista1.pista.length-1;
						}
						//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
					}
					else {
						if (pista1.pista[i] instanceof ManchaAceite) {
							manchaAceite.inicializa();
							pista1.pista[i]=null;
							arrayVehiculo[1].setMetros(arrayVehiculo[1].getMetros()+manchaAceite.getRetrasa());
							i=i+manchaAceite.getRetrasa();
							if (arrayVehiculo[1].getMetros()<0) {
								arrayVehiculo[1].setMetros(0);
							}
							if (i<0) {
								i=0;
							}
							//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
						}
					}
				}
				arrayVehiculo[1].setRecorridoVehiculo(i);
			}
			if (arrayVehiculo[1].getRecorridoVehiculo()!=pista1.pista.length-1 && arrayVehiculo[1].isRampaBandera()==false) {
				arrayVehiculo[1].avanza();
			}
			else {
				arrayVehiculo[1].setMetros(arrayVehiculo[1].getRecorridoVehiculo());
				arrayVehiculo[1].setNumeroAvanza((int) (Math.round(Math.random()*47)+3));
				arrayVehiculo[1].setMetros(arrayVehiculo[1].getMetros()+arrayVehiculo[1].getNumeroAvanza());
				arrayVehiculo[1].setRampaBandera(false);
			}
			
			if (arrayVehiculo[1].getRecorridoVehiculo()>=pista1.pista.length-1) {
				vehiculo2=true;
			}
			System.out.println();
			System.out.println("Soy el vehiculo "+arrayVehiculo[1].getNombre()+" y llevo "+arrayVehiculo[1].getRecorridoVehiculo()+" metros");
			
			if (vehiculo2) {
				boolean entraPodium=false;
				for (int i=0;i<podium.length;i++) {
					if(podium[i]==null && entraPodium==false) {
						podium[i]=arrayVehiculo[1];
						entraPodium=true;
					}
				}
			}
			
		}
	}
	
	public void coche3() {
		if(arrayVehiculo[2].getRecorridoVehiculo()<pista2.pista.length && vehiculo3==false) {
			
			for (int i=(arrayVehiculo[2].getMetros()-arrayVehiculo[2].getNumeroAvanza()+1); i<=arrayVehiculo[2].getMetros() && i<pista2.pista.length;i++) {
				
				if (pista2.pista[i]==null) {
					
					//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
				}
				else {
					if (pista2.pista[i] instanceof Rampa) {
						rampa.inicializa();
						pista2.pista[i]=null;
						i+=rampa.getImpulsa();
						arrayVehiculo[2].setRampaBandera(true);
						if (i>pista2.pista.length-1) {
							i=pista2.pista.length-1;
						}
						//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
					}
					else {
						if (pista2.pista[i] instanceof ManchaAceite) {
							manchaAceite.inicializa();
							pista2.pista[i]=null;
							arrayVehiculo[2].setMetros(arrayVehiculo[2].getMetros()+manchaAceite.getRetrasa());
							i=i+manchaAceite.getRetrasa();
							if (arrayVehiculo[2].getMetros()<0) {
								arrayVehiculo[2].setMetros(0);
							}
							if (i<0) {
								i=0;
							}
							//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
						}
					}
				}
				arrayVehiculo[2].setRecorridoVehiculo(i);
			}
			if (arrayVehiculo[2].getRecorridoVehiculo()!=pista2.pista.length-1 && arrayVehiculo[2].isRampaBandera()==false) {
				arrayVehiculo[2].avanza();
			}
			else {
				arrayVehiculo[2].setMetros(arrayVehiculo[2].getRecorridoVehiculo());
				arrayVehiculo[2].setNumeroAvanza((int) (Math.round(Math.random()*47)+3));
				arrayVehiculo[2].setMetros(arrayVehiculo[2].getMetros()+arrayVehiculo[2].getNumeroAvanza());
				arrayVehiculo[2].setRampaBandera(false);
			}
			
			if (arrayVehiculo[2].getRecorridoVehiculo()>=pista2.pista.length-1) {
				vehiculo3=true;
			}
			System.out.println();
			System.out.println("Soy el vehiculo "+arrayVehiculo[2].getNombre()+" y llevo "+arrayVehiculo[2].getRecorridoVehiculo()+" metros");
			
			if (vehiculo3) {
				boolean entraPodium=false;
				for (int i=0;i<podium.length;i++) {
					if(podium[i]==null && entraPodium==false) {
						podium[i]=arrayVehiculo[2];
						entraPodium=true;
					}
				}
			}
			
		}
	}
	
	public void coche4() {
		if(arrayVehiculo[3].getRecorridoVehiculo()<pista3.pista.length && vehiculo4==false) {
			
			for (int i=(arrayVehiculo[3].getMetros()-arrayVehiculo[3].getNumeroAvanza()+1); i<=arrayVehiculo[3].getMetros() && i<pista3.pista.length;i++) {
				
				if (pista3.pista[i]==null) {
					
					//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
				}
				else {
					if (pista3.pista[i] instanceof Rampa) {
						rampa.inicializa();
						pista3.pista[i]=null;
						i+=rampa.getImpulsa();
						arrayVehiculo[3].setRampaBandera(true);
						if (i>pista3.pista.length-1) {
							i=pista3.pista.length-1;
						}
						//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
					}
					else {
						if (pista3.pista[i] instanceof ManchaAceite) {
							manchaAceite.inicializa();
							pista3.pista[i]=null;
							arrayVehiculo[3].setMetros(arrayVehiculo[3].getMetros()+manchaAceite.getRetrasa());
							i=i+manchaAceite.getRetrasa();
							if (arrayVehiculo[3].getMetros()<0) {
								arrayVehiculo[3].setMetros(0);
							}
							if (i<0) {
								i=0;
							}
							//System.out.println("Soy el vehiculo "+arrayVehiculo[0].getNombre()+" y llevo "+i+" metros");
						}
					}
				}
				arrayVehiculo[3].setRecorridoVehiculo(i);
			}
			if (arrayVehiculo[3].getRecorridoVehiculo()!=pista3.pista.length-1 && arrayVehiculo[3].isRampaBandera()==false) {
				arrayVehiculo[3].avanza();
			}
			else {
				arrayVehiculo[3].setMetros(arrayVehiculo[3].getRecorridoVehiculo());
				arrayVehiculo[3].setNumeroAvanza((int) (Math.round(Math.random()*47)+3));
				arrayVehiculo[3].setMetros(arrayVehiculo[3].getMetros()+arrayVehiculo[3].getNumeroAvanza());
				arrayVehiculo[3].setRampaBandera(false);
			}
			
			if (arrayVehiculo[3].getRecorridoVehiculo()>=pista3.pista.length-1) {
				vehiculo4=true;
			}
			System.out.println();
			System.out.println("Soy el vehiculo "+arrayVehiculo[3].getNombre()+" y llevo "+arrayVehiculo[3].getRecorridoVehiculo()+" metros");
			
			if (vehiculo4) {
				boolean entraPodium=false;
				for (int i=0;i<podium.length;i++) {
					if(podium[i]==null && entraPodium==false) {
						podium[i]=arrayVehiculo[3];
						entraPodium=true;
					}
				}
			}
		}
	}
}
