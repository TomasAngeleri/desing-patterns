package com.patterns.estructurales.facade;

import java.util.List;

public interface Catalogo {
	List<String> searchVehicle(int priceMin, int priceMax);
}
