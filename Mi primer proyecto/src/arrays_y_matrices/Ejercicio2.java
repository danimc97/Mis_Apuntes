package arrays_y_matrices;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int array[]= new int [200];
		
		int contadorA=0;
		int contadorS=0;
		int resultadoA;
		int resultadoS;
		
		
		for (int i=0; i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*10);
		}
		
		for (int i=0;i<array.length;i++) {
			
			if (array[i]>=5) {
				contadorA++;
			}
			else {
				contadorS++;
			}
		}
		
		resultadoA=(contadorA*100)/20;
		resultadoS=(contadorS*100)/20;
		
		System.out.println("El porcentaje de aprobados es "+resultadoA+" y de los suspensos es "+resultadoS);
		
	}
}
