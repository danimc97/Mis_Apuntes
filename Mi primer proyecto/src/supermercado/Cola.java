package supermercado;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cola {

	List<Persona> colaSupermercado= new ArrayList<Persona>();

	
	public Cola() {
		super();
	}

	public Cola(List<Persona> colaSupermercado) {
		super();
		colaSupermercado = colaSupermercado;
	}

	public List<Persona> getcolaSupermercado() {
		return colaSupermercado;
	}

	public void setcolaSupermercado(List<Persona> colaSupermercado) {
		colaSupermercado = colaSupermercado;
	}
	
	
	public void mientrasCola() {
		
		int numeroEntrada;
		int numeroSalida;
		
		do {
			numeroEntrada=(int) Math.round(Math.random());
			
			if(numeroEntrada==1 && colaSupermercado.size()<10) {
				colaSupermercado.add(new Persona(JOptionPane.showInputDialog("Introduce el nombre de la persona:")));
			}
			
			numeroSalida=(int) Math.round(Math.random());
			
			if(colaSupermercado.size()>=1 && numeroSalida==0) {
				colaSupermercado.remove(0);
			}
			
			System.out.println(colaSupermercado);
			
			JOptionPane.showMessageDialog(null, "Avanza");
			
		}while(true);
		
	}
	
}
