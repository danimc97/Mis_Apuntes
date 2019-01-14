package arrays_y_matrices;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int matriz[][]= new int [5][5];
		
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0;j<matriz.length;j++) {
				
				matriz[i][j]=(int) Math.round(Math.random()*10);
				
			}
			
		}

	}

}
