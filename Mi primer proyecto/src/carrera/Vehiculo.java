package carrera;

import java.awt.Graphics;

import ahorcado.Ventana;

public abstract class Vehiculo {

	private int metros;
	
	private String nombre;
	
	private String color;
	
	static boolean manchaAceiteBandera=false;
	
	static boolean rampaBandera=false;
	
	private int contadorParado=0;
	
	private int recorridoVehiculo=0;
	
	
	int numeroAvanza;
	
	public abstract String paint(Graphics g);
	
	
	
	public Vehiculo() {
		super();
	}
	
	public void avanza() {
		numeroAvanza=0;
		numeroAvanza=(int) (Math.round(Math.random()*47)+3);
		this.metros+=numeroAvanza;
	}



	public Vehiculo(int metros, String nombre, String color, int contadorParado, int recorridoVehiculo,
			int numeroAvanza) {
		super();
		this.metros = metros;
		this.nombre = nombre;
		this.color = color;
		this.contadorParado = contadorParado;
		this.recorridoVehiculo = recorridoVehiculo;
		this.numeroAvanza = numeroAvanza;
	}



	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public int getNumeroAvanza() {
		return numeroAvanza;
	}



	public void setNumeroAvanza(int numeroAvanza) {
		this.numeroAvanza = numeroAvanza;
	}



	public boolean isManchaAceiteBandera() {
		return manchaAceiteBandera;
	}



	public void setManchaAceiteBandera(boolean manchaAceiteBandera) {
		this.manchaAceiteBandera = manchaAceiteBandera;
	}



	public boolean isRampaBandera() {
		return rampaBandera;
	}



	public void setRampaBandera(boolean rampaBandera) {
		this.rampaBandera = rampaBandera;
	}



	public int getContadorParado() {
		return contadorParado;
	}



	public void setContadorParado(int contadorParado) {
		this.contadorParado = contadorParado;
	}



	public int getRecorridoVehiculo() {
		return recorridoVehiculo;
	}



	public void setRecorridoVehiculo(int recorridoVehiculo) {
		this.recorridoVehiculo = recorridoVehiculo;
	}



	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	
}
