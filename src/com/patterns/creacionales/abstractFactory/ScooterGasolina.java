package com.patterns.creacionales.abstractFactory;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Scooter gasolina modelo " + modelo + " color " + color + " con una potencia " + potencia);
	}

}
