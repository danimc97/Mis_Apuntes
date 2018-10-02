import javax.swing.JOptionPane;

public class intercambiovariables {

	public static void main(String[] args) {
		String x= JOptionPane.showInputDialog("Introduce el numero x: ");
		int xnumero=Integer.parseInt(x);
		
		String y= JOptionPane.showInputDialog("Introduce el numero y: ");
		int ynumero=Integer.parseInt(y);
		
		int znumero = 0;
		
		System.out.println("El numero x es el "+xnumero+" y el numero y es el "+ynumero);
		
		
		znumero=ynumero;
		ynumero=xnumero;
		xnumero=znumero;
		
		System.out.println("El numero x es el "+xnumero+" y el numero y es el "+ynumero);

	}

}
