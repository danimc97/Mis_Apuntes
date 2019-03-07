package tema6_Recursos;

import java.util.Scanner;

public class Bloque4Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca numero: ");
		
		int num;
		try {
			num = pedirNumeroPar();
			System.out.println("Numero del usuario "+num);
		} catch (NumeroImparIntroducido e) {
			System.out.println("Numero impar introducido");
		}
		
		

	}
	
	public static int pedirNumeroPar() throws NumeroImparIntroducido {
		
		Scanner sc= new Scanner (System.in);
		
		int numUsuario=sc.nextInt();
		
		if (numUsuario % 2 == 1) {
			
			throw new NumeroImparIntroducido();
			
		}
		
		return numUsuario;
		
	}

}
