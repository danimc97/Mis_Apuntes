package tema6_Recursos;

public class PrecisionGrafica {

	public static void main(String[] args) {
		
		for (float x=0.0001f; x <1;x+=0.0001) {
			float y1=(float) Math.sqrt(x);
			//System.out.println("x: "+x+" y1: sqrt(x) "+y1);
			float y2=(float) ((float) 0 - Math.log(x));
			//System.out.println("x: "+x+" y1: ln(x) "+y1);
			
			if (Math.abs(y2-y1)< 0.0001) {
				System.out.println("Solucion encontrada en x: "+x);
			}
		}
	}
}
