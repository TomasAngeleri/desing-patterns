package com.patterns.creacionales.abstractFactory;

public class FabricaVehiculoElectrico implements FabricaVehiculo {

	@Override
	public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilElectrico(modelo,color,potencia,espacio);
	}

	@Override
	public Scooter crearScooter(String modelo, String color, int potencia) {
		return new ScooterElectrico(modelo, color, potencia);
	}

}
