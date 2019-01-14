package arrays_y_matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int longitudArray=(int) (Math.round(Math.random()*99)+1);
		int array[]= new int[longitudArray];
		int comprobacionParImpar;
		int resultado;
		int almacenarMitad;
		
		
		for (int i=0;i<array.length;i++) {
			array[i]=(int) (Math.round(Math.random()*100));
			System.out.print(array[i]+" ");
		}
		
		comprobacionParImpar=array.length%2;
		
		if (comprobacionParImpar!=0) {
			almacenarMitad=longitudArray/2;
			System.out.println();
			System.out.println("El numero que se encuentra en la posición media del array es el "+array[almacenarMitad]);
		}
		else {
			System.out.println();
			System.out.println("El valor es -1");
		}
		
	}

}
