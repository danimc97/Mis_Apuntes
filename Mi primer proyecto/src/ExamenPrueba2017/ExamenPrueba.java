package ExamenPrueba2017;

import javax.swing.JOptionPane;

public class ExamenPrueba {

	public static void main(String[] args) {
		
		int num=1;
		
		while (num!=0) {
		
		int num1=0;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("-------MENU------\n"
				+ "1. Area de triangulo\n"
				+ "2. Perimetro de circunferencia\n"
				+ "3. Numero al azar\n"
				+ "----------------------"));
		
		switch (num){
		
			case 1 : 
				JOptionPane.showMessageDialog(null, "El area es "+AreaTriangulo(5,6));
				break;
			
			case 2: 
				JOptionPane.showMessageDialog(null, "El perimetro es "+PerimetroCircunferencia());
				break;
				
			case 3: 
				
				while (num1!=47) {
				
					num1=NumeroAleatorio();
					
					if (num1!=47) {
					
					System.out.println(num1);
					}
				
				}int base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base: "));
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura: "));
				
				int area= (base*altura)/2;
				break;
				
			default: JOptionPane.showMessageDialog(null, "Error");
			break;
			}
		}
	}
	
	
	public static int NumeroAleatorio () {
		
		int num1=0;
		num1=(int) Math.round(Math.random()*100);
		return num1;
	}
	
	public static float PerimetroCircunferencia () {
		
		int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio: "));
		
		float perimetro=(float) (Math.PI*Math.pow(radio, 2));
		
		return perimetro;
	}
	
	public static int AreaTriangulo (int base, int altura) {
	
		int area= (base*altura)/2;
		
		return area;
		
	}

}
