package com.patterns.estructurales.facade;

import java.util.List;

public class WebServiceImpl implements WebServiceAuto {
	
	protected Catalogo catalogo = new ComponenteCatalogo();
	protected GestionDocumento gestionDocumento = new ComponenteGestionDocumento();

	@Override
	public String documento(int indice) {
		return gestionDocumento.documento(indice);
	}

	@Override
	public List<String> buscaVehiculo(int precioMedio, int desviacionMax) {
		return catalogo.searchVehicle(precioMedio - desviacionMax, precioMedio + desviacionMax);
	}

}
