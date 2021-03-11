package com.patterns.estructurales.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FabricaOpcion {

	protected Map<String, OpcionVehiculo> options = new TreeMap<String, OpcionVehiculo>();

	public OpcionVehiculo getOption(String name) {

		OpcionVehiculo resultado;
		if (options.containsKey(name)) {
			return options.get(name);
		} else {
			resultado = new OpcionVehiculo(name);
		}

		return resultado;

	}

}
