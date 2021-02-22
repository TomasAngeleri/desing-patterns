package com.patterns.creacionales.abstractFactory;

public class ScooterElectrico extends Scooter {

	public ScooterElectrico(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter electrico modelo " + modelo + " color " + color + " con una potencia " + potencia);

	}

}
