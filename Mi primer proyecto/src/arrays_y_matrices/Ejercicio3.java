package arrays_y_matrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double parteEntera;
		double parteDecimal;
		int numeros=0;
		int numero;
		int parteD;
		double array[]=new double[20];
		
		for (int i=0;i<array.length;i++) {
			
			parteEntera=Math.round(Math.random()*100);
			parteDecimal=(double)Math.round(Math.random()*99)/100;
			
			array[i]=parteEntera+parteDecimal;
		}
		
		for (int i=0;i<array.length;i++) {
			
			numero=(int) array[i];
			
		}

	}

}
