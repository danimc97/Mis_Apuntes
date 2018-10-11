package Tema3;

public class Los1000Numeros {

	public static void main(String[] args) {
		
		int suma=0;
		int media=0;
		int num;
		
		for (int i=1;i<=10000;i++) {
			
			num=(int) Math.round(Math.random()*1000);
			
			suma+=num;
			media=suma/10000;
			
		}
		System.out.println();

	}

}
