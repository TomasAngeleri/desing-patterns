package com.patterns.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa {
	
	protected List<Empresa> filiales = new ArrayList<Empresa>();
	
	@Override
	public double calculaCosteMantenimiento() {
		double coste=0.0;
		for (Empresa empresa : filiales) {
			coste = coste + empresa.calculaCosteMantenimiento();
		}
		return coste + nVehiculos * costeUnitarioVehiculo;
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		return filiales.add(filial);
	}

}
