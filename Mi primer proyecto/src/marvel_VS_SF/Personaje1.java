package marvel_VS_SF;

import java.util.ArrayList;
import java.util.List;

public class Personaje1 extends Personaje {
	
	private static Personaje1 instancia = null;
	Ataque_Especial ataque_especial = new Ataque_Especial();
	Punetazo punetazo = new Punetazo();
	Patada patada = new Patada();
	public List <Ataque> lista_ataque_personaje1=new ArrayList<Ataque>();
	private int cantidad_ataque=0;
	private int tipo_ataque=0;
	private int probabilidad=0;
	
	public Personaje1() {
		super();
		this.setId(1);
		this.setNombre(EjercicioPropiedades.getProperty("NOMBREPJ1"));
		this.setVida(100);
		this.setFuerza(60);	
	}

	@Override
	public void act() {
		
		cantidad_ataque=(int) (Math.round(Math.random()*2)+1);
		
		for (int i=0; i<cantidad_ataque;i++) {
			
			tipo_ataque=(int) (Math.round(Math.random()*2));
			
			if(tipo_ataque==0) {
				lista_ataque_personaje1.add(new Patada());
				
			}
			
			if(tipo_ataque==1) {
				lista_ataque_personaje1.add(new Punetazo());
				
			}
						
			if(tipo_ataque==2) {
				lista_ataque_personaje1.add(new Ataque_Especial());
				
			}
		}
		
		for (int i=0; i<lista_ataque_personaje1.size();i++) {
			
			if (lista_ataque_personaje1.get(i) instanceof Patada) {
				probabilidad=(int) (Math.round(Math.random()*99)+1);
				if(probabilidad<75) {
					Personaje2.getInstancia().setVida(Personaje2.getInstancia().getVida()-patada.getDanio());
					System.out.println(this.getNombre()+" ha dado una patada a "+Personaje2.getInstancia().getNombre());
				}
				else {
					System.out.println(this.getNombre()+" ha dado una patada a "+Personaje2.getInstancia().getNombre());
					System.out.println(Personaje2.getInstancia().getNombre()+" se ha defendido de la patada");
				}
			}
			
			if (lista_ataque_personaje1.get(i) instanceof Punetazo) {
				probabilidad=(int) (Math.round(Math.random()*99)+1);
				if(probabilidad<75) {
					Personaje2.getInstancia().setVida(Personaje2.getInstancia().getVida()-punetazo.getDanio());
					System.out.println(this.getNombre()+" ha dado un pu�etazo a "+Personaje2.getInstancia().getNombre());
				}
				else {
					System.out.println(this.getNombre()+" ha dado un pu�etazo a "+Personaje2.getInstancia().getNombre());
					System.out.println(Personaje2.getInstancia().getNombre()+" se ha defendido del pu�etazo");
				}
				
			}
			
			if (lista_ataque_personaje1.get(i) instanceof Ataque_Especial) {
				probabilidad=(int) (Math.round(Math.random()*99)+1);
				if(probabilidad<75) {
					Personaje2.getInstancia().setVida(Personaje2.getInstancia().getVida()-ataque_especial.getDanio());
					System.out.println(this.getNombre()+" ha realizado un ataque especial a "+Personaje2.getInstancia().getNombre());
				}
				else {
					System.out.println(this.getNombre()+" ha realizado un ataque especial a "+Personaje2.getInstancia().getNombre());
					System.out.println(Personaje2.getInstancia().getNombre()+" se ha defendido del ataque especial");
				}
			}
		}
	}
	
	public synchronized static Personaje1 getInstancia() {
        if (instancia == null) {
            instancia = new Personaje1();
        }
        return instancia;
    }
}
