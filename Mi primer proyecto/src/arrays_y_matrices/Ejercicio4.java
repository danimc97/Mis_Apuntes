package arrays_y_matrices;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static int matriz[][] = new int[][] {
		{3,	1, 	1, 	1, 	1},
		{1, 7, 	1,	1,	1},
		{1,	1,	13,	1,	1},
		{1,	1,	1,	19, 1},
		{1,	1,	1,	1,	25}
	};
	public static int contadorPositivo=0;
	
	public static void main(String[] args) {
		
		//Ejercicio 1
		//rellenarMatriz();
		
		//Ejercicio 2
		//imprimirMatriz();
		
		//Ejercicio 3
		//comprobarMatrizPositiva();
		
		//Ejercicio 4
		//comprobarDiagonal();
		
		//Ejercicio 5
		//comprobarTriangularSuperior();

		//Ejercicio 6
		//comprobarMatrizDispersa();
		
		//Ejercicio 7
		//matrizUnidimensional();
		
		//Ejercicio 8
		//matrizSimetrica();
		
		//Ejercicio 9
		matrizTraspuesta();
		
		//Ejercicio 10
		//matrizOpuesta();
		
		//Ejercicio 11
		//matrizEliminaUsuario();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void rellenarMatriz() {
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0;j<matriz.length;j++) {
				
				matriz[i][j]=(int) Math.round(Math.random()*9);
			}
		}
	}
	
	public static void imprimirMatriz() {
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void comprobarMatrizPositiva() {
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0;j<matriz.length;j++) {
				
				if (matriz[i][j]>0) {
					contadorPositivo++;
				}
			}
		}
		if (contadorPositivo==25) {
			System.out.println("La matriz es positiva");
		}
	}
	
	public static void comprobarDiagonal() {
		
		boolean comprobarDiagonal=false;
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				if (i!=j && matriz[i][j]!=0) {
					comprobarDiagonal=true;
				}
			}
		}
		if (comprobarDiagonal==true) {
			System.out.println("La matriz no es diagonal");
		}
		else {
			System.out.println("La matriz es diagonal");
		}
	}
	
	public static void comprobarTriangularSuperior() {
		
		boolean comprobarTriangular=false; 
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				if ((i!=j && matriz[i][j]!=0 && i<j) || (matriz[i][j]==0 && i>j) ) {
					comprobarTriangular=true;	
				}
			}
		}
		
		if (comprobarTriangular==true) {
			System.out.println("La matriz no es triangular superior");
		}
		else {
			System.out.println("La matriz es triangular");
		}
		
	}
	
	public static void comprobarMatrizDispersa() {
		
		boolean noHayCero=false;
		int contador=0;
		
		
		
		for (int i=0;i<matriz.length && noHayCero==false;i++) {
			contador=0;
			for (int j=0;j<matriz.length;j++) {
				
				if (matriz[i][j]!=0) {
					contador++;
				}
				if(contador==5) {
					noHayCero=true;
				}
			}
		}
		if(noHayCero==false) {
			System.out.println("La matriz es dispersa");
		}
		else {
			System.out.println("La matriz no es dispersa");
		}
	}
	
	public static void matrizUnidimensional() {
		int l=0;
		int k=0;
		int j=0;
		
		int matrizUnidimensional[]=new int[25];
		
		for (int i=0;i<matriz.length;i++) {
			l=0;
			for (j=k;j<k+5;j++) {
				
				matrizUnidimensional[j]=matriz[i][l];
				System.out.print(matriz[i][l]+" ");
				l++;
			}
			k+=5;
		}
	}
	
	
	public static void matrizSimetrica() {
		
		boolean noIgual=false;
		
		for (int i=0;i<matriz.length && noIgual==false;i++) {
			for(int j=i;j<matriz.length;j++) {
				if (matriz[i][j]!=matriz[j][i]) {
					noIgual=true;
				}
			}
		}
		if(noIgual==false) {
			System.out.println("La matriz es simetrica");
		}
		else {
			System.out.println("La matriz no es simetrica");
		}
	}
	
	
	public static void matrizOpuesta() {
		
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j]*=-1;
			}
		}
		
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void matrizEliminaUsuario() {
		
		int numeroUsuario= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de fila"));
		
		for (int i=0;i<matriz.length;i++) {
			if (i!=numeroUsuario) {
				for(int j=0;j<matriz.length;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void matrizTraspuesta() {
		
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matriz[j][i]);
			}
			System.out.println();
		}
	}
	
}
