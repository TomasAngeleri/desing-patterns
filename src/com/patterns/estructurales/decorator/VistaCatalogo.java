package com.patterns.estructurales.decorator;

public class VistaCatalogo {

	public static void main(String[] args) {
		
		VistaVehiculo vistaVehiculo = new VistaVehiculo();
		ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
		MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
		MotorDecorador motorDecorador = new MotorDecorador(marcaDecorador);
		motorDecorador.visualiza();
	}
}
