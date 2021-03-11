package com.patterns.estructurales.flyweight;

import java.util.ArrayList;
import java.util.List;

public class VehiculoSolicitado {

	protected List<OpcionVehiculo> options = new ArrayList<OpcionVehiculo>();
	protected List<Integer> precioDeVentaOpciones = new ArrayList<Integer>();

	public void agregaOpciones(String nombre, int precioDeVenta, FabricaOpcion fabrica) {

		options.add(fabrica.getOption(nombre));
		precioDeVentaOpciones.add(precioDeVenta);

	}

	public void muestraOpciones() {
		for (int i = 0; i < options.size(); i++) {
			options.get(i).visualiza(precioDeVentaOpciones.get(i));
			System.out.println();
		}
	}

}
