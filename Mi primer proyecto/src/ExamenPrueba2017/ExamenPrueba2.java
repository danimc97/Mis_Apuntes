package ExamenPrueba2017;

import javax.swing.JOptionPane;

public class ExamenPrueba2 {

	public static void main(String[] args) {
		
		int limite=Integer.parseInt(JOptionPane.showInputDialog("Introduce un límite: "));
		int multiplo=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		int mul=0;
		int j=0;
		int mul2=0;
		
		for (int i=0;mul<limite;i++) {
				
				mul=multiplo*i;
				
				if(mul<limite) {
					System.out.println(mul);
					}
				
				System.out.println("-------------------------");
				
				for (j=0;j<=10;j++) {
					
					mul2=mul*j;
					System.out.println(mul+"x"+j+"="+mul2);
					
				}
				
				System.out.println("-------------------------");
				
		}

	}

}
