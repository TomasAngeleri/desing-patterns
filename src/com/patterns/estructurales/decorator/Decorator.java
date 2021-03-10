package com.patterns.estructurales.decorator;

public abstract class Decorator implements ComponenteGraficoVehiculo {
	
	protected ComponenteGraficoVehiculo componente;
	
	public Decorator(ComponenteGraficoVehiculo componente) {
		this.componente = componente;
	}
	
	public void visualiza() {
		componente.visualiza();
	}
	
}
