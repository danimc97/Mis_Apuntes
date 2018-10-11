package Tema3;

import javax.swing.JOptionPane;

public class JuegoMonedas {

	public static void main(String[] args) {
		
		int cpu=0;
		int hum=0;
		int moneda;
		int cara;
		do {
			moneda=Integer.parseInt(JOptionPane.showInputDialog("Escoge (Cara=0 o Cruz=1): "));
			cara=(int) Math.round(Math.random());
			
			if (moneda==cara) {
				hum++;
			}
			else {
				cpu++;
			}
			JOptionPane.showMessageDialog(null, "-----------RESULTADOS-----------\n"
					+ "Tú= "+hum+" | Ordenador="+cpu+"\n"
							+ "--------------------------------------");
		} while (hum<3&&cpu<3);
		

	}

}
