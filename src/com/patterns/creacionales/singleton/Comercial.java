package com.patterns.creacionales.singleton;

public class Comercial {
	
	protected String nombre;
	protected String direccion;
	protected String email;
	
	private static Comercial _intance = null;
	
	private Comercial(){}
	
	public static Comercial Instance() {
		if(_intance == null)
			_intance = new Comercial();
		
		return _intance;
	}
	
	public void visualiza() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Email: " + email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
