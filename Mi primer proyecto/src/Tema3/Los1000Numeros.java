package Tema3;

public class Los1000Numeros {

	public static void main(String[] args) {
		
		int suma=0;
		int media=0;
		int num;
		int i;
		for (i=0;i<=10000;i++) {
			num=(int) Math.round(Math.random()*1000);
			suma=suma+num;
		}
		media=suma/i;
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+media);
	}
}
