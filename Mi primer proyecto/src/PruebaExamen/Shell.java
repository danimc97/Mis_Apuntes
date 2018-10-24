package PruebaExamen;

import javax.swing.JOptionPane;

public class Shell {

	public static void main(String[] args) {
		
		int array[]= new int[10];
		int num=0;
		int i=0;
		int j=0;
		int aux;
		boolean cambios;
		
		for (i=0;i<array.length;i++) {
			num=(int) Math.round(Math.random()*100);
			array[i]=num;
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for (i=array.length/2;i!=0;i/=2) {
			
			cambios=true;
			
			while (cambios) {
				cambios=false;
				
				for (j=i;j<array.length;j++) {
					
					if (array[j-i]>array[j]) {
						
						aux=array[j-i];
						array[j-i]=array[j];
						array[j]=aux;
						cambios=true;
					}
				}
			}
		}
		
		System.out.println();
		for (i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}