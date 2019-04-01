package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dniNie;
	private Date fechaNac;
	
	
	/**
	 * 
	 */
	public Cliente() {
		super();
	}


	public Cliente(int id, String nombre, String apellidos, String localidad, String dniNie, Date fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dniNie = dniNie;
		this.fechaNac = fechaNac;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getDniNie() {
		return dniNie;
	}


	public void setDniNie(String dniNie) {
		this.dniNie = dniNie;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	@Override
	public String toString() {
		return "fechaNac";
	}


	
	
	
	
	
}
