package com.patterns.estructurales.facade;

import java.util.ArrayList;
import java.util.List;

public class ComponenteCatalogo implements Catalogo {

	protected Object[] descriptionVehicle = { "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000, "Espace 5 puertas",
			8000, "Breack 5 puertas", 7000, "Coupe 2 puertas", 9000, "Utilitario 3 puertas", 5000 };

	@Override
	public List<String> searchVehicle(int priceMin, int priceMax) {
		int tamanio;
		List<String> resultado = new ArrayList<String>();
		tamanio = descriptionVehicle.length / 2;

		for (int i = 0; i < tamanio; i++) {
			int precio = (int) descriptionVehicle[2 * i + 1];
			if ((precio >= priceMin) && (precio <= priceMax)) {
				resultado.add((String) descriptionVehicle[2 * i]);
			}

		}

		return resultado;
	}

}
