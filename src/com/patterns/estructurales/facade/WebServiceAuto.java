package com.patterns.estructurales.facade;

import java.util.List;

public interface WebServiceAuto {
	
	String documento(int indice);
	List<String> buscaVehiculo(int precioMedio, int desviacionMax);
	
}
