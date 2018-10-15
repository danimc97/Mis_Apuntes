package Tema3;

import javax.swing.JOptionPane;

public class CartaMasAlta {

	public static void main(String[] args) {
		//4.Picas
		//3.Diamantes
		//2.Trebol
		//1.Corazones
		
		
		int cartacpu;
		int cartahum;
		int palocpu;
		int palohum;
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al juego de la carta mas alta\n"
				+ "Recuerda que: 4.Picas | 3.Diamantes | 2.Treboles | 1.Corazones\n"
				+ "¿Desea jugar? 1-Si  2-No"));
		
		if (num==1) {
		
			
			cartacpu=(int) (Math.random()*13)+2;
			if (cartacpu>13) {
				cartacpu-=2;
			}
			palocpu=(int) (Math.random()*3)+1;
			System.out.println("CPU= Carta: "+cartacpu+" Palo: "+palocpu);
			
			
			
			cartahum=(int) (Math.random()*13)+2;
			if (cartahum>13) {
				cartahum-=2;
			}
			palohum=(int) (Math.random()*3)+1;
			System.out.println("Tú= Carta: "+cartahum+" Palo: "+palohum);
			
			
					if (cartacpu>cartahum) {
						
						System.out.println("¡Gana la CPU!");
						
					}
					else {
							if (cartacpu<cartahum) {
								
								System.out.println("¡Ganas tú!");
								
							}
							else {
								
								if (cartacpu==cartahum&&palocpu>palohum) {
									
									System.out.println("¡Gana la CPU!");
									
								}
								else {
									
									if (cartacpu==cartahum&&palocpu<palohum) {
										
										System.out.println("¡Ganas tú!");
										
									}
									else {
										
										System.out.println("¡Empate!");
										
									}
									
								}
								
							}
						}	
					}
				}

}
