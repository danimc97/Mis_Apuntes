import javax.swing.JOptionPane;

public class Pedir3numerosysuma {

	public static void main(String[] args) {
		String x= JOptionPane.showInputDialog("Introduce el primer numero: ");
		int xnumero=Integer.parseInt(x);
		String y= JOptionPane.showInputDialog("Introduce el segundo numero: ");
		int ynumero=Integer.parseInt(y);
		String z= JOptionPane.showInputDialog("Introduce el tercer numero: ");
		int znumero=Integer.parseInt(z);
		
		int suma;
		float media;
		
		suma=xnumero+ynumero+znumero;
		
		media= (float) suma/3;
		
		
		System.out.println("La suma de los 3 numeros es: "+suma);
		
		
		

	}

}
