import javax.swing.JOptionPane;

public class pedirintdoublefloat {

	public static void main(String[] args) {
		String x= JOptionPane.showInputDialog("Introduce un numero int: ");
		int xnumero=Integer.parseInt(x);
		String y= JOptionPane.showInputDialog("Introduce un numero float: ");
		float ynumero=Float.parseFloat(y);
		String z= JOptionPane.showInputDialog("Introduce un numero double: ");
		double znumero=Double.parseDouble(z);
		
		
		System.out.println("Los numeros introducidos son el "+xnumero+", "+ynumero+", "+znumero);

	}

}
