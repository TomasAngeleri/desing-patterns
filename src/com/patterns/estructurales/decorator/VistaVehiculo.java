package com.patterns.estructurales.decorator;

public class VistaVehiculo implements ComponenteGraficoVehiculo {

	@Override
	public void visualiza() {
		System.out.println("Visualizacion del vehiculo");
	}

}
