package com.patterns.estructurales.decorator;

public class MotorDecorador extends Decorator{

	public MotorDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);
	}
	
	public void visualizaMotor() {
		System.out.println("Descripcion del motor");
	}
	
	public void visualiza() {
		super.visualiza();
		this.visualizaMotor();
	}

}
