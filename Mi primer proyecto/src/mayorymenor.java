import javax.swing.JOptionPane;

public class mayorymenor {

	public static void main(String[] args) {
		String x= JOptionPane.showInputDialog("Introduce el primer numero: ");
		float numero1=Float.parseFloat(x);
	
		String y=JOptionPane.showInputDialog("Introduce el segundo numero: ");
		float numero2=Float.parseFloat(y);
		
		String z=JOptionPane.showInputDialog("Introduce el tercer numero: ");
		int numero3=Integer.parseInt(z);
		
		if (numero1 > numero2 && numero1 > numero3) {
			
			System.out.println("El numero mayor es el "+numero1);
			
	}
		
		if (numero2 > numero1 && numero2 > numero3) {
				
			
			System.out.println("El numero mayor es el "+numero2);
			
			
		}
		
		if (numero3 > numero1 && numero3 > numero2)
		{
			
			System.out.println("El numero mayor es el "+numero3);
			
		}
		
		
		
		
		if (numero1 < numero2 && numero1 < numero3) {https://moodle.iesmarquesdecomares.org/course/view.php?id=40
			
			System.out.println("El numero menor es el "+numero1);
			
		}
		
		if (numero2 < numero1 && numero2 < numero3) {
				
			
			System.out.println("El numero menor es el "+numero2);
			
			
		}
		
		if (numero3 < numero1 && numero3 < numero2)
		{
			
			System.out.println("El numero menor es el "+numero3);
			
		}
		
		
		

}
}
