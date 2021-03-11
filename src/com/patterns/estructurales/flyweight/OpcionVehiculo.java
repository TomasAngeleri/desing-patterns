package com.patterns.estructurales.flyweight;

public class OpcionVehiculo {

	public String name;
	public String description;
	public int standarPrice;

	public OpcionVehiculo(String name) {
		this.name = name;
		this.description = "Descripcion de " + name;
		this.standarPrice = 100;
	}

	public void visualiza(int salePrice) {

		System.out.println("Opcion");
		System.out.println("Nombre: " + name);
		System.out.println(description);
		System.out.println("Standar price: " + standarPrice);
		System.out.println("Previo de venta: " + salePrice);

	}

}
