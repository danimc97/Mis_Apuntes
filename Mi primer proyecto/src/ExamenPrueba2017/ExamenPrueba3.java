package ExamenPrueba2017;

import javax.swing.JOptionPane;

public class ExamenPrueba3 {

	public static void main(String[] args) {
		
		int num=1;
		int modulo=0;
		
		while (num!=0) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			
			for (int i=num; i>0;i--) {
				
				modulo=num%i;
				
				if (modulo==0) {
					
					System.out.println(i);
					
				}
				
			}
			
			System.out.println(System.currentTimeMillis()*100);
			
		}

	}

}
