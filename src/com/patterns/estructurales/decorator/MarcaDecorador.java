package com.patterns.estructurales.decorator;

public class MarcaDecorador extends Decorator {

	public MarcaDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);
	}
	
	public void visualizaLogo() {
		System.out.println("Logotipo de la marca");
	}
	
	public void visualiza() {
		super.visualiza();
		this.visualizaLogo();
	}

}
