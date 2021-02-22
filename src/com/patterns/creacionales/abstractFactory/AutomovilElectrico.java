package com.patterns.creacionales.abstractFactory;

public class AutomovilElectrico extends Automovil {

	public AutomovilElectrico(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Automovil Electrico modelo "+modelo+" color "+color+" con una potencia de "
				+potencia+" y un espacio de "+ espacio);
	}

}
