import javax.swing.JOptionPane;

public class Calculo_hipoteca {

	public static void main(String[] args) {
		
		String x= JOptionPane.showInputDialog("Introduce el diferencial: ");
		float diferencial=Float.parseFloat(x);
	
		String y=JOptionPane.showInputDialog("Introduce el euribor: ");
		float euribor=Float.parseFloat(y);
		
		String z=JOptionPane.showInputDialog("Introduce el capital: ");
		int capital=Integer.parseInt(z);
		
		String a=JOptionPane.showInputDialog("Introduce los meses: ");
		int meses=Integer.parseInt(a);
		
		float InteresAnual;
		float CuotaMensual;
		float InteresMensual;
		
		InteresAnual=euribor+diferencial;
		InteresMensual=(InteresAnual/12)/100;
		
		CuotaMensual=(float) (capital*( (InteresMensual*(Math.pow(1+InteresMensual, meses) ) ) ) / 
				( (Math.pow(1+InteresMensual, meses))-1));
		
		System.out.println("La cuota mensual es de "+CuotaMensual);
		
		
		

	}

}
